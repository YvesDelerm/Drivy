package fr.ydelerm.drivy.network

import androidx.annotation.NonNull
import fr.ydelerm.drivy.model.Car
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CarApiService {
    @NonNull
    @GET("cars.json")
    fun getCars(): Call<List<Car>>
}