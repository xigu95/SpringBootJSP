package org.o7planning.sbjsp;

import com.google.gson.JsonObject;

public class Character extends Metadata{
	private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;

    public Character(JsonObject jsonObject) {
        this.name = this.getAsString(jsonObject.get("name"));
        this.height = this.getAsString(jsonObject.get("height"));
        this.mass = this.getAsString(jsonObject.get("mass"));
        this.hair_color = this.getAsString(jsonObject.get("hair_color"));
        this.skin_color = this.getAsString(jsonObject.get("skin_color"));
        this.eye_color = this.getAsString(jsonObject.get("eye_color"));
        this.birth_year = this.getAsString(jsonObject.get("birth_year"));
        this.gender = this.getAsString(jsonObject.get("gender"));
        this.homeworld = this.getAsString(jsonObject.get("homeworld"));
        this.films = toUrlArray(jsonObject.get("films").getAsJsonArray());
        this.vehicles = toUrlArray(jsonObject.get("vehicles").getAsJsonArray());
        this.starships = toUrlArray(jsonObject.get("starships").getAsJsonArray());
        this.species = toUrlArray(jsonObject.get("species").getAsJsonArray());
        this.url = this.getAsString(jsonObject.get("url"));
        this.created = this.getAsString(jsonObject.get("created"));
        this.edited = this.getAsString(jsonObject.get("edited"));
    }

    /*
     * Get the name of this person
     */
    public String getName(){
        return this.name;
    }

    /*
     * Get the height of this person in meters
     */
    public String getHeight(){
        return this.height;
    }

    /*
     * Get the mass of this person in kilograms
     */
    public String getMass(){
        return this.mass;
    }

    /*
     * Get the hair color of this person
     */
    public String getHair_color(){
        return this.hair_color;
    }

    /*
     * Get the skin color of this person
     */
    public String getSkin_color(){
        return this.skin_color;
    }

    /*
     * Get the eye color of this person
     */
    public String getEye_color(){
        return this.eye_color;
    }

    /*
     * Get the birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin)
     */
    public String getBirth_year(){
        return this.birth_year;
    }

    /*
     * Get the gender of this person (if known)
     */
    public String getGender(){
        return this.gender;
    }

    /*
     * Get the url of the planet resource that this person was born on
     */
    public String getHomeworld(){
        return this.homeworld;
    }
}
