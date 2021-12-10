
package com.mycompany.mvc;

public class Main {

    public static void main(String[] args) {
        // el modelo:
        ConversorDolarPesos modelo = new ConversorDolarPesos();
        // la vista:
        InterfazVista vista = new VentanaConversor();
        // y el control:
        ControlConversor control = new ControlConversor(vista,modelo);
        // configura la vista
        vista.setControlador(control);
        // y arranca la interfaz (vista):
        vista.arranca();
    }

}
