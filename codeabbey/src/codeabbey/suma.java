package codeabbey;

import java.util.Scanner;

public class suma {
	
	
	public static int suma(int a, int b)
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("ingrese primer numero");
		int a=reader.nextInt();
		System.out.println("ingrese segundo numero");
		int b=reader.nextInt();
		System.out.println(suma(a,b));
	}

}
