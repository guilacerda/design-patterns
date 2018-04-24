import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		EnterpriseBus enterprise = new ConcreteEnterpriseBus();

		UrbanBusPass passUrban = enterprise.emitsUrbanPass("Planaltina", "Brasília",
                                                        new GregorianCalendar(2018,
                                                                              Calendar.APRIL,
                                                                              18,
                                                                              55,
                                                                              0));

		InterstateBusPass passInterstate = enterprise.emitsInterstatePass("Gama", "Planaltina",
                                                                       new GregorianCalendar(2018,
                                                                                             Calendar.APRIL,
                                                                                             18,
                                                                                             55,
                                                                                             0));

		passUrban.showDetails();
		passInterstate.showDetails();
	}

}
