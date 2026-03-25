import java.util.Scanner;

public class Miku {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        int uem = 0;
        do {
            System.out.println();
            System.out.println("Ingrese el UEM necesario");
            System.out.print("> ");
            try {
                uem = Integer.valueOf(sc.nextLine());

                if (uem < 0) {
                    System.out.println("Error, El valor tiene que ser positivo");
                } else {
                    x++;
                    
                }

            } catch (Exception e) {
                System.out.println("Error, ingrese un valor numerico");
                x = 0;
            }
        }while (x == 0);
        
        int dias = 0;
        int completo = 0;
        int total = 0;
        int uemBase = uem;

        while (uem > 0) {
            ++dias;
            if (dias % 5 == 0) {
                uem -= 80;
                completo++;
                total += 80;
            }else {
                uem -= 50;
                completo++;
                total += 50;
            }
            
        }

        System.out.println("Miku tardaria " + dias + " dias en tener " + total + " UEM, con " + completo + " completos, "+
        "le sobrarian " + (total - uemBase) + " UEM de las " + uemBase + " necesarias");

        sc.close();
    }
}

