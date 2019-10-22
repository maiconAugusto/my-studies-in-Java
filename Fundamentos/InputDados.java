package Fundamentos;

import java.util.Scanner;

public class InputDados {
	
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		// STRING não é um tipo primitivo;
		 String name = inputs.nextLine();
		 
		 System.out.println(name);
	}
}
