/*
    amlaanb
    https://github.com/amlaanb
    https://www.hackerrank.com/amlaanb
    02-NOV-2016
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        // compare x1 + y * v1 = x2 + y * v2 where y = no. of jumps
        if (v1 > v2 && ((x2 - x1) % (v1 - v2) == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}