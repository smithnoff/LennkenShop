package com.skynoff.udo.lennkenshop;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Skynoff on 19/10/2016.
 */

public interface lenkkenWebService {
    @GET("/products")
void getProducto(Callback<List<articulo>> callback);

}
