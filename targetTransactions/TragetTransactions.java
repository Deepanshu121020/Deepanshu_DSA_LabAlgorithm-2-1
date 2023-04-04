package com.gl.targetTransactions;

import java.util.Scanner;

public class TragetTransactions {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of transactions array");
	int size = sc.nextInt();
	
	int [] trans = new int [size];
	int i;
	for (i=0;i<size;i++) {
		System.out.println("Enter the value of Transactions");
		trans[i]=sc.nextInt();
	}
		System.out.println("Enter the number of Targets to be achieved ");
		int targets = sc.nextInt();
		
		for (i=1;i<=targets;i++) {
			int sum = 0;
			int flag = 0;
			
			System.out.println("Enter the value of Target ");
			int ValueOfTarget = sc.nextInt();
				
			for (int j=0;j<size;j++) {
				
				sum = sum + trans[j];
				if (sum>=ValueOfTarget) {
					flag = 1;
					System.out.println("Taget achieved on transaction number "+(j+1));
					break;
				}
			}
			if(flag==0) {
				System.out.println("Given target not achieved");
			}
			
				
		}
}
}
