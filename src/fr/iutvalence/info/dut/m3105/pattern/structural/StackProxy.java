package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackProxy<E> implements Stack<E>{

	private Stack<E> stack;
	private int log;
	
	public StackProxy(int log) {
		this.log = log;
	}
	
	@Override
	public void push(E e) {
		
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
