// Class for binary Quest
class binaryquest{
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    static class binaryTree{
        Node root;
        public binaryTree(){
            this.root=null;
        }
        public binaryTree(Node node){
            this.root=node;
        }
        public void addBinary(int value){
            this.root = insertValue(value, this.root);
        }
        public Node insertValue(int value, Node current){
            if(current==null){
                return new Node(value);
            }
            if(current.data>value){
                current.left = insertValue(value, current.left);
            }
            else if(current.data<value){
                current.right = insertValue(value, current.right);
            }
            else return current;
        return current;
        }
        public void traversal(){
            System.out.println("Pre Order");
            preOrder(this.root);
            System.out.println("Post Oder");
            postOrder(this.root);
            System.out.println("In Order");
            inOrder(this.root);
        }
        public void preOrder(Node current){
            if(current==null)
                return;
            preOrder(current.left);
            System.out.println(current.data);
            preOrder(current.right);
        }
        public void inOrder(Node current){
            if(current==null)
                return;
            System.out.println(current.data);
            inOrder(current.left);
            inOrder(current.right);
        }
        public void postOrder(Node current){
            if(current==null)
                return;
            postOrder(current.left);
            postOrder(current.right);
            System.out.println(current.data);
        }

    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        bt.addBinary(10);
        bt.addBinary(2);
        bt.addBinary(89);
        bt.addBinary(23);
        bt.addBinary(-1);
        bt.addBinary(0);
        bt.addBinary(43);
        bt.addBinary(9);
        bt.addBinary(45);
        bt.addBinary(46);
        bt.traversal();
        //Test

    }
}