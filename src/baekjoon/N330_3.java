package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N330_3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);

		System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="));

	}
}