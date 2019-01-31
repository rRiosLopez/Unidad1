package unidad1;
import java.util.Scanner;
public class Programa8 {

	public static void main(String[] args) {
		byte day;
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Ingrese el día de la semana (1-7)");
		day=reader.nextByte();
		
		switch(day) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miércoles");
			break;
		case 4:	
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sábado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			break;
		}
	}

}
