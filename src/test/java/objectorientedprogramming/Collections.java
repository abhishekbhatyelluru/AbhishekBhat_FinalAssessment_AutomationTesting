//Collection
//The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

package objectorientedprogramming;

import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		
        LinkedList<String> listt = new LinkedList<String>(); //Initializing the predefined collection function called list
        
        listt.add("Abhishek");       //Adding the elements to the collection
        listt.add("Bhat");
        listt.addLast("Testing");
        listt.addFirst("Automation");
        listt.add(2, "Jira");
         
        System.out.println(listt);  //Printing the added collection to the list
 
        listt.remove("Jira");   //Removing the word Jira in list
        listt.remove(3);         //Removing the third element in list by index
        listt.removeFirst();    //Removing the first element
        listt.removeLast(); //Removing the last element
 
        System.out.println(listt); //Printing the remaining the element in the list

	}

}
