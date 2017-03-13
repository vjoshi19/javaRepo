package javaRepo.javaRepo;

public class QueueArray {
	private int head;
	private int tail;
	private int size;
	private int [] queue;
	
	 QueueArray(int x){
		queue = new int[x];
		head = queue[0];;
		tail = queue[0];
		size = 0;
		
	}
	
	private void enqueue(int x){
		//System.out.println("size = " + size);
		//System.out.println("queulen = " + (queue.length - 1));
		if ( size >= queue.length - 1) throw new ArrayIndexOutOfBoundsException(
				"cannot add more than the size of the queue");	
		if( size == 0){
			queue[0] = x;
			head = queue[0];
			tail = queue[0];
			++size;
		}else{
			int i;
			for(i = size - 1; i >= 0; i--){
				queue[i+1] = queue[i];
			}
			queue[0] = x;
			++size;
		}
	}
	
	/*private int dequeue(){
		
	}*/
	
	private void printQueue(){
		for(int i = 0; i <= size - 1; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println();
		System.out.println("Size of the Q: " + size);
	}

	public static void main(String[] args) {
		QueueArray q = new QueueArray(5);
		
		q.enqueue(10);
		q.printQueue();
		q.enqueue(11);
		q.printQueue();
		q.enqueue(12);
		q.printQueue();
		q.enqueue(13);
		q.printQueue();
		q.enqueue(14);
		q.printQueue();
		
		
	}

}
