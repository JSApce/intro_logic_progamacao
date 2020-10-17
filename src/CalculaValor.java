import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que
		 * essa pessoa contribuiu com a previdência, depois verifique se ela pode
		 * aposentar ou não.
		 * 
		 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e
		 * ter contribuído com, pelo menos, 25 anos. Se ela passar nessas duas
		 * condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Verificação da possibilidade de aposentadoria");
		System.out.print("Sua idade: ");
		Integer idade = scanner.nextInt();

		System.out.print("Anos de contribuição: ");
		Integer anoDeContribuicao = scanner.nextInt();

		if (idade >= 55 && anoDeContribuicao >= 25) {
			System.out.print("Você pode aposentar");
		} else {
			System.out.println("Você não pode aposentar");
		}

		scanner.close();
	}
}
