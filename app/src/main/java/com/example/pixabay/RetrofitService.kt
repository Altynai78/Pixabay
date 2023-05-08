package com.example.pixabay

class RetrofitService {
private var retrofit= Retrofit.Builder().baseUrl("https://pixabay.com/")
    .addConverterFactory(GsonConverterFactory.create()).build()

var api = retrofit.create(PixabayApi::class.java)

}