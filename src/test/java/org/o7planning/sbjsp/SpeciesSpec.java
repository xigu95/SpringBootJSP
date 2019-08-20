package org.o7planning.sbjsp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class SpeciesSpec {
	JsonObject mock;

	@Before
	public void setUp() throws Exception {
		String name = "Droid";
	    String classification = "artificial";
	    String designation = "sentient";
	    String average_height = "n/a"; 
	    String skin_colors = "n/a"; 
	    String hair_colors = "n/a"; 
	    String eye_colors = "n/a"; 
	    String average_lifespan = "indefinite"; 
	    String homeworld = null; 
	    String language = "n/a"; 
	    String[] people = {
	        "https://swapi.co/api/people/2/", 
	        "https://swapi.co/api/people/3/", 
	        "https://swapi.co/api/people/8/", 
	        "https://swapi.co/api/people/23/", 
	        "https://swapi.co/api/people/87/"
	    };
	    String[] films = {
	        "https://swapi.co/api/films/2/", 
	        "https://swapi.co/api/films/7/", 
	        "https://swapi.co/api/films/5/", 
	        "https://swapi.co/api/films/4/", 
	        "https://swapi.co/api/films/6/", 
	        "https://swapi.co/api/films/3/", 
	        "https://swapi.co/api/films/1/"
	    };
	    String created = "2014-12-10T15 =16 =16.259000Z";
	    String edited = "2015-04-17T06 =59 =43.869528Z"; 
	    String url = "https://swapi.co/api/species/2/";
	    mock = new JsonObject();
		mock.addProperty("name", name);
		mock.addProperty("classification", classification);
		mock.addProperty("designation", designation);
		mock.addProperty("average_height", average_height);
		mock.addProperty("skin_colors", skin_colors);
		mock.addProperty("hair_colors", hair_colors);
		mock.addProperty("eye_colors", eye_colors);
		mock.addProperty("average_lifespan", average_lifespan);
		mock.addProperty("homeworld", homeworld);
		mock.addProperty("language", language);
		Helper.addStringArray(mock, "people", people);
		Helper.addStringArray(mock, "films", films);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testSpecies() {
		Species tmp = new Species(mock);
		assertThat(tmp, allOf(
				hasProperty("name", is(Helper.getAsString(mock.get("name")))),
				hasProperty("classification", is(Helper.getAsString(mock.get("classification")))),
				hasProperty("designation", is(Helper.getAsString(mock.get("designation")))),
				hasProperty("average_height", is(Helper.getAsString(mock.get("average_height")))),
				hasProperty("average_lifespan", is(Helper.getAsString(mock.get("average_lifespan")))),
				hasProperty("language", is(Helper.getAsString(mock.get("language")))),
				hasProperty("hair_color", is(Helper.getAsString(mock.get("hair_colors")))),
				hasProperty("skin_color", is(Helper.getAsString(mock.get("skin_colors")))),
				hasProperty("eye_color", is(Helper.getAsString(mock.get("eye_colors")))),
				hasProperty("homeworld", is(Helper.getAsString(mock.get("homeworld")))),
				hasProperty("films", is(Helper.extractStringArray(mock, "films"))),
				hasProperty("people", is(Helper.extractStringArray(mock, "people"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
	}

	@Test
	public void testGetName() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getName(), Helper.getAsString(mock.get("name")));
	}

	@Test
	public void testGetClassification() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getClassification(), Helper.getAsString(mock.get("classification")));
	}

	@Test
	public void testGetDesignation() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getDesignation(), Helper.getAsString(mock.get("designation")));
	}

	@Test
	public void testGetAverage_height() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getAverage_height(), Helper.getAsString(mock.get("average_height")));
	}

	@Test
	public void testGetAverage_lifespan() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getAverage_lifespan(), Helper.getAsString(mock.get("average_lifespan")));
	}

	@Test
	public void testGetHair_color() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getHair_color(), Helper.getAsString(mock.get("hair_colors")));
	}

	@Test
	public void testGetSkin_color() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getSkin_color(), Helper.getAsString(mock.get("skin_colors")));
	}

	@Test
	public void testGetEye_color() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getEye_color(), Helper.getAsString(mock.get("eye_colors")));
	}

	@Test
	public void testGetLanguage() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getLanguage(), Helper.getAsString(mock.get("language")));
	}

	@Test
	public void testGetHomeworld() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getHomeworld(),  Helper.getAsString(mock.get("homeworld")));
	}

	@Test
	public void testGetPeople() {
		Species tmp = new Species(mock);
		assertArrayEquals(tmp.getPeople(), Helper.extractStringArray(mock, "people"));
	}

	@Test
	public void testGetFilms() {
		Species tmp = new Species(mock);
		assertArrayEquals(tmp.getFilms(), Helper.extractStringArray(mock, "films"));
	}

	@Test
	public void testGetUrl() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Species tmp = new Species(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}
}
