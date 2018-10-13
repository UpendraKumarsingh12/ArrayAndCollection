package com.Stack.com;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String>stack= new Stack<>();
		stack.push("upen");
		stack.push("suren");
		stack.push("shyam");
		stack.push("ram");
		stack.push("ravindra");
		stack.pop();
		Iterator<String>itr=stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
