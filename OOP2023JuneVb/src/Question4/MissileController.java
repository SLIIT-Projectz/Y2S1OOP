package Question4;

public class MissileController {
	public static MissileController mc = null;
	private MissileOperation launchOperation;
	private MissileOperation blastOperation;
	
	private MissileController() {
		System.out.println("Initialize Missile Controller");
	}
	
	public void setLaunchOperation(MissileOperation launchOperation) {
		this.launchOperation = launchOperation;
	}
	
	public void setBlastOperation(MissileOperation blastOperation) {
		this.blastOperation = blastOperation;
	}
	
	public void performLaunching(String start) {
		if(launchOperation != null) {
			launchOperation.initiateOperation(start);
		}
	}
	
	public void performBlasting(String end) {
		if(blastOperation != null) {
			blastOperation.initiateOperation(end);
		}
	}
	
	public static MissileController getInstance() {
		if(mc == null) {
			synchronized (MissileController.class) {
				if(mc == null) {
					mc = new MissileController();
				}
			}
		}
		
		return mc;
	}
}
