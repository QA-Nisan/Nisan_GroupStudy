package zoopla.uk.logintest;

public class MethodOverLoading {

	public void getProperty(double salary ) {
				System.out.println("bonus : " + salary );
	}
	

		
	public void getProperty (String name ,int salary) {
		System.out.println(" Employee name : " + name + " Employee Salary : "+ salary);
	}
	public void getProperty (int salary , String name) {
	System.out.println("Bonus : "+salary + "  Nickname : "+ name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverLoading obj = new  MethodOverLoading();
		 obj.getProperty("Sahab Uddin",10000);
		 obj.getProperty(10000,"Khan");
		 obj.getProperty(2000.50);
	}
	
	

}
