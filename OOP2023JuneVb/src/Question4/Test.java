package Question4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissileSystem hms = HeatMissileSystem.getInstance();
		MissileSystem rms = RocketMissileSystem.getInstance();
		
		MissileController mc = MissileController.getInstance();
		
		mc.setLaunchOperation(new LaunchMissile(hms));
		mc.setBlastOperation(new BlastMissile(hms));
		
		mc.performLaunching("Colombo");
		mc.performBlasting("Flight MH370");
		
		mc.setLaunchOperation(new LaunchMissile(rms));
		mc.setBlastOperation(new BlastMissile(rms));
		
		mc.performLaunching("Kandy");
		mc.performBlasting("Flight MH420");
	}

}
