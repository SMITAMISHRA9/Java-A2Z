package co.task;

class Admin extends Employee{

}
class Manager extends Employee{

}
public class Employee {
	static int count=0;
	public Employee() {
		count++;
	}


	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		Admin admin1=new Admin();
		Admin admin2=new Admin();
		
		Manager manager1 = new Manager();
		Manager manager2 = new Manager();
		
		System.out.println("the total number of objects created is "+count);
	}

}

