import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloGUI {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Propiedades del Triángulo Equilátero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear los componentes
        JLabel lblLado = new JLabel("Valor del lado:");
        JTextField txtLado = new JTextField();

        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Agregar componentes a la ventana
        frame.add(lblLado);
        frame.add(txtLado);

        frame.add(btnCalcular);
        frame.add(new JLabel()); // Espacio vacío

        frame.add(new JLabel("Resultado:"));
        frame.add(txtResultado);

        // Acción del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(txtLado.getText());

                    double perimetro = 3 * lado;
                    double altura = Math.sqrt(3) / 2 * lado;
                    double area = (Math.sqrt(3) / 4) * lado * lado;

                    txtResultado.setText("Perímetro: " + perimetro + "\n" +
                            "Altura: " + altura + "\n" +
                            "Área: " + area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
