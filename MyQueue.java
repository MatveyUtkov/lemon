package assig;

import assig.MyLinkedList.MyNode;

public class MyQueue<T extends Comparable <T>> implements MyList<T> {
	public static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
	}
	 private int length = 0;
	 MyNode front,back;
	 public MyQueue()
	    {
	        this.front = this.back = null;
	    }
public	void add(T item) {
	MyNode added= new MyNode(item);
	 if (this.back == null) {
         this.front = this.back = added;
         return;
     }

    
     this.back.next = added;
     this.back = added;
	
}
	public T removeRoot() {
		return null;
		
	}
	public boolean remove(T item) {
		if (this.front == null)
            return true;
 
        
        MyNode temp = this.front;
        this.front = this.front.next;
         if (temp == item) {
            temp=null;
        this.front=this.front.next;
            return true;
        }
         return false;
    }
	
	public void heapify() {
		
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


}
