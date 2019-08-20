package org.o7planning.sbjsp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class PlanetTest {
	JsonObject mock;
	
    
	@Before
	public void setUp() throws Exception {
		String name = "Alderaan";
	    String rotation_period = "24";
	    String orbital_period = "364";
	    String diameter = "12500";
	    String climate = "temperate";
	    String gravity = "1 standard";
	    String terrain = "grasslands, mountains";
	    String surface_water = "40";
	    String population = "2000000000"; 
	    String[] residents = {
	        "https://swapi.co/api/people/5/", 
	        "https://swapi.co/api/people/68/", 
	        "https://swapi.co/api/people/81/"
	    }; 
	    String[] films = {
	        "https://swapi.co/api/films/6/", 
	        "https://swapi.co/api/films/1/"
	    };
	    String created = "2014-12-10T11:35:48.479000Z";
	    String edited = "2014-12-20T20:58:18.420000Z";
	    String url = "https://swapi.co/api/planets/2/";
		mock = new JsonObject();
		mock.addProperty("name", name);
		mock.addProperty("rotation_period", rotation_period);
		mock.addProperty("orbital_period", orbital_period);
		mock.addProperty("diameter", diameter);
		mock.addProperty("climate", climate);
		mock.addProperty("gravity", gravity);
		mock.addProperty("terrain", terrain);
		mock.addProperty("surface_water", surface_water);
		mock.addProperty("population", population);
		Helper.addStringArray(mock, "residents", residents);
		Helper.addStringArray(mock, "films", films);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testPlanet() {
		Planet tmp = new Planet(mock);
		assertThat(tmp, allOf(
				hasProperty("name", is(Helper.getAsString(mock.get("name")))),
				hasProperty("rotation_period", is(Helper.getAsString(mock.get("rotation_period")))),
				hasProperty("orbital_period", is(Helper.getAsString(mock.get("orbital_period")))),
				hasProperty("diameter", is(Helper.getAsString(mock.get("diameter")))),
				hasProperty("climate", is(Helper.getAsString(mock.get("climate")))),
				hasProperty("gravity", is(Helper.getAsString(mock.get("gravity")))),
				hasProperty("terrain", is(Helper.getAsString(mock.get("terrain")))),
				hasProperty("surface_water", is(Helper.getAsString(mock.get("surface_water")))),
				hasProperty("population", is(Helper.getAsString(mock.get("population")))),
				hasProperty("films", is(Helper.extractStringArray(mock, "films"))),
				hasProperty("residents", is(Helper.extractStringArray(mock, "residents"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
	}

	@Test
	public void testGetName() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getName(), Helper.getAsString(mock.get("name")));	
	}

	@Test
	public void testGetRotation_period() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getRotation_period(), Helper.getAsString(mock.get("rotation_period")));	
	}

	@Test
	public void testGetOrbital_period() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getOrbital_period(), Helper.getAsString(mock.get("orbital_period")));	
	}

	@Test
	public void testGetDiameter() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getDiameter(), Helper.getAsString(mock.get("diameter")));	
	}

	@Test
	public void testGetClimate() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getClimate(), Helper.getAsString(mock.get("climate")));	
	}

	@Test
	public void testGetGravity() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getGravity(), Helper.getAsString(mock.get("gravity")));	
	}

	@Test
	public void testGetTerrain() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getTerrain(), Helper.getAsString(mock.get("terrain")));	
	}

	@Test
	public void testGetSurface_water() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getSurface_water(), Helper.getAsString(mock.get("surface_water")));	
	}

	@Test
	public void testGetPopulation() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getPopulation(), Helper.getAsString(mock.get("population")));	
	}

	@Test
	public void testGetResidents() {
		Planet tmp = new Planet(mock);
		assertArrayEquals(tmp.getResidents(), Helper.extractStringArray(mock, "residents"));
	}

	@Test
	public void testGetFilms() {
		Planet tmp = new Planet(mock);
		assertArrayEquals(tmp.getFilms(), Helper.extractStringArray(mock, "films"));
	}

	@Test
	public void testGetUrl() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Planet tmp = new Planet(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}

}
