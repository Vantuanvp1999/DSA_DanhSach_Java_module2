public class MyList<E> {
    private int size;
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int CAPACITY) {
        elements = new Object[CAPACITY];
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            Object[] newData = new Object[newCapacity];
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(50);

        }
        elements[size++] = e;
    }
    public void add(int index, E e) {

        ensureCapacity(50);

        for (int i = size-1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = e;
    }
    public E remove(int index) {
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }
    public int size() {
        return size;
    }
    public E get(int index) {
        return (E) elements[index];
    }
    public MyList<E> clone(){
        MyList<E> clone = new MyList();
        clone.ensureCapacity(this.size);
        for (int i = 0; i < size; i++) {
            clone.add(this.get(i));
        }
        return clone;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public boolean add1(E e){
        ensureCapacity( size+ 1);
        elements[size++]=e;
        return true;
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
