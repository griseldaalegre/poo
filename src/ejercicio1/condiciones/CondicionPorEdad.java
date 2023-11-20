package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionPorEdad implements Condicion {
    private int edad;

    public CondicionPorEdad(int edad) {
        this.edad = edad;
    }

    public boolean cumple(Socio socio) {
        return socio.getEdad() < edad;
    }

}
