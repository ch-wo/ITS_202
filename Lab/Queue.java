public class Queue{
	int array[];
	int len;
	int max;
	int front;
	int rear;

	public Queue(){
		len = 0;
		max = 10;
		front = 0;
		rear = -1;
		array = new int[max];
	}
	public int len(){
		return len;
	}
	public boolean isEmpty(){
		if(len==0){
			return true;
		}
		return false;
	}
	public int first(){
  		if(isEmpty()){
  			return 0;
	  	}
  		return array[front];
	}
	public void enqueue(int x){
		if(len>max){
			System.out.println("QueueOverflow");
		}
		else{
			array[rear+1]=x;
			rear=rear+1;
			System.out.println(x);
		}
		len=len+1;
	}
	public int dequeue(){
		if(isEmpty()){
			return 0;
		}
		else{
			front=front+1;
		}
		len-=1;
		return array[front-1];
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(2);
		q.enqueue(5);
		q.enqueue(8);
		q.dequeue();

		System.out.println("size:"+q.len());
		System.out.println("frist element:"+q.first());
		System.out.println(q.isEmpty());

	}
}