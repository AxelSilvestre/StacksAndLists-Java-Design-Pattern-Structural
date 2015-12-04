package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<E> implements Stack<E>{

	private ArrayList<E> list;
	
	public ListAdapter(ArrayList<E> list) {
		this.list = list;
	}
	
	
	@Override
	public void push(E e) {
		list.add(list.size(), e);
	}

	@Override
	public E pop() {
		return list.remove(list.size()-1);
	}

	@Override
	public E peek() {
		return list.get(list.size()-1);
	}

	@Override
	public int size() {
		return list.size();
	}

}
