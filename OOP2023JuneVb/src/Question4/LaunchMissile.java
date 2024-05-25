package Question4;

public class LaunchMissile implements MissileOperation {
	private MissileSystem missileSystem;
	
	public LaunchMissile(MissileSystem missileSystem) {
		this.missileSystem = missileSystem;
	}
	@Override
	public void initiateOperation(String location) {
		// TODO Auto-generated method stub
		missileSystem.launch(location);

	}

}
