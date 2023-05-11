import java.util.Scanner;

public class balik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input, reversed;
        int count = 1;
        boolean hop = false;
        do {
            for(int i = 1; i <= 5; i++){
                System.out.print(i + ". Masukkan string :   " );
                input = sc.nextLine();
                reversed = reverseString(input);
               System.out.println("--- reserve     :    " + reversed);
            } 
        } while (count < 5 && hop );
        
    }

    public static String reverseString(String input) {
        Stack stack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }

        // Mengambil karakter dari stack untuk membalikkan string
        String reversed = "";
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            reversed += ch;
        }

        return reversed;
    }

    // Definisi kelas Stack
    static class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        // Konstruktor
        public Stack(int maxSize) {
            this.maxSize = maxSize;
            stackArray = new char[maxSize];
            top = -1;
        }

        // Menambahkan elemen ke dalam stack
        public void push(char ch) {
            stackArray[++top] = ch;
        }

        // Mengambil elemen teratas dari stack dan menghapusnya
        public char pop() {
            return stackArray[top--];
        }

        // Mengecek apakah stack kosong
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
