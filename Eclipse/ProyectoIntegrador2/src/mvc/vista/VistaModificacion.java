package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaModificacion extends JFrame {
    private JLabel titulo, labelTipo, labelNombre;
    private JRadioButton radioAlumno, radioProyecto, radioAreas;
    private JTextField campoNombre;
    private JButton botonBuscar;

    public VistaModificacion() {
        // Configuración de la ventana
        super("Menu Modificación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 250);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("Modificar");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        labelTipo = new JLabel("Tipos:");
        labelTipo.setFont(new Font("Tahoma", Font.BOLD, 11));

        radioAlumno = new JRadioButton("Alumno");
        radioProyecto = new JRadioButton("Proyecto");
        radioAreas = new JRadioButton("Áreas");

        ButtonGroup grupoTipos = new ButtonGroup();
        grupoTipos.add(radioAlumno);
        grupoTipos.add(radioProyecto);
        grupoTipos.add(radioAreas);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));

        campoNombre = new JTextField();

        botonBuscar = new JButton("Buscar");

        // Configuración del layout
        getContentPane().setLayout(null);

        titulo.setBounds(10, 28, 400, 30);
        getContentPane().add(titulo);

        labelTipo.setBounds(56, 68, 50, 30);
        getContentPane().add(labelTipo);

        radioAlumno.setBounds(170, 68, 61, 30);
        getContentPane().add(radioAlumno);

        radioProyecto.setBounds(296, 68, 65, 30);
        getContentPane().add(radioProyecto);

        radioAreas.setBounds(233, 68, 61, 30);
        getContentPane().add(radioAreas);

        labelNombre.setBounds(56, 108, 61, 30);
        getContentPane().add(labelNombre);

        campoNombre.setBounds(170, 109, 200, 30);
        getContentPane().add(campoNombre);

        botonBuscar.setBounds(290, 160, 80, 30);
        getContentPane().add(botonBuscar);
    }
}