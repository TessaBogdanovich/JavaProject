

import java.util.Collections;
import java.util.LinkedList;

public class Homework_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("ab");
        list.add("bc");
        list.add("cd");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}
