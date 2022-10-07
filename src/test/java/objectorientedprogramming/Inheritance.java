// Multilevel inheritance
package objectorientedprogramming;
class Loginn                        
{
	void verifyloginn()
	{
		System.out.println("Login is verified");
	}
}
class Benificiaryy extends Loginn
{
	void verifybenyficiaryy()
	{
		System.out.println("Benificiary is verified");
	}
}
public class Inheritance extends Benificiaryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj=new Inheritance();
		obj.verifybenyficiaryy();
		obj.transferfundd();
		obj.verifyloginn();
	}
	void transferfundd()
	{
		System.out.println("Fund is transfered");
	}

}


