package com.nirmal.lab4;

import java.util.Scanner;

public class VigenereCipher {

	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the keyword:");
		String key=inp.nextLine();
		System.out.print("Enter the Message:");
		String Mess=inp.nextLine();
		String Mod=String.valueOf(Mess);
		int i,j=0;
		inp.close();
		for(i=0;i<(key.length()-Mess.length()%key.length());i++)
		{
			Mod+='*';
		}
		System.out.println(Mod);
		String nKey="";
		for(i=0;i<(Mod.length()/key.length());i++)
		{
			nKey+=key;
		}
		System.out.println(nKey);
		String encMess="";
		for(i=0;i<Mess.length();i++)
		{
			char d=Mess.charAt(i);
			if(d==' '){
				encMess+=" ";
				
			}
			if(d>='A'&&d<='Z')
			{
				encMess+=(char)((Mess.charAt(i)+nKey.charAt(j++)-130)%26+65);
			}
		}
		System.out.println("Encrypted Message:"+encMess);
	}
}
