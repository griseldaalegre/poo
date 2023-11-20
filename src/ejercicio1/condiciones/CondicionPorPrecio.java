package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionPorPrecio implements Condicion {
    private double xMonto;

    public CondicionPorPrecio(double xMonto) {
        this.xMonto = xMonto;
    }

    public boolean cumple(Socio socio) {
        return socio.pagoMontoMayorA(xMonto);
    }
}
