package org.o7planning.sbjsp;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Helper {
	public static void addStringArray(JsonObject jsonObject, String property, String[] array) {
		JsonArray tmp = new JsonArray();
	    for (String elem : array) {
	    	tmp.add(new JsonPrimitive(elem));
	    }
	    jsonObject.add(property, tmp);
	}
	
	public static String[] extractStringArray(JsonObject jsonObject, String property) {
		List<String> tmp = new ArrayList<String>();
		for(JsonElement elem: jsonObject.getAsJsonArray(property)) {
			tmp.add(elem.getAsString());
		}
		String[] ans = new String[tmp.size()];
		tmp.toArray(ans);
		return ans;
	}
	public static String getAsString(JsonElement jsonElement) {
    	return jsonElement.isJsonNull()? "": jsonElement.getAsString();
    }
}
