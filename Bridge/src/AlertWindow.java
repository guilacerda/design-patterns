
public class AlertWindow extends AbstractWindow{
	public AlertWindow(WindowsImp windows) {
		super(windows);
	}
	
    @Override
    public void draw() {
        drawWindow("Alert windows");
        drawButton("Ok");
    }
}
