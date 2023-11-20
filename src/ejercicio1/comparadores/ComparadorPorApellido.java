package ejercicio1.comparadores;

import java.util.Comparator;

import ejercicio1.Socio;

public class ComparadorPorApellido implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
         //comparo 2 apellios da un valor negativo si el apellido de o1 es menor que el de o2 y 0 si son iguales
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
