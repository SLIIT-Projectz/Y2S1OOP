package Question4;

public class HeatMissileSystem implements MissileSystem {
	public static HeatMissileSystem hms = null;
	
	private HeatMissileSystem() {
		System.out.println("Initialize Heat MissileSystem");
	}
	
	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		System.out.print("Heat Missile launch from " + source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		System.out.println("and Heat Missile blast Flight " + destination);
	}
	
	public static HeatMissileSystem getInstance() {
		if(hms == null) {
			synchronized (HeatMissileSystem.class) {
				if(hms == null) {
					hms = new HeatMissileSystem();
				}
			}
		}
		
		return hms;
	}

}
