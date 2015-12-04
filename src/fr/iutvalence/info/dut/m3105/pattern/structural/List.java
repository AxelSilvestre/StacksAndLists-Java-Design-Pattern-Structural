package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {
	
	void add(int index, E e);
	
	E remove(int index);

	E get(int index);
	
	int size();
}
