package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.CotizacionModelo;

import java.util.ArrayList;

public interface ICotizacionServicio {
    ArrayList<CotizacionModelo> getCotizaciones();
    CotizacionModelo getCotizacion(int id);

    CotizacionModelo putCotizacion(int id);

    void print();

    CotizacionModelo deleteCotizacion(int id);
}
