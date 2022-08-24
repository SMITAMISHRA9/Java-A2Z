
import java.time.LocalDate;
public class PlusMinusDate {
public static void main(String[] args) {
		        LocalDate date1 = LocalDate.parse("2022-08-10");
		        LocalDate date2 = LocalDate.parse("2022-05-09");
		        System.out.println("Date before Using Plus Method : " + date1);
		        LocalDate plusday = date1.plusDays(9);
		        LocalDate plusmonth= date1.plusMonths(2);
		        LocalDate plusyear = date1.plusYears(18);
		        System.out.println("Date after adding days: " + plusday);
		        System.out.println("Date after adding months: " + plusmonth);
		        System.out.println("Date after adding years: " + plusyear);
		        
		        System.out.println("Date before Using Minus Method : " + date1);
		        LocalDate minusday = date1.minusDays(9);
		        LocalDate minusmonth= date1.minusMonths(2);
		        LocalDate minusyear = date1.minusYears(18);
		        System.out.println("Date after adding days: " + minusday);
		        System.out.println("Date after adding months: " + minusmonth);
		        System.out.println("Date after adding years: " + minusyear);
		}
	}