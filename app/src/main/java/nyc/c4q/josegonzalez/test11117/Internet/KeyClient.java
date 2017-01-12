package nyc.c4q.josegonzalez.test11117.Internet;

import nyc.c4q.josegonzalez.test11117.Model.Success;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mathcore on 1/11/17.
 */

public class KeyClient {

    private final String BASE_URL = "http://jsjrobotics.nyc/";

    private static KeyClient instance;
    private final KeyService keys;

    public static KeyClient getInstance() {
        if (instance == null) {
            instance = new KeyClient();
        }
        return instance;
    }

    private KeyClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        keys = retrofit.create(KeyService.class);
    }

    public Call<Success> getAvailableKeys() {
        return keys.getAvailableKeys();
    }

}
