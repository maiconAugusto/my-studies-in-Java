package ClasseAndMetodos;

public class Pessoa {
	String name;
	double peso;
	
	Pessoa(String name, double peso){
		this.name = name;
		this.peso = peso;
	}
	void Comer(Comida comida) {
		this.peso = this.peso + comida.peso;
	}
	
	String IntroduceME() {
		return "Ola meu nome é " + name + " e tenho " + peso + " Kl" ;
	}
}	
