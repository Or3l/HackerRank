package Exercice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aurel on 5/31/17.
 */
public class RansomNote {
    public boolean testIfPossible(String paper, String note, int m, int n) {

        if(n>m)
            return false;

        Map<String, Integer> paperMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        convertStringToMap(paper, paperMap);
        convertStringToMap(note, noteMap);

        for(Map.Entry<String, Integer> entry: noteMap.entrySet()){
            Integer count = paperMap.get(entry.getKey());
            if(count == null){
                return false;
            }    else {
                if(count < entry.getValue()){
                    return false;
                }

            }
        }


        return true;
    }

    private void convertStringToMap(String paper, Map<String, Integer> paperMap) {
        String[] paperWords = paper.split(" ");
        for(String word: paperWords){
            Integer count = paperMap.get(word);
            if(count == null)
                paperMap.put(word, 1);
            else {
                paperMap.put(word, ++count);
            }
        }
    }
}
