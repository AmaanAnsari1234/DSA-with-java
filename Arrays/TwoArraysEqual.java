//  two array equal

import java.util.*;

public class P8 {

    static boolean areEqual(int[] a, int[] b) {
        // write your logic here
        int a1 = a.length;
        int b1 = b.length;
        if(a1!=b1)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i< a.length-1;i++)
        {
            if (a[i]!=b[i])
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        if (areEqual(a, b))
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}


