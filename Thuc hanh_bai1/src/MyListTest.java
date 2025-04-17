public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("elements 4: " + list.get(3));
        System.out.println("elements 2: " + list.get(1));
    }
}
