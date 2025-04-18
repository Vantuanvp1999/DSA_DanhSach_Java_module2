import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes=0;
    private Node tail=null;

    private class Node<E> {
        private Node next;
        private Object data;

        public Node(E data) {
            this.data = data;

        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList() {
    head = null;
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
        if(tail == null) {
            tail = head;
        }
        numNodes++;
    }
    public void addLast(E data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail= newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        numNodes++;
    }
    public E removeFirst() {
        if(numNodes == 0) {
            return null;
        }
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if(head == null) {
                tail = null;
            }
            return (E) temp.data;
        }
    }
    public E removeLast() {
        if(numNodes == 0) {
        return null;
    } else if (numNodes==1) {
            Node temp = head;
            head =tail = null;
            numNodes=0;
            return (E) temp.data;
        }else {
            Node current = head;
            for(int i=0; i<numNodes-2; i++) {
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.data;
        }

        }


        public E remove(int index) {
        if(index < 0 || index >= numNodes) {
            return null;
        } else if (index ==0) {
            return removeFirst();
        }else if (index ==numNodes-1) {
            return removeLast();
        }else{
            Node previous = head;
            for(int i=0; i<index; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current.data;
        }
        }

        public boolean removeElement(E data) {
        if(head == null) {
            return false;
        }
        if(head.data.equals(data)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while(current != null) {
            if(current.data.equals(data)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
        }

        public int size() {
        return numNodes;
        }

        public void add1(E data) {
            Node<E> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<E> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            numNodes++;
        }

        public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();

        Node current = head;
        while(current != null) {
            cloneList.add1((E) current.data);
            current = current.next;
        }
        return cloneList;
        }


        public boolean contains(E data) {
        Node current = head;
        while(current != null) {
            if(current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
        }

        public int indexOf(E data) {
        Node current = head;
        for(int i=0; i<numNodes; i++) {
            if(current.data.equals(data)) {
                return i;
            }
            current = current.next;
        }
        return -1;
        }


        public E get(int index) {
        if(index < 0 || index >= numNodes) {
            return null;
        }
        Node current = head;
        for(int i=0; i<index; i++) {
            current = current.next;
        }
        return (E) current.data;
        }


        public E getFirst() {
        if(head == null) {
            return null;
        }
        return (E) head.data;
        }


        public E getLast() {
        if(head == null) {
            return null;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            return (E) current.data;
        }

        }
        public void clear() {
        head = null;
        numNodes = 0;
        }


        public void set(int index, E data) {
        if(index < 0 || index >= numNodes) {
             throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node current = head;
        for(int i=0; i<index; i++) {
            current = current.next;
        }
        current.data = data;

        }

}
