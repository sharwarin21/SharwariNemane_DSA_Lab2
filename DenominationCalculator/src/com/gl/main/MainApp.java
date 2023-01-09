package com.gl.main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size=sc.nextInt();
		int[] denominations=new int[size];
		System.out.println("Enter the currency denominations value:");
		for(int i=0;i<size;i++) 
			denominations[i]=sc.nextInt();
		System.out.println("Enter the amount you want to pay:");
		int amount=sc.nextInt();
		denominations=sort(denominations);
		System.out.println("Your payment approach in order to give minimum number of notes will be:");
		calculate(denominations,amount);
		sc.close();
	}
	
	public static int[] sort(int[] denominations) {
		int len=denominations.length;
		for(int i=0;i<len;i++)
			for(int j=i;j<len;j++) {
				if(denominations[i]<denominations[j]) {
					int temp=denominations[i];
					denominations[i]=denominations[j];
					denominations[j]=temp;
				}
			}
		return denominations;
	}

	public static void calculate(int[] denominations,int amount) {
		int[] notes=new int[denominations.length];
		for(int i=0;i<denominations.length;i++)
		{
			notes[i]=amount/denominations[i];
			amount=amount%denominations[i];
			if(notes[i]!=0)
				System.out.println(denominations[i]+":"+notes[i]);
		}
		if(amount!=0)
			System.out.println("Unable to provide denomination for amount of "+amount);
	}

}
