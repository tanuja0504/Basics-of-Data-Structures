package basicDataStructure;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.PriorityQueue;

public class dsCollection {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("Hi");
		stack.push("String");
		Iterator i = stack.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			i.next();
			
		}
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			q.add(1);
			q.add(2);
			q.add(3);
			Iterator j = q.iterator();
			while(j.hasNext()){
				System.out.println(j.next());							
			}
			
			LinkedList<Integer> l = new LinkedList<Integer>();
		
			l.add(1);
			l.add(2);
			Iterator k = l.iterator();
			
			while(k.hasNext()){
				System.out.println(k.next());							
			}
			
			
	}

}
