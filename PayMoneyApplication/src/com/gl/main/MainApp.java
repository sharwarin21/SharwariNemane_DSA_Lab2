package com.gl.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		int size=sc.nextInt();
		int[] transactions=new int[size];
		System.out.println("Enter the values of array:");
		for(int i=0;i<size;i++)
			transactions[i]=sc.nextInt();
		System.out.println("Enter the total number of targets that needs to be achieved:");
		int totalTargets=sc.nextInt();
		for(int j=0;j<totalTargets;j++) {
			System.out.println("Enter the value of target:");
			int target=sc.nextInt();
			int res=determine(transactions,target);
			if(res==0)
				System.out.println("Given target is not achieved.");
			else
				System.out.println("Target achieved after "+res+" transactions.");
		}
		sc.close();
	}
	public static int determine(int[] transactions,int target) {
		int sum=0;
		for(int i=0;i<transactions.length;i++) {
			int val=transactions[i];
			sum+=val;
			if(sum>=target) {
				return i+1;
			}
		}
		return 0;
	}
}