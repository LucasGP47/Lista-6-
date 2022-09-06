import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os numeros que quer somar: ");
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		int z = entrada.nextInt();
		
		int total = soma(x, y, z);
		
		System.out.println("O total e: " + total);
		entrada.close();
		
	}
	
	public static int soma(int a, int b, int c) {
		
		int soma = a + b +c;
		return soma;
	}

}
