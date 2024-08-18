package LinkedList;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next = null;
            size++;
        }
    }
    // add - first or last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            Node currNode=head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next=newNode;
        }

    }

    // Delete First
    public void DeleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //Delete Last
    public void DeleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node SecondLast = head;
        Node Last = head.next;
        while(Last.next!=null){
            Last = Last.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next=null;
    }

    public void printList(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
        }
        System.out.print("null");
    }

    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.printList();

//        list.DeleteFirst();
//        list.printList();

        list.DeleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
