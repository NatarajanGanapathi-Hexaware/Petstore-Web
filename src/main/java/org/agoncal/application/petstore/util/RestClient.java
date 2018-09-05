package org.agoncal.application.petstore.util;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient
{
	public static final String ApiURL= System.getenv("PETSTORE-API-URL");
	public static <T> T get(Class<T> type, String path) 
	{
		Response res = getBuilder(path).get();
		T data =  isValid(res) ? res.readEntity(type) : null;
		return data;
	}
	public static <T> T post(Class<T> type, String path, Entity<?> entity) 
	{
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
		String url = ApiURL+ "/applicationPetstore/rest";
		System.out.println(url + "/" + path);
		return ClientBuilder
				.newClient()
				.target(url)
				.path(path)
				.request(MediaType.APPLICATION_JSON);
	}
}