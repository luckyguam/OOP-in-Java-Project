import java.util.Iterator;

public class ArrayBag implements Bag {
    private Student[] arr;
    private int size;

    public ArrayBag(){
        this.arr = new Student[4];
    }

    public ArrayBag(int capacity) {
        if (capacity < 4) {
            capacity = 4;
        }
        this.arr = new Student[capacity];
    }
 
    @Override
    public void add(Student s) {
        if (size < arr.length) {
            arr[size]=s;
            size++;
        }
        else{
            throw new BagFullException();
        }
    }

    @Override
    public void remove(Student s) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(s)) {
                arr[i] = arr[size - 1];
                size--;
                return;
            }
        }
    }

    @Override
    public boolean contains(Student s) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int Index = 0;
            @Override
            public boolean hasNext(){
                return Index<size;
            }

            @Override
            public Student next(){
                if (!hasNext()) {
                    return Index < size;
                }
                return arr[Index++];
            }
        };
    }
}
