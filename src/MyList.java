import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){

        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Index is out of boundary");
        } else {
            for (int a = index; a < size; a++) {
                elements[a] = elements[a+1];
            }
        }
        size --;
    }

}
