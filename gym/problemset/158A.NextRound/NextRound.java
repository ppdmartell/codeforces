//Java JDK11 [accepted]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int position = sc.nextInt();
		List<Integer> scores = new ArrayList<>();
		while(amount > 0) {
			int current = sc.nextInt();
			scores.add(current);
			amount--;
		}
		Collections.sort(scores, Collections.reverseOrder());
		int toBeat = scores.get(position - 1);
		int advance = (int) scores.stream().filter(p -> p >= toBeat && p > 0).count();
		System.out.println(advance);
	}
}

/*
Next Round (https://codeforces.com/problemset/problem/158/A)

"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
Input

The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
Output

Output the number of participants who advance to the next round.
*/
