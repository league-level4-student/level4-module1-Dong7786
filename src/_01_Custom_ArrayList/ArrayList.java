package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{

T[] list;
	
	
	public ArrayList() {
		list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		
		T[]	other = (T[])new Object[list.length+1];
		other[other.length-1] = val;
		list = other;

		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]	other = (T[])new Object[list.length+1];
		for(int i = other.length; i > 0; i --) {
			if(i >= loc) {
				other[i+1] = other[i]; 
				
			}
			
		}
		other[loc] = val;
		
		list = other;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		for(int i = 0; i < list.length; i ++) {
			if(i >= loc) {
				list[i] = list[i+1];
				
			}
		}
		list[list.length] = null;
		T[] other = (T[])new Object[list.length-1];
		for(int i = 0; i < other.length; i ++) {
			other[i] = list[i];
			
		}
		list = other;
		
	}
	public int size() {
		
		return list.length;
	}
	
	public boolean contains(T val) {
		for(int i = 0 ; i < list.length; i ++) {
			if(list[i] == val) {
				return true;
				
			}
			
		}
		return false;
	}
}