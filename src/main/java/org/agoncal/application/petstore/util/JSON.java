package org.agoncal.application.petstore.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSON {

	public static String Serialize(final Object data) 
	{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.setPrettyPrinting().setDateFormat("yyyy-MM-dd").create();
		String conversationBody = gson.toJson(data);
		return conversationBody;
	}
}
