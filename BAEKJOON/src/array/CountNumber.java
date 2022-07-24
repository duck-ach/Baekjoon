package array;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int prod = A * B * C; // 17037300
		while(prod>0) {
			arr[prod%10]++;
			prod /= 10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
