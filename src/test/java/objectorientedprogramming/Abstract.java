//Abstract
//Data abstraction is the process of hiding certain details and showing only essential information to the user. Abstraction can be achieved with either abstract classes or interfaces
package objectorientedprogramming;


abstract class employee
{
	abstract void details();  //No difinition
	void name()//declaring the method
	{
		System.out.println("Company name is Evry");
	}
	
}
public class Abstract extends employee{ //inherites the parent property

	public static void main(String[] args)
	{
		
		Abstract obj=new Abstract(); //initialization of object
		obj.name();    //calling the name method
		obj.details(); //calling the details method
				

	}
	void details()//Defining the hided method in class employee
	{
		System.out.println("Employee Id is 123");
	}

}
