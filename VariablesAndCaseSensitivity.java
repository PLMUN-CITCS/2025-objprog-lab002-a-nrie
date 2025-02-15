public class VariablesAndCaseSensitivity {
	public static void main(String[] args) {
		int studentAge = 15;            //integer (whole number)
		double itemPrice = 29.99;      //double (with decimal)
		String studentName = "Alice";
		
		//Example of Case Sensitivity
		int counter = 10;
		int Counter = 20;
		
		// Concatenation 
		System.out.println("Student Age: " + studentAge);
		System.out.println("Item Price: $" + itemPrice);
		System.out.println("Student Name: " + studentName);
		System.out.println("Counter: " + counter);
		System.out.println("Counter (Different Case): " + Counter);
	}
}