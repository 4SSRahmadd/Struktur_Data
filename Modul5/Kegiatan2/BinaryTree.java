package Kegiatan2;

public class BinaryTree {
    Node root;
    
    Node Create(String[] arr, Node root, int a, int b){
        if(a < b){
            Node temp = new Node(arr[a]);
            root = temp;

            root.left = Create(arr, root.left, 2 * a + 1, b);
            root.right = Create(arr, root.right, 2 * a + 2, b);
        }
        return root;
    }
   
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
