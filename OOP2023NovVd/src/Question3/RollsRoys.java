package Question3;

public class RollsRoys implements ICar {
	private static RollsRoys rr = null;
	
	public void displayVehicle() {
		System.out.println("Factory rolls out RollsRoys Car");
	}

	public static RollsRoys getInstance() {
		if(rr == null) {
			synchronized (RollsRoys.class) {
				if(rr == null) {
					rr = new RollsRoys();
				}
			}
		}
		
		return rr;
	}
}
