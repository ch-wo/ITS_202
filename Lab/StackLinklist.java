class Node{
	public int element;
	public Node next;

	public Node(int element, Node next){
		this.element = element;
		next = null;
	}
}
public class StackLinklist{
	Node top;
	Node head;
	Node tail;
	int size;

	public StackLinklist(){
		top = null;
		head = null;
		tail = null;
		size = 0;
	}

	public int size(){
	 	return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public int top(){
		if(isEmpty()){
			return 0;
		}
		return top.element;
	}

	public void push(int x){
		Node newest = new Node(x, null);
		if(this.isEmpty()){
			this.head = newest;
			this.top = newest;
			this.tail = newest;
		}
		else{
			this.top.next = newest;
			this.top = newest;
			System.out.println(x);
		}
		size = size+1;
	}

	public int pop(){
		if(this.isEmpty()) {
            return 0;
        }
        else {
            int x = this.top.element;
            if(this.head == this.top){
                this.top = null;
                this.head = null;
            }
            else {
                Node newest = this.head;
                while(newest.next != this.top)               
                newest = newest.next;
                newest.next = null;
                this.top = newest;
            }
            size = size - 1;
            return x;
       	}
    }

	public static void main(String[] args){
		StackLinklist s = new StackLinklist();

		s.push(7);
		s.push(1);
		s.push(9);
		s.push(3);
		System.out.println("Size: "+s.size());
		System.out.println(s.isEmpty());
		System.out.println("The top element is :"+s.top());
		System.out.println("The element is pop out: "+s.pop());
		s.push(4);
		s.push(6);
		System.out.println("Size: "+s.size());
	}
}