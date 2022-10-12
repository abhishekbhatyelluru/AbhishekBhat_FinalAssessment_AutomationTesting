//The access modifiers
//The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class
package objectorientedprogramming;
class carss
{
	private int carno=123; //initializing the private variable
	private void detailscar()     //private-only accessible inside the class
	{
		System.out.println("Engine no is 325");
	}
	void carcaompany()     //Default-accessible anywhere inside the package
	{
		System.out.println("Car is BMW");
	}
}

public class AccessModifiers extends carss {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
	//	System.out.println(obj.carno);     //Private variable so compilation error
	//	obj.detailscar();      //private method so it will give error
	    obj.carcaompany();      //Default method...It will be executed
		
	}

}
