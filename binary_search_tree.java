
public class BinaryTreeProblems{
    public static void preorderTraverval(Node root){
        if (root == null){
            return;
        }

        // root node
        System.out.print(root.data + ", ");

        // left node
        preorderTraverval(root.left);

        // right node
        preorderTraverval(root.right);
        
    }

    public static void inorderTraversal(Node root){
        if (root == null){
            return;
            
        }
        // left node
        inorderTraversal(root.left);

        // root node
        System.out.print(root.data + ", ");

        // right
        inorderTraversal(root.right);
    }

    public static void main(String[] args){
        System.out.println("Problem 1: Tree Traversal");
        //          40
        //      20      60
        //    10  30  50   70
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        // Pre-order :root -> left -> right
        // Expected: 40, 20, 10, 30, 60, 50,   70
        preorderTraverval(root);
        System.out.println("");

        // In-order: left -> root -> right
        // Expected: 10, 20, 30, 40, 50, 60, 70
        inorderTraversal(root);
        System.out.println("");

        // Post: left -> right -> root
        // Expected: 10 , 30, 20, 50, 70, 60, 40
    }
}

public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
