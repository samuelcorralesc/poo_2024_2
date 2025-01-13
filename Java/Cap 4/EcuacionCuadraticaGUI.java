import javax.swing.*;

public class EcuacionCuadraticaGUI {
    public static void main(String[] args) {
        // Entrada de datos mediante cuadros de diálogo
        String aStr = JOptionPane.showInputDialog("Ingrese el valor de A:");
        String bStr = JOptionPane.showInputDialog("Ingrese el valor de B:");
        String cStr = JOptionPane.showInputDialog("Ingrese el valor de C:");

        // Convertir las entradas a números
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        // Verificar si es una ecuación cuadrática válida
        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                "Esto no es una ecuación cuadrática (A no puede ser 0).",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Cálculo del discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante > 0) {
                // Dos soluciones reales
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "Las soluciones son:\n" +
                    "x1 = " + x1 + "\n" +
                    "x2 = " + x2, 
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (discriminante == 0) {
                // Una solución real
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "La solución única es:\n" +
                    "x = " + x, 
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Sin soluciones reales
                JOptionPane.showMessageDialog(null, 
                    "La ecuación no tiene soluciones reales.",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
