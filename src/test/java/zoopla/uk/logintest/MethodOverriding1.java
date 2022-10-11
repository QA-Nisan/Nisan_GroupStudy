package zoopla.uk.logintest;

public class MethodOverriding1 extends MethodOverriding2 {

	public void getVehicle () {
		String car = " Lexus Es350";
		
		System.out.println("My father gave me a car :"+ car);
	}
	
	public void getMarry () {
		System.out.println("Nasima");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding1 obj = new MethodOverriding1();
		obj.getGold();
		obj.getMarry();
		obj.getSalary();
		obj.getVehicle();
		
	}

}
