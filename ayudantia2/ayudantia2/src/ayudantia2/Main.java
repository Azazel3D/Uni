package ayudantia2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		String [] trajes;
		
		Scanner sc = new Scanner(System.in);
		
		int res;
		int x = 0;
		boolean check = false;
		do {
			System.out.println();
			System.out.println("1, Cargar archivo");
			System.out.println("2, Consulta de color");
			System.out.println("3, Agregar una nueva prenda");
			System.out.println("4, Espacios vacios");
			System.out.println("5, Salir");
			System.out.print("> ");
			
			try {
				res = Integer.valueOf(sc.nextLine());
			} catch (Exception e){
				System.out.println("Error, ingrese numeros");
				res = 0;
			}
			
			switch (res) {
			case 1:
				if (check == false) {
					System.out.println("Ingrese el nombre de el archivo");
					String nombre = String.valueOf(sc.nextLine());
					
					try {
						File arch = new File("archivos/"+nombre+".txt");
						Scanner Sarch = new Scanner(arch);
					
						while(Sarch.hasNextLine()) {
							String linea = Sarch.nextLine();
						
							String[] partes = linea.split(",");
						
						}
						
						check = true;
						Sarch.close();
					
				
					} catch (Exception e) {
						System.out.println("No existe el archivo");
						
						check = false;
					}
				}else {
					System.out.println("Ya existe el archivo");
				}
				
				break;
				
			case 2:
				if (check == true) {
					System.out.println("Hay archivo");
				}else {
					System.out.println("No hay archivo");
				}
				break;
				
			case 3:
				System.out.println("en progreso");
				break;
				
			case 4:
				System.out.println("en progreso");
				break;
				
			case 5:
				System.out.println("Adios");
				x++;
				break;
				
			default:
				System.out.println("Ingrese un valor valido");
				break;
			}
		} while (x==0);

		
		
		
	
		
		
		
		
		
		
		
	}

}
