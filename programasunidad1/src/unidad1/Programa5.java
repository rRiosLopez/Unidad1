package unidad1;
import java.util.Scanner;
public class Programa5 {

	public static void main(String[] args) {
			byte cal;
			Scanner reader=new Scanner(System.in);
			
			System.out.println("Ingrese su calificación");
			cal=reader.nextByte();
			if(cal>=80)
			{
			System.out.println("Está usted aprobado.");
			}
			else 
			{
			System.out.println("Ha reprobado.");	
			}

	}

}
