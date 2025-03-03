package com.controlFlowStatement3;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int x,rj=0,vr=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		 n=sc.nextInt();
		
		 for(int i=3;i<=n;i++)
		 {
			 int next=rj+vr;
			 System.out.print(","+next);
			 rj=vr;
			 vr=next;
		 }
	}
}
