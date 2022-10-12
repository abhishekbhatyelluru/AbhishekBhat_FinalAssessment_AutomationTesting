//Method Overloading

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

package objectorientedprogramming;
public class Overload
{
	int diff;    //Initialization of variable
	int mul;

	public static void main(String[] args) 
	{
		Overload obj1=new Overload();  //Initailization of object
		Overload obj2=new Overload();//Initailization of object
		obj1.sub(100,20);        //Calling the method sub with parameter
		obj1.sub(100.5f,30.2f);//Calling the method sub with parameter
		obj1.sub(100,20,30);//Calling the method sub with parameter
		obj2.multiplication(10,20);//Calling the method multiplication with parameter
		obj2.multiplication(20.4f,30.5f);//Calling the method multiplication with parameter
		obj2.multiplication(5,5,5);//Calling the method multiplication with parameter

	}
	void sub(int a,int b) //method called sub
	{
		 diff=a-b;       
		System.out.println("Difference is "+diff);
	}
	void sub(float a,float b) //same method name as "sub",but parameter is different
	{
		float diff=a-b;
		System.out.println("Difference is "+diff);
		
	}
	void sub(int x,int y,int z)//same method name as "sub",but parameter is different
	{
		diff=x-y-z;
		System.out.println("difference is "+diff);
	}
	void multiplication(int a,int b) //method called multiplication
	{
		mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	void multiplication(float a,float b)//same method name as "multiplication",but parameter is different
	{
		float mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	void multiplication(int x,int y,int z)//same method name as "multiplication",but parameter is different
	{
		mul=x*y*z;
		System.out.println("multiplication is "+mul);
	}



}


