import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] notas = {85.0, 55.0, 72.0, 48.0, 90.0, 63.0};

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;

        int reprobados = 0;
        for (double nota : notas) {
            if (nota < 60) {
                reprobados++;
            }
        }

        String mensaje = "=== Ejercicio 1: Notas de un salón fijo ===\n\n";
        mensaje += "Notas del curso: " + Arrays.toString(notas) + "\n\n";
        mensaje += "Promedio del curso: " + promedio + "\n";
        mensaje += "Estudiantes reprobados: " + reprobados;

        JOptionPane.showMessageDialog(null, mensaje, "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
    }
}
