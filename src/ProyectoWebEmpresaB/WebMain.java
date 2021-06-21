package ProyectoWebEmpresaB;

import java.util.Scanner;

public class WebMain {

	public String pedirNombre() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		String Nombre = sc.nextLine();
		return Nombre;
		
	}
	
}
