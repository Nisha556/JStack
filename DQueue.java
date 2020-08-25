package Stack;
import java.util.*;

public class DQueue {
public static void main(String args[])
{
	Deque<String> dq = new ArrayDeque<>();
	dq.add("Welcome");
	dq.add("to");
	dq.add("India");
	System.out.println("print the  value of Deque" +dq);
	dq.remove();
	System.out.println("print the value of deque" +dq);
}
}
