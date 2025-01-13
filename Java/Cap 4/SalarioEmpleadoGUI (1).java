import javax.swing.*;

public class SalarioEmpleadoGUI {
    public static void main(String[] args) {
        // Entrada de datos mediante cuadros de diálogo
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String salarioPorHoraStr = JOptionPane.showInputDialog("Ingrese el salario básico por hora:");
        String horasTrabajadasStr = JOptionPane.showInputDialog("Ingrese el número de horas trabajadas en el mes:");

        // Convertir las entradas a números
        double salarioPorHora = Double.parseDouble(salarioPorHoraStr);
        int horasTrabajadas = Integer.parseInt(horasTrabajadasStr);

        // Cálculo del salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;

        // Mostrar el resultado
        if (salarioMensual > 450000) {
            JOptionPane.showMessageDialog(null, 
                "Nombre: " + nombre + "\nSalario Mensual: $" + salarioMensual,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Nombre: " + nombre, 
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
