import java.util.Scanner;

public class TrianguloEquilatero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar el valor del lado
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = sc.nextDouble();

        // Calcular el perímetro, la altura y el área
        double perimetro = 3 * lado;
        double altura = Math.sqrt(3) / 2 * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;

        // Mostrar los resultados
        System.out.println("\n--- Propiedades del Triángulo Equilátero ---");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
