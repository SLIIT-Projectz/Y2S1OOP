package Question4;

public class StraightLines implements IDrawableLines{
	public static StraightLines str = null;
	@Override
	public void drawLines(String robotType) {
		// TODO Auto-generated method stub
		System.out.print("Draw Straight Lines ");
	}
	
	public static StraightLines getInstance() {
		if(str == null) {
			synchronized (StraightLines.class) {
				if(str == null) {
					str = new StraightLines();
				}
			}
		}
		
		return str;
	}
}
