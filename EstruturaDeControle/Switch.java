package EstruturaDeControle;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int number = entrada.nextInt();
		
		switch(number) {
		case 1: System.out.println(" aqui 1");
			break;
		case 2 : System.out.println("aqui 2");
			break;
		case 3 : System.out.println("aqui 3");
			break;
		default: break;
		}
		
		entrada.close();
	}
}
