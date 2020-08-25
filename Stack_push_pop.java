package Stack;
import java.util.*;
public class Stack_push_pop {
static void stackpush(Stack st, int a)
{
	st.push( new Integer(a));
	System.out.println("push("+a+")");
	System.out.println("Stack :" +st);
	
}
static void pop(Stack st)
{
	System.out.println("pop");
	Integer a = (Integer) st.pop();
	System.out.println(a);
	System.out.println("pop" +st);
}
public static void main(String args[])
{
	Stack st = new Stack();
	System.out.println("stack " +st);
	;
	stackpush(st, 42);
	stackpush(st, 45);
	stackpush(st, 30);
	stackpush(st,20);
	pop(st);
	pop(st);
	pop(st);
	pop(st);
	System.out.println(st);
	
	try {
		pop(st);
	}
	catch(EmptyStackException e) {
	System.out.println("Empty stack");
}
}
}