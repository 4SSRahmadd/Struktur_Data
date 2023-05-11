// public class LinkedList <T> {
//     Node<T> header;
//     Node<T> last;
//     int size;
// public static void main(String[] args) {
//     LinkedList<Integer> ll = new LinkedList<Integer>();

//     ll.add(1);
//     ll.add(2);
//     ll.add(4);
//     ll.print();
// }
//     public LinkedList(){
//         this.header = new Node<T>(null);
//         last = header;
//     }

//     public void add (T data){
//         Node<T> tmp = new Node<T>(data);

//         if(header.next == null){
//             header.next = tmp;
//             last = tmp;
//         }
//         else{
//             last.next = tmp;
//             last = tmp;
//         }
//         size++;

//     }

//     public int size(){
//         return this.size;
//     }
//     public void clear(){
//         header.next = null;
//         last = header;
//     }

//     public void print(){
//         Node<T> current = header.next;
//         while(current != null){
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }
//     public void display() {
//     }
//     public void sortList() {
//     }
//     public void addNode(int i) {
//     }
// }

// class Node <T>{
//     Node<T> next;
//     T data;

//     public Node(T data){
//         this.data = data;
//     }

//     public Node(T data, Node<T> next){
//         this.data = data;
//         this.next = next;
//     }

// }