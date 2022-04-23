package assig;

public class MyHeap<T extends Comparable <T>> implements MyList<T> {
private MyArrayList<T> list;

private Object[] heap;
private int length=0;
private int capacity=3;
private int left(int index) {return 2*index;}
private int right(int index) {return 2*index+1;}
public MyHeap(int capacity) {
    heap = new Object[capacity];
}
public void add(T item) {
	 if (length == capacity)
         increaseCapacity();

     heap[length++] = item;
     
}
private void increaseCapacity() {
    capacity = 2 * capacity;
    Object[] old = heap;
    heap = new Object[capacity];

    for (int i = 0; i < old.length; i++)
        heap[i] = old[i];
}
public T removeroot() {
	return null;
}
public boolean remove(T item) {
	return true;
}
public void heapify(int index) {
	T rightC=get(right(index));
	T leftC=get(left(index));
	if(leftC.compareTo(rightC)>0) {
		
	}
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void add(T item, int index) {
	// TODO Auto-generated method stub
	
}
@Override
public T remove(int index) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void clear() {
	// TODO Auto-generated method stub
	
}
@Override
public T get(int index) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int indexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int lastIndexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void sort() {
	// TODO Auto-generated method stub
	
}
@Override
public T removeRoot() {
	// TODO Auto-generated method stub
	return null;
}
 }
