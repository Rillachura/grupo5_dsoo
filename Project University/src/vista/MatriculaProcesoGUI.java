package vista;

import modelo.*;
import javax.swing.*;
import java.awt.*;

public class MatriculaProcesoGUI extends JFrame {

    private Modelo modelo;
    private JComboBox<Alumno> cbAlumnos;
    private JComboBox<Curso> cbCursos;
    private JTextArea taInfo;
    private Secretaria secretaria;

    public MatriculaProcesoGUI(Modelo modelo) {
        this.modelo = modelo;
        this.secretaria = new Secretaria("S001", "María Pérez");
        setTitle("Proceso de Matrícula");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cbAlumnos = new JComboBox<>(this.modelo.getAlumnos().toArray(new Alumno[0]));
        cbCursos = new JComboBox<>(this.modelo.getCursos().toArray(new Curso[0]));
        JButton btnMatricular = new JButton("Matricular");
        taInfo = new JTextArea(10, 40);
        taInfo.setEditable(false);

        add(new JLabel("Seleccionar Alumno:"));
        add(cbAlumnos);
        add(new JLabel("Seleccionar Curso:"));
        add(cbCursos);
        add(btnMatricular);
        add(new JScrollPane(taInfo));

        btnMatricular.addActionListener(e -> {
            Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
            Curso curso = (Curso) cbCursos.getSelectedItem();
            if (alumno != null && curso != null) {
                Matricula matricula = new Matricula("2025-I", null);
                matricula.incluirCurso(curso);
                secretaria.registrarMatricula(alumno, matricula);
                taInfo.setText("Alumno " + alumno.getNombre() + " matriculado en " + curso.getNombre());
            }
        });
    }
}
