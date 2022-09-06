import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o numero inteiro: ");
		
		int numero = entrada.nextInt();
		
		String tam = tamanho(numero);
		
		System.out.println("O inverso e: " + tam);
		
		entrada.close();

	}
	
	public static String tamanho(int num) {
		
		String tamanho = String.valueOf(num);
		
		StringBuilder tamanho2 = new StringBuilder(tamanho);
		
		tamanho = tamanho2.reverse().toString();
		
		
		return tamanho;
	}

}
