package unidad1;
import java.util.Scanner;
public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read= new Scanner(System.in);
	    String nombre;
	    int edad;
	    double estatura;
	    System.out.println("Ingrese su nombre: ");
	     nombre=read.nextLine();
	    System.out.println("Ingrese su edad: ");
	     edad=read.nextInt();
	    System.out.println("Ingrese su estatura: ");
	     estatura=read.nextDouble();
	     
	     System.out.println("Nombre: "+nombre);
	     System.out.println("Edad: "+edad);
	     System.out.println("Estatura: "+estatura);
	}

}
