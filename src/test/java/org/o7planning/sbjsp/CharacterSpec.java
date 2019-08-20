package org.o7planning.sbjsp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.JsonObject;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasProperty;

public class CharacterSpec {
	JsonObject mock;
	
	@Before
	public void setUp() throws Exception {
		String name = "C-3PO";
		String height = "167";
		String mass = "75";
		String hair_color = "n/a";
		String skin_color = "gold";
		String eye_color = "yellow";
		String birth_year = "112BBY";
		String gender = "n/a";
		String homeworld = "https,//swapi.co/api/planets/1/";
		String[] films =  {"https://swapi.co/api/films/2/", 
				        "https://swapi.co/api/films/5/", 
				        "https://swapi.co/api/films/4/", 
				        "https://swapi.co/api/films/6/", 
				        "https://swapi.co/api/films/3/", 
				        "https://swapi.co/api/films/1/"};
		String[] species = {"https,//swapi.co/api/species/2/"};
		String[] vehicles = {};
		String[] starship = {};
		String created = "2014-12-10T15,10,51.357000Z";
		String edited = "2014-12-20T21,17,50.309000Z";
		String url = "https://swapi.co/api/people/2/";
		
		mock = new JsonObject();
		mock.addProperty("name", name);
		mock.addProperty("height", height);
		mock.addProperty("mass", mass);
		mock.addProperty("hair_color", hair_color);
		mock.addProperty("skin_color", skin_color);
		mock.addProperty("eye_color", eye_color);
		mock.addProperty("birth_year", birth_year);
		mock.addProperty("gender", gender);
		mock.addProperty("homeworld", homeworld);
		Helper.addStringArray(mock, "films", films);
		Helper.addStringArray(mock, "species", species);
		Helper.addStringArray(mock, "vehicles", vehicles);
		Helper.addStringArray(mock, "starships", starship);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}
	

	@SuppressWarnings("unchecked")
	@Test
	public void testCharacter() {
		Character tmp = new Character(mock);
		assertThat(tmp, allOf(
				hasProperty("name", is(Helper.getAsString(mock.get("name")))),
				hasProperty("height", is(Helper.getAsString(mock.get("height")))),
				hasProperty("mass", is(Helper.getAsString(mock.get("mass")))),
				hasProperty("hair_color", is(Helper.getAsString(mock.get("hair_color")))),
				hasProperty("skin_color", is(Helper.getAsString(mock.get("skin_color")))),
				hasProperty("eye_color", is(Helper.getAsString(mock.get("eye_color")))),
				hasProperty("birth_year", is(Helper.getAsString(mock.get("birth_year")))),
				hasProperty("homeworld", is(Helper.getAsString(mock.get("homeworld")))),
				hasProperty("films", is(Helper.extractStringArray(mock, "films"))),
				hasProperty("species", is(Helper.extractStringArray(mock, "species"))),
				hasProperty("vehicles", is(Helper.extractStringArray(mock, "vehicles"))),
				hasProperty("starships", is(Helper.extractStringArray(mock, "starships"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
	}

	@Test
	public void testGetName() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getName(), Helper.getAsString(mock.get("name")));
	}

	@Test
	public void testGetHeight() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getHeight(), Helper.getAsString(mock.get("height")));
	}

	@Test
	public void testGetMass() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getMass(), Helper.getAsString(mock.get("mass")));
	}

	@Test
	public void testGetHair_color() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getHair_color(), Helper.getAsString(mock.get("hair_color")));
	}

	@Test
	public void testGetSkin_color() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getSkin_color(), Helper.getAsString(mock.get("skin_color")));
	}

	@Test
	public void testGetEye_color() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getEye_color(), Helper.getAsString(mock.get("eye_color")));
	}

	@Test
	public void testGetBirth_year() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getBirth_year(), Helper.getAsString(mock.get("birth_year")));
	}

	@Test
	public void testGetGender() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getGender(), Helper.getAsString(mock.get("gender")));
	}

	@Test
	public void testGetHomeworld() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getHomeworld(), Helper.getAsString(mock.get("homeworld")));
	}

	@Test
	public void testGetFilms() {
		Character tmp = new Character(mock);
		assertArrayEquals(tmp.getFilms(), Helper.extractStringArray(mock, "films"));
	}

	@Test
	public void testGetStarships() {
		Character tmp = new Character(mock);
		assertArrayEquals(tmp.getStarships(), Helper.extractStringArray(mock, "starships"));
	}

	@Test
	public void testGetVehicles() {
		Character tmp = new Character(mock);
		assertArrayEquals(tmp.getVehicles(), Helper.extractStringArray(mock, "vehicles"));
	}

	@Test
	public void testGetSpecies() {
		Character tmp = new Character(mock);
		assertArrayEquals(tmp.getSpecies(), Helper.extractStringArray(mock, "species"));		
	}

	@Test
	public void testGetUrl() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Character tmp = new Character(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}

}
