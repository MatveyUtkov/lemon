package assig;
import java.util.Scanner;
public class MyLinkedList<T extends Comparable <T>> implements MyList<T>{
    public static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private int length = 0;
    private MyNode<T> head, tail;

    public MyLinkedList() {
    	
    }
public boolean contains(Object o) {
	 MyNode current = head;
     while (current != null)
     {
         if (current.data == o)
             return true;
         current = current.next;
     }
     return false;  
}
public boolean remove(T item) {
	MyNode<T> Node=new MyNode<>(item);
	if(contains(Node)==true) {
		Node=null;
		return true;
	}return false;
}
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void clear() {
    	head=null;
          
    }

    public T get(int index) {
        if (index >= length || index < 0)
            throw new IndexOutOfBoundsException("index should be positive and less than size");

        MyNode<T> temp = head;

        while (index != 0) {
            temp = temp.next;
            index--;
        }

        return temp.data;
    }

    public int size() {
        return length;
    }
    public void add(T item, int index) {
    	
    }
public T remove(int index) {
	return null;
}
public  int indexOf(Object o) {
	return -1;
}
public int lastIndexOf(Object o) {
	return -1;
}

public void sort() {
	if (length > 1) {
        for (int i = 0; i < length; i++ ) {
            MyNode current = head;
            MyNode next = head.next;
            for (int j = 0; j < length - 1; j++) {
                if (((Comparable<T>)current.data).compareTo((T)next.data)>0) {
                    MyNode temporary = current;
                    current = next;
                    next = temporary;
                } 
                current = next;
                next = next.next;                   
            } 
        }
    }
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
