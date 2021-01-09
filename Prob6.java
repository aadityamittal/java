package probs;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String m = sc.nextLine().toLowerCase();
		String p = sc.nextLine().toLowerCase();
		m = m.replaceAll("["+p+"]", "");
		System.out.println(m.trim());
	}

}
