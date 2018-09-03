package org.agoncal.application.petstore.dto;
import java.util.Date;
import org.agoncal.application.petstore.model.UserRole;

public class CustomerDto
{

   private Long id;
   private int version;
   private String firstName;
   private String lastName;
   private String telephone;
   private String email;
   private String login;
   private String password;
   private String uuid;
   private UserRole role;
   private Date dateOfBirth;
   private Integer age;
   private AddressDto homeAddress = new AddressDto();
 

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   public String getLogin()
   {
      return login;
   }

   public void setLogin(String login)
   {
      this.login = login;
   }

   public UserRole getRole()
   {
      return role;
   }

   public void setRole(UserRole role)
   {
      this.role = role;
   }

   public String getUuid()
   {
      return uuid;
   }

   public void setUuid(String uuid)
   {
      this.uuid = uuid;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getFullName()
   {
      return firstName + " " + lastName;
   }

   public String getTelephone()
   {
      return telephone;
   }

   public void setTelephone(String telephone)
   {
      this.telephone = telephone;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public Date getDateOfBirth()
   {
      return dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public Integer getAge()
   {
      return age;
   }

   public AddressDto getHomeAddress()
   {
      return homeAddress;
   }

   public void setHomeAddress(AddressDto homeAddress)
   {
      this.homeAddress = homeAddress;
   }

   @Override
   public String toString()
   {
      return firstName + ' ' + lastName + " (" + login + ")";
   }
}
