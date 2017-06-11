package com.nirmal.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Transposition
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the key string:");
		String kstr=inp.nextLine();
		char b[]=kstr.toCharArray();
		char c[]=kstr.toCharArray();
		Arrays.sort(b);
		int d[][]=new int[2][b.length];
		int i,j,k;
		for(i=0;i<b.length;i++)
		{
			d[0][i]=i;
		}
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(b[j]==c[i])
				{
					d[1][i]=d[0][j];
					break;
				}
			}
		}
		System.out.println();
		System.out.print("Enter the Input String:");
		String instr=inp.nextLine();
		String ninstr=String.valueOf(instr);
		for(i=0;i<(kstr.length()-instr.length()%kstr.length());i++)
		{
			ninstr+='*';
		}
		int m=ninstr.length()/kstr.length();
		char w[][]=new char[m][kstr.length()];
		k=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<kstr.length();j++)
			{
				w[i][j]=ninstr.charAt(k);
				k++;
			}
		}
		for(i=0;i<instr.length();i++)
		{
			for(j=0;j<kstr.length()-1;j++)
			{
				if(d[1][j]>d[1][j+1])
				{
					int temp3=d[1][j];
					d[1][j]=d[1][j+1];
					d[1][j+1]=temp3;
					for(k=0;k<m;k++)
					{
						char temp4=w[k][j];
						w[k][j]=w[k][j+1];
						w[k][j+1]=temp4;
					}
				}
			}
		}
		String ostr="";
		for(i=0;i<kstr.length();i++)
		{
			for(j=0;j<m;j++)
			{
				ostr+=String.valueOf(w[j][i]);
			}
		}
		System.out.println("\nEncoded String:"+ostr);
		inp.close();
	}
}
