package Question3;

import java.util.Arrays;

public class ResourceManager {
	private boolean[] TResources;
	
	public ResourceManager(int TResources) {
		// TODO Auto-generated constructor stub
		this.TResources = new boolean[TResources];
		Arrays.fill(this.TResources, false);

	}

	public synchronized int requestResource(int user) {
		
		while(true) {
			for (int i = 0; i < TResources.length; i++) {
                if (!TResources[i]) {
                    TResources[i] = true;
                    System.out.println("User " + user + " acquires Resource " + i);
                    return i;
                }
            }
            System.out.println("User " + user + " is waiting for a resource.");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("User " + user + " was interrupted.");
                return -1;
            }
		}
	}
	
	public synchronized void releaseResource(int resourceID, int userid) {
		TResources[resourceID] = false;
		System.out.println("User " + userid + " releases Resource " + resourceID);
		notifyAll();
	}
}
