package Question4;

public class TriangleShapes implements IDrawableShapes {
	public static TriangleShapes tri = null;
	@Override
	public void drawShapes(String robotType) {
		// TODO Auto-generated method stub
		System.out.print("Draw Triangles ");
	}
	
	public static TriangleShapes getInstance() {
		if(tri == null) {
			synchronized (TriangleShapes.class) {
				if(tri == null) {
					tri = new TriangleShapes();
				}
			}
		}
		
		return tri;
	}

}
