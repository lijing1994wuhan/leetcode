package leetcode;

import java.util.Iterator;
import java.util.LinkedList;



public class MinStack {
	

	    /** initialize your data structure here. */
	    private LinkedList<Integer> list;
	    public MinStack() {
	        list = new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        list.add(x);
	    }
	    
	    public void pop() {
	        list.removeLast();
	    }
	    
	    public int top() {
	        return list.getLast();
	    }
	    
	    public int getMin() {
	        int min = list.getLast();
	        Iterator<Integer> l= list.iterator();
	        while(l.hasNext()){
	            int next = l.next();
	            if(next<min){
	                min = next;
	            }
	        }
	        return min;
	    }
	}

