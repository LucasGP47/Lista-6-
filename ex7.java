import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor da prestacao: ");
		
		int valor = entrada.nextInt();
		
		System.out.println("Informe os dias atrasados: ");
		
		int dias = entrada.nextInt();
		
		double total = valorPagamento(valor, dias);
		
		System.out.println("O valor a ser pago e: " + total);
		
		entrada.close();
		

	}
	
	public static double valorPagamento(float valor, int dias) {
		
	double valort = 0;
		
	if (dias > 0) {	
		 valort = valor + (valor * 0.3);
	}
	
	else {
		valort = valor;
	}
		for (int x = 0; x < dias; x++) {
			valort = valort + (valort * 0.1);
		}
		
		
		return valort;
	}
	

}
