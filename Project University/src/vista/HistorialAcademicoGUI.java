package vista;

import modelo.*;

import javax.swing.*;
import java.awt.*;

public class HistorialAcademicoGUI extends JFrame {

    private Modelo modelo;
    private JComboBox<Alumno> cbAlumnos;
    private JTextArea taHistorial;

    public HistorialAcademicoGUI(Modelo modelo) {
        this.modelo = modelo;
        setTitle("Historial Académico");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cbAlumnos = new JComboBox<>(this.modelo.getAlumnos().toArray(new Alumno[0]));
        taHistorial = new JTextArea(15, 40);
        taHistorial.setEditable(false);

        add(new JLabel("Seleccionar Alumno:"));
        add(cbAlumnos);
        add(new JScrollPane(taHistorial));

        cbAlumnos.addActionListener(e -> {
            Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
            taHistorial.setText("");
            if (alumno != null) {
                for (Nota n : alumno.getHistorial()) {
                    taHistorial.append(n.getCurso().getNombre() + " : " + n.getValor() + " (" + n.getEstado() + ")\n");
                }
            }
        });
    }
}
