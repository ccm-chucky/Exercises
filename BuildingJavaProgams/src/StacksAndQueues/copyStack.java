package StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*Write a method copyStack that takes a stack of integers as a parameter and returns
 a copy of the original stack (i.e., a new stack with the same values as the original,
  stored in the same order as the original). Your method should create the new stack
  and fill it up with the same values that are stored in the original stack. It is not
   acceptable to return the same stack passed to the method; you must create, fill,
   and return a new stack.

You will be removing values from the original stack to make the copy, but you have to
 be sure to put them back into the original stack in the same order before you are
  done. In other words, when your method is done executing, the original stack must be
   restored to its original state and you will return the new independent stack that
    is in the same state. You may use one queue as auxiliary storage.*/
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        Stack<Integer> copiedStack = new Stack<>();

        originalStack.add(3);
        originalStack.add(4);
        originalStack.add(1);
        originalStack.add(8);

        System.out.println("Original Stack"+ Arrays.toString(originalStack.toArray()));

        copiedStack = copyStack(originalStack);
        System.out.println("\n\nCopied Stack"+ Arrays.toString(copiedStack.toArray()));
        System.out.println("Original Stack"+ Arrays.toString(originalStack.toArray()));


    }

    public static Stack<Integer> copyStack(Stack<Integer> s){
        Stack<Integer> copiedStack = new Stack<>();
        int element;
        while(!s.isEmpty()){
            element = s.pop();
            copiedStack.add(element);
        }

        Queue<Integer> temporaryQueue = new LinkedList<>();

        while (!copiedStack.isEmpty()){
            element = copiedStack.pop();
            s.add(element);
            temporaryQueue.add(element);
        }

        while (!temporaryQueue.isEmpty()){
            copiedStack.add(temporaryQueue.remove());
        }

        return copiedStack;
    }
}
