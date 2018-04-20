import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame {
	private static Window window = null;
	
	// Calls the constructor method and set the dimension of the window
	private Window() {
		setPreferredSize(new Dimension(640, 480));
	}
	
	// Allows that create only instance of the Window class
	public static Window getInstance() {
		if (window == null) {
			window = new Window();
		}
		
		return window;
	}
}
