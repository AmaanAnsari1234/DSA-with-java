// Leet Code Problem NO : 455
// Assign Cookies (Greedy Algo)

import java.util.*;

public class P20 {

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer
        int count = 0;

        while (i<g.length && j<s.length )
        {
            if(s[j]>g[i])
            {
                j++;
                i++;
                count++;
            }
            else j++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++) g[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] s = new int[m];
        for (int i = 0; i < m; i++) s[i] = sc.nextInt();

        System.out.println(findContentChildren(g, s));
        sc.close();
    }
}

