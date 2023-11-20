package ejercicio1;

import java.time.LocalDate;

public class Cancha {
    private int idCancha;
    private LocalDate fecha;
    private String nombreCancha;
    private double valorCancha;

    public Cancha(int idCancha, String nombreCancha, double valorCancha) {
        this.idCancha = idCancha;
        this.fecha = LocalDate.now();
        this.nombreCancha = nombreCancha;
        this.valorCancha = valorCancha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreCancha() {
        return nombreCancha;
    }

    public void setNombreCancha(String nombreCancha) {
        this.nombreCancha = nombreCancha;
    }

    public double getValorCancha() {
        return valorCancha;
    }

    public void setValorCancha(double valorCancha) {
        this.valorCancha = valorCancha;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Cancha otra = (Cancha) o;
            return this.getFecha().equals(otra.getFecha()) &&
                    this.getIdCancha() == (otra.getIdCancha())
                    && this.getValorCancha() == (otra.getValorCancha());
        } catch (Exception e) {
            return false;
        }
    }

}
