import java.util.Calendar;

public class ConcreteUrbanBusPass extends UrbanBusPass{
	public ConcreteUrbanBusPass(String origin, String destiny, Calendar departure) {
		super (origin, destiny, departure);
	}
	
	public void showDetails() {
		System.out.println("Interstate bus pass: " + this.getOrigin() +
							" to " + this.getDestiny() +
							", Date/Hour: " + super.df.format(this.getDeparture().getTime()));
	}
}
