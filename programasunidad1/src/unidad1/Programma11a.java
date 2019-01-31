package unidad1;
import java.util.Scanner;
public class Programma11a {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n,i;
		double sueld_sing,suma,min,max,isr,total,subtotal;
		
		i=0;
		isr=.33;
		suma=0;
		n = read.nextInt();
		
		sueld_sing = read.nextInt();
		min = sueld_sing;
		max = sueld_sing;
		suma = suma+sueld_sing;
		
		do{
			sueld_sing = read.nextInt();
			suma = suma+sueld_sing;
			if(sueld_sing<min){
				min= sueld_sing;
			}
			if(sueld_sing>max){
				max=sueld_sing;
			}
			i+=1;	
		}while (n!=i);

	}

}
