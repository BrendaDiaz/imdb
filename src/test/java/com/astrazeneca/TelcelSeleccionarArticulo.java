package com.astrazeneca;

import org.junit.Test;

public class TelcelSeleccionarArticulo extends TelcelParent {

    //
    @Test
    public void searchPhone () {
        navegarSitio("https://www.telcel.com");
        verificarLandingPage();
        listarTelefonos();
        seleccionarEstado("Jalisco");
        verificarPaginaResultados();
        Celular primerCelular;
        primerCelular = capturarDatosCelular(1);
        seleccionarCelular(1);
        validarDatosCelular(primerCelular);
        cerrarBrowser();
    }


}