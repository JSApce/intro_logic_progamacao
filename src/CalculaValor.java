import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba:
		 * 
		 * O valor da conta de luz Conta de água Conta de telefone Escola do filho
		 * Fatura do cartão Gastos com supermercado ... e mostre o gasto total que a
		 * família teve no mês. Não esqueça de usar muito o operador "+=".
		 */
		Scanner scanner = new Scanner(System.in);
		
		Double total = 0.0;
		
		System.out.println("Cálculo de gastos familiar");
		System.out.print("Conta de energia: ");
		Double energia = scanner.nextDouble();
		total += energia;
		
		System.out.print("Conta de água: ");
		Double agua = scanner.nextDouble();
		total += agua;
		
		System.out.print("Conta de telefone: ");
		Double telefone = scanner.nextDouble();
		total += telefone;
		
		System.out.print("Conta de escola: ");
		Double escola = scanner.nextDouble();
		total += escola;
		
		System.out.print("Conta de cartão: ");
		Double cartao = scanner.nextDouble();
		total += cartao;
		
		System.out.print("Conta de supermercado: ");
		Double supermercado = scanner.nextDouble();
		total += supermercado;
		
		
		System.out.println("Total: " + total);

		scanner.close();
	}
}
