package ClasseAndMetodos;

public class Produto {
	String nome;
	double pre�o;
	double desconto;
	
	
	Produto(String nameInitial){
		nome = nameInitial;
	}
	
	double Desconto( double pre�o, double desconto) {
		double res = pre�o - desconto;
		return res;
	}
	
}
