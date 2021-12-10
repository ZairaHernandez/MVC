package com.mycompany.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlConversor implements ActionListener {

    private InterfazVista vista;
    private ConversorDolarPesos modelo;

    public ControlConversor(InterfazVista vista, ConversorDolarPesos modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        if (evento.getActionCommand().equals(InterfazVista.ADOLAR)) {
            vista.escribeCambio(cantidad + " pesos mexicanos son: " + modelo.pesosADolar(cantidad) + " dolares");
        } else if (evento.getActionCommand().equals(InterfazVista.APESO)) {
            vista.escribeCambio(cantidad + " dolares son: " + modelo.dolarAPesos(cantidad) + " pesos mexicanos");
        } else {
            vista.escribeCambio("ERROR");
        }
    }
}
