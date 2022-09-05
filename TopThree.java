package co.clay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopThree
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(new Employee("Smita",900, 99891.0));
		l.add(new Employee("Titiksha",918, 76689.0));
		l.add(new Employee("Peshal",927, 98648.0));
		l.add(new Employee("Krati",936, 80001.0));
		l.add(new Employee("Anshi",963, 78965.0));
		l.add(new Employee("Muskan",972, 78556.0));
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		
		System.out.println();
		System.out.println("Top Three paid Salary for Employees  ");
		for(int i=0;i<3;i++)
		{
			System.out.println(l.get(i));
		}		
	}
	
}
class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, double salary) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) 
	{
		if(this.salary>o.salary)
			return 1;
		else if(this.salary<o.salary)
			return -1;
		else
			return 0;
	}
		
}
