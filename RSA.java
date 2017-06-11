package com.nirmal.lab9;

import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
 
public class RSA
{
    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int bitlength=512;
    private Random r;
 
    public RSA()
    {
        r = new Random();
        p = BigInteger.probablePrime(bitlength,r);
        q = BigInteger.probablePrime(bitlength,r);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
        {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }
 
    public static void main(String[] args) throws IOException
    {
        RSA rsa = new RSA();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the plain text:");
        String teststring = in.nextLine();
        System.out.println("Encrypting String: " + teststring);
        System.out.println("String in Bytes: "+b2S(teststring.getBytes()));
        byte[] encrypted = rsa.encrypt(teststring.getBytes());
        System.out.println(encrypted);
        byte[] decrypted = rsa.decrypt(encrypted);
        System.out.println("Decrypting Bytes: " + b2S(decrypted));
        System.out.println("Decrypted String: " + new String(decrypted));
    }
 
    private static String b2S(byte[] encrypted)
    {
        String test = "";
        for (byte b : encrypted)
        {
            test += Byte.toString(b);
        }
        return test;
    }
    public byte[] encrypt(byte[] message)
    {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }
    public byte[] decrypt(byte[] message)
    {
        return (new BigInteger(message)).modPow(d, N).toByteArray();
    }
}
