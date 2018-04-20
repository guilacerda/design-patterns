import java.util.Calendar;

public class UrbanBusEnterprise extends Enterprise{
	public Pass emitsPass(String origin, String destiny, Calendar departure) {
		return new InterstateBusPass(origin, destiny, departure);
	}
}
