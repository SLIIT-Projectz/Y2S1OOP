package Question4;

public abstract class DesignSelector {
	IDrawableLines drawableLines;
	IDrawableShapes drawableShapes;
	
	public void setDrawableLines(IDrawableLines drawableLines) {
		this.drawableLines = drawableLines;
	}
	
	public void setDrawableShapes(IDrawableShapes drawableShapes) {
		this.drawableShapes = drawableShapes;
	}

	protected abstract void designLines();
	protected abstract void designShapes();
}
