package org.o7planning.sbjsp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;

public class MainControllerSpec {
	MainController mockController;
	
	@Before
	public void init() {
	    MockitoAnnotations.initMocks(this);
	    mockController = mock(MainController.class);
	}

	@Test
	public void testGetCharacter() {
		Mockito.when(mockController.doGet(Mockito.anyString())).thenReturn(new JsonObject());
		
		Character mockCharacter = mock(Character.class);;
		Mockito.when(mockController.getCharacter(Mockito.anyString())).thenReturn(mockCharacter);
		
		String mockID = "1";
		Character tmp = mockController.getCharacter(mockID);
		Mockito.verify(mockController).getCharacter(Mockito.anyString());
		assertThat(tmp, is(mockCharacter));
	}
	
	@Test
	public void testGetPlanet() {
		Mockito.when(mockController.doGet(Mockito.anyString())).thenReturn(new JsonObject());
		
		Planet mockPlanet = mock(Planet.class);;
		Mockito.when(mockController.getPlanet(Mockito.anyString())).thenReturn(mockPlanet);
		
		String mockID = "1";
		Planet tmp = mockController.getPlanet(mockID);
		Mockito.verify(mockController).getPlanet(Mockito.anyString());
		assertThat(tmp, is(mockPlanet));
	}
	
	@Test
	public void testGetStarship() {
		Mockito.when(mockController.doGet(Mockito.anyString())).thenReturn(new JsonObject());
		
		Starship mockStarship = mock(Starship.class);;
		Mockito.when(mockController.getStarship(Mockito.anyString())).thenReturn(mockStarship);
		
		String mockID = "1";
		Starship tmp = mockController.getStarship(mockID);
		Mockito.verify(mockController).getStarship(Mockito.anyString());
		assertThat(tmp, is(mockStarship));
	}
	
	@Test
	public void testGetVehicle() {
		Mockito.when(mockController.doGet(Mockito.anyString())).thenReturn(new JsonObject());
		
		Vehicle mockVehicle = mock(Vehicle.class);;
		Mockito.when(mockController.getVehicle(Mockito.anyString())).thenReturn(mockVehicle);
		
		String mockID = "1";
		Vehicle tmp = mockController.getVehicle(mockID);
		Mockito.verify(mockController).getVehicle(Mockito.anyString());
		assertThat(tmp, is(mockVehicle));
	}
	
	@Test
	public void testGetSpecies() {
		Mockito.when(mockController.doGet(Mockito.anyString())).thenReturn(new JsonObject());
		
		Species mockSpecies = mock(Species.class);;
		Mockito.when(mockController.getSpecies(Mockito.anyString())).thenReturn(mockSpecies);
		
		String mockID = "1";
		Species tmp = mockController.getSpecies(mockID);
		Mockito.verify(mockController).getSpecies(Mockito.anyString());
		assertThat(tmp, is(mockSpecies));
	}
}
