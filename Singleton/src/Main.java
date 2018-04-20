
public class Main {
	public static void main (String[] Args) {
		// Doesn't allows instantiate more than once 
		// If you try, the method return only one instance
		
		Window window = Window.getInstance();
		window.pack();
		window.setVisible(true);
	}
}
