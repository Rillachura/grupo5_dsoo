package vista;

import modelo.*;

import javax.swing.*;
import java.awt.*;

public class CarreraGestionGUI extends JFrame {

    private Modelo modelo;
    private JComboBox<Carrera> cbCarreras;
    private JTextArea taCursos;

    public CarreraGestionGUI(Modelo modelo) {
        this.modelo = modelo;
        setTitle("Gestión de Carreras");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cbCarreras = new JComboBox<>(this.modelo.getCarreras().toArray(new Carrera[0]));
        taCursos = new JTextArea(15, 40);
        taCursos.setEditable(false);

        add(new JLabel("Seleccionar Carrera:")); add(cbCarreras);
        add(new JScrollPane(taCursos));

        cbCarreras.addActionListener(e -> {
            Carrera carrera = (Carrera) cbCarreras.getSelectedItem();
            taCursos.setText("");
            if (carrera != null) {
                for (Curso c : carrera.getCursos()) {
                    taCursos.append(c.getCodigo() + " - " + c.getNombre() + " (" + c.getCreditos() + " créditos)\n");
                }
            }
        });
    }
}
