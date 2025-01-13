import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalarioEmpleadoGUI {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Cálculo de Salario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(7, 2, 10, 10));

        // Crear los componentes
        JLabel lblCodigo = new JLabel("Código del empleado:");
        JTextField txtCodigo = new JTextField();

        JLabel lblNombres = new JLabel("Nombres del empleado:");
        JTextField txtNombres = new JTextField();

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        JTextField txtHoras = new JTextField();

        JLabel lblValorHora = new JLabel("Valor por hora:");
        JTextField txtValorHora = new JTextField();

        JLabel lblRetencion = new JLabel("Retención en la fuente (%):");
        JTextField txtRetencion = new JTextField();

        JButton btnCalcular = new JButton("Calcular");
        JTextArea txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Agregar componentes a la ventana
        frame.add(lblCodigo);
        frame.add(txtCodigo);

        frame.add(lblNombres);
        frame.add(txtNombres);

        frame.add(lblHoras);
        frame.add(txtHoras);

        frame.add(lblValorHora);
        frame.add(txtValorHora);

        frame.add(lblRetencion);
        frame.add(txtRetencion);

        frame.add(btnCalcular);
        frame.add(new JLabel()); // Espacio vacío

        frame.add(new JLabel("Resultado:"));
        frame.add(txtResultado);

        // Acción del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = txtCodigo.getText();
                    String nombres = txtNombres.getText();
                    int horas = Integer.parseInt(txtHoras.getText());
                    double valorHora = Double.parseDouble(txtValorHora.getText());
                    double retencion = Double.parseDouble(txtRetencion.getText());

                    double salarioBruto = horas * valorHora;
                    double salarioNeto = salarioBruto - (salarioBruto * retencion / 100);

                    txtResultado.setText("Código: " + codigo + "\n" +
                            "Nombres: " + nombres + "\n" +
                            "Salario Bruto: $" + salarioBruto + "\n" +
                            "Salario Neto: $" + salarioNeto);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
