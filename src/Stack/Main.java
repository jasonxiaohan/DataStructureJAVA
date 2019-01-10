package Stack;

import Stack.ArrayStack;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
//        testStack();
        int opCount = 1000000;
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack,time：" + time1 + " s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack,time:" + time2 + " s");
    }
    // 数组栈和链表栈的测试方法
    private static void testStack() {
        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
        // 入栈
        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        // 出栈
        arrayStack.pop();
        System.out.println(arrayStack);

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        // 入栈
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        // 出栈
        linkedListStack.pop();
        System.out.println(linkedListStack);
    }

    // 测试使用stack运行opCount个push和pop操作所需要的时间，单位：秒
    private static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
}
