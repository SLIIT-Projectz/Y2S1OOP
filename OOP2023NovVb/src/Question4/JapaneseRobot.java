package Question4;

public class JapaneseRobot extends DesignSelector {
	
	public void designLines() {
		if(drawableLines != null) {
			drawableLines.drawLines("Japanese");
			System.out.println("on clothes by Japanese Robot");
		} else {
			System.out.println("No Lines");
		}
	}

	@Override
	protected void designShapes() {
		if(drawableShapes != null) {
			drawableShapes.drawShapes("Japanese");
			System.out.println("on clothes by Japanese Robot");
		} else {
			System.out.println("No shape");
		}
	}
}
