public class SelectionSort{
	public static void main(String[] args){
		int arr[] = {3,2,5,6,1,4};
		int l= arr.length;
		int smallestEle;
		int temp;

		System.out.print("Array before sorting: \n");
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}

		System.out.print("\nAfter selection sort: \n");
		for(int i=0; i<=l-1; i++){
				smallestEle = i;	//keeping first element as smallest

			for(int j=i+1; j<l; j++){
				if(arr[j]<arr[smallestEle]){
					smallestEle = j;	//searching for lowest index
				}	
			}
			temp = arr[smallestEle];
			arr[smallestEle] = arr[i];
			arr[i] = temp;

			System.out.print(arr[i]);
		}
	}
}