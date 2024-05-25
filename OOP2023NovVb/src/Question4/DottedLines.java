package Question4;

public class DottedLines implements IDrawableLines {
	public static DottedLines dot = null;
	@Override
	public void drawLines(String robotType) {
		// TODO Auto-generated method stub
		System.out.print("Draw Dotted Lines ");
	}
	
	public static DottedLines getInstance() {
		if(dot == null) {
			synchronized (DottedLines.class) {
				if(dot == null) {
					dot = new DottedLines();
				}
			}
		}
		
		return dot;
	}

}
