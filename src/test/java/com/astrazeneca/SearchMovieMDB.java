package com.astrazeneca;

import org.junit.Test;

public class SearchMovieMDB extends MovieMDB {

    @Test
    public void searchMovie()

    {
        navegarSitio("https://imdb.com");
        verificarLandingPage();
        buscaPelicula();
        listarPeliculas();

    }

}
