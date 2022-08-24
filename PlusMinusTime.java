import java.time.LocalTime;
public class PlusMinusTime {
public static void main(String[] args) {
		        LocalTime time1 = LocalTime.parse("09:18:27");
		        LocalTime time2 = LocalTime.parse("05:04:00");
		        System.out.println("Time before Using Plus Method : " + time1);
		        LocalTime plussec = time1.plusSeconds(9);
		        LocalTime plusmin= time1.plusMinutes(2);
		        LocalTime plushr = time1.plusHours(18);
		        System.out.println("Time after adding Seconds: " + plussec);
		        System.out.println("Time after adding Minutes: " + plusmin);
		        System.out.println("Time after adding Hours: " + plushr);
		        
		        System.out.println("Time before Using Minus Method : " + time2);
		        LocalTime minussec = time2.minusSeconds(9);
		        LocalTime minusmin= time2.minusMinutes(2);
		        LocalTime minushr = time2.minusHours(18);
		        System.out.println("Time after adding days: " + minussec);
		        System.out.println("Time after adding months: " + minusmin);
		        System.out.println("Time after adding years: " + minushr);
		}
	}