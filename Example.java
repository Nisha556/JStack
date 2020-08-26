package Stack;
import java.util.*;
public class Example {
public static void main(String args[])
{
	PriorityQueue<String> pq = new PriorityQueue<>();
	pq.add("C");
	pq.add("Java");
	pq.add("C++");
	pq.add("python");
	System.out.println("The queue elements :" + pq.peek());
	Iterator itr = pq.iterator();
	while(itr.hasNext());
	System.out.println(itr.next());
	pq.poll();
	System.out.println("After polling element with " +"with poll function")
;
	pq.remove();
	System.out.println("After removing  element wih " + "with remove finction")
;
	Iterator<String> itr3 = pq.iterator();
	while(itr3.hasNext())
		System.out.println(itr3.next());
	boolean b= pq.contains("C")
	;
	 System.out.println("Priority queue contains C "
             + "or not?: " + b);
	 Object[] arr = pq.toArray(); 
	System.out.println("Valye in array :");
	 for (int i = 0; i < arr.length; i++) 
         System.out.println("Value: " + arr[i].toString()); 
 
	}
}
