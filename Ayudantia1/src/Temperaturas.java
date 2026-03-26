
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {


        String[] serenaNombres = {"Serena Centro", "Cuatro esquinas"};
        String[] coquimboNombres = {"Puerto Coquimbo", "Guanaqueros"};

        Double[] serena = new Double[2];
        Double[] coquimbo = new Double[2];

        Scanner sc = new Scanner(System.in);

        int flag = 0;

            
        System.out.println();

        int x = 0;

        while (x < 2) {
            System.out.println("Inngrese la temperatura de " + serenaNombres[x] + " en grados Celsius");

            try {
                double valor = Double.valueOf(sc.nextLine());

                
                serena[x] = valor;

                x ++;

            } catch (Exception e) {
                System.out.println("Error, ingrese numeros");
                    
            }
        }
        x = 0;
        while (x < 2) {
            System.out.println("Inngrese la temperatura de " + coquimboNombres[x] + " en grados Celsius");

            try {

                double valor = Double.valueOf(sc.nextLine());

                
                coquimbo[x] = valor;

                x ++;

            } catch (Exception e) {

                System.out.println("Error, ingrese numeros");
                    
            }

        }

        Double serenaPromedio = (serena[0] + serena[1]) / 2;
        Double coquimboPromedio = (coquimbo[0] + coquimbo[1]) / 2;
        

        x = 0;

        do { 
            System.out.println("Desea ver las temperaturas? 1. Si 2. No");
            System.out.print("> ");
            try {
                int res = Integer.valueOf(sc.nextLine());

                if (res <= 0 || res > 2) {

                    System.out.println("Error, Numero no valido");

                } else if (res == 1) {
                    System.out.println("Que metrica prefiere? (Celsius, Fahrenheit, Kelvin)");
                    System.out.print("> ");

                    String respuesta = sc.nextLine();

                    switch (respuesta.toLowerCase()) {
                        case "celsius":
                            System.out.println("Temperatura promedio en La Serena: " + serenaPromedio + "°C");
                            System.out.println("Temperatura promedio en Coquimbo: " + coquimboPromedio + "°C");

                            System.out.println();
                            System.out.println("Desea salir? 1. Si 2. No");
                            System.out.print("> ");

                            try {
                                int res2 = Integer.valueOf(sc.nextLine());

                                if (res2 <= 0 || res2 > 2) {
                                    System.out.println("Error, Numero no valido");
                                } else if (res2 == 1) {
                                    System.out.println("Adios");
                                    x++;
                                } else {
                                    System.out.println("Volviendo al menu...");
                                }

                            } catch (Exception e) {
                                System.out.println("Error, Ingrese un valor numerico");
                            }

                            break;


                        case "fahrenheit":

                            System.out.println("Temperatura promedio en La Serena: " + ((serenaPromedio*1.8) + 32) + "°F");
                            System.out.println("Temperatura promedio en Coquimbo: " + ((coquimboPromedio*1.8) + 32) + "°F");


                            System.out.println();
                            System.out.println("Desea salir? 1. Si 2. No");
                            System.out.print("> ");

                            try {
                                int res2 = Integer.valueOf(sc.nextLine());

                                if (res2 <= 0 || res2 > 2) {
                                    System.out.println("Error, Numero no valido");
                                } else if (res2 == 1) {
                                    System.out.println("Adios");
                                    x++;
                                } else {
                                    System.out.println("Volviendo al menu...");
                                }

                            } catch (Exception e) {
                                System.out.println("Error, Ingrese un valor numerico");
                            }


                            break;

                        case "kelvin":
                            System.out.println("Temperatura promedio en La Serena: " + (serenaPromedio + 273.15) + "K");
                            System.out.println("Temperatura promedio en Coquimbo: " + (coquimboPromedio + 273.15) + "K");


                            System.out.println();
                            System.out.println("Desea salir? 1. Si 2. No");
                            System.out.print("> ");

                            try {
                                int res2 = Integer.valueOf(sc.nextLine());

                                if (res2 <= 0 || res2 > 2) {
                                    System.out.println("Error, Numero no valido");
                                } else if (res2 == 1) {
                                    System.out.println("Adios");
                                    x++;
                                } else {
                                    System.out.println("Volviendo al menu...");
                                }

                            } catch (Exception e) {
                                System.out.println("Error, Ingrese un valor numerico");
                            }


                            break;

                        default:
                            System.out.println("Error, ingrese una metrica valida");
                            break;
                    }
                } else {
                    System.out.println("Adios");
                    x++;
                    
                }

            } catch (Exception e) {
                System.out.println("Error, Ingrese un valor numerico");
            }

            
        } while (x==0);


        sc.close();
    }
    
}
