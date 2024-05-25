package Question4;

public class ChineseRobot extends DesignSelector {
	public void designShapes() {
		if(drawableShapes != null) {
			drawableShapes.drawShapes("Chinese");
			System.out.println("on clothes by Chinese Robot");
		} else {
			System.out.println("No shape");
		}
	}

	@Override
	protected void designLines() {
		// TODO Auto-generated method stub
		if(drawableLines != null) {
			drawableLines.drawLines("Chinese");
			System.out.println("on clothes by Chinese Robot");
		} else {
			System.out.println("No Lines");
		}
	}
}
