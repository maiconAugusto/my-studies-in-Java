package ClasseAndMetodos;

public class Raiocircle {
	double raio;
	//Static torna o atributo unicoe class;
	final static double pi = 2.4;
	
	
	Raiocircle(double raio){
		this.raio = raio;
	}
	double area() {
		return raio * raio * pi;
	}
}
