package LinkedList;

import java.net.StandardSocketOptions;
import java.util.LinkedList;

public class CollectionFrameworks {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("is");
        list.addLast("a");
        System.out.println(list);

        list.addFirst("This");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i< list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
