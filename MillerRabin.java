package com.nirmal.lab12;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class MillerRabin
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter an odd number:");
		int n=inp.nextInt();
		int m=n-1,k=0;
		while(m%2==0)
		{
			k++;
			m/=2;
		}
		Random random=new Random();
		int rbase=random.nextInt(n-4)+2;
		BigInteger a=new BigInteger(String.valueOf(rbase));
		boolean flag=false;
		for(int i=0;i<k;i++)
		{
			int l=(int)Math.pow(2,i);
			int exp=l*m;
			BigInteger bn=new BigInteger(String.valueOf(n));
			BigInteger res=a.pow(exp).mod(bn);
			if(res.equals(BigInteger.ONE)||res.equals(bn.subtract(BigInteger.ONE)))
			{
				flag=true; break;
			}
		}
		if(flag)
		{
			System.out.println("The given number is a prime with high probability");
		}
		else
		{
			System.out.println("The given number is a not a prime number");
		}
		inp.close();
	}
}
