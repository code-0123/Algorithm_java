package chap02;

//�迭 ���� 

//�迭�̸�.clone() : �迭�� ���� 

public class CloneArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b�� a�� ������ ����
		// �迭 ���� b�� a�� �����ϴ� �迭 ��ü�� ������ �����Ѵ�.

		b[3] = 0; // �� ��ҿ��� 0�� ����

		System.out.print("a = ");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		System.out.print("\nb =");
		for (int i = 0; i < b.length; i++)
			System.out.print(" " + b[i]);
	}
}

/*
 b[3]�� ���� 0���� �ٲ� �� ��� ����� ���� ��Ÿ����. �̷��� �� ����
 �迭 ���� b�� ������ �迭 a�� ��ü �� ��ü�� �ƴ϶� �� �������� Ȯ���ϱ� �����̴�. 
 */
