//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass

package objectorientedprogramming;
class vehicle
{
	void cars() //method declared as cars
	{
		System.out.println("We have a veriety of cars");
	}
}

public class Override extends vehicle //This class inherites the parent class
{
	
	public static void main(String[] args) 
	{
		
		Override obj=new Override(); //initialization of object
		obj.cars();  //calling the object with mathod name

	}
	void cars() //same method name is given as in class vehicle
	{
		super.cars();   //super can be used to invoke immediate parent class method
		System.out.println("BMW is the best"); //So code can be edited in this method overriding.
	}
}


