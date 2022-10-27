package algo_exercise.Hash;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    private int size;
    private int[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, int value){
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key+" : "+"저장완료");
    }


    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"test", "jinwoo", "hello", "please"};

        HashTable hashTable = new HashTable(90);

        Set<Integer> nameSet = new HashSet<>();

        for(int i = 0 ; i < names.length ; i ++) {
            hashTable.insert(names[i], hashTable.hash(names[i]));
        }

        for(int i = 0 ; i < names.length ; i ++) {
            nameSet.add(hashTable.hash(names[i]));
        }
        System.out.printf("입력 수 : %d, 중복 수 : %d\n", names.length, names.length - nameSet.size());

        System.out.println("test : " + hashTable.search("test") + "번 방에 저장되어 있음");
    }
}
