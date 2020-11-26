public class SolutionTest{
	public static void main(String[] args) {
		Solution<Integer, String> obj = new Solution<Integer, String>();
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		obj.put(1,"Sonam");
		obj.put(2,"Tashi");
		obj.put(3,"Pema");
		obj.put(4,"Lhamo");
		obj.put(5,"Norbu");
		System.out.println(obj.min());
		System.out.println(obj.isEmpty());
		obj.put(6,"Ugyen");
		System.out.println(obj.floor(5));
		System.out.println(obj.get(2));
		System.out.println(obj.size());
		System.out.println(obj.select(3));
		System.out.println(obj.keys(1,6));


		assert(obj.isEmpty() == false);
		assert(obj.size() == 6);

		System.out.println("All the test pass.");
	}
}