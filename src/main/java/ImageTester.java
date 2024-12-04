import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.ImageIcon;
import java.io.File;

//Esto fue creado con chatGpt con usos de estudio
public class ImageTester {

    public static void main(String[] args) {
        // Crear los datos de ejemplo
        Object[][] data = {
                {1, "Pikachu", "Pikachu es un Pokémon eléctrico.", new ImageIcon("C:\\Users\\zBook\\Documents\\NetBeansProjects\\Fokemones\\src\\main\\java\\mx\\itson\\fokemones\\images\\images\\images\\images\\juiceportal.jpg")},
                {2, "Charmander", "Charmander es un Pokémon de fuego.", new ImageIcon("C:\\Users\\zBook\\Documents\\NetBeansProjects\\Fokemones\\src\\main\\java\\mx\\itson\\fokemones\\images\\images\\images\\images\\texturewrld.png")}
        };

        // Nombres de las columnas
        String[] columnNames = {"ID", "Nombre", "Descripción", "Imagen"};

        // Crear el modelo de tabla
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Crear la tabla
        JTable table = new JTable(model);
        table.setRowHeight(50); // Ajustar la altura de la fila para mostrar las imágenes

        // Hacer que las imágenes se ajusten dentro de las celdas
        table.getColumn("Imagen").setCellRenderer(new ImageRenderer());

        // Botón para agregar nuevas imágenes
        JButton addButton = new JButton("Agregar Nueva Imagen");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir el selector de archivos para elegir una nueva imagen
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Selecciona una imagen");
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagenes", "jpg", "png", "gif"));
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon newImage = new ImageIcon(selectedFile.getAbsolutePath());

                    // Aquí agregamos una nueva fila con datos ficticios y la nueva imagen
                    model.addRow(new Object[]{model.getRowCount() + 1, "Nuevo Pokémon", "Descripción de nuevo Pokémon", newImage});
                }
            }
        });

        // Crear la ventana
        JFrame frame = new JFrame("Tabla de Potromones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Crear el panel de la interfaz
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.SOUTH); // Agregar el botón al panel

        frame.add(panel);
        frame.setVisible(true);
    }

    // Clase personalizada para renderizar imágenes en la tabla
    static class ImageRenderer extends JLabel implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                setIcon((ImageIcon) value);
            } else {
                setIcon(null);
            }
            return this;
        }
    }
}
