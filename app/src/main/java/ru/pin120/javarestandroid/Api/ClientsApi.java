package ru.pin120.javarestandroid.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ru.pin120.javarestandroid.Entities.Clients;

public interface ClientsApi {
    @GET("/clients/get-all")
    Call<List<Clients>> getAllClients();

    @POST("/clients/save/test")
    Call<Clients> save(@Body Clients client);
}
