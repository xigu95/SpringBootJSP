package org.o7planning.sbjsp;

import com.google.gson.JsonObject;
public class Film extends Metadata{
    public String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String  release_date;

    public Film(JsonObject jsonObject) {
        this.title = jsonObject.get("title").getAsString();
        this.episode_id = jsonObject.get("episode_id").getAsInt();
        this.opening_crawl = jsonObject.get("opening_crawl").getAsString();
        this.director = jsonObject.get("director").getAsString();
        this.producer = jsonObject.get("producer").getAsString();
        this.release_date = jsonObject.get("release_date").getAsString();
        this.characters = toUrlArray(jsonObject.get("characters").getAsJsonArray());
        this.planets = toUrlArray(jsonObject.get("planets").getAsJsonArray());
        this.starships = toUrlArray(jsonObject.get("starships").getAsJsonArray());
        this.vehicles = toUrlArray(jsonObject.get("vehicles").getAsJsonArray());
        this.species = toUrlArray(jsonObject.get("species").getAsJsonArray());
        this.url = jsonObject.get("url").getAsString();
        this.created = jsonObject.get("created").getAsString();
        this.edited = jsonObject.get("edited").getAsString();
    }

    /*
     *  Get the title of this film
     */
    public String getTitle(){
        return this.title;
    }

    /*
     *  Get the episode number of this film
     */
    public int getEpisode_id(){
        return this.episode_id;
    }

    /*
     * Get the opening crawl text at the beginning of this film
     */
    public String getOpening_crawl(){
        return this.opening_crawl;
    }

    /*
     * Get the director of this film
     */
    public String getDirector(){
        return this.director;
    }

    /*
     * Get the producer(s) of this film
     */
    public String getProducer(){
        return this.producer;
    }

    /*
     * Get the release date at original creator country
     */
    public String getRelease_date(){
        return this.release_date;
    }
}
