public class keyIndex{
	public static void KeyCount(int a[]){
		int R = 8;
		int N = a.length;
		int [] aux = new int[N];
		int []count = new int[R+1];

		//compute frequency counts
		for (int i = 0; i < N; i++){
			count[a[i] + 1]++;
		}
		//Transform counts to indices
		for (int r = 0; r < R; r++){
			count[r+1] += count[r];
		}
		// Distribute the records
		for (int i = 0; i < N; i++){
			aux[count[a[i]]++] = a[i];
		}
		// Copy back
		for (int i = 0; i < N; i++){
			a[i] = aux[i];
		}
		for(int i: a){
			System.out.print(i +" ");
		}
	}
	public static void main(String[] args){
		keyIndex obj =  new keyIndex();
		int a[] = {5,4,2,6,1,7};
		int N = a.length;	
		// for(int i=0; i<arr.length; i++){
		// 	System.out.print(arr[i]);
		// }
		obj.KeyCount(a);
	}
}