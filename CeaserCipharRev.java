package com.nirmal.lab1;

import java.util.Scanner;

public class CeaserCipharRev {

	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the Key:");
		int k=inp.nextInt();
		System.out.print("Enter a String:");
		inp.nextLine();
		String txt=inp.nextLine();
		String ntxt="";
		char a[]=txt.toCharArray();
		char b[]=new char[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&&a[i]<='z')
			{
				b[i]=(char)((a[i]-k-96+26)%26+96);
				if(b[i]<'a')
				b[i]+=26;
				ntxt+=String.valueOf(b[i]);
			}
			else
			{
				ntxt+=String.valueOf(a[i]);
			}
		}
		System.out.println(ntxt);
		inp.close();
	}

}
