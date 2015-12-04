package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private Stack stack;
	
	public StackOfStringTester(Stack stack) {
		this.stack = stack;
	}
	
	public void testStack(){
		System.out.println(stack.size());
		
		stack.push("A");
		System.out.println("Pushed A");
		System.out.println(stack.size());
		
		stack.push("B");
		System.out.println("Pushed B");
		System.out.println(stack.size());
		
		System.out.println("Peek");
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("Pop");
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println("Pop 2");
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
	}

}
