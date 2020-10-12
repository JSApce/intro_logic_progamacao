import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculo do IMC");
		System.out.print("Digite a altura: ");
		Double valorAltura = scanner.nextDouble();
		
		System.out.print("Digite o peso: ");
		Double valorPeso = scanner.nextDouble();
		
		Double imc = valorPeso / (valorAltura * valorAltura);
		System.out.println("O IMC é: " + imc);
		
		scanner.close();
	}
}
