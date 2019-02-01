package unidad1;
import java.util.Scanner;
public class Programa12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		 int op=0,n;
		 float consClien,consTot=0,over100=0,bel100=0;
		 double consAvg;
		 System.out.println("Ingrese el numero de clientes");
		 n = read.nextInt();
		 while (op!=n){
		  op++;
		  System.out.println("Ingrese los minutos consumidos por el cliente "+ op);
		  consClien = read.nextFloat();
		  consTot +=consClien;
		  if (consClien<100){
		   bel100++;
		  }
		  if(consClien>100){
		   over100++;
		  }
		  
		 }
		 consAvg=consTot/n;
		 System.out.println("El promedio de consumo de su compañía es "+consAvg);
		 System.out.println("El total de clientes que consume menos de 100 minutos es "+bel100);
		 System.out.println("El total de clientes que consume más de 100 minutos es "+over100);
	}

}
