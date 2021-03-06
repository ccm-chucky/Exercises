/*
Write a method called pairCounts that accepts a list of strings representing individual words and
counts the number of occurrences of all 2-character sequences of letters in those words.
For example, suppose the list contains ["banana", "bends", "i", "mend", "sandy"].
This list contains the following two-character pairs: "ba", "an", "na", "an", "na" from "banana";
"be", "en", "nd", "ds" from "bends"; "me", "en", "nd" from "mend"; and "sa", "an", "nd", "dy" from
"sandy". (Note that "i" is only one character long, so it contains no pairs.)
Your method should count the occurrences of these pairs of letters and return the counts as a Map.
In this case you would return {an=3, ba=1, be=1, ds=1, dy=1, en=2, me=1, na=2, nd=3, sa=1}.
Notice that pairings that occur more than once in the same word should be counted as separate
occurrences.
For example, "an" and "na" each occur twice in "banana".
 */

import java.util.*;

public class PairCounts {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("banana", "bends", "i", "mend", "sandy"));
        Map<String, Integer> map = new HashMap<String, Integer>();
        map = pairCounts(list);
        System.out.println(map);
    }

    private static Map<String, Integer> pairCounts(List<String> list) {
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (int i=0;i<list.size();i++){
            String word = list.get(i);
            if(word.length()>1){
                for (int z = 0; z < word.length()-1; z++) {
                String pair = word.substring(z, z + 2);
                //System.out.println(pair);

                if (map2.containsKey(pair)) {
                    map2.put(pair, map2.get(pair) + 1);
                } else {
                    map2.put(pair, 1);
                }
                }
            }


        }
        return map2;
    }

}