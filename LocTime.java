import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class LocTime {
	public static void main(String[] args) {
		LocalTime time1 =LocalTime.now();
		LocalTime time2 =LocalTime.parse("09:18:18");
		LocalTime time3 =LocalTime.of(9,9,9,189);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		int time=time1.compareTo(time3);
		System.out.println(time);
		if(time==1) {
			System.out.println("time1 is greater than time2");
		}
		else if(time==-1) {
			System.out.println("time2 is greater than time1");
		}
		else {
			System.out.println("both time are equal");
		}
		System.out.println("Time1 before using Truncated");
		LocalTime trunctime1= time2.truncatedTo(ChronoUnit.HOURS);
		LocalTime trunctime2= time2.truncatedTo(ChronoUnit.MINUTES);
		LocalTime trunctime3= time2.truncatedTo(ChronoUnit.SECONDS);
		System.out.println("Time After Truncated to Hours:"+trunctime1);
		System.out.println("Time After Truncated to Hours:"+trunctime2);
		System.out.println("Time After Truncated to Hours:"+trunctime3);
	}

}
