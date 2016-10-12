package com.foass

import com.foass.model.Message
import com.foass.model.Operation
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable


internal interface FoassApi {

    @GET("/getVersion")
    fun getVersion(): Observable<Message>;

    @GET("/operations")
    fun getOperations(): Observable<List<Operation>>;

    @GET("{url}")
    fun getMessage(@Path("url", encoded = true) url: String): Observable<Message>
}