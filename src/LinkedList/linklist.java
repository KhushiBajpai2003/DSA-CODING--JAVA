package LinkedList;        //non primitive default data type ki value hoti hai null

public class linklist {

class Node {
    Node(int val){
        this.data = val;
    }
    int data;
    Node next;
}
 Node head;
public void addFirst(int value){
    Node obj = new Node(value);
    obj.next = head;
    head = obj;
}

public void RemoveLast(){
    Node prev = null;
    Node curr = head;
    if(curr==null){
        throw new RuntimeException("Sab khali hai!!");
    }
    while(curr.next!=null){
        prev = curr;
        curr = curr.next;
    }
    if(prev == null ){
        head = null;
        return;
    }
    prev.next = null;
}

public void addLast(int value){
    Node temp = head;
    Node obj = new Node(value);
    if(temp==null){
        head=obj;
        return;
    }
    while(temp.next!=null){
        temp = temp.next;

    }
    temp.next = obj;
}

public void RemoveFirst(){
    if(head==null){
        RemoveLast();
    }
    head = head.next;

}
public void display(){
    Node temp = head;
    if(temp==null){
        System.out.print("null head");
    }
    while(temp!=null){
        System.out.print(temp.data + "=>");
        temp = temp.next;
    }
}
public Node FindMid(){
    Node fast = head;
    Node Slow = head;

    while(fast!=null && fast.next!=null ){     // (fast.next!=null && fast.next.next!==null)
        Slow = Slow.next;
        fast = fast.next.next;
    }
    return Slow;
}

    public static void main(String[] args){
         linklist obj = new linklist();
         obj.addLast(1);
         obj.addLast(2);
         obj.addLast(3);
//         obj.addFirst(4);
//         obj.RemoveFirst();
         Node X = obj.FindMid();
        System.out.println(X.data);
         obj.display();

    }
}
