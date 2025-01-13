import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

        // Verificar si es una ecuación cuadrática válida
        if (a == 0) {
            System.out.println("Esto no es una ecuación cuadrática (A no puede ser 0).");
        } else {
            // Cálculo del discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante > 0) {
                // Dos soluciones reales
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                // Una solución real
                double x = -b / (2 * a);
                System.out.println("La solución única es:");
                System.out.println("x = " + x);
            } else {
                // Sin soluciones reales
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }

        scanner.close();
    }
}

