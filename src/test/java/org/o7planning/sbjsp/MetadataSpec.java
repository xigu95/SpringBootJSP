package org.o7planning.sbjsp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonArray;

public class MetadataSpec {
	JsonArray planets = new JsonArray();;
	@Before
	public void setUp() throws Exception {
		planets.add("https://swapi.co/api/planets/4/");
		planets.add("https://swapi.co/api/planets/5/");
	}

	@Test
	public void testToUrlArray() {
		String[] res = {"https://swapi.co/api/planets/4/","https://swapi.co/api/planets/5/"};
		Metadata tmp = new Metadata();
		assertArrayEquals(tmp.toUrlArray(planets),res);
	}

}
