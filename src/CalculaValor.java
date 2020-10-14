import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba o valor de um produto e exiba o valor final da
		 * compra. Esse valor final será o valor do produto mais o valor do frete - use
		 * o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um
		 * valor final de R$95,00.
		 * 
		 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Desconto de frete em compras acima de R$100,00");
		System.out.print("Digite o valor da compra: ");
		Double valor = scanner.nextDouble();

		if (valor < 100) {
			valor += 15.0;
		}
		System.out.println("Total (valor + frete): " + valor);

		scanner.close();
	}
}
