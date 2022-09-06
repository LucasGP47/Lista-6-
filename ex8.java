import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o numero inteiro: ");
		
		int numero = entrada.nextInt();
		
		int tam = tamanho(numero);
		
		System.out.println("Quantidade de digitos e: " + tam);
		
		entrada.close();

	}
	
	public static int tamanho(int num) {
		
		String tamanho = String.valueOf(num);
		
		int tam = tamanho.length();
		
		return tam;
	}

}
