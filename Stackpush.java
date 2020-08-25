package Stack;
import java.util.*;
import Stack.StackDemo;
public class Stackpush {
 //static void stackpush(Stack st, int a){
	//st.push(new Integer(a));
	//System.out.println("push("+a+")");
	//System.out.println("Stack : " +st);
	
//}
static void  stackpop(Stack st)
{
	System.out.println("pop");
	Integer a = (Integer) st.pop();
	System.out.println(a);
	System.out.println("stack :" +st);
	
	
}
public static void main(String args[])
{
	Stack st = new Stack();
	System.out.println("stack " +st);
	;
	//stackpush(st, 42);
	//stackpush(st, 45);
	//stackpush(st, 30);
	//stackpush(st,20);
	stackpop(st);
	stackpop(st);
	stackpop(st);
	System.out.println(st);
	
	
}
}
