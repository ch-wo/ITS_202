public class LinearSearch{
	public static void Search(int[] a, int key){
		int N = a.length;
		for(int i=0; i<N; i++){
			if(a[i] == key){
				System.out.println("The key found is " + a[i]);
				return;
			}	
		}
		System.out.println("key not found");	
		return;
		//System.out.println("Key not found.");		
	}
	public static void main(String[] args) {
		int[] a = {3,1,5,6,2};
		LinearSearch obj = new LinearSearch();
		obj.Search(a, 5);
	}
}