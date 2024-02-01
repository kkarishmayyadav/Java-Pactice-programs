public class BST{
    public  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public  Node insert(Node root, int val){
            if(root==null){
                root=new Node(val);
                return root;
            }
            if(root.data>val){
                root.left=insert(root.left, val);
            }else{
                root.right=insert(root.right, val);
            }
            return root;
        }
         public static void inorder(BST.Node root) {
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
    }
    

    public static void main(String[] args) {
        BST ob=new BST();
        int[] value={3,6,1,4,7,2,9,4,10,5};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root = ob.insert(root,value[i]);
        }

        inorder(root);
        System.out.println();
    }


   
}