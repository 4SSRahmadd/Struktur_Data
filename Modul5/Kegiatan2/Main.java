package Kegiatan2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryTree binaryTree = new BinaryTree();

        System.out.println("\nMasukkan kombinasi huruf dan angka: ");
        String input = scanner.nextLine();
        String[] combination = input.split(" ");

        binaryTree.root = binaryTree.Create(combination, binaryTree.root, 0, combination.length);

        System.out.println("\nPreOrder:");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\nInOrder:");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("\nPostOrder:");
        binaryTree.postOrder(binaryTree.root);

        scanner.close();
    }
}
