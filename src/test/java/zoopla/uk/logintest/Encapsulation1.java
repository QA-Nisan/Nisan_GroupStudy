package zoopla.uk.logintest;

public class Encapsulation1 {

	//put variable
    private String name = "Nisan";
	private int salary = 100000;
	private String job = "QA Automation Engineer";
	
// getter and setter method
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	public String getJob() {
		return job;
	}

	//main method create 	
	public static void main(String[] args) {
		// create object 
		 Encapsulation1 obj = new  Encapsulation1 ();
		 //print out for seeing in console 
	 System.out.println("Employee Name : " + obj.getName());
		System.out.println("Nisan Salary is : " + obj.getSalary());
System.out.println("Nisan current roles is : " + obj.getJob());
		
		
		
		
		 
		 
		 
		 
	}

}
