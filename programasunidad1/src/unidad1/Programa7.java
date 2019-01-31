package unidad1;
import java.util.Scanner;
public class Programa7 {

	public static void main(String[] args) {

			Scanner reader=new Scanner(System.in);
			float farenheit;
			double celsius;

			System.out.println("Escriba la temperatura en farenheit");
			farenheit=reader.nextFloat();
			
			celsius=(farenheit-32)/1.8;
			
			System.out.println("La temperatura en farenheit es: "+farenheit);
			System.out.println("La temperatura en celsius es: "+celsius);
			
	}

}
