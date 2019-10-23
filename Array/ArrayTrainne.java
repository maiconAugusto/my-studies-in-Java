package Array;

import java.util.Scanner;

public class ArrayTrainne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas!");
		
		int tam = input.nextInt();
		int values[] = new int[tam];
		
		
		for(int i = 0; i < values.length; i++) {
			int nt = input.nextInt();
			values[i] = nt;
		}
		System.out.println("Notas inseridas");
		System.out.println("Listando as Notas:");
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		input.close();
	}
	
}
