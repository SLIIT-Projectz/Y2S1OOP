package Question4;

public class BlastMissile implements MissileOperation {
	private MissileSystem missileSystem;
	
	public BlastMissile(MissileSystem missileSystem) {
		this.missileSystem = missileSystem;
	}
	@Override
	public void initiateOperation(String location) {
		// TODO Auto-generated method stub
		missileSystem.blast(location);
		
	}

}
