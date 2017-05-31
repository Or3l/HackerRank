package Exercice;

import java.util.Arrays;

/**
 * Created by Aurel on 5/27/17.
 */
public class LeftRotation {

    public static void main(String... args){
        int[] a= {1,2,3,4,5};

        //[5,1,2,3,4]
        int[] res = rotate(a, 2);
        Arrays.stream(res).forEach(i -> System.out.println(i));


    }


    public static int[] rotate(int[] a, int d) {

        int length = a.length;
        int[] res = new int[length];

        for(int i = 0; i < length; i++){
            int diff = i - d;
            if(diff >= 0){
                res[diff] = a[i];
            } else {
                res[length+diff] = a[i];
            }

        }

        return res;
    }
}
