package Stack;
import java.util.*;

public class QAdd {
public static void man(String args[])
{
	Queue<String> pq = new PriorityQueue<>();
	pq.add("hello");
	pq.add("Geeks");
	Iterator iterator = pq.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next() + " ");
	}
	
}
}
