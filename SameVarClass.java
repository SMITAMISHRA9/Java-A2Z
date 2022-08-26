package co.task;
class Parent {
    String string ="I am Parent class";
    }

    class Child extends Parent {
	    String string = "I am Child class";
	}

public class SameVarClass {
		public static void main(String[] args) {
	        Parent parent = new Parent();
	        System.out.println("Direct calling to object parent class"+parent.string);
	        Child child = new Child();
	        System.out.println("Direct calling to object child class"+child.string);
	        parent = new Child();
	        System.out.println("Calling Parent class with the help of Child  class"+parent.string);
	        }
	 
	
}
