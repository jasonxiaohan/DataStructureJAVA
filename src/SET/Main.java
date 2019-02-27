package SET;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("pride-and-prejudice");

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
        System.out.println("Total different words："+set2.getSize());
    }
}
