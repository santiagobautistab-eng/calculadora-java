import java.util.Scanner;

public class Main {

    // Lee un número decimal; si no es válido lanza NumberFormatException
    private static double leerNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        String texto = scanner.nextLine().trim().replace(",", ".");
        return Double.parseDouble(texto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion = 0;

        do {
            System.out.println("=================================");
            System.out.println("          CALCULADORA");
            System.out.println("=================================");
            calculadora.mostrarOperacionesDisponibles();
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());

                switch (opcion) {
                    case 1: {
                        double a = leerNumero(scanner, "Ingrese el primer número: ");
                        double b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.sumar(a, b));
                        break;
                    }
                    case 2: {
                        double a = leerNumero(scanner, "Ingrese el primer número: ");
                        double b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.restar(a, b));
                        break;
                    }
                    case 3: {
                        double a = leerNumero(scanner, "Ingrese el primer número: ");
                        double b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.multiplicar(a, b));
                        break;
                    }
                    case 4: {
                        double a = leerNumero(scanner, "Ingrese el dividendo: ");
                        double b = leerNumero(scanner, "Ingrese el divisor: ");
                        try {
                            System.out.println("Resultado: " + calculadora.dividir(a, b));
                        } catch (DivisionPorCeroException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 5:
                        calculadora.mostrarHistorial();
                        System.out.println("¡Hasta pronto,lo has hecho muy bien!");
                        break;
                    default:
                        System.out.println("Opción no válida. Elija entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
                opcion = 0; // evita que el menú se cierre por error
            }

            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
 } 
    

