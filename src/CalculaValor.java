import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		/*
		 * Pense em uma empresa fictícia que todo o mês de Janeiro premia seus
		 * funcionários com um bônus, caso a meta seja alcançada.
		 * 
		 * Crie um programa que receba 3 parâmetros. O primeiro será a meta de
		 * faturamento anual da empresa para o ano que passou. Depois, receba o
		 * parâmetro referente ao faturamento real da empresa no ultimo ano. Por último,
		 * receba a média salarial do funcionário(a) para o ano anterior (não precisa
		 * fazer cálculo de média salarial, já que estamos trabalhando com um algoritmo
		 * fictício - na hora de informar esse parâmetro, invente um valor qualquer para
		 * representar essa média salarial).
		 * 
		 * Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta
		 * de faturamento anual, então os funcionários ganharam um bônus que será igual
		 * a média salarial deles no último ano. 
		 * Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então eles receberão
		 * também 80% de sua média salarial.
		 * 
		 * No final, mostre de quanto será o prêmio desse funcionário(a).
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calcule o bônus do funcionário(a)");
		System.out.print("Meta de faturamento anual: ");
		Double metaAnual = scanner.nextDouble();

		System.out.print("Faturamneto real: ");
		Double faturamentoAnual = scanner.nextDouble();
		
		System.out.print("Média anual de salario do funcionário(a): ");
		Double mediaSalarial = scanner.nextDouble();

		if (faturamentoAnual >= metaAnual) {
			
			System.out.print("Bônus de 100%: " + mediaSalarial);
			
		} else if(faturamentoAnual >= (metaAnual*0.8)){
			
			System.out.println("Bônus de 80%: " + (mediaSalarial * 0.8));
		} else {
			System.out.println("Sem bônus!");
		}

		scanner.close();
	}
}
