object Network {
    private const val retrofitVersion = "2.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val gson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"

    private const val loggingInterceptorVersion = "4.9.3"
    const val loggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:$loggingInterceptorVersion"

    private const val coroutinesAdapterVersion = "0.9.2"
    const val coroutinesAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:$coroutinesAdapterVersion"

}