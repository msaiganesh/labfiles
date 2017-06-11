package com.nirmal.lab12;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class FermatPrimalirityTest {

	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter any number:");
		Integer n=inp.nextInt();
		BigInteger bn=new BigInteger(String.valueOf(n));
		Random rnd=new Random();
		BigInteger a=BigInteger.probablePrime(Integer.toBinaryString(n).length()/2, rnd);
		if(a.pow(n).mod(bn).equals(a))
		{
			System.out.println("The given number can be a prime number");
		}
		else
		{
			System.out.println("The given number is not a prime number");
		}
	}

}
