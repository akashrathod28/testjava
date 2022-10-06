import java.util.Iterator;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        assert list.size() == 0;

        list.add(2);
        list.add(5);

        Iterator<Integer> iter = list.iterator();
        assert iter.next() == 2;
        assert iter.next() == 5;
        assert !iter.hasNext();

        assert list.size() == 2;
        assert list.get(0) == 2;

        try {
            list.get(-1);
            assert false;
        } catch (Exception ignore) {

        }

        try {
            list.get(5);
            assert false;
        } catch (Exception ignore) {

        }

        list.remove(0);
        assert list.size() == 1;
        assert list.get(0) == 5;

        assert true;
    }
}
