package com.example.ead_thin_client;

        import retrofit2.Retrofit;
        import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {

    private static RetrofitBuilder instance = new RetrofitBuilder();

    private RetrofitBuilder(){}

    public static RetrofitBuilder getInstance(){
        return instance;
    }

    public EadApi configure (){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:4000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return  retrofit.create(EadApi.class);
    }
}
