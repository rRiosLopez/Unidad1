package unidad1;
import java.util.Scanner;
public class Programa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		byte op;
		float inch, con;
		double cm;
		
		System.out.println("1.- Pulgadas a cent�metros.");
		System.out.println("2.-pies a cent�metros.");
		System.out.println("3.-Pies a pulgadas");
		System.out.println("Ingrese la opci�n.(1-3)");
		
		op = read.nextByte();
		
		switch (op){
		case 1:
			
			System.out.println("ingrese las pulgadas.");
			con = read.nextFloat();
			cm = con*2.54;
			System.out.println(con +" pulgadas es igual a "+ cm+" cent�metros.");
			break;
			
		case 2:
			
			System.out.println("Ingrese los pies");
			con=read.nextFloat();
			cm = con*30.48;
			System.out.println(con+" pies es igual a "+cm+" pies.");
			break;
			
		case 3:
			
			System.out.println("Ingrese los pies.");
			con=read.nextFloat();
			inch = con*12;
			System.out.println(con + " pies es igual a " + inch + " pulgadas.");
			break;
			
		default:
			
			System.out.println("Entrada no v�lida");
			break;
	}
	}
}
