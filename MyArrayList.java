package assig;

import java.util.Scanner;
public class MyArrayList<T extends Comparable <T>> implements MyList<T>{
    private Object[] arr;
    private int length = 0;
    private int capacity = 3;

    public MyArrayList() {
        arr = new Object[capacity];
    }


    public void add(T item) {
        if (length == capacity)
            increaseCapacity();

        arr[length++] = item;
    }
   public boolean contains(Object o) {
	   for(int i=0;i<length;i++) {
		   if(arr[i]==o)
			   return true;
	   }
    	return false;
    }
   public T remove(int index) {
	   boolean removed=contains(arr[index]);
	   if(removed=true) {
		   arr[index]=null;
		   System.out.println("Element removed");
	   }
    	return null;
    }
   public boolean remove(T item) {
	   return false;
   }
    public void add(T item, int index) {
    	 if(index>=capacity) {
    		 increaseCapacity();
    	 }else if(index<=length)
    		 throw new IndexOutOfBoundsException("There is an element with this index");
    	 arr[index]=item;
    }

    private void increaseCapacity() {
        capacity = 2 * capacity;
        Object[] old = arr;
        arr = new Object[capacity];

        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];
    }
public int lastIndexOf(Object o ) {
	 if (o == null) {
	        for (int i = length-1; i >= 0; i--)
	            if (arr[i]==null)
	                return i;
	    } else {
	        for (int i = length-1; i >= 0; i--)
	            if (o.equals(arr[i]))
	                return i;
	    }
	    return -1;
}
public void sort() {
	boolean sorted = false;
    Object temporary;
    while (!sorted) {
        sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
        	if(((Comparable<T>)arr[i]).compareTo((T)arr[i+1])>0){
                temporary = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temporary;
                sorted = false;
            }
        }
        System.out.println("ArrayList sorted");
    }
}
public void clear() {
	for(int i=0;i<length;i++) {
		arr[i]=null;
	}
}
public int indexOf(Object o) {
	 if (o == null) {
	        for (int i = 0; i <= length-1; i++)
	            if (arr[i]==null)
	                return i;
	    } else {
	        for (int i = 0; i <= length-1; i++)
	            if (o.equals(arr[i]))
	                return i;
	    }
	    return -1;
}
    public T get(int index) {
    	T t = (T)arr[index];
    	return t;
    }

    public int size() {
        return length;
    }


	@Override
	public T removeRoot() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void heapify() {
		// TODO Auto-generated method stub
		
	}
}
