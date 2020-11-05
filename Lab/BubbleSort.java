public class BubbleSort{
	public static void BubbleS(int[] arr){
		int l = arr.length;

		for (int i = 0; i < l; i++ ) {
			for (int j = 0; j< l-1; j++ ) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		int[] array = {3,6,2,8,1,4};
		int l = array.length;

		// System.out.print("Array before sorting: ");
		// for (int i = 0; i < l; i++ ) {
		// 	System.out.print(array[i]);
		//}	
		BubbleS(array);	
		System.out.println("");

		System.out.print("Array after sorting: ");
		for (int i = 0; i < l; i++ ) {
			System.out.print(array[i]);
		}	
		System.out.println("");	
	}
}
