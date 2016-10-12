package com.foass

import com.foass.model.Message
import com.foass.model.Operation
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import rx.Observable

class Foass {

    private val ENDPOINT = "https://www.foaas.com"

    private var foassApi: FoassApi

    private val headerInterceptor = Interceptor { chain ->
        val original = chain.request()
        val request = original.newBuilder()
                .header("Accept", "application/json")
                .method(original.method(), original.body())
                .build()
        chain.proceed(request)
    }

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.NONE
    }

    init {
        val httpClient = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(headerInterceptor)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(MoshiConverterFactory.create())
                .client(httpClient)
                .build()

        foassApi = retrofit.create(FoassApi::class.java)
    }

    // Public interface

    fun getVersion() = foassApi.getVersion()

    fun getOperations() = foassApi.getOperations()

    fun getMessage(operation: Operation): Observable<Message> {
        var finalUrl = operation.url
        for (field in operation.fields) {
            finalUrl = finalUrl.replace(field.fieldToken, field.encodedValue)
        }
        return foassApi.getMessage(finalUrl)
    }

}
