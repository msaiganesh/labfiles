package com.nirmal.lab4;

import java.util.Scanner;

public class VigenereCipherDecrypt {

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
		String nKey="";
		for(i=0;i<(Mod.length()/key.length());i++)
		{
			nKey+=key;
		}
		String encMess="";
		char enc[]=new char[Mess.length()];
		for(i=0;i<Mess.length();i++)
		{
			char d=Mess.charAt(i);
			if(d==' ')
			{
				encMess+=" ";
			}
			if(d>='A'&&d<='Z')
			{
				enc[i]=(char)((Mess.charAt(i)-nKey.charAt(j++))+65);
				if(enc[i]<'A')
				{
					enc[i]+=26;
				}
				encMess+=enc[i];
			}
		}
		System.out.println("Decrypted Message:"+encMess);
	}
}
