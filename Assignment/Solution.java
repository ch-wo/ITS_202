import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;
    private int size;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;         // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
    	root = null;
        size = 0;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
    	return size; 
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
       if (key == null){
            throw new IllegalArgumentException("argument to contains() is null");
        }
        return get(key) != null;
    }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        Node x = root;
        while (x !=null){
            int cmp = key.compareTo(x.key);
            if(cmp < 0){
                x = x.left;
            }
            else if(cmp > 0){
                x = x.right;
            }
            else{
                return x.val;
            }
        }
        return null;
   	}
      
    // private Value get(Node x, Key key) {         
    // }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        Node newest = new Node(key, val, 1);
        if(root == null){
            root = newest;
        }
        else{
            Node cur_node = root, parent = null;
            while(cur_node != null){
                parent = cur_node;
                int cmp = key.compareTo(cur_node.key);
                if(cmp < 0){
                    cur_node = cur_node.left;
                }
                else if(cmp > 0){
                    cur_node = cur_node.right;
                }
                else{
                    cur_node.val = val;   
                }   
            } 
            int cmp = key.compareTo(parent.key);
            if(cmp < 0){
                parent.left = newest;
            }
            else{
                parent.right = newest;
            }
        }
        size = size + 1;   
    }

    // private Node put(Node x, Key key, Value val) {

    // }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        Node x = root;
        while (x.left != null ) {
           x = x.left;
           //x = x.left; 
        }
        return x.key; 
    } 
    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if(x == null) return null;
        return x.key;
    } 
    private Node floor(Node x, Key key) {
        Node searchkey = null;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if(cmp == 0){
                return x;
            }
            else if (cmp < 0) {
                x = x.left;
            }
            else{
                searchkey = x;
                x = x.right;
            }
        }
        return searchkey;  
    }
    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    // public Key select(int k) {
    //     Node nodeCount = 0;
    //     if (k < 0 || k >= size()) {
    //         throw new IllegalArgumentException("Invalid");
    //     }
    //     return select(root, k+1).key; 
    // }

    // // Return key of rank k. 
    // private Node select(Node x, int k) {
    //     Stack<Node> queue = new Stack<Node>();
    //     while (x != null || !stack.eEmpty()) {
    //         //int cmp = key.compareTo(x.key);
    //         if(x !=null){
    //             stack.push(x);
    //             x =x.left;
    //         }
    //         else {
    //             x = stack.pop();
    //             nodeCount++;
    //             if(nodeCount == k)
    //                 break;
    //             x = x.right;  
    //         }
    //     }
    //     return x;
    // } 

    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    // public Iterable<Key> keys(Key lo, Key hi) {
    //     ArrayList<Key> array = new ArrayList<Key>();
    //     keys(root, array, lo, hi);
    //     return array;
    // } 

    // private void keys(Node x,ArrayList<Key> array, Key lo, Key hi) { 
    //     if(x == null){
    //         return;
    //     }
    //     int cmplo = lo.compareTo(x.key);
    //     int cmphi = hi.compareTo(x.key);
    //     if(cmplo < 0){
    //         keys(x.left, array, lo, hi);
    //     }
    //     if(cmplo <= 0 && cmphi >= 0){
    //         array.add(x.key);
    //     }
    //     if(cmphi > 0){
    //         keys(x.right, array, lo, hi);
    //     }
    // } 
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    public static void main(String[] args) { 
        
       
    }
}