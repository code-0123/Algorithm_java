package chap01;

//3���� ������ ��� �ִ밪�� ���Ͽ� ����մϴ�
public class Max3m {
	//a,b,c�� �ִ��� ���Ͽ� ����մϴ�
	
	static int max3(int a, int b, int c) {
		int max = a; 
		if(b>max)
			max = b; 
		if(c>max)
			max = c; 
		
		return max; 
	}
	
}
