/*
Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that
eliminates any duplicates from the list.
For example, suppose that a variable called list contains the following values:
{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"}
After calling removeDuplicates(list); the list should store the following values:
{"be", "is", "not", "or", "question", "that", "the", "to"}
Because the values will be sorted, all of the duplicates will be grouped together.
 */



import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String >(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        removeDuplicates(list);
        System.out.println(list);
    }

    private static void removeDuplicates(ArrayList<String> list) {
        for(int i=0;i<list.size()-1;i++){
            String element1 = list.get(i);
            for(int j=i+1;j<list.size();j++){
                String element2 = list.get(j);
                if(element1.equals(element2)){
                    list.remove(j);
                    j=j-1;
                }
            }
        }
    }
}
