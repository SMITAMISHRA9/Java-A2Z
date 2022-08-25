import java.util.Scanner;
public class CountWord {
	public  static void WordCount(String dummyText, String find)
	{
		String arr[]=dummyText.split(" ");
		int count=0;		
		for(int i=0;i<arr.length;i++)
		{
			if(find.equals(arr[i]))
			{
				count++;
			}			
		}
		if(count>0)
		{
			System.out.println("The word present total "+count+"times in Dummy Text ");
		}
		else {
			System.out.println("Sorry,"+find+"is not present in Dummy Text");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dummyText="Lorem Ipsum is simply dummy text of the printing and \r\n"
				+ "typesetting Lorem industry. Lorem Ipsum has been the industry's \r\n"
				+ "standard dummy text ever Lorem since the 1500s, when an unknown \r\n"
				+ "printer took a galley of Lorem type and scrambled it to make a \r\n"
				+ "type specimen book. It has survived Lorem not only five centuries, \r\n"
				+ "but also the Lorem leap into electronic typesetting, \r\n"
				+ "remaining essentially Lorem unchanged. \r\n";
		System.out.println(dummyText);
		Scanner sc= new Scanner(System.in);
		System.out.println("Word that you want to find: ");
		String find=sc.next();
		WordCount(dummyText, find);

	}

}
