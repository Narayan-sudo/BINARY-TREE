//Ayush  narayan ojha
public class BStree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(int nodes[], int start, int end) {
       if(start > end) {
        return null;
       } 
       int mid = (start + end) / 2;
       Node root = new Node(nodes[mid]);

      root.left = insert(nodes, start, mid-1);
      root.right = insert(nodes, mid+1, end);
      return root;

    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void search(Node root, int key) {
      if(root.data == key) {
        System.out.println("your key found");
        return;
      } 
      if(key < root.data) {
        search(root.left, key);
      } else {
        search(root.right, key);
      }

    }
    public static int subtreeSum(Node root) {
        if(root == null) {
            return 0;
        }
        return root.data + subtreeSum(root.left) + subtreeSum(root.right);
    }
    
    public static int LSubtreeSUM(Node root) {
        if(root == null) {
            return 0;
        }
        return subtreeSum(root.left);
    }

    public static int RSubtreeSUM(Node root) {
        if(root == null) {
            return 0;
        }
        return subtreeSum(root.right);
    }
    public static void main(String args[]) {
        int nodes[] = {1,2,3,4,5,6,7,8,9,10,11};
        Node root = insert(nodes, 0, 10);
        insert(nodes, 0, 10);
        System.out.println("your preorder traversal of the tree is as following :- ");
        preorder(root);
        System.out.println();
        search(root, 10);
        System.out.println(LSubtreeSUM(root));
    }

}
    