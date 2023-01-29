/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();

        while(tc-- > 0){
            int len = in.nextInt();
            int[] arr = new int[len];
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

            for( int i = 0; i < len; i++) {
                arr[i] = in.nextInt();

            }
            for(int i = 0 ; i < len ; i++) {
                if(arr[i] >= 0 && arr[i] < max) {
                    max = arr[i];
                } else if(arr[i] < 0 && arr[i] > min) {
                    min = arr[i];
                }
            }
             long s = Math.abs((long)min);
            //if(maxPositive < s) {
            //    System.out.println(--maxPositive);
            //} else {
            //    System.out.println(--s);
            ////}
            //System.out.println(max +"++");
            // System.out.println(min +"--");
            //System.out.println(s +"-+");

            long bn = Math.min(max,s);

            System.out.println( bn - 1);


        }

    }
}
