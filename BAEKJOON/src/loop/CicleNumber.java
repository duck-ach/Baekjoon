package loop;

import java.util.Scanner;

public class CicleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = N;
		int count = 0;
		
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) %10);
			count++;
		} while (C != N);
		
		System.out.println(count);
		
		

	}

}
