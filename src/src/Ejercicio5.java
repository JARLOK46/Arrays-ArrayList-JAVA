import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] top5 = {100, 95, 90, 88, 85};

        ArrayList<Integer> demas = new ArrayList<>();
        demas.add(80);
        demas.add(75);
        demas.add(72);
        demas.add(68);

        String mensaje = "=== Ejercicio 5: Comparando ambas estructuras ===\n\n";
        mensaje += "Array (top 5 fijos): " + Arrays.toString(top5) + "\n";
        mensaje += "ArrayList (demás participantes): " + demas + "\n\n";
        mensaje += "--- Justificación ---\n";
        mensaje += "Array: Se usa porque el top 5 siempre tiene 5 posiciones, no cambia.\n";
        mensaje += "ArrayList: Se usa porque el número de demás participantes no se sabe de antemano.";

        JOptionPane.showMessageDialog(null, mensaje, "Ejercicio 5 - Comparando estructuras", JOptionPane.INFORMATION_MESSAGE);
    }
}
