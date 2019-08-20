package org.o7planning.sbjsp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class FilmSpec {
	JsonObject mock;

	@Before
	public void setUp() throws Exception {
		String title = "The Empire Strikes Back";
		int episode_id = 5; 
	    String opening_crawl = "It is a dark time for the\r\nRebellion. Although the Death\r\nStar has been destroyed,\r\nImperial troops have driven the\r\nRebel forces from their hidden\r\nbase and pursued them across\r\nthe galaxy.\r\n\r\nEvading the dreaded Imperial\r\nStarfleet, a group of freedom\r\nfighters led by Luke Skywalker\r\nhas established a new secret\r\nbase on the remote ice world\r\nof Hoth.\r\n\r\nThe evil lord Darth Vader,\r\nobsessed with finding young\r\nSkywalker, has dispatched\r\nthousands of remote probes into\r\nthe far reaches of space...."; 
	    String director = "Irvin Kershner";
	    String producer = "Gary Kurtz, Rick McCallum";
	    String release_date= "1980-05-17";
	    String[] characters = {
	        "https://swapi.co/api/people/1/", 
	        "https://swapi.co/api/people/2/", 
	        "https://swapi.co/api/people/3/", 
	        "https://swapi.co/api/people/4/", 
	        "https://swapi.co/api/people/5/", 
	        "https://swapi.co/api/people/10/", 
	        "https://swapi.co/api/people/13/", 
	        "https://swapi.co/api/people/14/", 
	        "https://swapi.co/api/people/18/", 
	        "https://swapi.co/api/people/20/", 
	        "https://swapi.co/api/people/21/", 
	        "https://swapi.co/api/people/22/", 
	        "https://swapi.co/api/people/23/", 
	        "https://swapi.co/api/people/24/", 
	        "https://swapi.co/api/people/25/", 
	        "https://swapi.co/api/people/26/"
	    };
	    String[] planets = {
	        "https://swapi.co/api/planets/4/", 
	        "https://swapi.co/api/planets/5/", 
	        "https://swapi.co/api/planets/6/", 
	        "https://swapi.co/api/planets/27/"
	    }; 
	    String[] starships = {
	        "https://swapi.co/api/starships/15/", 
	        "https://swapi.co/api/starships/10/", 
	        "https://swapi.co/api/starships/11/", 
	        "https://swapi.co/api/starships/12/", 
	        "https://swapi.co/api/starships/21/", 
	        "https://swapi.co/api/starships/22/", 
	        "https://swapi.co/api/starships/23/", 
	        "https://swapi.co/api/starships/3/", 
	        "https://swapi.co/api/starships/17/"
	    };
	    String[] vehicles = {
	        "https://swapi.co/api/vehicles/8/", 
	        "https://swapi.co/api/vehicles/14/", 
	        "https://swapi.co/api/vehicles/16/", 
	        "https://swapi.co/api/vehicles/18/", 
	        "https://swapi.co/api/vehicles/19/", 
	        "https://swapi.co/api/vehicles/20/"
	    };
	    String[] species = {
	        "https://swapi.co/api/species/6/", 
	        "https://swapi.co/api/species/7/", 
	        "https://swapi.co/api/species/3/", 
	        "https://swapi.co/api/species/2/", 
	        "https://swapi.co/api/species/1/"
	    };
	    String created = "2014-12-12T11:26:24.656000Z";
	    String edited = "2017-04-19T10:57:29.544256Z";
	    String url = "https://swapi.co/api/films/2/";
	    mock = new JsonObject();
		mock.addProperty("title", title);
		mock.addProperty("episode_id", episode_id);
		mock.addProperty("opening_crawl", opening_crawl);
		mock.addProperty("director", director);
		mock.addProperty("producer", producer);
		mock.addProperty("release_date", release_date);
		Helper.addStringArray(mock, "characters", characters);
		Helper.addStringArray(mock, "planets", planets);
		Helper.addStringArray(mock, "species", species);
		Helper.addStringArray(mock, "vehicles", vehicles);
		Helper.addStringArray(mock, "starships", starships);
		mock.addProperty("created", created);
		mock.addProperty("edited", edited);
		mock.addProperty("url", url);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testFilm() {
		Film tmp = new Film(mock);
		assertThat(tmp, allOf(
				hasProperty("title", is(Helper.getAsString(mock.get("title")))),
				hasProperty("episode_id", is(mock.get("episode_id").getAsInt())),
				hasProperty("opening_crawl", is(Helper.getAsString(mock.get("opening_crawl")))),
				hasProperty("director", is(Helper.getAsString(mock.get("director")))),
				hasProperty("producer", is(Helper.getAsString(mock.get("producer")))),
				hasProperty("release_date", is(Helper.getAsString(mock.get("release_date")))),
				hasProperty("characters", is(Helper.extractStringArray(mock, "characters"))),
				hasProperty("planets", is(Helper.extractStringArray(mock, "planets"))),
				hasProperty("species", is(Helper.extractStringArray(mock, "species"))),
				hasProperty("vehicles", is(Helper.extractStringArray(mock, "vehicles"))),
				hasProperty("starships", is(Helper.extractStringArray(mock, "starships"))),
				hasProperty("created", is(Helper.getAsString(mock.get("created")))),
				hasProperty("edited", is(Helper.getAsString(mock.get("edited")))),
				hasProperty("url", is(Helper.getAsString(mock.get("url"))))));
	}

	@Test
	public void testGetTitle() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getTitle(), Helper.getAsString(mock.get("title")));	
	}

	@Test
	public void testGetEpisode_id() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getEpisode_id(), mock.get("episode_id").getAsInt());	
	}

	@Test
	public void testGetOpening_crawl() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getOpening_crawl(), Helper.getAsString(mock.get("opening_crawl")));	
	}

	@Test
	public void testGetDirector() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getDirector(), Helper.getAsString(mock.get("director")));	
	}

	@Test
	public void testGetProducer() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getProducer(), Helper.getAsString(mock.get("producer")));	
	}

	@Test
	public void testGetRelease_date() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getRelease_date(), Helper.getAsString(mock.get("release_date")));	
	}

	@Test
	public void testGetCharacters() {
		Film tmp = new Film(mock);
		assertArrayEquals(tmp.getCharacters(), Helper.extractStringArray(mock, "characters"));
	}

	@Test
	public void testGetPlanets() {
		Film tmp = new Film(mock);
		assertArrayEquals(tmp.getPlanets(), Helper.extractStringArray(mock, "planets"));
	}

	@Test
	public void testGetStarships() {
		Film tmp = new Film(mock);
		assertArrayEquals(tmp.getStarships(), Helper.extractStringArray(mock, "starships"));
	}

	@Test
	public void testGetVehicles() {
		Film tmp = new Film(mock);
		assertArrayEquals(tmp.getVehicles(), Helper.extractStringArray(mock, "vehicles"));
	}

	@Test
	public void testGetSpecies() {
		Film tmp = new Film(mock);
		assertArrayEquals(tmp.getSpecies(), Helper.extractStringArray(mock, "species"));		
	}

	@Test
	public void testGetUrl() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getUrl(), Helper.getAsString(mock.get("url")));
	}

	@Test
	public void testGetCreated() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getCreated(), Helper.getAsString(mock.get("created")));
	}

	@Test
	public void testGetEdited() {
		Film tmp = new Film(mock);
		assertEquals(tmp.getEdited(), Helper.getAsString(mock.get("edited")));
	}

}
