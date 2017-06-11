package com.nirmal.lab4;

import java.io.*;
import java.lang.*;
public class hillcipher
{
	public static void main(String []arg)throws Exception
	{
		int k[][]={{2,23}, {21,7}};
		int p[]=new int[300];
		int c[]=new int[300];
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter plain text");
		String str=br.readLine();

		for( i=0;i<str.length();i++)
		{
			int c1=str.charAt(i);
			p[i]=(c1)-97;
		}
        i=0;int zz=0;
        for( int b=0;b<str.length()/2;b++)
        {
        	for(int j=0;j<2;j++)
        	{
        		for(int x=0;x<2;x++)
        		{
        			c[i]+=k[j][x]*p[x+zz];
        		}
        		i++;
        	}
        	zz+=2;
        }
        System.out.println("Encrypted Text : ");
        for(int z=0;z<str.length();z++)
        System.out.print((char)((c[z]%26)+97));
	}
}
