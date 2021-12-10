
package com.mycompany.mvc;

import java.awt.BorderLayout;
import javax.swing.*;

public class VentanaConversor extends JFrame implements InterfazVista {

    private JButton convertirAPeso;
    private JButton convertirADolar;
    private JTextField cantidad;
    private JLabel resultado;

    public VentanaConversor() {
        super("Conversor de Dolar y Pesos Mexicanos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10, 10));
        cantidad = new JTextField(8);
        JPanel panelaux = new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2 = new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirAPeso = new JButton("A Peso Mexicano");
        convertirAPeso.setActionCommand(APESO);
        convertirADolar = new JButton("A Dolar");
        convertirADolar.setActionCommand(ADOLAR);
        JPanel botonera = new JPanel();
        botonera.add(convertirAPeso);
        botonera.add(convertirADolar);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }

    // Métodos de la interfaz InterfazVista:
    public void escribeCambio(String s) {
        resultado.setText(s);
    }

    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
        } catch (NumberFormatException e) {
            return 0.0D;
        }
    }

    public void setControlador(ControlConversor c) {
        convertirAPeso.addActionListener(c);
        convertirADolar.addActionListener(c);
    }

    public void arranca() {
        pack();// coloca los componentes
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }

}
