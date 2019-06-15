import java.util.*;

class RemoveDuplicatesLinkedList{

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class LinkedList{
        Node start;
        public LinkedList(){
            start=null;
        }
        public void addLinkedList(int value){
            start = insertLinkedList(start,value);
        }
        public Node insertLinkedList(Node current, int value){
            Node start=current;
            if(current==null){
                return new Node(value);
            }
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node(value);
            return start;
        }
        public void traverse(){
            Node current = start;
            do{
                System.out.println(current.data);
                current = current.next;
            }while(current.next!=null);
            System.out.println(current.data);
        }
        public void deleteDuplicate(){
            Node current = start;
            HashSet<Integer> unique = new HashSet<Integer>();
            unique = null;
            while(current.next!=null){
                if(unique!=null){
                    if(!unique.contains(current.data)){
                        unique.add(current.data);
                        current=current.next;
                    }
                    else{
                        current=current.next.next;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addLinkedList(3);
        ll.addLinkedList(5);
        ll.addLinkedList(2);
        ll.addLinkedList(8);
        ll.addLinkedList(9);
        ll.addLinkedList(1);
        ll.addLinkedList(6);
        ll.addLinkedList(4);
        ll.addLinkedList(7);
        ll.addLinkedList(0);
        ll.addLinkedList(3);
        ll.addLinkedList(9);
        //ll.traverse();
        ll.deleteDuplicate();
        ll.traverse();
    }
}