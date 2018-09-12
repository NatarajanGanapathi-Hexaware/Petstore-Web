FROM jboss/wildfly
ENV JBOSS_HOME /opt/jboss/wildfly
ENV POSTGRESQL_VERSION 9.4-1201-jdbc41

ARG DB_HOST=postgresql
ARG DB_NAME=postgresdb
ARG DB_USER=postgres
ARG DB_PASS=irtt

USER root

RUN /opt/jboss/wildfly/bin/add-user.sh admin password  --silent

# Install postgres drivers and datasource
RUN /bin/sh -c '$JBOSS_HOME/bin/standalone.sh &' && \
  sleep 10 && \
  cd /tmp && \
  curl --location --output postgresql-${POSTGRESQL_VERSION}.jar --url http://search.maven.org/remotecontent?filepath=org/postgresql/postgresql/${POSTGRESQL_VERSION}/postgresql-${POSTGRESQL_VERSION}.jar && \
  $JBOSS_HOME/bin/jboss-cli.sh --connect --command="data-source remove --name=ExampleDS" && \
  $JBOSS_HOME/bin/jboss-cli.sh --connect --command="deploy /tmp/postgresql-${POSTGRESQL_VERSION}.jar" && \
  $JBOSS_HOME/bin/jboss-cli.sh --connect --command="xa-data-source add --name=ExampleDS --jndi-name=java:jboss/datasources/ExampleDS --user-name=${DB_USER} --password=${DB_PASS} --driver-name=postgresql-9.4-1201-jdbc41.jar --xa-datasource-class=org.postgresql.xa.PGXADataSource --xa-datasource-properties=ServerName=${DB_HOST},PortNumber=5432,DatabaseName=${DB_NAME} --valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker --exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter" && \
  $JBOSS_HOME/bin/jboss-cli.sh --connect --command=:shutdown && \
  rm -rf $JBOSS_HOME/standalone/configuration/standalone_xml_history/ $JBOSS_HOME/standalone/log/* && \
  rm /tmp/postgresql-9.4*.jar && \
  rm -rf /tmp/postgresql-*.jar


ADD bin/applicationPetstore.war /opt/jboss/wildfly/standalone/deployments/

RUN chown -f jboss:0 /opt/jboss/wildfly/standalone/deployments/applicationPetstore.war
RUN chmod -R 777 /opt/jboss/wildfly/standalone
USER jboss

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

# "-c", "standalone-zplatform.xml",

# BUILD DOCKER IMAGE
# docker build -t petstore-web:1.0.0 .
# docker build -t petstore-web:1.0.0 --build-arg DB_HOST=172.25.141.81 --build-arg DB_NAME=postgresdb --build-arg DB_USER=postgres --build-arg DB_PASS=irtt .

# RUN DOCKER IMAGE
# docker run -it -p 9992:9990 -p 8082:8080 -e PETSTORE-API-URL=http://127.0.0.1:8083 petstore-web:1.0.0
# docker run -it -p 9992:9990 -p 8082:8080 -e PETSTORE-API-URL=http://127.0.0.1:8083 --rm -d  petstore-web:1.0.0

# RUN WILDFLY IMAGE
# docker run -p 8082:8080 -p 9992:9990 -it jboss/wildfly /opt/jboss/wildfly/bin/standalone.sh -bmanagement 0.0.0
