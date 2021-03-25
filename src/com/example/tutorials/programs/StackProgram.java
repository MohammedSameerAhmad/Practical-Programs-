package com.example.tutorials.programs;

/**
 * this program is used to create a stack in java manually
 *
 * @author Mohammed Sameer Ahmad
 */
public class StackProgram {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
//        System.out.println(stack.peek()); // this throws stack is empty exception
        System.out.println(stack.push(20)); // inserted 1 Element in the stack
        System.out.println(stack.push(23)); // inserted 2 element in the stack
//        System.out.println(stack.push(40));// this will throws stack is full exception
        System.out.println(stack.pop()); // this will remove the top element from the stack i.e 23
    }
}


class Stack{
    private int capacity;
    private int top;
    private int[] array;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.array = new int[capacity];
    }

    public int push(int item){
        if (isFull()){
            throw new RuntimeException("Stack is Full");
        }
        array[++top] = item;
        return item;
    }

    /**
     * this method will remove the top element from the stack
     * and returns the current top element from the stack
     * */
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return array[--top];
    }
    /**
     * this method just returns the top element of the stack
     * it doesn't do any operation like push/pop
     * */
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}