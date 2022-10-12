//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

//In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime
package objectorientedprogramming;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int result[]=new int[10]; //initializing the array
		int i = 11;  //giving array bound error
		try
		{
			
			result[i]=10/0; // Arithmatic error
			System.out.println(result[i]); //print the result
			
		}
		catch(ArrayIndexOutOfBoundsException e) //If Array Index Out Of Bounds Exception,this method will be called
		{
			System.out.println("Cannot store the in this index");
		}
		catch(ArithmeticException e )// If Arithmetic Exception is there, then this method will be called
		{
			System.out.println("Cannot devide by zero..please enter different number");
		}
		// If we have two catch then it will print one at a time

	}
	//We have both exception together..but it will print only arithmatic error
}



