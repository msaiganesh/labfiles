package com.nirmal.lab1;

import java.util.Scanner;

public class MACiphar {

	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter a String:");
		String txt=inp.nextLine();
		String ntxt="";
		char a[]=txt.toCharArray();
		char b[]=new char[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&&a[i]<='z')
			{
				b[i]=getEnc(a[i]);
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
	public static char getEnc(char x)
	{
		char r;
		switch(x)
		{
			case 'a':r= 'b';
			break;
			case 'b':r= 'c';
			break;
			case 'c':r= 'r';
			break;
			case 'd':r= 'h';
			break;
			case 'e':r= 'a';
			break;
			case 'f':r= 't';
			break;
			case 'g':r= 'h';
			break;
			case 'h':r= 'z';
			break;
			case 'i':r= 'x';
			break;
			case 'j':r= 'y';
			break;
			case 'k':r= 'j';
			break;
			case 'l':r= 'k';
			break;
			case 'm':r= 'l';
			break;
			case 'n':r= 'd';
			break;
			case 'o':r= 'e';
			break;
			case 'p':r= 'f';
			break;
			case 'q':r= 'g';
			break;
			case 'r':r= 'i';
			break;
			case 's':r= 'm';
			break;
			default: r=x; 
		}
		return r;
	}
}
