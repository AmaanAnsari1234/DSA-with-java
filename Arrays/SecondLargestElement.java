// second largest element of an array

import java.util.*;

public class P4 {

    static int secondLargest(int[] arr) {
        if (arr.length<2)
            return -1;
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];

        for (int i = arr.length-1; i>0 ;i--)
        {
            if (arr[i]< largest)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println(secondLargest(arr));
        sc.close();
    }
}

