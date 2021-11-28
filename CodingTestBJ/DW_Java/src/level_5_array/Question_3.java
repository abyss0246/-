package level_5_array;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] counts = new int[10];
		int result = A * B * C;
		while (result > 0) {
			counts[result % 10]++;
			result /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}

	}
}
