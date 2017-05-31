package Exercice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aurel on 5/28/17.
 */
public class LonelyInteger {
    public static void main(String... args){
        int a []  = {1,1,2};
        findUnique(a);


    }


    public static Integer findUnique(int[] a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count;
        for(int num : a){
            if(map.get(num) == null){
                map.put(num, 1);
            } else {
                count = map.get(num);
                count++;
                map.put(num, count);
            }
        }

        Integer res = map.entrySet().stream()
                .filter(m -> m.getValue().equals(1))
                .map(m -> m.getKey())
                .findFirst()
                .get();


        return res;
    }
}

