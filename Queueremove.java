package Stack;
import java.util.*;
import java.util.Queue;
public class Queueremove {
public static void main(String args[])
{
	Queue<Integer> qe = new LinkedList<>();
qe.add(10);
qe.add(10);
System.out.println( "Element of queue" +qe);
int removee = qe.remove();
System.out.println("Element after removing" +qe);
int removeee= qe.removeAll();
System.out.println(removeee);
	
}
}
