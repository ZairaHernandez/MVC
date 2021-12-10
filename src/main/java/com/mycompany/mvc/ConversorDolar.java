package com.mycompany.mvc;



public class ConversorDolar {

    private double cambio;

    public ConversorDolar(double valorCambio) {
        // valor en la moneda de 1 dolar
        cambio = valorCambio;
    }

    public double dolarAMoneda(double cantidad) {
        return (double)Math.round((cantidad*cambio) * 100d) / 100d;
    }

    public double MonedaADolar(double cantidad) {
        return (double)Math.round((cantidad/cambio) * 100d) / 100d;
    }
}
