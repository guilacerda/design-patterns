
public class DialogWindow extends AbstractWindow{
	public DialogWindow(WindowsImp windows) {
		super(windows);
	}
	
    @Override
    public void draw() {
        drawWindow("Dialog Windows");
        drawButton("Yes button");
        drawButton("No button");
        drawButton("Cancel button");
    }
}
