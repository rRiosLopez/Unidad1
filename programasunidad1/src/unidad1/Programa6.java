package unidad1;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int num,res;
		 
		System.out.println("Ingrese un n�mero.");
		num=reader.nextInt();
		
		res=num%2; 	 
		if(res==1)
		{
			System.out.println("El n�mero es impar");
		}
		else
		{
			System.out.println("El n�mero es par");
		}
	}

}
