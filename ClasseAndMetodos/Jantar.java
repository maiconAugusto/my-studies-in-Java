package ClasseAndMetodos;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Batata", 0.500);
		Pessoa pessoa = new Pessoa("Maicon", 89.89);
		
		System.out.println(pessoa.IntroduceME());
		pessoa.Comer(c1);
		System.out.println(pessoa.IntroduceME());
		
	}
}
