
import java.util.Scanner;

public class App {

    private static final String ROJO = "\u001B[31m";
    private static final String RESET = "\u001B[0m";
    private static final String VERDE = "\u001B[32m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String BLANCO = "\u001B[37m";
    public static final String NEGRITA = "\u001B[1m";
    public static final String BLANCO_BRILLANTE = "\u001B[97m";

    public static void main(String[] args) {
        // Hacer un bucle que le pida al usuario dos números y una operación
        // (sumar, restar, multiplicar, dividir)
        // podéis hacerlo ofreciendo opciones numéricas
        // (1. Sumar / 2. Restar / 3. Multiplicar / 4.Dividir)
        // Muestra por pantalla el resultado
        // Vuelve al comienzo del bucle

        // Ejemplo para llamar a una función:
        // System.out.println("Resultado: " + sumar(primerNumero, segundoNumero));
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            double primerNumero = 0;
            double segundoNumero = 0;
            boolean soloNumeros1 = false;
            boolean soloNumeros2 = false;

            System.out.println(VERDE + "+-----------------------------------------------------+");
            System.out.println("|                 Calculadora  v1.0                   |");
            System.out.println("|           (C) 2026  TERMINAL No. 0042               |");
            System.out.println("+-----------------------------------------------------+" + RESET);
            System.out.println();
            System.out.println(VERDE);
            System.out.println("+----------------------------------------+");
            System.out.println("|             MENU PRINCIPAL             |");
            System.out.println("+----------------------------------------+");
            System.out.println("|                                        |");
            System.out.println("|   1. SUMAR                             |");
            System.out.println("|   2. RESTAR                            |");
            System.out.println("|   3. MULTIPLICAR                       |");
            System.out.println("|   4. DIVIDIR                           |");
            System.out.println("|                                        |");
            System.out.println("|   5. SALIR                             |");
            System.out.println("|                                        |");
            System.out.println("+----------------------------------------+" + RESET);

            boolean soloNumeros3 = false;
            int operacion = 0;

            while (!soloNumeros3) {
                System.out.print(VERDE + "Seleccione que operacion quiere Realiza: " + RESET);
                try {
                    operacion = Integer.parseInt(leer.nextLine().trim());
                    soloNumeros3 = true;
                } catch (NumberFormatException e) {
                    System.out.println(ROJO);
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("|                                                  |");
                    System.out.println("|    Entrada no válida. Introduce solo números.    |");
                    System.out.println("|                                                  |");
                    System.out.println("+--------------------------------------------------+" + RESET);
                }
            }
            System.out.println();

            while (!soloNumeros1) {
                System.out.print(VERDE + "Inserte el primer número: " + RESET);
                try {
                    primerNumero = Double.parseDouble(leer.nextLine().trim());
                    soloNumeros1 = true;
                } catch (NumberFormatException e) {
                    System.out.println(ROJO);
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("|                                                  |");
                    System.out.println("|    Entrada no válida. Introduce solo números.    |");
                    System.out.println("|                                                  |");
                    System.out.println("+--------------------------------------------------+" + RESET);

                }
            }
            while (!soloNumeros2) {
                System.out.println();
                System.out.print(VERDE + "Inserte el segundo número: " + RESET);
                try {
                    segundoNumero = Double.parseDouble(leer.nextLine().trim());
                    soloNumeros2 = true;
                } catch (NumberFormatException e) {
                    System.out.println(ROJO);
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("|                                                  |");
                    System.out.println("|    Entrada no válida. Introduce solo números.    |");
                    System.out.println("|                                                  |");
                    System.out.println("+--------------------------------------------------+" + RESET);
                }
            }
            System.out.println();
            double resultado = 0;
            switch (operacion) {
                case 1:
                    resultado = sumar(primerNumero, segundoNumero);
                    break;
                case 2:
                    resultado = restar(primerNumero, segundoNumero);
                    break;
                case 3:
                    resultado = multiplicar(primerNumero, segundoNumero);
                    break;
                case 4:
                    try {
                        resultado = dividir(primerNumero, segundoNumero);
                    } catch (ArithmeticException e) {
                        System.out.println(ROJO);
                        System.out.println("+--------------------------------------------------+");
                        System.out.println("|                                                  |");
                        System.out.println("|          No se puede dividir entre cero.         |");
                        System.out.println("|                                                  |");
                        System.out.println("+--------------------------------------------------+" + RESET);
                    }
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println(ROJO);
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("|                 OPCION NO VALIDA                 |");
                    System.out.println("|     debes seleccionar una opcion entre 1 y 4     |");
                    System.out.println("+--------------------------------------------------+" + RESET);
            }

            System.out.println("Resultado: " + FONDO_ROJO + BLANCO + NEGRITA + " " + resultado + " " + RESET);
            System.out.println();
            System.out.println(ROJO + "--------------------------------------------------FIN DE LA OPERACION-----------------------------------------------------------" + RESET);
            System.out.println();

        }
        leer.close();

    }

    public static double sumar(double primerNumero, double segundoNumero) {
        double resultado = primerNumero + segundoNumero;

        return resultado;
    }

    public static double restar(double primerNumero, double segundoNumero) {
        double resultado = primerNumero - segundoNumero;

        return resultado;
    }

    public static double multiplicar(double primerNumero, double segundoNumero) {
        double resultado = primerNumero * segundoNumero;

        return resultado;
    }

    public static double dividir(double primerNumero, double segundoNumero) throws ArithmeticException {
        if (segundoNumero == 0) {
            throw new ArithmeticException();
        }
        return primerNumero / segundoNumero;
    }
}
