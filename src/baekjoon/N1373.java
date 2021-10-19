package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1373 {

	static int[] powNumbers = {1, 2, 4}; // 2^0, 2^1, 2^2
	static char[] eightCharArr;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String twoStr = br.readLine();
		char[] twoCharArr = twoStr.toCharArray();
		int len = twoCharArr.length;
		int index;
		
		// 3���� ����������� ������, �� �ڸ��� �߰��ȴ�. 
		if(len % 3 != 0) {
			index = (len / 3);
		}
		else {
			index = (len / 3) - 1;
		}
		
		eightCharArr = new char[index + 1]; // String�� append���� �迭�� ���ڸ� ����ִ� ��������Ͽ� �޸� �� �ӵ���� 
		
		// 2���� -> 8����. 3�ڸ��� ��� ���ϱ�
		// 2���� input�� �ִ� ���̰� 1000000 ���� ����. ��, 10������ �ִ� �Է� ���� 2^999999 �̴�.
		int powNumber = 0, num = 0;
		
		while(--len >= 0) {
			num += (twoCharArr[len] - '0') * powNumbers[powNumber]; // 2���� �� * powNumber �� ° �ڸ� 
			
			if(powNumber == 2) { // 2���� 3�ڸ��� ���� ��������� ���ڿ��� �߰�
				eightCharArr[index] = (char) (num + '0');
				index--;
				powNumber = 0;
				num = 0;
			}
			else {
				powNumber++;
			}
		}
		
		if(index == 0) {
			eightCharArr[index] = (char) (num + '0');
		}
		
		System.out.println(new String(eightCharArr));
	}
}