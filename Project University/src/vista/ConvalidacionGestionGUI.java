package vista;

import modelo.*;

import javax.swing.*;
import java.awt.*;

public class ConvalidacionGestionGUI extends JFrame {

    private Modelo modelo;
    private JComboBox<Alumno> cbAlumnos;
    private JComboBox<Curso> cbCursos;
    private JTextField tfNota;
    private JTextField tfEntidad;
    private JTextArea taInfo;
    private Secretaria secretaria;

    public ConvalidacionGestionGUI(Modelo modelo) {
        this.modelo = modelo;
        this.secretaria = new Secretaria("S001", "María Pérez");
        setTitle("Gestión de Convalidaciones");
        setSize(500, 450);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cbAlumnos = new JComboBox<>(this.modelo.getAlumnos().toArray(new Alumno[0]));
        cbCursos = new JComboBox<>(this.modelo.getCursos().toArray(new Curso[0]));
        tfNota = new JTextField(5);
        tfEntidad = new JTextField(15);
        JButton btnRegistrar = new JButton("Registrar Convalidación");
        taInfo = new JTextArea(10, 40);
        taInfo.setEditable(false);

        add(new JLabel("Alumno:")); add(cbAlumnos);
        add(new JLabel("Curso:")); add(cbCursos);
        add(new JLabel("Nota:")); add(tfNota);
        add(new JLabel("Entidad:")); add(tfEntidad);
        add(btnRegistrar);
        add(new JScrollPane(taInfo));

        btnRegistrar.addActionListener(e -> {
            Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
            Curso curso = (Curso) cbCursos.getSelectedItem();
            try {
                double valor = Double.parseDouble(tfNota.getText());
                String entidad = tfEntidad.getText();
                if (alumno != null && curso != null && entidad != null && !entidad.isEmpty()) {
                    Convalidacion conv = new Convalidacion(curso, valor, entidad);
                    secretaria.registrarConvalidacion(alumno, conv);
                    taInfo.setText("Convalidación registrada para " + alumno.getNombre());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para la nota.");
            }
        });
    }
}
