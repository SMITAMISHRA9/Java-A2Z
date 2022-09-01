import java.util.*;

class SetList {
	public static void main(String[] args)
	{
		Set<String> Obj1 = new HashSet<String>();
		Obj1.add("Clayfin");
		Obj1.add("Technologies private ltd...!!!");

		// Creating an array list using constructor
		List<String> Obj2 = new ArrayList<String>(Obj1);

		System.out.println("Created ArrayList is");
		for (String y : Obj2)
			System.out.println(y);

		System.out.println("Created LinkedList is");
		List<String> nL = new LinkedList<String>(Obj1);
		for (String y : nL)
			System.out.println(y);
	}
}  