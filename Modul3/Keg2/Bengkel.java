public class Bengkel<T> {
    
    private Node<T> front, rear;
    private int size;
    
    private static class Node<T> {
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Method enqueue untuk menambahkan elemen ke dalam antrian
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    // Method dequeue untuk menghapus elemen dari antrian
    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }
    
    // Method peek untuk melihat elemen pertama dalam antrian
    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }
        return front.data;
    }
    
    // Method isEmpty untuk memeriksa apakah antrian kosong atau tidak
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Method size untuk mendapatkan ukuran antrian
    public int size() {
        return size;
    }
    
    // Method untuk display
    public void display(){
        Node<T> temp = front;
        while (temp!= null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    // Main method untuk contoh penggunaan
    public static void main(String[] args) throws Exception {
        Bengkel<String> bengkel = new Bengkel();
        
        // Enqueue beberapa motor ke dalam antrian
        bengkel.enqueue("Honda Vario");
        bengkel.enqueue("Yamaha NMax");
        bengkel.enqueue("Kawasaki Ninja");
        
        // Cek ukuran antrian dan elemen pertama
        System.out.println("Ukuran antrian: " + bengkel.size());
        System.out.println("Elemen pertama: " + bengkel.peek());
        
        //dequeue menghapus elemen pertama
        do {
        System.out.println(bengkel.dequeue() + " dikerjakan & selesai");
        System.out.print("Antrian sekarang : ");
        bengkel.display();
       }while (!bengkel.isEmpty());
        System.out.println();
            
        // Cek apakah antrian kosong atau tidak
        System.out.println("Antrian kosong? " + bengkel.isEmpty());
    }
}
