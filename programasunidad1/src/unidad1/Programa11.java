package unidad1;
import java.util.Scanner;
public class Programa11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double inch,feet,feetcm,value,res;
		byte op;
		
		inch = 2.54;
		feetcm = 30.48;
		feet = 12;

		do{
			System.out.println("1.- Pulgadas a centímetros.");
			System.out.println("2.-pies a centímetros.");
			System.out.println("3.-Pies a pulgadas");
			System.out.println("4.- Salir.");
			System.out.println("Ingrese la opción.(1-4)");
			op = read.nextByte();
			switch (op){
			case 1:
				System.out.println("Ingrese las pulgadas.");
				value = read.nextDouble();
				res = value*inch;
				System.out.println(value+" pulgadas es igual a "+res+" centímetros.");
				break;
			case 2: 
				System.out.println("Ingrese los pies.");
				value = read.nextDouble();
				res = value*feetcm;
				System.out.println(value+ " pies es igual a "+res+" Centímetros");
				break;
			case 3:
				System.out.println("Ingrese los pies.");
				value = read.nextDouble();
				res= value*feet;
				System.out.println(value+ " pies es igual a "+res+" pulgadas");
				break;
			case 4:
				System.out.println("Cerrando programa");
				break;
			default:
				System.out.println("Entrada no reconocida, intente de nuevo ingresando un número del 1 al 4");
				break;
			}
			
		}while(op!=4);

	}

}
