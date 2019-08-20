package org.o7planning.sbjsp;

import com.google.gson.JsonObject;

public class Starship extends Metadata{
	private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String hyperdrive_rating;
    private String MGLT;
    private String starship_class;
    private String[] pilots;
    
    public Starship(JsonObject jsonObject) {
    	this.name = this.getAsString(jsonObject.get("name"));
        this.model = this.getAsString(jsonObject.get("model"));
        this.manufacturer = this.getAsString(jsonObject.get("manufacturer"));
        this.cost_in_credits = this.getAsString(jsonObject.get("cost_in_credits"));
        this.length = this.getAsString(jsonObject.get("length"));
        this.max_atmosphering_speed = this.getAsString(jsonObject.get("max_atmosphering_speed"));
        this.crew = this.getAsString(jsonObject.get("crew"));
        this.passengers = this.getAsString(jsonObject.get("passengers"));
        this.cargo_capacity = this.getAsString(jsonObject.get("cargo_capacity"));
        this.consumables = this.getAsString(jsonObject.get("consumables"));
        this.hyperdrive_rating = this.getAsString(jsonObject.get("hyperdrive_rating"));
        this.MGLT = this.getAsString(jsonObject.get("MGLT"));
        this.starship_class = this.getAsString(jsonObject.get("starship_class"));
        this.pilots = toUrlArray(jsonObject.get("pilots").getAsJsonArray());
        this.films = toUrlArray(jsonObject.get("films").getAsJsonArray());
        this.url = this.getAsString(jsonObject.get("url"));
        this.created = this.getAsString(jsonObject.get("created"));
        this.edited = this.getAsString(jsonObject.get("edited"));
    }
    
    /*
	 * Get the name of this starship. The common name, such as Death Star
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * Get the model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station
	 */
	public String getModel() {
		return this.model;
	}

	/*
	 * Get the manufacturer of this starship. Comma seperated if more than one 
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}

	/*
	 * Get the cost of this starship new, in galactic credits
	 */
	public String getCost_in_credits() {
		return this.cost_in_credits;
	}

	/*
	 * Get the length of this starship in meters
	 */
	public String getLength() {
		return this.length;
	}

	/*
	 * Get the max_atmosphering_speed
	 */
	public String getMax_atmosphering_speed() {
		return this.max_atmosphering_speed;
	}

	/*
	 * Get the number of personnel needed to run or pilot this starship
	 */
	public String getCrew() {
		return this.crew;
	}

	/*
	 * Get the number of non-essential people this starship can transport
	 */
	public String getPassengers() {
		return this.passengers;
	}

	/*
	 * Get the maximum number of kilograms that this starship can transport
	 */
	public String getCargo_capacity() {
		return this.cargo_capacity;
	}

	/*
	 * Get the maximum length of time that this starship can provide consumables for its entire crew without having to resupply
	 */
	public String getConsumables() {
		return this.consumables;
	}

	/*
	 * Get the class of this starships hyperdrive
	 */
	public String getHyperdrive_rating() {
		return this.hyperdrive_rating;
	}

	/*
	 * Get the maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance 
	 * and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference 
	 * in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth
	 */
	public String getMGLT() {
		return this.MGLT;
	}

	/*
	 * Get the class of this starship, such as Starfighter or Deep Space Mobile Battlestation
	 */
	public String getStarship_class() {
		return this.starship_class;
	}

	/*
	 * Get the People URL Resources that this starship has been piloted by
	 */
	public String[] getPilots() {
		return this.pilots;
	}
}
