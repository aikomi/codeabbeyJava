package sumsinloop;

import java.util.Scanner;
import java.util.Arrays;

public class Sumsinloop {

	public static int[] sumsLoop(int[] arreglob, int[] arregloc, int entradas)
	{
		int cont=0;
		int[] totales=new int[entradas];
		
		
		for( int suma : arreglob)
		{
		 totales[cont]=suma+arregloc[cont];
		 cont++;
		}
		
		return totales;
		
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("ingrese numero de entradas");
		int entradas=reader.nextInt();
		reader.nextLine();
		int[] b=new int[entradas];
		int[] c=new int[entradas];
		int cont=0;
		System.out.println("ingrese la lista de numeros");
		while(cont<entradas)
		{
			try{
			String linea=reader.nextLine();
			
			Scanner lector=new Scanner(linea);
		
			b[cont]=lector.nextInt();
			c[cont]=lector.nextInt();
			
			}catch(Exception e)
			{
				b[cont]=0;
				c[cont]=0;
			}
		
		cont++;
			
			
		
		}
		
		
		
		int[] totales=sumsLoop(b,c,entradas);
		for (int elemento : totales)
		{
			System.out.println(elemento+" ");
		}
	}

}
