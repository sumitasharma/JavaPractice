import java.util.*;

class KthToLast{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class SingleLinkedList{
        Node start;
        public SingleLinkedList(){
            this.start = null;
        }
        public Node addList(Node current, int value){
            if(current != null){
                while(current.next != null){
                    current = current.next;
                }
                current.next = new Node(value);
            }
            else
                return new Node(value);
            return start;
        }
        public void insertList(int value){
            start = addList(this.start,value);
        }
        public void traverse(){
            Node current = start;
            if(current == null){
                System.out.println("List is empty");
                return;
            }
            while(current.next != null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
        public void kthToLast(int value){
            Node current = this.start;
            int count = 0;
            if(current == null){
                System.out.println("List is empty");
            }
            while(current.next != null){
                if(count == value){
                   break;
                }
                count++;
                current = current.next;
            }
            while(current.next !=null){
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
        }
    }

    public static void main(String args[]){
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertList(12);
        sl.insertList(34);
        sl.insertList(22);
        sl.insertList(9);
        sl.insertList(78);
        sl.insertList(6);
        sl.insertList(4);
        sl.insertList(50);
        sl.insertList(21);
        sl.insertList(3);
        sl.traverse();
        System.out.println("Kth Element");
        sl.kthToLast(3);
    }
}

