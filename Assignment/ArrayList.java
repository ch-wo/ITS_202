/*#**********************************************************************************************************#
#Level 1: 15 Marks
#Question2:
#	Complete the incomplete functions in the ArrayList(Dynamic array API) class. There are 5 incomplete 
#	functions inside the class which are:
#	1) add() - which takes a generic variable as a parameter and adds the element to the dynamic array. 
#			   Insert elements into a dynamic array which doubles in size when the array is 3/4th full 
#			   and halves in size when the array is 1/4th full
#	2) pop() - this function does not take a parameter.When called pop deletes the last element in the dynamic array.
#	3) resize() - this function takes one integer parameter. When called resize changes the size of the array
#				to the value of the parameter sent.
#	4) size() - Does not take ay parameter and returns the number of elements present in the dynamic array.
#	5) toString() - Does not take any parameter and returns the string representation of the dynamic array.
#**********************************************************************************************************#*/
//@SuppressWarnings("unchecked")

public class ArrayList
{
	double size1by4 = 0.25;
	double size3by4 = 0.75;
	int size = 4;
	static int a;
	int remove;
	int top = 0;
	double length;
	int Array[];

	public ArrayList()
	{
		Array = new int[size];
	}
	public void add(int e)
	{
		Array[top] = e;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) {
			count++;
		}
		a = count;
		length = (double)a/size;
		System.out.println("Remove Element " +remove);
	}
	
	public void resize()
	{
		if(length == size1by4 ) {
			int newArray[] = new int[(size/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			size = size/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == size3by4) {
			int newArray[] = new int[size*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			size = size * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		return size;
	}
	public String toString()
	{
		String s = Integer.toString(size);
		return s;
	}

/*#*************************************************************************************************************#
#*		DO NOT WRITE/MODIFY CODE BELOW THIS LINE. ANY CHANGES MAY CAUSE YOUR HIDDEN TEST CASES TO FAIL 		*#
#*				YOU MAY USE THE SPACE PROVIDED ABOVE TO WRITE YOUR PROGRAM. ALL THE BEST!					*#
#*************************************************************************************************************#*/


	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(1);
		obj.add(4);
		obj.add(5);
		obj.add(3);
		obj.pop();
		obj.resize();
		System.out.println("toString " +obj.toString());
		System.out.println("New number of Arraylist " +a);
		System.out.println("The Size of new Array is " +obj.size());
		System.out.print("Testcase3 passed");

	}
}

