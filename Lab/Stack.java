  public class Stack{
  int array[];
  int top;
  int size;
  int max;
  //constructor
  public Stack(){
  	top = 0;
  	max=10;
  	size = 0;
    array = new int[max];
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
  	return array[top];
  }

  public void push(int x){
  	if(size>max){
  		System.out.println("Stackoverflow");
  	}
  	else{
  		array[++top]=x;
      System.out.println(x);
  	}
  	size=size+1;
  }

  public int pop(){
  	if(isEmpty()){
  		System.out.println("Stackunderflow");
  	}
  	else{
  		top=array[top--];
  	}
  	size-=1;
    return array[top+1];
  }
  public static void main(String[] args){
		Stack obj = new Stack();

    System.out.println(obj.isEmpty());
    System.out.println(obj.top());  
		obj.push(3);     //adding 1st element in stack
    obj.push(6);     //adding 2nd element in stack
    obj.push(1);     //adding 3rd element in stack
    System.out.println("Size: "+obj.size());  //size of the element
    System.out.println("pop: "+obj.pop());     //remove the top element i.e 1
    System.out.println("Size: "+obj.size());   //size is decrease by one
    obj.push(9);   //4th element is added. 
    System.out.println(obj.isEmpty());
    System.out.println(obj.top());       //top element is display
    System.out.println("Size: "+obj.size());
  }
}

















































































































































































































































