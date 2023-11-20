package ejercicio1.condiciones;

import ejercicio1.Socio;

public class CondicionPorCuota implements Condicion {
    private boolean pagoUltimaCuota;

    public CondicionPorCuota(boolean pagoUltimaCuota) {
        this.pagoUltimaCuota = pagoUltimaCuota;
    }

    @Override
    public boolean cumple(Socio socio) {
        //Comparo la ultima cuota de mi clase socio con la cuota que paso por parametro
        return socio.getUltimaCuotaPaga() == pagoUltimaCuota;
    }
}
