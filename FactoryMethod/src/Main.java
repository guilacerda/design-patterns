import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Enterprise enterpriseUrban  = new UrbanBusEnterprise();
		Enterprise enterpriseInterstate = new InterstateBusEnterprise();
		
		Pass passUrban = enterpriseUrban.emitsPass("Planaltina", "Brasília", new GregorianCalendar(2018, Calendar.APRIL, 18, 55, 0));
	
		Pass passInterstate = enterpriseInterstate.emitsPass("Gama", "Planaltina", new GregorianCalendar(2018, Calendar.APRIL, 18, 55, 0));

		passUrban.showDetails();
		passInterstate.showDetails();
	}

}
