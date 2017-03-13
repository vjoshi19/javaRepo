package javaRepo.javaRepo;

public class Stack_array {
	int top;
    int [] stack;
    
    Stack_array(int size){
    	if(size <= 0) throw new IllegalArgumentException("Stacks"
    			+ "size must be a positive number");
    	stack = new int[size];
    	top = -1;
    }
    
    void push2Stack(int d){
    	if(top == stack.length)throw new StackException(
    			"Stack's underlying storage is overflow");
    		
    	top++;
    	stack[top]= d;
    }
    
    void printStack(){
    	for ( int i = 0; i <= top; i++){
    		System.out.println(stack[i] + " ");
    	}
    }
    
     int popfromStack(){
    	if(top == stack.length)throw new StackException(
    			"Exceeds stack max capacity");
    	
    	return stack[top--];
    	
    }
    
    public class StackException extends RuntimeException {
        public StackException(String message) {
              super(message);
        }
  }
	
	// Array implementation of the stack data structure
	public static void main(String[] args) {
		Stack_array sa = new Stack_array(10);
		
		sa.push2Stack(23);
		sa.push2Stack(25);
		sa.push2Stack(27);
		sa.push2Stack(29);
		sa.printStack();
		System.out.println("pop'd "+ sa.popfromStack());
		sa.printStack();
		// push(1);
		// printStack();
		// pop(10);
		// 
		
		
	}

	
	public static void push(int x){
		
		
	}

}
