package vista;

import modelo.Modelo;

import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {

    private Modelo modelo;

    public MainGUI(Modelo modelo) {
        this.modelo = modelo;
        setTitle("Sistema Universidad XYZ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        JButton btnMatricula = new JButton("Proceso de Matrícula");
        JButton btnHistorial = new JButton("Historial Académico");
        JButton btnConvalidacion = new JButton("Gestión de Convalidaciones");
        JButton btnCarrera = new JButton("Gestión de Carreras");
        JButton btnSalir = new JButton("Salir");

        add(btnMatricula);
        add(btnHistorial);
        add(btnConvalidacion);
        add(btnCarrera);
        add(btnSalir);

        btnMatricula.addActionListener(e -> new MatriculaProcesoGUI(this.modelo).setVisible(true));
        btnHistorial.addActionListener(e -> new HistorialAcademicoGUI(this.modelo).setVisible(true));
        btnConvalidacion.addActionListener(e -> new ConvalidacionGestionGUI(this.modelo).setVisible(true));
        btnCarrera.addActionListener(e -> new CarreraGestionGUI(this.modelo).setVisible(true));
        btnSalir.addActionListener(e -> dispose());
    }
}
