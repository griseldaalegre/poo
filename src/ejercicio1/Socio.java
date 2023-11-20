package ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;

import ejercicio1.condiciones.Condicion;

public class Socio implements Comparable<Socio> {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultimaCuotataPaga;
    private ArrayList<Cancha> alquileresRealizados;

    public Socio(String nombre, String apellido, int edad, boolean ultimaCuitaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuotataPaga = ultimaCuitaPaga;
        this.alquileresRealizados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getUltimaCuotaPaga() {
        return ultimaCuotataPaga;
    }

    public void setUltimaCuotaPaga(boolean ultimaCuitaPaga) {
        this.ultimaCuotataPaga = ultimaCuitaPaga;
    }

    public void addAlquiler(Cancha cancha) {
        // si no contiene esta cancha, la agrego
        if (!this.alquileresRealizados.contains(cancha))
            this.alquileresRealizados.add(cancha);
    }

    // devuelve int

    @Override  //a este medodo lo uso en la clase comparadorAnd
    public int compareTo(Socio otro) {
        return this.getApellido().compareTo(otro.getApellido());
        // comparo 2 objetos de tipo socio por apellido
    }

    // este metodo lo uso en condicion por cancha
    public boolean socioAlquiloCancha(int idCancha) {
        for (int i = 0; i < alquileresRealizados.size(); i++) {
            // si la cancha en X posicion cumple con el id q paso entra al if
            if (alquileresRealizados.get(i).getIdCancha() == idCancha)
                return true;
        }
        return false;
    }

    //este metodo lo uso en la condicion por precio
    public boolean pagoMontoMayorA(double xMonto) {
        for (int i = 0; i < alquileresRealizados.size(); i++) {
            if (alquileresRealizados.get(i).getValorCancha() > xMonto)
                return true;
        }
        return false;
    }

    public ArrayList<Socio> getSociosQueCumplenOrdenados(Condicion condicion, Comparator<Socio> orden) { // revisar
        ArrayList<Socio> resultado = new ArrayList<>();
        if (condicion.cumple(this)) {// paso a este objeto
            resultado.add(this); // agrego a this objeto
        }
        return resultado; // siempre retornar copia de mi lista original
    }

    @Override
    public String toString() {
        return "Socio \n nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad()
                + ", ultimaCuitaPaga="
                + getUltimaCuotaPaga() + "]";
    }

}