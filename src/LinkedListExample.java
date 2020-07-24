import java.util.LinkedList;

public class LinkedListExample {
    // --Commented out by Inspection (7/24/2020 12:39 PM):public static final String constant = "AAAAA";

    public static void main(String[] args) {
        LinkedList<String> list = getStrings();

        // list.remove("C");
        // System.out.println(list);
        System.out.println(list.poll()); //poll uses the poping the first elemment oout

    }

    private static LinkedList<String> getStrings() {
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        return list;
    }

}
