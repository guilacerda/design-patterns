import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Pass {
	private String origin;
	private String destiny;
	private Calendar departure;
	
	protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public Pass(String origin, String destiny, Calendar departure) {
		this.origin = origin;
		this.destiny = destiny;
		this.departure = departure;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestiny() {
		return destiny;
	}
	
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	
	public Calendar getDeparture() {
		return departure;
	}
	
	public void setDeparture(Calendar departure) {
		this.departure = departure;
	}
	
	public void showDetails() {
		
	}
	
}
