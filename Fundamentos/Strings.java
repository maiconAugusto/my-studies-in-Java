package Fundamentos;

public class Strings {
	public static void main(String[] args) {
		String name = "Maicon";
		name = name.replace("Maicon", "Aline");
		System.out.println(name);
		
		name = name.toUpperCase();
		System.out.println(name);
		
		name = name.concat(" Augusto");
		System.out.println(name);
		
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		for(int i = 0; i < name.length(); i++) {
			System.out.print(i + " ");
		}
		
		System.out.printf("\n%s",name);
	}
}
