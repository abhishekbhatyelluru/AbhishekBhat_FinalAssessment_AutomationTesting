//Method Overloading

package objectorientedprogramming;
public class Overload {
	int diff;
	int mul;

	public static void main(String[] args) {
		Overload obj1=new Overload();
		Overload obj2=new Overload();
		obj1.sub(100,20);
		obj1.sub(100.5f,30.2f);
		obj1.sub(100,20,30);
		obj2.multiplication(10,20);
		obj2.multiplication(20.4f,30.5f);
		obj2.multiplication(5,5,5);

	}
	void sub(int a,int b)
	{
		 diff=a-b;
		System.out.println("Difference is "+diff);
	}
	void sub(float a,float b)
	{
		float diff=a-b;
		System.out.println("Difference is "+diff);
		
	}
	void sub(int x,int y,int z)
	{
		diff=x-y-z;
		System.out.println("difference is "+diff);
	}
	void multiplication(int a,int b)
	{
		mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	void multiplication(float a,float b)
	{
		float mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	void multiplication(int x,int y,int z)
	{
		mul=x*y*z;
		System.out.println("multiplication is "+mul);
	}



}


