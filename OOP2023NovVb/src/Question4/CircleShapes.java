package Question4;

public class CircleShapes implements IDrawableShapes {
	public static CircleShapes circle = null;
	@Override
	public void drawShapes(String robotType) {
		// TODO Auto-generated method stub
		System.out.print("Draw Circles ");
	}
	
	public static CircleShapes getInstance() {
		if(circle == null) {
			synchronized (CircleShapes.class) {
				if(circle == null) {
					circle = new CircleShapes();
				}
			}
		}
		
		return circle;
	}

}
