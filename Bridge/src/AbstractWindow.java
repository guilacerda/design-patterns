
public abstract class AbstractWindow {
	protected WindowsImp windows;
	
	public AbstractWindow(WindowsImp w) {
		windows = w;
	}
	
	public void drawWindow(String title) {
		System.out.println(title);
	}
	
	public void drawButton(String title) {
		System.out.println(title);
	}
	
	public abstract void draw();
}
