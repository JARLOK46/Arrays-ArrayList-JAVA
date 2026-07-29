import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();

        inventario.add("Arroz");
        inventario.add("Frijol");
        inventario.add("Aceite");
        inventario.add("Sal");

        String mensaje = "=== Inventario inicial ===\n";
        for (String producto : inventario) {
            mensaje += "- " + producto + "\n";
        }

        inventario.add("Azúcar");
        inventario.add("Café");

        inventario.remove("Frijol");

        mensaje += "\n=== Llegaron 2 productos nuevos, se vendió 1 ===\n";
        for (int i = 0; i < inventario.size(); i++) {
            mensaje += (i + 1) + ". " + inventario.get(i) + "\n";
        }

        mensaje += "\n¿Arroz sigue disponible? " + (inventario.contains("Arroz") ? "Sí" : "No");
        mensaje += "\nInventario final: " + inventario.size() + " productos";

        JOptionPane.showMessageDialog(null, mensaje, "Ejercicio 4 - Inventario tienda", JOptionPane.INFORMATION_MESSAGE);
    }
}
