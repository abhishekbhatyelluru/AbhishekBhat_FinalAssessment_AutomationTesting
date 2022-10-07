package objectorientedprogramming;

interface laptop
{
	void lapdetails(); //jvm creates public abstract void lapdetails() 
}
interface desktop
{
	void deskdetails();
}

public class Interface implements laptop,desktop{

	public static void main(String[] args) {
		Interface obj=new Interface();
		obj.lapdetails();
		obj.deskdetails();

	}
	public void lapdetails()
	{
		System.out.println("My laptop is Dell");
	}
	public void deskdetails()
	{
		System.out.println("My Desktop is Hp");
	}

}
