package EstruturaDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int res = entrada.nextInt();
		if( res < 4) {
			System.out.println("Menor");
		}
		else
		{
			System.out.println("Maior");
		}
		entrada.close();
	}
}
