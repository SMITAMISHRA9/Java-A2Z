import java.time.LocalDate;

public class LocDate {

	public static void main(String[] args) {
		LocalDate obj1 = LocalDate.parse("2022-08-24");
		LocalDate obj2 = LocalDate.of(2022,8,23);
		LocalDate obj3 = LocalDate.of(2023,8,1);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1.getDayOfYear());
		System.out.println(obj1.getDayOfMonth());
		System.out.println(obj1.getDayOfWeek());
		System.out.println(obj1.getYear());
		System.out.println(obj1.getMonthValue());
		System.out.println(obj1.getMonth());
		System.out.println(obj1.isAfter(obj2));
		System.out.println(obj1.isBefore(obj2));
		System.out.println(obj1.isEqual(obj3));
		System.out.println(obj1.isLeapYear());
		
		
	}

}