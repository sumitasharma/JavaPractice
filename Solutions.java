
class Solutions {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        Node root;
        public BinaryTree(){
            this.root=null;
        }

        public BinaryTree(Node root) {
            this.root = root;
        }

        public Node binaryAdd(int value, Node current){
            if(current==null)
                return new Node(value);
            if(value<current.data)
                current.left=binaryAdd(value, current.left);
            else if(value>current.data)
                current.right=binaryAdd(value, current.right);
            else 
                return current; 
            return current;
        }

        public void add(int value){
            this.root = binaryAdd(value,root);
        }

        public void traverse(){
            System.out.println("Inorder");
            inOrder(this.root);
            System.out.println("Preorder");
            preOrder(this.root);
            System.out.println("Postorder");
            postOrder(this.root);
        }

        public void inOrder(Node current){
            if(current==null)
                return;
            inOrder(current.left);
            System.out.println(" "+current.data);
            inOrder(current.right);
        }

        public void preOrder(Node current){
            if(current==null)
                return;
            System.out.println(" "+current.data);
            preOrder(current.left);
            preOrder(current.right);
        }

        public void postOrder(Node current){
            if(current==null)
                return;
            postOrder(current.left);
            postOrder(current.right);
            System.out.println(" "+current.data);

        }

        public boolean isBinary(){
             return isBinaryTree(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        public boolean isBinaryTree(Node current, int low, int high){
            if(current==null)
                return true;
            return current.data > low && current.data < high &&
                    isBinaryTree(current.left, low, current.data) && isBinaryTree(current.right, current.data, high);
        }

       
        
    }

    static Node makeBinaryTree(){
        Node root = new Node(30);
        Node l1 = new Node(10);
        root.left=l1;
        Node r1 = new Node(40);
        root.right=r1;
        Node l11 = new Node(1);
        Node l12 = new Node (15);
        Node r11 = new Node(35);
        Node r12 = new Node(45);
        l1.left = l11;
        l1.right = l12;
        r1.left = r11;
        r1.right = r12;
        return root;
    }

    

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(12);
        bt.add(3);
        bt.add(6);
        bt.add(8);
        bt.add(1);
        bt.add(55);
        bt.add(10);
        bt.add(0);
        bt.add(-1);
        bt.add(90);
        bt.traverse();

        // Make binary Tree
        Node binaryTreeRoot = makeBinaryTree();
        BinaryTree bt2 = new BinaryTree(binaryTreeRoot);
        bt2.traverse();

        if(bt.isBinary())
            System.out.println("This tree is a binary search tree");
        else
            System.out.println("This tree is not a binary search tree");
        if(bt2.isBinary())
            System.out.println("This tree is a binary search tree");
        else
            System.out.println("This tree is not a binary search tree");
        }

    
}