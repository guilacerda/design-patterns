import java.util.Calendar;

public class ConcreteInterpriseBus extends EnterpriseBus{
	public UrbanBusPass emitsUrbanPass(String origin, String destiny, Calendar departure) {
		return new ConcreteUrbanBusPass(origin, destiny, departure);  
	}

	public InterstateBusPass emitsInterstatePass(String origin, String destiny, Calendar departure) {
		return new ConcreteInterstateBusPass(origin, destiny, departure);
	}
}
