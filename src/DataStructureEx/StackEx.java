package DataStructureEx;

import java.util.*;

//Stack 구현 예제(java)
public class StackEx {
	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();

		st.push("0");
		st.push("1");
		st.push("2");
		st.pop();
		st.clear(); // stack의 값 전부 제거
		st.push("5");
		st.push("1");
		st.push("6");
		st.push("222");
		st.peek();

		System.out.println("---stack 테스트중---");
		System.out.println(st.size()); // stack의 크기 출력
		System.out.println(st.empty()); // stack이 비어있는지 여부 체크 (비어있으면 true,아니면 false)
		System.out.println(st.contains("222")); // stack에 222가 있는지 체크 (있으면 true, 없으면 false)
		System.out.println(st.peek()); // stack의 가장 상단 값 출력

		System.out.println("---Stack 출력---");
		while (!st.isEmpty()) {

			System.out.println(st.pop());
		}

	}

}
