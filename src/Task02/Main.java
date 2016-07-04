package Task02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		Queue<String> kiu = new LinkedList<String>();
		String[] str = text.split(" ");
		for (String a : str) {
			kiu.offer(a);
		}
		while (kiu.size() > 0) {
			String word = kiu.poll();
			if (word.length() > 3) {
				System.out.print(word + " ");
			}
		}
	}

}