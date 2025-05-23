public class LL {
    //Insertion O(1) better than ArrayList O(n)
    //Searching O(n) worse than ArrayList O(1)
    // Non contiguous memory
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add - last
    public void addLast(String data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty, cannot delete");
            return;
        }
        size--;
        head = head.next;
    }
    //delete - last
    public void deleteLast(){
        if(head == null){
            System.out.println("LIst is empty, cammot delete");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node Last = head.next;
        while(Last.next != null){
            Last = Last.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("List");
        list.printlist();
        list.addFirst("this");
        list.printlist();
        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
        System.out.println(list.getSize());
    }
}
