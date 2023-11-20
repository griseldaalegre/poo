package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionAnd implements Condicion {
    // Implemento los metodos de mi interface Condicion
    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Socio s) {
        return c1.cumple(s) && c2.cumple(s);
    }
}
