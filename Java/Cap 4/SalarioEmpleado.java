import java.util.Scanner;

public class SalarioEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        // Cálculo del salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;

        // Salida según condición
        if (salarioMensual > 450000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario Mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre: " + nombre);
        }

        scanner.close();
    }
}
