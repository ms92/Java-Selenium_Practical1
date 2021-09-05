package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class PrintSmallestRanNum {
	static int num[] = {1,2,3,7,8,9,67,89,45,23,87};
	static int i;
	int arr[];

	public static void main(String[] args) {

		Random ran = new Random();
		int n;

		for (int i = 0; i <= 500; i++) {
		n = ran.nextInt(500);
		 System.out.println(n);
		}
		
		System.out.println("get n numbers from user and print the smallest number!");
		Scanner input = new Scanner(System.in);
		
	for(int i=0; i<10; i++) {
	num[i] = input.nextInt();
	}
		System.out.println("Smallest number is: " + smallest(num));
	}

static int smallest(int arr[]) {
		int smallestNum = num[0];
		for (int i = 0; i < arr.length; i++) {
			if (num[i] < smallestNum) {
				smallestNum = num[i];
			}
		}
		return smallestNum;

	}

}
