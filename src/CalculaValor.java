import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Para criar uma calculadora simples você vai precisar receber três informações
		 * pelo console. São os dois números que participarão da operação e também a
		 * operação que será realizada.
		 * 
		 * Você vai receber o primeiro número, depois vai receber qual é a operação e,
		 * por último, o segundo número.
		 * 
		 * Para os números que você vai receber pelo console, pode utilizar a mesma
		 * funcionalidade que já utilizamos aqui no curso - o *Scanner*. Para receber a
		 * operação você pode receber também um número que vai indicar a mesma. Por
		 * exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4
		 * divisão.
		 * 
		 * Com esses três valores - os dois números e qual será a operação - você pode
		 * utilizar a estrutura de decisão if para só realizar a operação que o usuário
		 * escolheu. Se estiver com dúvidas, então volte a aula onde falamos sobre
		 * alteração do valor de uma variável - aula 3.10.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculadora simples");
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Escolha: [1 - Adição, 2 - subtração, 3 - multiplicação, 4 - divisão]: ");
		Integer operador = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		if (operador == 1) {
			System.out.println("Soma: " + (primeiroNumero + segundoNumero));
		} else if (operador == 2) {
			System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
		} else if (operador == 3) {
			System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
		} else {
			System.out.println("Divisão: " + (primeiroNumero / segundoNumero));
		}

		scanner.close();
	}
}
