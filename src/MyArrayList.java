import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<T> implements Iterable<T>{
	
	private  Object[] items = new Object[10];

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Proxy approach
//	private  List<T> myArrayList = new ArrayList<T>();
//	
//	public void add(T item) {
//		myArrayList.add(item);
//	}
//	
//	public void remove(int index) {
//		myArrayList.remove(index);
//	}
//	
//	public T get(int index) {
//		return myArrayList.get(index);
//	}
//	
//	public int size() {
//		return myArrayList.size();
//	}
//	
//	@Override
//	public Iterator<T> iterator(){
//		 Iterator<T> it = new Iterator<T>() {
//
//	            private int currentIndex = 0;
//
//	            @Override
//	            public boolean hasNext() {
//	                return currentIndex < size() && get(currentIndex) != null;
//	            }
//
//	            @Override
//	            public void remove() {
//	                throw new UnsupportedOperationException();
//	            }
//
//				@Override
//				public T next() {
//					return get(currentIndex++);
//				}
//	        };
//	        return it;
//	}
}
