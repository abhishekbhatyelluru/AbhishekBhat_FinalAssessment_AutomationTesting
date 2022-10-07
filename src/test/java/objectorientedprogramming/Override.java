package objectorientedprogramming;

class vehicle
{
	void cars()
	{
		System.out.println("We have a veriety of cars");
	}
}

public class Override extends vehicle
{
	
	public static void main(String[] args) 
	{
		
		Override obj=new Override();
		obj.cars(); 

	}
	void cars()
	{
		super.cars();   
		System.out.println("BMW is the best");
	}
}


