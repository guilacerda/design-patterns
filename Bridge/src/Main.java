
public class Main {

	public static void main(String[] args) {
	    AbstractWindow windows = new DialogWindow(new WindowsWin());
	    windows.draw();
	    windows = new AlertWindow(new WindowsWin());
	    windows.draw();
	}

}
