package suminloop;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumLoop {

	
	public static int sumaLoop(int[] arreglo)
	{
	
		int total=0;
		
		for( int suma : arreglo)
		{
		 total+=suma;
		}
		
		return total;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("ingrese numero de entradas");
		int a=reader.nextInt();
		reader.nextLine();
		int[] b=new int[a];
		int cont=0;
		System.out.println("ingrese los " + a +" numeros");
		String linea=reader.nextLine();
		Scanner lector=new Scanner(linea);
		while(lector.hasNext())
		{
			
			b[cont]=lector.nextInt();
			cont++;
		}
		
		System.out.println(sumaLoop(b));
	
	}
	
}
