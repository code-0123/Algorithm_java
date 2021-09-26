package DataStructureEx;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>(); 
		queue.offer(5); 
		queue.offer(1); 
		queue.offer(2); 
		queue.clear();      // queue 초기화
		queue.offer(3); 
		queue.offer(4);
		queue.add(11); 
		queue.poll(); //queue에 첫번째 값을 반환하고 제거 비어있다면 null
		System.out.println(queue);
		queue.remove();     // queue에 첫번째 값 제거
		System.out.println(queue);
		
	}
	
	
	


}
