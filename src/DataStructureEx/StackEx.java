package DataStructureEx;

import java.util.*;

//Stack ���� ����(java)
public class StackEx {
	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();

		st.push("0");
		st.push("1");
		st.push("2");
		st.pop();
		st.clear(); // stack�� �� ���� ����
		st.push("5");
		st.push("1");
		st.push("6");
		st.push("222");
		st.peek();

		System.out.println("---stack �׽�Ʈ��---");
		System.out.println(st.size()); // stack�� ũ�� ���
		System.out.println(st.empty()); // stack�� ����ִ��� ���� üũ (��������� true,�ƴϸ� false)
		System.out.println(st.contains("222")); // stack�� 222�� �ִ��� üũ (������ true, ������ false)
		System.out.println(st.peek()); // stack�� ���� ��� �� ���

		System.out.println("---Stack ���---");
		while (!st.isEmpty()) {

			System.out.println(st.pop());
		}

	}

}
