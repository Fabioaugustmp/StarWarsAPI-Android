package com.example.starwarsapi.api;

import com.example.starwarsapi.models.StarWarsResposta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StarWarsService {

    @GET("people")
    Call<StarWarsResposta> obterListaStarWars();

}
