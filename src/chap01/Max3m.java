package chap01;

//3개의 정숫값 가운데 최대값을 구하여 출력합니다
public class Max3m {
	//a,b,c의 최댓값을 구하여 출력합니다
	
	static int max3(int a, int b, int c) {
		int max = a; 
		if(b>max)
			max = b; 
		if(c>max)
			max = c; 
		
		return max; 
	}
	
}
