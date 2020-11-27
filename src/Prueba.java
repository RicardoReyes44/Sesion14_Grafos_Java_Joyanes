import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
	
	public static GrafoMatriz generar() {
		Scanner entrada = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("Introduce tamaño de la matriz");
			int tam = entrada.nextInt();

			if(tam>=1) {
				return new GrafoMatriz(tam);
			}else {
				System.out.println("Error, valor no permitido");
			}
			}catch(InputMismatchException e) {
				System.out.println("Error en la entrada de datos <" + e + ">, por favor prueba de nuevo");
				entrada.nextLine();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		GrafoMatriz gm = generar();
		
		System.out.println();
		
		while(true) {
			System.out.println("-----------------MENU-------------------");
			System.out.println("1.- Introducir vertice");
			System.out.println("2.- Introducir arco");
			System.out.println("3.- Ver matriz");
			System.out.println("4.- Verificar si 2 matrices son adyacentes");
			System.out.println("5.- Salir");
			
			try {
			int opcion = entrada.nextInt();
			
			if(opcion==1) {
				if(gm.getNumVerts()!=(gm.matAd[0]).length) {
					entrada.nextLine();
					System.out.print("Introduce un vertice: ");
					String n = entrada.nextLine();
	                
	                gm.nuevoVertice(n);

				}else {
	                System.out.println("Limite de vertices alcanzado");
				}
			}else if(opcion==2) {
				
				System.out.print("Introduce primer vertice: ");
				entrada.nextLine();
				String p = entrada.nextLine();
				System.out.print("Introduce segudo vertice: ");
				String s = entrada.nextLine();
				try {
					gm.nuevoArco(p, s);
				}catch(Exception e) {
					System.out.println("Error, no existe algun vertice o ninguno");
				}
				
			}else if(opcion==3) {
				
				System.out.println();
				gm.imprimir();
				System.out.println();
				
			}else if(opcion==4) {
				System.out.print("Introduce primer vertice: ");
				entrada.nextLine();
				String p = entrada.nextLine();
				System.out.print("Introduce segudo vertice: ");
				String s = entrada.nextLine();
				try {
					System.out.println(">>> "+gm.adyacente(p, s));
				}catch(Exception e) {
					System.out.println("Error, no existe algun vertice o ninguno");
				}
			}else if(opcion==5) {
				System.out.println("----------------Programa terminado------------------");
				break;
			}else {
				System.out.println("Opcion invalida, prueba de nuevo");
			}
			}catch(InputMismatchException e) {
				System.out.println("Error en la entrada de datos <" + e + ">, por favor prueba de nuevo");
				entrada.nextLine();
			}
			System.out.println("--------------------------------------");
		}

	}

}
