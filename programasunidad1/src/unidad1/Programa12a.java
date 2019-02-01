package unidad1;
import java.util.Scanner;
public class Programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int op=1,i,opc1=0,opc2=0;
		 double precio;
		Scanner read = new Scanner(System.in);
		System.out.println("cuantas ventas realizó?");
		i = read.nextByte();
		while (op<=i){
		System.out.println("precio del producto "+op+":");
		op++;
		precio = read.nextDouble();
		if(precio<=200){
		 opc1+=1;
		}
		 if(precio>200 && precio <400){
		  opc2+=1;
		 }
		}
		 System.out.println("ud. realizó "+opc1+" ventas menores a 200 pesos");
		 System.out.println("Ud. realizó "+opc2+" ventas mayores a 200 y menores a 400");
	}

}
