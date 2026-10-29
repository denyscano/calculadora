
import java.util.Scanner;

public class App {

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
        boolean soloText = false;
        int primerNumero;
        int segundoNumero;
        try {
            do {
                System.out.println("Inserte el primer número:");
                primerNumero = Integer.parseInt(leer.nextLine().trim());
                System.out.println("Inserte el primer número:");
                segundoNumero = Integer.parseInt(leer.nextLine().trim());
            } while (!soloText);
            int operacion = Integer.parseInt(leer.nextLine().trim());
            switch (operacion) {
            case 1:
                sumar(primerNumero, segundoNumero);
                break;
            case 2:
                restar(primerNumero, segundoNumero);
                break;
            case 3:
                multiplicar(primerNumero, segundoNumero);
                break;
            case 4:
                dividir(primerNumero, segundoNumero);
                break;
            default:
                System.out.println();
            }

        } catch (ArithmeticException e) {

        }

    }

    public static double sumar(double primerNumero, double segundoNumero) {
        double resultado = 0;

        return resultado;
    }

    public static double restar(double primerNumero, double segundoNumero) {
        double resultado = 0;

        return resultado;
    }

    public static double multiplicar(double primerNumero, double segundoNumero) {
        double resultado = 0;

        return resultado;
    }

    public static double dividir(double primerNumero, double segundoNumero) throws ArithmeticException {

        return primerNumero / segundoNumero;
    }
}
