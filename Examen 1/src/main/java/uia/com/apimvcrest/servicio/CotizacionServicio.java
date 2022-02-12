package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.compras.InfoComprasUIA;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;

import java.io.IOException;
import java.util.ArrayList;

public class CotizacionServicio implements ICotizacionServicio {
    private GestorCompras miGestorCompras = new GestorCompras();

    public CotizacionServicio() throws IOException {
    }

    @Override
    public ArrayList<CotizacionModelo> getCotizaciones() {
        return miGestorCompras.getCotizaciones();
    }

    @Override
    public CotizacionModelo getCotizacion(int id) {
        return null;
    }

    @Override
    public CotizacionModelo setCotizacion(int id)
    {
        return miGestorCompras.getCotizacion(id);
    }

    @Override
    public CotizacionModelo putCotizacion(int id){return miGestorCompras.putCotizacion(id);}

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloCotizaciones();
    }

    @Override
    public CotizacionModelo deleteCotizacion(int id) {
        return miGestorCompras.deleteCotizacion(id);
    }

}
