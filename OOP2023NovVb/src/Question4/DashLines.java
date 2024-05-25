package Question4;

public class DashLines implements IDrawableLines {
	public static DashLines dash = null;
	@Override
	public void drawLines(String robotType) {
		System.out.print("Draw Dash Lines ");
		
	}
	
	public static DashLines getInstance() {
		if(dash == null) {
			synchronized (DashLines.class) {
				if(dash == null) {
					dash = new DashLines();
				}
			}
		}
		
		return dash;
	}

}
