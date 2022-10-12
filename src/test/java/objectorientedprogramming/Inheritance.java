// Multilevel inheritance
package objectorientedprogramming;
class Loginn    //creating the class          
{
	void verifyloginn() //creating the method
	{
		System.out.println("Login is verified"); //printing the statement
	}
}
class Benificiaryy extends Loginn //sub class inherites the parent property
{
	void verifybenyficiaryy()
	{
		System.out.println("Benificiary is verified");
	}
}
public class Inheritance extends Benificiaryy {  //The class inherites the property of Benificiaryy 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj=new Inheritance(); //initialization of object
		obj.verifybenyficiaryy();  //calling of the methods
		obj.transferfundd();
		obj.verifyloginn();
	}
	void transferfundd() //Defining the method
	{
		System.out.println("Fund is transfered");
	}

}


