import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e
		 * depois imprime o nome completo. Para isso, você vai precisar de duas
		 * variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome".
		 * Por último, você vai juntar o nome e o sobrenome em uma única impressão.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faça a impressão do nome e do sobrenome da pessoa");
		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Nome completo: " + nome + " " +sobrenome);

		scanner.close();
	}
}
