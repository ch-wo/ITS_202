class Node{
    public int element;
    public Node next;

    // constructor
    public Node(int element, Node next ){
        this.element = element;
        next = null;
    }
}
public class QueueLinklist{
	Node front;
	Node rear;
    Node head;
	int len;

	public QueueLinklist(){
		front = null;
		rear = null;
        head = null;
		len = 0;
	}

    public int len(){
        return len;
	}

	public boolean isEmpty()
    {
        if (len == 0) {

        	return true; 	
        }
        else {
        	return false;
        }
    }

    public int first()
    {
        if (isEmpty()){
        	return 0;

        }
        else {
        	return front.element;
        }
        
	}
	public void enqueue(int x)
    {
        Node newest = new Node(x, null);
        if (this.isEmpty())
        {
            this.head = newest;
            this.rear = newest;
            this.front = newest;
        }
        else
        {
            this.rear.next = newest;
            this.rear = newest;
            System.out.println(x);
        }
        len = len + 1;
    } 
    //
    public int dequeue()
    {
        int x = front.element;

        if (isEmpty()) {
        	return 0;
        }

        else {
            front = front.next;
        }
        len = len - 1;
        return x;
    }
    public static void main(String[] args) {
        QueueLinklist q = new QueueLinklist();

        q.enqueue(3);
        q.enqueue(1);
        q.enqueue(8);
                
        System.out.println(q.isEmpty());
        System.out.println("length of the queue: "+q.len());
        System.out.println("Display first element: "+q.first());
        System.out.println("Removes the first element: "+q.dequeue());
        q.enqueue(2);
        q.enqueue(7);
        System.out.println("length of the queue: "+q.len());
    }
}
