package SET;

import java.util.ArrayList;

public class Main {
    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words：" + words.size());

            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words：" + set.getSize());
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
       /* System.out.println("pride-and-prejudice");

        ArrayList<String> words1 = new ArrayList();
        FileOperation.readFile("E:\\JavaWork\\DataStructureJAVA\\src\\file\\pride-and-prejudice.txt", words1);
        System.out.println(words1.size());
        BSTSet<String> set1 = new BSTSet<>();
        for (String word:words1) {
            set1.add(word);
        }
        System.out.println("Total different words："+set1.getSize());
        System.out.println();

        ArrayList<String> words2 = new ArrayList();
        FileOperation.readFile("E:\\JavaWork\\DataStructureJAVA\\src\\file\\a-tale-of-two-cities.txt", words2);
        System.out.println(words2.size());
        BSTSet<String> set2 = new BSTSet<>();
        for (String word:words2) {
            set2.add(word);
        }
        System.out.println("Total different words："+set2.getSize());*/
        String filename = "E:\\\\JavaWork\\\\DataStructureJAVA\\\\src\\\\file\\\\pride-and-prejudice.txt";
        BSTSet<String> bstSet = new BSTSet<>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST SET：" + time1 + " s");
        System.out.println();
        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("LinkedListSet SET：" + time2 + " s");
    }
}
