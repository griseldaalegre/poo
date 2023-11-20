package ejercicio1.comparadores;
import java.util.Comparator;

import ejercicio1.Socio;


public class ComparadorPorPago implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return Boolean.compare(o1.getUltimaCuotaPaga(),(o2.getUltimaCuotaPaga()));
    }
}