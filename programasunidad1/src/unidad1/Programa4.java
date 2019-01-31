package unidad1;
import java.util.Scanner;
public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read= new Scanner(System.in);
	    String nombre;
	    int edad;
	    System.out.println("Ingrese su nombre: ");
	     nombre=read.nextLine();
	    System.out.println("Ingrese su edad: ");
	     edad=read.nextInt();
	     if(edad>=18){
	    	 System.out.println(nombre+" es mayor de edad con "+edad+" años");
		     
	     }
	     else {
	    	 System.out.println(nombre+" es menor de edad con "+edad+" años");
	}

	}
	}
