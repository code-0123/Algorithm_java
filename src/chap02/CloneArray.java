package chap02;

//배열 복제 

//배열이름.clone() : 배열의 복제 

public class CloneArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b는 a의 복제를 참조
		// 배열 변수 b는 a가 참조하는 배열 본체의 복제를 참조한다.

		b[3] = 0; // 한 요소에만 0을 대입

		System.out.print("a = ");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		System.out.print("\nb =");
		for (int i = 0; i < b.length; i++)
			System.out.print(" " + b[i]);
	}
}

/*
 b[3]의 값을 0으로 바꾼 뒤 모든 요소의 값을 나타낸다. 이렇게 한 것은
 배열 변수 b의 참조가 배열 a의 본체 그 자체가 아니라 그 복제임을 확인하기 위함이다. 
 */
