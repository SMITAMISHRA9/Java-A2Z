import java.util.Scanner;
public class CountObj {
	static int count;
	CountObj(){
		count++;
	}
	public static void main(String[] args) {
		CountObj Obj1 = new CountObj();
		CountObj Obj2 = new CountObj();
		CountObj Obj3 = new CountObj();
		CountObj Obj4 = new CountObj();
		CountObj Obj5 = new CountObj();
		System.out.println("Total Number:"+CountObj.count);
		
		
		
	}

}
