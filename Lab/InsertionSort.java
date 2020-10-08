public class InsertionSort{  

    public static void insertion(int a[]) {  
        int n = a.length;  

        for (int i = 0; i < n-1; i++) {  
            for (int j = i + 1; j>0 && compare(j-1, j, a) ;j-- ) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }     
        }
    } 
        public static boolean compare(int i, int j, int[] a){
            if (a[i] > a[j]) {
                return true;  
            }
            return false;   
        }  
       
    public static void main(String[] args) {    
        int[] arr = {7,3,2,1,6,5,4};    
        InsertionSort obj = new InsertionSort();

        System.out.println("Before insertion sort:");    
        for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }    
        System.out.println("");
        obj.insertion(arr);

        System.out.println("After insertion sort:"); 
          for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }   
    }
}
