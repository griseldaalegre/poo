package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionPorCancha implements Condicion {
    private int idCancha;

    public CondicionPorCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.socioAlquiloCancha(idCancha);
    }

}
