package ejercicio1.comparadores;

import java.util.Comparator;

import ejercicio1.Socio;

//implemento interfaz Comparator, le paso el tipo de objeto que necesito comparar
public class ComparadorAnd implements Comparator<Socio> {
    private Comparator<Socio> comparador1;
    private Comparator<Socio> comparador2;

    public ComparadorAnd(Comparator<Socio> comparador1, Comparator<Socio> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int resultado = this.comparador1.compare(o1, o2);

        // Si el resultado es 0(son iguales) uso el segundo
        if (resultado == 0)
            resultado = this.comparador2.compare(o1, o2);
        // comparador para desempatar

        return resultado;
    }

}
