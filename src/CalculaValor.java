import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber um número que será referente ao dia da
		 * semana (de 1 até 7). Dependendo do número informado você deve imprimir o nome
		 * desse dia.
		 * 
		 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então
		 * "segunda-feira" e por ai vai.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número dia da semana: ");
		int numeroDaSemana = scanner.nextInt();

		switch (numeroDaSemana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.err.println("Número inválido: " + numeroDaSemana);
				break;
		}

		

		scanner.close();
	}
}
