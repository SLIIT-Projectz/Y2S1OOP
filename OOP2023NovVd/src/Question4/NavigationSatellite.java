package Question4;

public class NavigationSatellite implements ISatellite{
	String name;
	
	public NavigationSatellite(String name) {
		this.name = name;
	}
	@Override
	public void activate() {
		System.out.println("Navigation Satellite activated");
		
	}

	@Override
	public void deactivate() {
		System.out.println("Navigation Satellite deactivated");
	}

}
