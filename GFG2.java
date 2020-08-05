package Stack;
import java.util.*;
public class GFG2 {
public static void main(String args[])
{
	Queue<String> pq = new PriorityQueue<>();
	pq.add("This");
	pq.add("is");
	pq.add("Nisha");
	System.out.println("Initial Queue " +pq);
	pq.remove(1);
	System.out.println("After Remove");
	pq.remove("is");
	System.out.println("After remove " +pq);
	System.out.println("Poll Method" +pq.poll())
;
	System.out.println("Final Queue" +pq);
}
}
