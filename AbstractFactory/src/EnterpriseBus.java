import java.util.Calendar;

public abstract class EnterpriseBus {
	public abstract UrbanBusPass emitsUrbanPass(String origin, String destiny, Calendar departure);
	public abstract InterstateBusPass emitsInterstatePass(String origin, String destiny, Calendar departure);
}
