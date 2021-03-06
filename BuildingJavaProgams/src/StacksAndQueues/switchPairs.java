package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Write a method switchPairs that takes a stack of integers as a parameter and
*  that switches successive pairs of numbers starting at the bottom of the stack.
*  For example, if the stack initially stores these values:

bottom [3, 8, 17, 9, 99, 9, 17, 8, 3, 1, 2, 3, 4, 14] top
Your method should switch the first pair (3, 8), the second pair (17, 9), the
*  third pair (99, 9), and so on, yielding this sequence:

bottom [8, 3, 9, 17, 9, 99, 8, 17, 1, 3, 3, 2, 14, 4] top
If there are an odd number of values in the stack, the value at the top of the
* stack is not moved. For example, if the original stack had stored:

bottom [3, 8, 17, 9, 99, 9, 17, 8, 3, 1, 2, 3, 4, 14, 42] top
It would again switch pairs of values, but the value at the top of the stack (42)
*  would not be moved, yielding this sequence:

bottom [8, 3, 9, 17, 9, 99, 8, 17, 1, 3, 3, 2, 14, 4, 42] top
Do not make assumptions about how many elements are in the stack. Use one queue
* as auxiliary storage.*/
public class switchPairs {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(1);
        s.add(9);
        s.add(5);
        s.add(4);

        System.out.println("Original Stack = "+ Arrays.toString(s.toArray()));

        switchPairs(s);

        System.out.println("\nStack with switched pairs = "+Arrays.toString(s.toArray()));
    }

    public static void switchPairs(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<>();
        int size = s.size();
        int top=0;
        boolean odd = false;

        if((size%2) !=0){
            top=s.pop();
            odd = true;
            size--;
        }

        for(int i=0; i<size; i++){
            q.add(s.pop());
        }
        for(int i=0; i<size; i++){
            s.add(q.remove());
        }


        for(int i=0; i<(size/2); i++){
            int element1 = s.pop();
           // System.out.println(element1);
            int element2 = s.pop();
            q.add(element2);
            q.add(element1);
        }

        for(int i=0; i<size; i++) {
            s.add(q.remove());
        }

        if(odd){
            s.add(top);
        }
    }

}
