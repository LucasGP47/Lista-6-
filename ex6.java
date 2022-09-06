import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int horast;
		
		System.out.println("Informe a hora que deseja converter: ");
		
		int hora = entrada.nextInt();
		
		while (hora > 24 ) {
			System.out.println("Hora invalida. Digite novamente: ");
			hora = entrada.nextInt();
		}
		
		System.out.println("Informe os minutos: ");
		
		int minutos = entrada.nextInt();
		
		while (minutos > 59) {
			System.out.println("Minutos invalidos. Digite novamente: ");
			minutos = entrada.nextInt();
			
		}
		
		horast = converter(hora);
		
		System.out.println("");
		
		if (hora > 11) {
			System.out.println("Nova hora: " + horast + ":" + minutos + " PM");
		}
		
		else {
			System.out.println("Nova hora: " + horast + ":" + minutos + " AM");
		}
		entrada.close();
	}
	
	public static int converter(int horas) {
		
		int horasc;
		
		if (horas > 11) {
			
			horasc = horas - 12;
			
		}
		
		else {
			horasc = horas;
		}
		
		
		return horasc;
		
	}
	
	
	

}
