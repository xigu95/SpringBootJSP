package org.o7planning.sbjsp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class VehicleSpec {
	JsonObject mock;

	@Before
	public void setUp() throws Exception {
		String name = "Sand Crawler"; 
		String model = "Digger Crawler"; 
		String manufacturer = "Corellia Mining Corporation"; 
		String cost_in_credits = "150000"; 
		String length = "36.8"; 
		String max_atmosphering_speed = "30"; 
		String crew = "46"; 
		String passengers = "30"; 
		String cargo_capacity = "50000"; 
		String consumables = "2 months"; 
		String vehicle_class = "wheeled"; 
		String[] pilots = {}; 
		String[] films = {
	        "https://swapi.co/api/films/5/", 
	        "https://swapi.co/api/films/1/"
		};
		String created = "2014-12-10T15:36:25.724000Z";
		String edited = "2014-12-22T18:21:15.523587Z";
		String url = "https://swapi.co/api/vehicles/4/";
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
		mock.addProperty("vehicle_class", vehicle_class);
		Helper.addStringArray(mock, "films", films);
		Helper.addStringArray(mock, "pilots", pilots);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testVehicle() {
		Vehicle tmp = new Vehicle(mock);
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
				hasProperty("vehicle_class", is(Helper.getAsString(mock.get("vehicle_class")))),
				hasProperty("films", is(Helper.extractStringArray(mock, "films"))),
				hasProperty("pilots", is(Helper.extractStringArray(mock, "pilots"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
	}

	@Test
	public void testGetName() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getName(), Helper.getAsString(mock.get("name")));
	}

	@Test
	public void testGetModel() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getModel(), Helper.getAsString(mock.get("model")));
	}

	@Test
	public void testGetVehicle_class() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getVehicle_class(), Helper.getAsString(mock.get("vehicle_class")));
	}

	@Test
	public void testGetManufacturer() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getManufacturer(), Helper.getAsString(mock.get("manufacturer")));
	}

	@Test
	public void testGetCost_in_credits() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getCost_in_credits(), Helper.getAsString(mock.get("cost_in_credits")));
	}

	@Test
	public void testGetLength() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getLength(), Helper.getAsString(mock.get("length")));
	}

	@Test
	public void testGetMax_atmosphering_speed() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getMax_atmosphering_speed(), Helper.getAsString(mock.get("max_atmosphering_speed")));
	}

	@Test
	public void testGetCrew() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getCrew(), Helper.getAsString(mock.get("crew")));
	}

	@Test
	public void testGetPassengers() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getPassengers(), Helper.getAsString(mock.get("passengers")));
	}

	@Test
	public void testGetCargo_capacity() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getCargo_capacity(), Helper.getAsString(mock.get("cargo_capacity")));
	}

	@Test
	public void testGetConsumables() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getConsumables(), Helper.getAsString(mock.get("consumables")));
	}

	@Test
	public void testGetPilots() {
		Vehicle tmp = new Vehicle(mock);
		assertArrayEquals(tmp.getPilots(), Helper.extractStringArray(mock, "pilots"));
	}

	@Test
	public void testGetFilms() {
		Vehicle tmp = new Vehicle(mock);
		assertArrayEquals(tmp.getFilms(), Helper.extractStringArray(mock, "films"));
	}
	
	@Test
	public void testGetUrl() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Vehicle tmp = new Vehicle(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}

}
