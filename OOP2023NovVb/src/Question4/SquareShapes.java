package Question4;

public class SquareShapes implements IDrawableShapes {
	public static SquareShapes sq = null;
	@Override
	public void drawShapes(String robotType) {
		// TODO Auto-generated method stub
		System.out.print("Draw Squares ");
	}
	
	public static SquareShapes getInstance() {
		if(sq == null) {
			synchronized (SquareShapes.class) {
				if(sq == null) {
					sq = new SquareShapes();
				}
			}
		}
		
		return sq;
	}

}
