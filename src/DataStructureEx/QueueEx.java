package DataStructureEx;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>(); 
		queue.offer(5); 
		queue.offer(1); 
		queue.offer(2); 
		queue.clear();      // queue �ʱ�ȭ
		queue.offer(3); 
		queue.offer(4);
		queue.add(11); 
		queue.poll(); //queue�� ù��° ���� ��ȯ�ϰ� ���� ����ִٸ� null
		System.out.println(queue);
		queue.remove();     // queue�� ù��° �� ����
		System.out.println(queue);
		
	}
	
	
	


}
