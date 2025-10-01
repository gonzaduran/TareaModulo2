import javax.swing.*;

public class GestorUsuarios {
    public JPanel rootPanel;
    private JPanel headerPanel;
    private JPanel West;
    private JButton Dashboard;
    private JButton Usuarios;
    private JButton Informes;
    private JButton Ajustes;
    private JButton Ayuda;
    private JLabel gestorDeUsuarios;
    private JPanel Center;
    private JPanel South;
    private JButton Cancelar;
    private JButton Limpiar;
    private JButton Guardar;
    private JPanel East;
    private JTextField textFieldnombre;
    private JTextField textFieldemail;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;
    private JTextArea textArea1;
    private JTabbedPane tabbedPane1;
    private JTextArea textAreaResumen;
    private JTextArea textAreaLogs;
    private JPanel panelPreview;

    // 🔹 Constructor
    public GestorUsuarios() {
        // Acción para el botón Guardar → abrir el diálogo
        Guardar.addActionListener(e -> {
            Dialog dialog = new Dialog();  // usa tu clase Dialog.java
            dialog.pack();
            dialog.setLocationRelativeTo(rootPanel); // centrar
            dialog.setVisible(true);
        });

        // Acción para Cancelar → cerrar la ventana
        Cancelar.addActionListener(e -> {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(rootPanel);
            topFrame.dispose();
        });

        // Acción para Limpiar → vaciar campos del formulario
        Limpiar.addActionListener(e -> {
            textFieldnombre.setText("");
            textFieldemail.setText("");
            comboBox1.setSelectedIndex(-1);
            checkBox1.setSelected(false);
            textArea1.setText("");
        });
    }

    // 🔹 Método principal para ejecutar
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestor de usuarios");
        frame.setContentPane(new GestorUsuarios().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // centrar en pantalla
        frame.setVisible(true);
    }
}
