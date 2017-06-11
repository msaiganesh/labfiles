package com.nirmal.lab11;

import java.math.BigInteger;
import java.util.Scanner;

public class ChineseRemainderTheorum {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the number of equations:");
		int k=inp.nextInt();
		int a[]=new int[k];
		int m[]=new int[k];
		int M[]=new int[k];
		int i,j;
		for(i=0;i<k;i++)
		{
			System.out.print("Enter a["+(i)+"] and m["+(i)+"]:");
			a[i]=inp.nextInt();
			m[i]=inp.nextInt();
		}
		inp.close();
		System.out.println("Equations are:-");
		for(i=0;i<k;i++)
		{
			System.out.println("x = "+a[i]+" mod "+m[i]);
		}
		int Mul=1;
		for(i=0;i<k;i++)
		{
			Mul*=m[i];
		}
		for(i=0;i<k;i++)
		{
			M[i]=Mul/m[i];
		}
		BigInteger bM[]=new BigInteger[k];
		BigInteger bm[]=new BigInteger[k];
		BigInteger InvM[]=new BigInteger[k];
		BigInteger rem[]=new BigInteger[k];
		BigInteger x=BigInteger.ZERO;
		for(i=0;i<k;i++)
		{
			bM[i]=new BigInteger(String.valueOf(M[i]));
			bm[i]=new BigInteger(String.valueOf(m[i]));
			InvM[i]=bM[i].modInverse(bm[i]);
			rem[i]=new BigInteger(String.valueOf(a[i]));
			x=x.add(rem[i].multiply(bM[i].multiply(InvM[i])));
		}
		BigInteger bMul=new BigInteger(String.valueOf(Mul));
		x=x.mod(bMul);
		System.out.println("x = "+x);
	}
}
