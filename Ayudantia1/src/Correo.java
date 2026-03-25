import java.util.Scanner;

public class Correo {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int b = 0;

        System.out.println("Bienvenido al sistema de correo UCN, ingrese su nombre por favor");
        System.out.print("> ");
        String nombre = String.valueOf(sc.nextLine());

        do {
            System.out.println(); 
            System.out.println("por favor ingrese su correo");
            System.out.print("> ");
            
            String correo = String.valueOf(sc.nextLine());
            
            String[] partes = new String[2];

            try {

                partes = correo.split("@");
                
                switch (partes[1]) {
                    case "alumnos.ucn.cl":
                        System.out.println();
                        System.out.println("¡Bienvenido " + nombre + "! Acceso a la plataforma estudiantil");
                        x++;

                        break;
                    case "ucn.cl":
                        System.out.println();
                        System.out.println("¡Bienvenido " + nombre + "! Acceso a plataforma docente");
                        x++;

                        break;
                    default:
                        System.out.println();
                        System.out.println("Acceso denegado, intente nuevamente");
                        break;
                }

            } catch (Exception e) {

                System.out.println("Error, ingrese un correo valido");
                b = 0;
            }


        } while (x == 0);


    }
}
