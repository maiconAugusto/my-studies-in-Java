package ClasseAndMetodos;

public class Produto {
	String nome;
	double preço;
	double desconto;
	
	
	Produto(String nameInitial){
		nome = nameInitial;
	}
	
	double Desconto( double preço, double desconto) {
		double res = preço - desconto;
		return res;
	}
	
}
