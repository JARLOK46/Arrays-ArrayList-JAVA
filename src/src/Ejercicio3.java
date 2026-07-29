import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> invitados = new ArrayList<>();

        invitados.add("Ana");
        invitados.add("Carlos");
        invitados.add("María");
        invitados.add("Pedro");
        invitados.add("Laura");

        String lista = "Lista de invitados:\n";
        for (int i = 0; i < invitados.size(); i++) {
            lista += (i + 1) + ". " + invitados.get(i) + "\n";
        }

        invitados.remove("Carlos");

        String mensaje = lista + "\n--- Después de que canceló Carlos ---\n\n";
        for (int i = 0; i < invitados.size(); i++) {
            mensaje += (i + 1) + ". " + invitados.get(i) + "\n";
        }
        mensaje += "\nInvitados confirmados: " + invitados.size();

        JOptionPane.showMessageDialog(null, mensaje, "Ejercicio 3 - Invitados cumpleaños", JOptionPane.INFORMATION_MESSAGE);
    }
}
