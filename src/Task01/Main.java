package Task01;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		Stack<String> stack = new Stack<String>();
		String[] str = text.split(" ");
		for (String a : str) {
			stack.push(a);
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}