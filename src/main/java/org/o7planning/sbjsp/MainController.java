package org.o7planning.sbjsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
 
@Controller
public class MainController {
    private List<Film> films = new ArrayList<Film>();
    private HashMap<String, String> filmInfo = new HashMap<String, String>();
    
    /*
     *  To load index page with all the film details listed
     */
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
    	initializeHomePage();
        model.addAttribute("films", films);
        return "index";
    }
    
    /*
     *  To load a character page with specific id
     */
    @RequestMapping(value = { "/character/{id}" }, method = RequestMethod.GET)
    public String character(Model model, @PathVariable(value="id") String id) {
    	Character c = getCharacter(id);
    	model.addAttribute("filmMap", filmInfo);
        model.addAttribute("character", c);
    	return "character";
    }
    
    /*
     *  To load a planet page with specific id
     */
    @RequestMapping(value = { "/planet/{id}" }, method = RequestMethod.GET)
    public String planet(Model model, @PathVariable(value="id") String id) {
    	Planet p = getPlanet(id);
    	model.addAttribute("filmMap", filmInfo);
        model.addAttribute("planet", p);
    	return "planet";
    }
    
    /*
     *  To load a starship page with specific id
     */
    @RequestMapping(value = { "/starship/{id}" }, method = RequestMethod.GET)
    public String starship(Model model, @PathVariable(value="id") String id) {
    	Starship s = getStarship(id);
    	model.addAttribute("filmMap", filmInfo);
        model.addAttribute("starship", s);
    	return "starship";
    }
    
    /*
     *  To load a vehicle page with specific id
     */
    @RequestMapping(value = { "/vehicle/{id}" }, method = RequestMethod.GET)
    public String vehicle(Model model, @PathVariable(value="id") String id) {
    	Vehicle v = getVehicle(id);
    	model.addAttribute("filmMap", filmInfo);
        model.addAttribute("vehicle",v);
    	return "vehicle";
    }
    
    /*
     *  To load a species page with specific id
     */
    @RequestMapping(value = { "/species/{id}" }, method = RequestMethod.GET)
    public String species(Model model, @PathVariable(value="id") String id) {
    	Species s = getSpecies(id);
    	model.addAttribute("filmMap", filmInfo);
        model.addAttribute("species",s);
    	return "species";
    }
    
    /*
     *  To load the error page if doGet request doesn't return with correct response
     */
    @RequestMapping(value = { "/error"}, method = RequestMethod.GET)
    public String error() {
    	return "error";
    }
    
    /*
     *  Call the Star War API to obtain character's information with
     *  specific id
     */
    public Character getCharacter(String id) {
        String characterURL = "https://swapi.co/api/people/"+id;
    	JsonObject response = doGet(characterURL);
    	return new Character(response);
    }
    
    /*
     *  Call the Star War API to obtain planet's information with
     *  specific id
     */
    public Planet getPlanet(String id) {
    	String planetURL = "https://swapi.co/api/planets/"+id;
    	JsonObject response = doGet(planetURL);
    	return new Planet(response);
    }
    
    /*
     *  Call the Star War API to obtain starship's information with
     *  specific id
     */
    public Starship getStarship(String id) {
    	String starshipURL = "https://swapi.co/api/starships/"+id;
    	JsonObject response = doGet(starshipURL);
		return new Starship(response);
	}
    
    /*
     *  Call the Star War API to obtain vehicle's information with
     *  specific id
     */
    public Vehicle getVehicle(String id) {
    	String vehicleURL = "https://swapi.co/api/vehicles/"+id;
    	JsonObject response = doGet(vehicleURL);
		return new Vehicle(response);
    }
    
    /*
     *  Call the Star War API to obtain species's information with
     *  specific id
     */
    public Species getSpecies(String id) {
    	String speciesURL = "https://swapi.co/api/species/"+id;
    	JsonObject response = doGet(speciesURL);
		return new Species(response);
    }
    
    /*
     *  Calls an RESTful server
     */
    public JsonObject doGet(String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response;
        HttpEntity entity = new HttpEntity(new HttpHeaders());
        response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        
        if(response.getStatusCodeValue()!= 200) {
        	error();
        }
        
        JsonObject result = new Gson().fromJson(response.getBody(), JsonObject.class);
        return result;
    }

    /*
     *  Obtain the list of films and film's information
     *  then populate the id to name map for other
     *  pages
     */
    public void initializeHomePage(){
        String filmURL = "https://swapi.co/api/films/";
        JsonObject response = doGet(filmURL);
        JsonArray filmList = response.getAsJsonArray("results");
        for(JsonElement film: filmList){
        	Film tmp = new Film(film.getAsJsonObject());
        	films.add(tmp);
        	
        	String id = tmp.getUrl().split("films/")[1];
        	filmInfo.put(id.substring(0,id.length()-1), tmp.getTitle());
        }
    }
    
}