package Question4;

public class DroneSatellite implements ISatellite {
	String name;
	
	public DroneSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println("Drone satellite activated");
		
	}

	@Override
	public void deactivate() {
		System.out.println("Drone satellite deactivated");
		
	}

}
