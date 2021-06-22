package ProyectoWebEmpresaB;

import java.util.Scanner;

public class WebMain {

	public String pedirNombre() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		String Nombre = sc.nextLine();
		System.out.println("Indique su apellido: ");
		String Apellido = sc.nextLine();
		Nombre = Nombre + " " + Apellido;
		return Nombre;
	}
	
}
