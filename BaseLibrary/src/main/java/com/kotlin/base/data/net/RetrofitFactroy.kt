package com.kotlin.base.data.net

import com.kotlin.base.common.Constant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *作者 LiBW
 *创建时间 2018/10/9
 *描述:工厂
 */
class RetrofitFactroy private constructor() {
    companion object {
        val instance : RetrofitFactroy by lazy { RetrofitFactroy() }
    }
    private val retrofit : Retrofit
    init {
        retrofit =Retrofit.Builder()
                .baseUrl(Constant.SERVER_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    private fun initClient(): OkHttpClient {
      return  OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                .connectTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build()



    }
    //日志拦截器
    private fun initLogInterceptor(): Interceptor {
        val interceptor= HttpLoggingInterceptor()
            interceptor.level=HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun <T>create(service:Class<T>){
        retrofit.create(service)
    }

}