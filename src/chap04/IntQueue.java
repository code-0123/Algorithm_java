package chap04;

public class IntQueue {
	
	private int max; 
	private int front; 
	private int rear; 
	private int num; 
	private int[] que; 
	
	public class EmptyQueueException extends RuntimeException{
		public EmptyIntQueueException() {
		}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQuereException() {
		}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0; 
		max = capacity;
		
		try {
			que = new int[max]; 
		}catch(OutofMemoryError e) {
			max = 0; 
		}
	}
	
	
	
	
	


