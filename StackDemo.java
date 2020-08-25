package Stack;
import java.util.*;
public class StackDemo {
static void showpush(Stack st , int a)
{
	st.push(new Integer(a));
	System.out.println(a);
	System.out.println("push(" +a+")");
	System.out.println("Stack :" +st);
}

public static void main(String ars[])
{
	Stack st = new Stack();
System.out.println("stack : " +st);
	showpush(st, 42);
	showpush(st,66);
	showpush(st,99);
	System.out.println(st);
}
}
