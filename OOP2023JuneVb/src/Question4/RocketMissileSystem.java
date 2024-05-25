package Question4;

public class RocketMissileSystem implements MissileSystem {
	public static RocketMissileSystem rms = null;
	
	private RocketMissileSystem() {
		System.out.println("Initialize RocketMissile System");
	}
	
	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		System.out.print("Rocket Missile launch from " + source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		System.out.println("and Rocket Missile blast Flight " + destination);
	}
	
	public static RocketMissileSystem getInstance() {
		if(rms == null) {
			synchronized (RocketMissileSystem.class) {
				if(rms == null) {
					rms = new RocketMissileSystem();
				}
			}
		}
		
		return rms;
	}

}
