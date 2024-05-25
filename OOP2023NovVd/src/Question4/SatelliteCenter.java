package Question4;

public class SatelliteCenter {
	int option;
	ISatellite[] ISatellite;
	IGeoLocation[] IGeoLocation;
	
	NavigationSatellite navigationSatellite = new NavigationSatellite(null);
	DroneSatellite ds = new DroneSatellite(null);
	SatelliteLocation sl = new SatelliteLocation(null);
	
	public SatelliteCenter(int option, ISatellite[] satelliteArray, IGeoLocation[] trackerArray) {
		this.option = option;
		this.ISatellite = satelliteArray;
		this.IGeoLocation = trackerArray;
	}

	public void startService() {
		if(this.option == 0) {
			navigationSatellite.activate();
		} else {
			ds.activate();
		}
	}
	
	public void stopService() {
		navigationSatellite.deactivate();
		ds.deactivate();
	}
	
	public void locationService() {
		sl.displayLocation();
	}
}
