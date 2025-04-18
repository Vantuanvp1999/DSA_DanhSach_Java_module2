import java.util.LinkedList;

public class MyLinkListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.add1(5);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }
        MyLinkedList<Integer> cloneList = linkedList.clone();
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println(cloneList.get(i));
        }
        linkedList.set(2,6);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        linkedList.removeElement(2);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
