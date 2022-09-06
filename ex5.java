import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		
		float valor = entrada.nextFloat();
		
		float valortotal;
		
		valortotal = imposto(valor);
		
		System.out.println("O produto com imposto e: " + valortotal);
		
		entrada.close(); 
	

	}
	
	public static float imposto(float valor) {
		
		System.out.println("Informe a porcentagem de imposto: ");
		Scanner entrada = new Scanner(System.in);
		float imposto = entrada.nextFloat();
		
		float valort = (valor * (imposto / 100) + valor);
		entrada.close();
		
		return valort;
	}

}
