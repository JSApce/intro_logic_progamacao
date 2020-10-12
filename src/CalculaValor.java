import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		Double valoProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor informado pelo cliente: ");
		Double valoInformadoPelocliente = scanner.nextDouble();
		
		
		System.out.println("Troco: " + (valoInformadoPelocliente - valoProduto));
		
		scanner.close();
	}
}
