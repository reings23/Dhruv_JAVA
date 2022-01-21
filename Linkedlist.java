import java.util.*;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("JANUARY");
        list.add("MARCH");
        list.add("MAY");
        list.add("JULY");
        list.add("SEPTEMBER");
        System.out.println(list);
        list.remove(2);
        list.remove(3);
        System.out.println(list);
    }
}
