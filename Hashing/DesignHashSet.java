/*
LeetCode 705 - Design HashSet
Pattern: Hashing
Time Complexity: O(1) average
Space Complexity: O(n)
*/

import java.util.*;

class MyHashSet {

    boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001];
    }

    // add key
    public void add(int key) {
        set[key] = true;
    }

    // remove key
    public void remove(int key) {
        set[key] = false;
    }

    // check if key exists
    public boolean contains(int key) {
        return set[key];
    }
}

public class DesignHashSet {

    public static void main(String[] args) {

        MyHashSet hashSet = new MyHashSet();

        hashSet.add(1);
        hashSet.add(2);

        System.out.println(hashSet.contains(1)); // true
        System.out.println(hashSet.contains(3)); // false

        hashSet.add(3);
        System.out.println(hashSet.contains(3)); // true

        hashSet.remove(2);
        System.out.println(hashSet.contains(2)); // false
    }
}
