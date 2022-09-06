import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o dia: ");
		
		int dia = entrada.nextInt();
		
		while (dia < 1 || dia > 31 ) {
			
			System.out.println("Dia invalido. Reinicie o programa. ");
			break;
		}
		
		
		System.out.println("Informe o ano");
		
		int ano = entrada.nextInt();
		
		while (ano < 1) {
			System.out.println("Ano invalido. Reinicie o programa. ");
		}
		
		System.out.println( dia + " de "+ extenso()+ " de " + ano);
		
		entrada.close();

	}
	
   public static String extenso() {
	   
	   String meses = null;
	   
	   System.out.println("Informe o mes: ");
	   
	   Scanner entrada = new Scanner (System.in);
		
		int mes = entrada.nextInt();
		
		while (mes < 1 || mes > 12) {
			System.out.println("Mes invalido. Reinicie o programa. ");
		}
		
		entrada.close();
	  
	   switch (mes) {
	   
	   case 1:
	   meses = "Janeiro";
	   
	   case 2:
	   meses = "Fevereiro";
	   
	   case 3:
	   meses = "Março";
	   
	   case 4:
	   meses = "Abril";
	   
	   case 5:
	   meses = "Maio";
	   
	   case 6:
	   meses = "Junho";
	   
	   case 7:
	   meses = "Julho";
	   
	   case 8:
	   meses = "Agosto";
	   
	   case 9:
	   meses = "Setembro";
	   
	   case 10:
	   meses = "Outubro";
	   
	   case 11:
	   meses = "Novembro";
	   
	   case 12: 
	   meses = "Dezembro";
	   
	   }
	   
	
	return meses;
	   
   }

}
