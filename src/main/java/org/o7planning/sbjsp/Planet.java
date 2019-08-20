package org.o7planning.sbjsp;

import com.google.gson.JsonObject;

public class Planet extends Metadata{
	private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private String[] residents;
    
    public Planet(JsonObject jsonObject) {
    	this.name = this.getAsString(jsonObject.get("name"));
        this.rotation_period = this.getAsString(jsonObject.get("rotation_period"));
        this.orbital_period = this.getAsString(jsonObject.get("orbital_period"));
        this.diameter = this.getAsString(jsonObject.get("diameter"));
        this.climate = this.getAsString(jsonObject.get("climate"));
        this.gravity = this.getAsString(jsonObject.get("gravity"));
        this.terrain = this.getAsString(jsonObject.get("terrain"));
        this.surface_water = this.getAsString(jsonObject.get("surface_water"));
        this.population = this.getAsString(jsonObject.get("population"));
        this.residents = toUrlArray(jsonObject.get("residents").getAsJsonArray());
        this.films = toUrlArray(jsonObject.get("films").getAsJsonArray());
        this.url = this.getAsString(jsonObject.get("url"));
        this.created = this.getAsString(jsonObject.get("created"));
        this.edited = this.getAsString(jsonObject.get("edited"));
    }
    
    /*
     * Get the name of this planet
     */
    public String getName(){
        return this.name;
    }
    
    /*
     * Get the number of standard hours it takes for this planet to complete a single rotation on its axis
     */
    public String getRotation_period() {
    	return this.rotation_period;
    }
    
    /*
     * Get the number of standard days it takes for this planet to complete a single orbit of its local star
     */
    public String getOrbital_period() {
    	return this.orbital_period;
    }
    
    /*
     * Get the diameter of this planet in kilometers
     */
    public String getDiameter() {
    	return this.diameter;
    }
    
    /*
     * Get the climate of this planet. Comma-seperated if diverse
     */
    public String getClimate() {
    	return this.climate;
    }
    
    /*
     * Get A number denoting the gravity of this planet. Where 1 is normal
     */
    public String getGravity() {
    	return this.gravity;
    }
    
    /*
     * Get the terrain of this planet. Comma-seperated if diverse
     */
    public String getTerrain() {
    	return this.terrain;
    }
    
    /*
     * Get the percentage of the planet surface that is naturally occuring water or bodies of water
     */
    public String getSurface_water() {
    	return this.surface_water;
    }
    
    /*
     * Get the average population of sentiment beings inhabiting this planet
     */
    public String getPopulation() {
    	return this.population;
    }
    
    /*
     * Get the People URL Resources that live on this planet
     */
    public String[] getResidents() {
    	return this.residents;
    }
}
