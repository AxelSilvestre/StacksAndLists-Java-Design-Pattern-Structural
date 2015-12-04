package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E> {

	private Object[] elements;
	
	private int size;
	
	public ArrayList() {
		size = 0;
		elements = new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	E element(int index){
		return (E) elements[index];
	}
	
	@Override
	public void add(int index, E e) {
		System.arraycopy(elements, size, elements, size + 1, size - index);
		elements[index] = e;
		size++;	
		
	}

	@Override
	public E remove(int index) {
		E e = element(index);
		int value =  size - index - 1;
		if(value > 0)
			System.arraycopy(elements, size + 1, elements, size, value);
		elements[--size] = null;
		return e;
		
	}

	@Override
	public E get(int index) {
		return element(index);
	}

	@Override
	public int size() {
		return size;
	}

}
