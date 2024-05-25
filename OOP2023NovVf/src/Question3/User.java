package Question3;

public class User extends Thread{
	private ResourceManager rm;
	int users;

	public User(int users, ResourceManager rm) {
		// TODO Auto-generated constructor stub
		this.rm = rm;
		this.users = users;
	}
	
	public void run() {
		while(true) {
			int resourceID = rm.requestResource(users);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rm.releaseResource(resourceID, users);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
