import java.util.Scanner;

public class Empleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar los datos del empleado
        System.out.print("Ingrese el código del empleado: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        int horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente (en %): ");
        double retencionFuente = sc.nextDouble();

        // Calcular el salario bruto y el salario neto
        double salarioBruto = horasTrabajadas * valorHora;
        double salarioNeto = salarioBruto - (salarioBruto * retencionFuente / 100);

        // Mostrar los resultados
        System.out.println("\n--- Información del Empleado ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}

