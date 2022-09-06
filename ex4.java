import java.util.Scanner; 

public class ex4 {

	public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Informe o numero que deseja checar: ");
				
				int x = entrada.nextInt();
				
				String total = check(x);
				
				System.out.println("O Resultado e: " + total);
				entrada.close();
				
			}
			
			public static String check(int a) {
				
				String resposta;
				
				if (a > 0) {
			    resposta = "positivo";
				}
				
				else {
				resposta = "negativo";
					
				}
				
				
				return resposta;
			}



	}


