package com.nirmal.lab2;

import java.util.Scanner;

public class RailFenceCipher {

	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the input string:");
		String istr=inp.nextLine();
		System.out.print("Enter the key value:");
		int k=inp.nextInt();
		char a[][]=new char[k][istr.length()];
		int i,j;
		for(i=0;i<k;i++)
		{
			for(j=0;j<istr.length();j++)
			{
				a[i][j]='*';
			}
		}
		for(j=0;j<istr.length();j++)
		{
			if((j/(k-1))%2==0)
			{
				a[j%(k-1)][j]=istr.charAt(j);
			}
			else if((j/(k-1))%2==1)
			{
				a[(k-1)-j%(k-1)][j]=istr.charAt(j);
			}
		}
		String ostr="";
		for(i=0;i<k;i++)
		{
			for(j=0;j<istr.length();j++)
			{
				if(a[i][j]!='*')
				{
					ostr+=String.valueOf(a[i][j]);
				}
			}
		}
		for(i=0;i<k;i++)
		{
			for(j=0;j<istr.length();j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Output String:"+ostr);
		inp.close();
	}
}
