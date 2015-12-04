package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface Stack<E> {
	
	void push(E e);
	
	E pop();
	
	E peek();
	
	int size();

}
