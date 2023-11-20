package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionOr implements Condicion {
    private Condicion c;

    public CondicionOr(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Socio socio) {
        // Devuelve true si la condición no se cumple para el socio
        return !c.cumple(socio);
    }
}
