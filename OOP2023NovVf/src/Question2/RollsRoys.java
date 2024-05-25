package Question2;

public class RollsRoys implements ICar {
	public static RollsRoys roll = null;
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		System.out.println("RollsRoys Car");
	}
	
	public static RollsRoys getInstance() {
		if(roll == null) {
			synchronized (RollsRoys.class) {
				if(roll == null) {
					roll = new RollsRoys();
				}
			}
		}
		
		return roll;
	}

}
