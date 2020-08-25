package Stack;
import java.util.*;
public class DequeExample {
public static void main(String args[])
{
	Deque<String> deque = new ArrayDeque<String>();
	deque.offer("arvind");
	deque.offer("vimal");
	deque.add("mikul");
	deque.offerFirst("jai");
	System.out.println("After offer first traversal");
	for(String s : deque)
	{
		System.out.println(s);
		
	}
	deque.pollLast();
	System.out.println("After pollLast Traversal");
	for(String s: deque)
	{
		System.out.println(s);
	}
	
}
}
