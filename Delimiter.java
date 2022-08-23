import java.util.Scanner;
public class Delitmer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String desc = sc.nextLine();
		Scanner scann = new Scanner(desc);
		scann.useDelimiter(" |-");
		while(scann.hasNext()) {
			System.out.println(scann.next());
		}
		scann.close();
		sc.close();
		
	}

}
