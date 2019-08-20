package org.o7planning.sbjsp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class StarshipSpec {
	JsonObject mock;

	@Before
	public void setUp() throws Exception {
		String name = "CR90 corvette"; 
	    String model = "CR90 corvette"; 
	    String manufacturer = "Corellian Engineering Corporation"; 
	    String cost_in_credits = "3500000"; 
	    String length = "150"; 
	    String max_atmosphering_speed = "950"; 
	    String crew = "165"; 
	    String passengers = "600"; 
	    String cargo_capacity = "3000000"; 
	    String consumables = "1 year"; 
	    String hyperdrive_rating = "2.0"; 
	    String MGLT = "60"; 
	    String starship_class = "corvette"; 
	    String[] pilots = {}; 
	    String[] films = {
	        "https://swapi.co/api/films/6/", 
	        "https://swapi.co/api/films/3/", 
	        "https://swapi.co/api/films/1/"
	    }; 
	    String created = "2014-12-10T14 =20 =33.369000Z";
		String edited = "2014-12-22T17 =35 =45.408368Z";
		String url = "https://swapi.co/api/starships/2/";
		mock = new JsonObject();
		mock.addProperty("name", name);
		mock.addProperty("model", model);
		mock.addProperty("manufacturer", manufacturer);
		mock.addProperty("cost_in_credits", cost_in_credits);
		mock.addProperty("length", length);
		mock.addProperty("max_atmosphering_speed", max_atmosphering_speed);
		mock.addProperty("crew", crew);
		mock.addProperty("passengers", passengers);
		mock.addProperty("cargo_capacity", cargo_capacity);
		mock.addProperty("consumables", consumables);
		mock.addProperty("hyperdrive_rating", hyperdrive_rating);
		mock.addProperty("MGLT", MGLT);
		mock.addProperty("starship_class", starship_class);
		Helper.addStringArray(mock, "films", films);
		Helper.addStringArray(mock, "pilots", pilots);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testStarship() {
		Starship tmp = new Starship(mock);
		assertThat(tmp, allOf(
				hasProperty("name", is(Helper.getAsString(mock.get("name")))),
				hasProperty("model", is(Helper.getAsString(mock.get("model")))),
				hasProperty("manufacturer", is(Helper.getAsString(mock.get("manufacturer")))),
				hasProperty("cost_in_credits", is(Helper.getAsString(mock.get("cost_in_credits")))),
				hasProperty("length", is(Helper.getAsString(mock.get("length")))),
				hasProperty("max_atmosphering_speed", is(Helper.getAsString(mock.get("max_atmosphering_speed")))),
				hasProperty("crew", is(Helper.getAsString(mock.get("crew")))),
				hasProperty("passengers", is(Helper.getAsString(mock.get("passengers")))),
				hasProperty("cargo_capacity", is(Helper.getAsString(mock.get("cargo_capacity")))),
				hasProperty("consumables", is(Helper.getAsString(mock.get("consumables")))),
				hasProperty("hyperdrive_rating", is(Helper.getAsString(mock.get("hyperdrive_rating")))),
				hasProperty("MGLT", is(Helper.getAsString(mock.get("MGLT")))),
				hasProperty("starship_class", is(Helper.getAsString(mock.get("starship_class")))),
				hasProperty("films", is(Helper.extractStringArray(mock, "films"))),
				hasProperty("pilots", is(Helper.extractStringArray(mock, "pilots"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
		}

	@Test
	public void testGetName() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getName(), Helper.getAsString(mock.get("name")));
	}

	@Test
	public void testGetModel() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getModel(), Helper.getAsString(mock.get("model")));
	}

	@Test
	public void testGetManufacturer() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getManufacturer(), Helper.getAsString(mock.get("manufacturer")));
	}

	@Test
	public void testGetCost_in_credits() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getCost_in_credits(), Helper.getAsString(mock.get("cost_in_credits")));
	}

	@Test
	public void testGetLength() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getLength(), Helper.getAsString(mock.get("length")));
	}

	@Test
	public void testGetMax_atmosphering_speed() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getMax_atmosphering_speed(), Helper.getAsString(mock.get("max_atmosphering_speed")));
	}

	@Test
	public void testGetCrew() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getCrew(), Helper.getAsString(mock.get("crew")));
	}

	@Test
	public void testGetPassengers() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getPassengers(), Helper.getAsString(mock.get("passengers")));
	}

	@Test
	public void testGetCargo_capacity() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getCargo_capacity(), Helper.getAsString(mock.get("cargo_capacity")));
	}

	@Test
	public void testGetConsumables() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getConsumables(), Helper.getAsString(mock.get("consumables")));
	}

	@Test
	public void testGetHyperdrive_rating() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getHyperdrive_rating(), Helper.getAsString(mock.get("hyperdrive_rating")));
	}

	@Test
	public void testGetMGLT() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getMGLT(), Helper.getAsString(mock.get("MGLT")));
	}

	@Test
	public void testGetStarship_class() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getStarship_class(), Helper.getAsString(mock.get("starship_class")));
	}

	@Test
	public void testGetPilots() {
		Starship tmp = new Starship(mock);
		assertArrayEquals(tmp.getPilots(), Helper.extractStringArray(mock, "pilots"));
	}

	@Test
	public void testGetFilms() {
		Starship tmp = new Starship(mock);
		assertArrayEquals(tmp.getFilms(), Helper.extractStringArray(mock, "films"));
	}

	@Test
	public void testGetUrl() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Starship tmp = new Starship(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}
}
