public class Btree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BuildTree{
        static int idx=-1;
        public static Node BuildT(int nodes[]) {
            idx++;
            if(nodes[idx]==-1) {
                
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildT(nodes);
            newNode.right=BuildT(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if(root==null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

    }
    public static void main(String args[]) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree=new BuildTree();
        Node root=tree.BuildT(nodes);
        tree.preorder(root);
        //tree.topView(root);
    }
     
}
