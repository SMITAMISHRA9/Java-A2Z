public class InheritanceReplica {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student= new Student();
		PCM pcm= new PCM();
		PCB pcb= new PCB();
		student.learning();
		pcm.math();
		pcb.bio();
		
		
	
	}
	 
	}

	
	class Student{
		
		static int count;
		public Student()
		{
			count++;
			}
		
		int studentId=14;
    String Name="Kendriya Vidyalaya,Mathura";
		public void learning(){
			System.out.println("learninggggg!!!!!!");
			System.out.println("the total number of objects created is"+count);
		}
	}

	class PCM extends Student{
		public void math() {
			System.out.println("I am Math Student!");
			
		}
	
	}
	class PCB extends Student{
			public void bio() {
				System.out.println("I am Biology Student!");
			}}