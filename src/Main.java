import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Para que la GUI se ejecute en el hilo de Swing
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame
            JFrame frame = new JFrame("Gestor de Usuarios");

            // Crear instancia del formulario
            GestorUsuarios gui = new GestorUsuarios(); // tu clase del form

            // Poner el panel raíz del formulario en el JFrame
            frame.setContentPane(gui.rootPanel);

            // Ajustar tamaño al contenido
            frame.pack();

            // Centrar ventana en pantalla
            frame.setLocationRelativeTo(null);

            // Permitir cerrar la ventana
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Hacer visible
            frame.setVisible(true);
        });
    }
}
