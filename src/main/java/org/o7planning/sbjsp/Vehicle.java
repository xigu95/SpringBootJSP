package org.o7planning.sbjsp;

import com.google.gson.JsonObject;

public class Vehicle extends Metadata{
	private String name;
    private String model;
    private String vehicle_class;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String[] pilots;
    
    public Vehicle(JsonObject jsonObject) {
    	this.name = this.getAsString(jsonObject.get("name"));
        this.model = this.getAsString(jsonObject.get("model"));
        this.vehicle_class = this.getAsString(jsonObject.get("vehicle_class"));
        this.manufacturer = this.getAsString(jsonObject.get("manufacturer"));
        this.cost_in_credits = this.getAsString(jsonObject.get("cost_in_credits"));
        this.length = this.getAsString(jsonObject.get("length"));
        this.max_atmosphering_speed = this.getAsString(jsonObject.get("max_atmosphering_speed"));
        this.crew = this.getAsString(jsonObject.get("crew"));
        this.passengers = this.getAsString(jsonObject.get("passengers"));
        this.cargo_capacity = this.getAsString(jsonObject.get("cargo_capacity"));
        this.consumables = this.getAsString(jsonObject.get("consumables"));
        this.pilots = toUrlArray(jsonObject.get("pilots").getAsJsonArray());
        this.films = toUrlArray(jsonObject.get("films").getAsJsonArray());
        this.url = this.getAsString(jsonObject.get("url"));
        this.created = this.getAsString(jsonObject.get("created"));
        this.edited = this.getAsString(jsonObject.get("edited"));
    }
    
    /*
	 * Get the name of this vehicle. The common name, such as Death Star
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * Get the model or official name of this vehicle. Such as T-65 X-wing or DS-1 Orbital Battle Station
	 */
	public String getModel() {
		return this.model;
	}
	
	/*
	 * Get the class of this vehicle, such as "Wheeled" or "Repulsorcraft"
	 */
	public String getVehicle_class() {
		return this.vehicle_class;
	}

	/*
	 * Get the manufacturer of this vehicle. Comma seperated if more than one 
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}

	/*
	 * Get the cost of this vehicle new, in galactic credits
	 */
	public String getCost_in_credits() {
		return this.cost_in_credits;
	}

	/*
	 * Get the length of this vehicle in meters
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
	 * Get the number of personnel needed to run or pilot this vehicle
	 */
	public String getCrew() {
		return this.crew;
	}

	/*
	 * Get the number of non-essential people this vehicle can transport
	 */
	public String getPassengers() {
		return this.passengers;
	}

	/*
	 * Get the maximum number of kilograms that this vehicle can transport
	 */
	public String getCargo_capacity() {
		return this.cargo_capacity;
	}

	/*
	 * Get the maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply
	 */
	public String getConsumables() {
		return this.consumables;
	}

	/*
	 * Get the People URL Resources that this vehicle has been piloted by
	 */
	public String[] getPilots() {
		return this.pilots;
	}
}
