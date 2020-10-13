import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * O seu programa deve receber a nota do aluno pelo console e depois você vai
		 * fazer uma operação lógica para saber se a nota do aluno é maior que 70. O
		 * resultado dessa operação lógica deve ser atribuido a uma variável do tipo
		 * Boolean.
		 * 
		 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de
		 * decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno
		 * passou ou não passou.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa que informa se o aluno passou de ano");
		System.out.print("Digite a nota: ");
		Double nota = scanner.nextDouble();

		boolean aprovado = nota >= 7;
		if(aprovado ) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
		
		scanner.close();
	}
}
