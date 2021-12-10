package com.mycompany.mvc;

public class ConversorDolarPesos extends ConversorDolar { // Adaptador de clase

    public ConversorDolarPesos() {
        super(21.23D);
    }

    public double dolarAPesos(double cantidad) {
        return dolarAMoneda(cantidad);
    }

    public double pesosADolar(double cantidad) {
        return MonedaADolar(cantidad);
    }
}
