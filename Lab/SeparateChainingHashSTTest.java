public class SeparateChainingHashSTTest {
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("A",4);
        st.put("B",2);
        st.put("C",11);
        st.put("D",5);
        st.put("E",9);
        st.put("F",1);
        st.put("G",7);
        st.put("H",6);
        
        st.delete("D");
        st.delete("E");

        System.out.println(st.get("A"));
        System.out.println(st.get("Z"));
        System.out.println(st.contains("G"));
        System.out.println(st.contains("I"));
        System.out.println(st.size());
        System.out.println(st.isEmpty());
       

        assert(st.isEmpty() == false);
        assert(st.size() == 6);
        System.out.println("All Test Cases Passed.");
    }

}
