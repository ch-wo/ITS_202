public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<Integer, String> obj = new SequentialSearchST<Integer, String>();
		obj.put(1,"s");
		obj.put(2,"c");
		obj.put(3,"p");
		obj.put(4,"l");
		obj.put(5,"y");
		obj.delete(3);
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.keys());
		System.out.println(obj.get(3));
		 
        System.out.println("The size is : "+obj.size());

        assert(obj.isEmpty() == false);
		assert(obj.size() == 4);

		System.out.println("All the test pass.");
	}
}