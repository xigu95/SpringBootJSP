package org.o7planning.sbjsp;

import com.google.gson.JsonObject;

public class Species extends Metadata{
	private String name;
    private String classification;
    private String designation;
    private String average_height;
    private String average_lifespan;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String language;
    private String homeworld;
    private String[] people;
    
    public Species(JsonObject jsonObject) {
        this.name = this.getAsString(jsonObject.get("name"));
        this.classification = this.getAsString(jsonObject.get("classification"));
        this.designation = this.getAsString(jsonObject.get("designation"));
        this.average_height = this.getAsString(jsonObject.get("average_height"));
        this.average_lifespan = this.getAsString(jsonObject.get("average_lifespan"));
        this.hair_color = this.getAsString(jsonObject.get("hair_colors"));
        this.skin_color = this.getAsString(jsonObject.get("skin_colors"));
        this.eye_color = this.getAsString(jsonObject.get("eye_colors"));
        this.language = this.getAsString(jsonObject.get("language"));
        this.homeworld = this.getAsString(jsonObject.get("homeworld"));
        this.people = toUrlArray(jsonObject.get("people").getAsJsonArray());
        this.films = toUrlArray(jsonObject.get("films").getAsJsonArray());
        this.url = this.getAsString(jsonObject.get("url"));
        this.created = this.getAsString(jsonObject.get("created"));
        this.edited = this.getAsString(jsonObject.get("edited"));
    }
    
	/*
	 * Get the name of this species
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * Get the classification of this species, such as "mammal" or "reptile"
	 */
	public String getClassification() {
		return this.classification;
	}
	
	/*
	 * Get the designation of this species, such as "sentient"
	 */
	public String getDesignation() {
		return this.designation;
	}
	
	/*
	 * Get the average height of this species in centimeters
	 */
	public String getAverage_height() {
		return this.average_height;
	}
	
	/*
	 * Get the average lifespan of this species in years
	 */
	public String getAverage_lifespan() {
		return this.average_lifespan;
	}
	
	/*
	 * Get a comma-separated string of common skin colors for this species, "none" if this species does not typically have skin.
	 */
	public String getHair_color() {
		return this.hair_color;
	}
	
	/*
	 * Get a comma-separated string of common hair colors for this species, "none" if this species does not typically have hair
	 */
	public String getSkin_color() {
		return this.skin_color;
	}
	
	/*
	 * Get a comma-separated string of common eye colors for this species, "none" if this species does not typically have eyes.
	 */
	public String getEye_color() {
		return this.eye_color;
	}
	
	/*
	 * Get the language commonly spoken by this species.
	 */
	public String getLanguage() {
		return this.language;
	}
	
	/*
	 * Get the URL of a planet resource, a planet that this species originates from
	 */
	public String getHomeworld() {
		return this.homeworld;
	}
	
	/*
	 * Get the list of People URL Resources that are a part of this species
	 */
	public String[] getPeople() {
		return this.people;
	}

}