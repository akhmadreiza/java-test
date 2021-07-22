package com.akhmadreiza.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Put an integer: ");
        String strInpunt = scanner.nextLine();
        printStairCase(Integer.valueOf(strInpunt));
        scanner.close();
	}
	
	private static void printStairCase(int depth) {
		for (int i = depth; i > 0; i--) {
			for (int j = 1; j <= depth; j++) {
				System.out.print(j < i ? " " : "#");
			}
			System.out.println();
		}
	}
}
