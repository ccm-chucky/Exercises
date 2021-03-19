package Arrays;
/*
* Write a static method named vowelCount that accepts a String as a parameter
*  and returns an array of integers representing the counts of each vowel in the
* String. The array returned by your method should hold 5 elements: the first is
* the count of As, the second is the count of Es, the third Is, the fourth Os, and
*  the fifth Us. Assume that the string contains no uppercase letters.
For example, the call vowelCount("i think, therefore i am") should return
*  the array {1, 3, 3, 1, 0}.
 */

import java.util.Arrays;

public class vowelCount {
    public static void main(String[] args) {
        String vowels = "i think, therefore i am";

        int[] count = Arrays.copyOf(vowelCount(vowels),5);

        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }

    }


}
