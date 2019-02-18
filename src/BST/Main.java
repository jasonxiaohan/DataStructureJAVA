package BST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BST<Integer> bst = new BST<Integer>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums)
            bst.add(num);
        // 层序遍历
        bst.levelOrder();
        System.out.println();
        bst.preOrder();
        System.out.println();
        /*bst.inOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();*/
        bst.preOrderNR();
//        System.out.println(bst);
        System.out.println();
        System.out.println(bst.minimum());
        System.out.println(bst.maximum());

        bst = new BST<Integer>();
        Random random = new Random();
        int n = 1000;
        for (int i = 0; i < n;i ++) {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> ns = new ArrayList<>();
        while (!bst.isEmpty())
            ns.add(bst.removeMin());
        System.out.println(ns);
    }
}
