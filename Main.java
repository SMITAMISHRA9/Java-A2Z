import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
LinkedList<Integer> L1 = new LinkedList<>();
        L1.add(1);
        L1.add(3);
        L1.add(5);
LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(2);
        L2.add(4);
        L2.add(6);
LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(L1);
        merged.addAll(L2);

System.out.println("L1 : "+L1);
System.out.println("L2 : "+L2);
System.out.println("Merged : "+merged);
}
}