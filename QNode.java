package Stack;

public class QNode {
int key;
QNode next;
public QNode(int key)
{
	this.key= key;
	this.next = null;
}
}
class QUeue {
	QNode front ,rear;
	public QUeue()
	{
		this.front = this.rear = null;
	}
	void enqueue(int key)
	{
		QNode temp = new QNode(key);
		if(this.rear == null)
		{
			this.front = this.rear= temp;
			return;
			
		}
		this.rear.next= temp;
		 this.rear= temp;
		 
	}
	void dequeue()
	{
		if(this.front == null)
			return;
		QNode temp = this.front;
		this.front =this.front.next;
		if(this.front == null)
			this.rear = null;
	}
	
}
class Test {
	public static void main(String args[])
	{
		QUeue q= new QUeue();
		q.enqueue(10);
		q.enqueue(20);q.enqueue(30);
		   q.dequeue(); 
		   q.dequeue(); 
		   q.enqueue(40);
		   q.enqueue(50);q.enqueue(60);
		   System.out.println("Queue front : " q.front.key);
		   System.out.println("Queue Rear : " + q.rear.key);
		   
		
	}
	
}
