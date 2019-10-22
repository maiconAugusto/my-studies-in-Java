package ClasseAndMetodos;
import java.util.Scanner;

public class ProdutoEnd {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Produto products = new Produto();
		products.nome = "Notebook";
		products.preço = 155.5;
		products.desconto = 14.4;
		
		System.out.println(products.nome);
		System.out.println(products.desconto);
		System.out.println(products.preço);
		System.out.println("\n");
		
		Produto product = new Produto();
		product.nome = "Notebook";
		product.preço = 155.5;
		product.desconto = 14.4;
		
		System.out.println(product.nome);
		System.out.println(product.desconto);
		System.out.println(product.preço);
		
		Data date = new Data();
		System.out.println(date.data);
		
	}
}
