package Linked_list;

public class base {
    public static  class Node{
        int data;
        Node next;
        public Node(int value){
            this.data = value;
        }
        public Node(int value , Node next){
            this.data = value;
            this.next = next;
        }
    }
    private static Node Head;
    private static Node Tail;
    public static int size = 0;
    /*
        insertfirst();
        insertlast();
        insert();
        deleteLast();
        delete();
        find();
        get();
        deleteFirst();
     */

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = Head;
        Head = node;
        if (Tail == null){
            Tail = Head;
        }
        ++size;
    }
    public void insertlast(int val){
    if (Tail == null){
        insertfirst(val);
    }else {
        Node node = new Node(val);
        this.Tail.next = node;
        this.Tail = node;
        ++size;
        }
    }
    public void insert(int value , int index){
        if (index ==0){
            insertfirst(value);
        } else if (index == this.size) {
            insertlast(value);
        }else{
            Node temp = this.Head;
            for (int i = 1; i < index; ++i) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            ++size;
        }
    }
    public Node get(int index) {
        Node node = this.Head;

        for(int i = 0; i < index; ++i) {
            node = node.next;
        }

        return node;
    }
    public int deleteFirst() {
        int val = this.Head.data;
        this.Head = this.Head.next;
        if (this.Head == null) {
            this.Tail = null;
        }

        --this.size;
        return val;
    }
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }else {
            Node secondlast = this.get(size-2);
            int val = Tail.data;
            Tail = secondlast;
            Tail.next = null;
            --size;
            return val;
        }
    }
    public int Delete (int index){
        if (index ==0){
            return deleteFirst();
        }else if(index == size-1){
            return deleteLast();
        }else{
            Node prev = this.get(index - 1);
            int val = prev.next.data;
            prev.next = prev.next.next;
            --size;
            return val;
        }
    }
    public void display() {
        for(Node temp = Head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " -> ");
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        base list = new base();
        list.insertfirst(10);
        list.insertfirst(50);
        list.insertfirst(20);
        list.insertlast(35);
        list.insert(11,2);
        list.deleteFirst();
        list.deleteLast();
        list.Delete(0);
        list.display();
    }

}
