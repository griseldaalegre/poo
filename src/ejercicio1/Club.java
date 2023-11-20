package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ejercicio1.condiciones.Condicion;

public class Club {
    private ArrayList<Socio> listadoSocios;

    public Club() {
        this.listadoSocios = new ArrayList<>();
    }

    public void addSocio(Socio socio) {
        this.listadoSocios.add(socio);
    }

    public ArrayList<Socio> getSociosQueCumplenOrdenados(Condicion c, Comparator<Socio> orden) {
        ArrayList<Socio> resultado = new ArrayList<>();
        for (int i = 0; i < listadoSocios.size(); i++) {
            resultado.addAll(this.listadoSocios.get(i).getSociosQueCumplenOrdenados(c, orden));
        }
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }
}
