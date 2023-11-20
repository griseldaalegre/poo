package ejercicio1.comparadores;

import java.util.Comparator;

import ejercicio1.Socio;

public class ComparadorPorNombre implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
