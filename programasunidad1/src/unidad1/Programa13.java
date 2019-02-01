package unidad1;
import java.util.Scanner;
public class Programa13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, sum=0,total=0;
		System.out.println("Ingrese un número.");
		n = read.nextInt();
		for(int i=0;i<n;i+=2) {
			sum+=i;
			System.out.println(i);
			total+=1;
		}
		System.out.println(sum/total);
		
	}

}
