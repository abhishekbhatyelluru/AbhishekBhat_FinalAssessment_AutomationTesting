//Abstract

package objectorientedprogramming;


abstract class employee
{
	abstract void details();  //No difinition
	void name()
	{
		System.out.println("Company name is Evry");
	}
	
}
public class Abstract extends employee{

	public static void main(String[] args)
	{
		
		Abstract obj=new Abstract();
		obj.name();
		obj.details();
				

	}
	void details()
	{
		System.out.println("Employee Id is 123");
	}

}
