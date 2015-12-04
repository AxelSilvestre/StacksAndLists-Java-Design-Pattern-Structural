package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E> {

	
	private int size;
	private Object[] elements;
	
	public ArrayStack() {
		size = 0;
		elements = new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	E element(int index){
		return (E) elements[index];
	}
	
	
	@Override
	public void push(E e) {
		elements[size] = e;
		size++;		
	}

	@Override
	public E pop() {
		return element(--size);
	}

	@Override
	public E peek() {
		return element(size-1);
	}

	@Override
	public int size() {
		return size;
	}

}
