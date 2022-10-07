package objectorientedprogramming;

import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		
        LinkedList<String> listt = new LinkedList<String>();
        
        listt.add("Abhishek");
        listt.add("Bhat");
        listt.addLast("Testing");
        listt.addFirst("Automation");
        listt.add(2, "Jira");
         
        System.out.println(listt);
 
        listt.remove("Jira");
        listt.remove(3);
        listt.removeFirst();
        listt.removeLast();
 
        System.out.println(listt);

	}

}
