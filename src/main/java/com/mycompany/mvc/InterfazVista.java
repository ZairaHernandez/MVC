
package com.mycompany.mvc;

public interface InterfazVista {

    void setControlador(ControlConversor c);

    void arranca(); // comienza la visualización

    double getCantidad(); // cantidad a convertir

    void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:
    static final String ADOLAR = "Pesos mexicanos a dolar";
    static final String APESO = "Dolar a peso mexicano";

}
