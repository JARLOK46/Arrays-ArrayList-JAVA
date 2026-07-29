import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] actividades = {"Java", "Bases de datos", "HTML y CSS", "Python", "Redes", "Descanso", "Descanso"};

        int indiceMiercoles = 2;
        String mensaje = "Hoy es " + dias[indiceMiercoles] + " y tu actividad es " + actividades[indiceMiercoles];

        JOptionPane.showMessageDialog(null, mensaje, "Ejercicio 2 - Horario Semanal", JOptionPane.INFORMATION_MESSAGE);
    }
}
