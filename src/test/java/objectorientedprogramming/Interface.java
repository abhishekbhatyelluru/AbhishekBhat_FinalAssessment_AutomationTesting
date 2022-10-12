package objectorientedprogramming;

interface laptop //Declaring the interface
{
	void lapdetails(); //jvm creates public abstract void lapdetails() 
}
interface desktop //Declaring the interface
{
	void deskdetails();  //jvm creates public abstract void lapdetails() 
}

public class Interface implements laptop,desktop{

	public static void main(String[] args) {
		Interface obj=new Interface(); //Initializing the object
		obj.lapdetails();  //Calling the method using object
		obj.deskdetails(); //Calling the method using object

	}
	public void lapdetails() //Defining the method inside the main
	{
		System.out.println("My laptop is Dell");
	}
	public void deskdetails()//Defining the method inside the main
	{
		System.out.println("My Desktop is Hp");
	}

}
