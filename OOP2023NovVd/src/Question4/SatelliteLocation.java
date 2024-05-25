package Question4;

public class SatelliteLocation implements IGeoLocation{
	String Location;
	
	public SatelliteLocation(String Location) {
		this.Location = Location;
	}
	@Override
	public void displayLocation() {
		System.out.println("The location is " + this.Location);
		
	}

}
