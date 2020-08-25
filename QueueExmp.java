package Stack;
import java.util.*;
import java.util.Queue;
public class QueueExmp {
static void queuepush(Queue qe, int a)
{
	qe.add(new Integer(a));
	System.out.println("push("+a+")");
	System.out.println("Queue :" +qe);
	
	
	
}
static void queuepop(Queue qe) {
	Integer a = (Integer) qe.remove();
	System.out.println(a);
	System.out.println("pop" +qe);
}
public static void main(String arsg[])
{
	Queue qe=  new Queue();

	queuepush(qe, 20)
;
	queuepush(qe, 21);
	remove(qe);
	remove(qe);
	System.out.println("REst element in the queue" +qe);
	
	
}