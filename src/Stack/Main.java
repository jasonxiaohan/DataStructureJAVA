package Stack;

import Stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        // 入栈
        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        // 出栈
        arrayStack.pop();
        System.out.println(arrayStack);
    }
}
