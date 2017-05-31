package TddSet;

/**
 * Created by Aurel on 5/21/17.
 */
public class Set {
    private int size;

    private Object[] data = new Object[10];

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;

    }

    public void add(String s) {
        data[size] = s;

        size++;
    }

    public boolean contains(String s) {
        return search(s) != -1;
    }

    private int search(String s) {
        int found = -1;
        for(int i = 0; i<size; i++){
            if(data[i].equals(s))
                found = i;
        }
        return found;
    }

    public void remove(String s) {
        int found = search(s);
        data[found] = data[size];
        data[size] = null;
        size--;
    }
}
