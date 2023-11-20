package ejercicio1.comparadores;

import java.util.Comparator;

import ejercicio1.Socio;

public class ComparadorPorEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
}
