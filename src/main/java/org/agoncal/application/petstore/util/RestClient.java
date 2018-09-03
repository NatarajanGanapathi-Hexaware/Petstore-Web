package org.agoncal.application.petstore.util;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient
{
	private static final String BaseUrl= "http://localhost:8083/applicationPetstore/rest";
	public static <T> T get(Class<T> type, String path) 
	{
		Response res = getBuilder(path).get();
		T data =  isValid(res) ? res.readEntity(type) : null;
		return data;
	}
	public static <T> T post(Class<T> type, String path, Entity<?> entity) 
	{
//		Invocation.Builder builder = ClientBuilder.newClient().target("http://localhost:8083/applicationPetstore/rest/purchaseOrder").request(MediaType.APPLICATION_JSON);
//		Response res = builder.post(entity);
//		T data = isValid(res) ? res.readEntity(type): null;
//		return data;
		Response res = getBuilder(path).post(entity);
		T data =  isValid(res) ? res.readEntity(type) : null;
		return data;
	}
	
	public static <T> T delete(Class<T> type, String path) 
	{
		Response res = getBuilder(path).delete();
		T data =  isValid(res) ? res.readEntity(type) : null;
		return data;
	}
	
	private static boolean isValid(Response res)
	{
		if(res.getStatus() != Response.Status.OK.getStatusCode())
		{
			throw new RuntimeException("Network call failed.");
		}
		return true;
	}
	private static Invocation.Builder getBuilder(String path) {
		return ClientBuilder
				.newClient()
				.target(BaseUrl)
				.path(path)
				.request(MediaType.APPLICATION_JSON);
	}
}