package algo_exercise.Hash;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {
    private int size;
    List<Node>[] table;

    public HashTable2(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey(){
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    public int hash(String str){
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii%this.size;
    }

    public void insert(String key, int value){
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) { this.table[hashIdx] = new ArrayList<>(); }
        this.table[hashIdx].add(new Node(key,value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable2 hashTable2 = new HashTable2(10000);

    }

}
