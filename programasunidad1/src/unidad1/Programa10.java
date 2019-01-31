package unidad1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Programa10 {

	public static void main(String[] args) {
		DecimalFormat formateador = new DecimalFormat ("###,###.##");
		double n1,n2,n3, suma,incsuma10,incsuma11,total11,total10;
		Scanner leer=new Scanner(System.in);

		System.out.println("Ingrese el primer producto");
		n1=leer.nextDouble();
		System.out.println("Ingrese el segundo producto");
		n2=leer.nextDouble();
		System.out.println("Ingrese el tercer producto ");
		n3=leer.nextDouble();

		suma=n1+n2+n3;
	

		if (suma>=1500){
			
		System.out.println("El monto a pagar es: "+formateador.format(suma));
		
		incsuma11=suma*0.11;

		total11=incsuma11+suma;
		System.out.println("Monto total a pagar es: "+formateador.format(total11));
		}
		else {
			System.out.println("El monto a pagar es: "+formateador.format(suma));
		incsuma10=suma*0.10;
		total10=incsuma10+suma;
			System.out.println("Monto total a pagar es: "+formateador.format(total10));
		}
	}

}
