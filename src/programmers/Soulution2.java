package programmers;

import java.util.*;

//완주하지 못한 선수
public class Soulution2 {
	public String solution(String[] participant, String[] completion) {

		int i;
		Arrays.sort(participant); // {"leo", "kiki", "eden"}; => {eden,kiki,leo}
		Arrays.sort(completion); // {"eden","kiki"}; =>{eden,kiki}

		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}

		return participant[i];
	}
}
