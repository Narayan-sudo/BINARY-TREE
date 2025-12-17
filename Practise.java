//AYUSH NARAYAN OJHA

import java.util.*;
public class Practise{
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
    public static Node insert(Node root, int key) {
      if(root == null) {
        return new Node(key);
      } else if(key <= root.data) {
        root.left = insert(root.left, key);

      } else {
        root.right = insert(root.right, key);
      }
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

    public static int leftSubtreeSum(Node root) {
      if(root == null) {
        return 0;
      }
      return subtreeSum(root.left);
    }

    public static int rightSubtreeSum(Node root) {
      if(root == null) {
        return 0;
      }
      return subtreeSum(root.right);
    }
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node root = null;

    while(true) {
      System.out.println("enter stop to stop the code and else to continue.....");
      String str = sc.nextLine();
      if(str.equalsIgnoreCase("stop")) {
        System.out.println("you quit!!!!");
        break;
      } else {
        System.out.println("enter your elements of tree :-");
        
        int n = sc.nextInt();
        root = insert(root, n);
        sc.nextLine();

      }
    }
    System.out.println("the preorder traversal of your tree is :- ");
    preorder(root);
    sc.close();
  }
}