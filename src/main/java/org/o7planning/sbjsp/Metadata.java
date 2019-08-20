package org.o7planning.sbjsp;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class Metadata {
	protected String url;
    protected String created;
    protected String edited;
    protected String[] films;
    protected String[] characters;
    protected String[] planets;
    protected String[] starships;
    protected String[] vehicles;
    protected String[] species;

    public Metadata(){}
    
    /*
     * Custom toString function to handle null input
     */
    public String getAsString(JsonElement jsonElement) {
    	return jsonElement.isJsonNull()? "": jsonElement.getAsString();
    }
    
    /*
     * Get the film resources featured within this metadata
     */
    public String[] getFilms() {
        return this.films;
    }
    
    /*
     * Get the character resources featured within this metadata
     */
    public String[] getCharacters() {
        return this.characters;
    }

    /*
     * Get the planet resources featured within this metadata
     */
    public String[] getPlanets(){
        return this.planets;
    }

    /*
     * Get the starship resources featured within this metadata
     */
    public String[] getStarships(){
        return this.starships;
    }

    /*
     * Get the vehicle resources featured within this metadata
     */
    public String[] getVehicles(){
        return this.vehicles;
    }

    /*
     * Get the species resources featured within this metadata
     */
    public String[] getSpecies(){
        return this.species;
    }

    /*
     * Get the url of this resource
     */
    public String getUrl(){
        return this.url;
    }

    /*
     * Get the ISO8601 date format of the time that this resource was created
     */
    public String getCreated(){
        return this.created;
    }

    /*
     * Get the ISO 8601 date format of the time that this resource was edited
     */
    public String getEdited(){
        return this.edited;
    }

    /*
     * Create a String array of resource url
     */
    public String[] toUrlArray(JsonArray array){
        List<String> tmp = new ArrayList<>();
        for(JsonElement elem: array){
            tmp.add(elem.getAsString());
        }
        String[] ans = new String[tmp.size()];
        tmp.toArray(ans);
        return ans;
    }
}
