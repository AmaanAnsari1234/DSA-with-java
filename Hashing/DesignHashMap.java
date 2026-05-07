/*
LeetCode 706 - Design HashMap
Pattern: Hashing
Time Complexity: O(1) average
Space Complexity: O(n)
*/

import java.util.*;

class MyHashMap {

    int[] map;

    public MyHashMap() {

        map = new int[1000001];

        // initialize all values as -1
        Arrays.fill(map, -1);
    }

    // insert (key, value)
    public void put(int key, int value) {
        map[key] = value;
    }

    // get value of key
    public int get(int key) {
        return map[key];
    }

    // remove key
    public void remove(int key) {
        map[key] = -1;
    }
}

public class DesignHashMap {

    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1, 10);
        hashMap.put(2, 20);

        System.out.println(hashMap.get(1)); // 10
        System.out.println(hashMap.get(3)); // -1

        hashMap.put(2, 30);
        System.out.println(hashMap.get(2)); // 30

        hashMap.remove(2);
        System.out.println(hashMap.get(2)); // -1
    }
}
