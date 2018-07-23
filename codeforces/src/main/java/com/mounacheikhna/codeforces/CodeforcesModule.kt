package com.mounacheikhna.codeforces

/**
 * Created by mounacheikhna on 04/07/2018.
 */
//@Module
class CodeforcesModule {

    /*@Provides
    @Singleton
    fun documentationService(baseUrl: String): CodeforcesService {
        // TODO logging
        //HttpLoggingInterceptor.Logger logger = message -> Timber.tag("HTTP").d(message);

        val client = OkHttpClient.Builder() //
                //.addNetworkInterceptor(new HttpLoggingInterceptor(logger).setLevel(BASIC)) //
                .build()

        val contentType = requireNonNull(MediaType.parse("application/json; charset=utf-8"))
        val json = JSON.Companion.getUnquoted()
        val retrofit = Retrofit.Builder() //
                .baseUrl(baseUrl.getUrl()) //
                .client(client) //
                .addConverterFactory(
                        KotlinSerializationConverterFactory.stringBased(contentType, ???({ json.parse() }), ???({ json.stringify() }))) //
        .addCallAdapterFactory(CoroutineCallAdapterFactory.create()) //
                .build()

        return retrofit.create(DocumentationService::class.java)*/
    }
}