package nyc.c4q.josegonzalez.test11117;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import nyc.c4q.josegonzalez.test11117.Internet.KeyClient;
import nyc.c4q.josegonzalez.test11117.Model.AvailableKey;
import nyc.c4q.josegonzalez.test11117.Model.Success;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Connected" ;
    KeyClient keyClient;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getJSON();

    }

    public void getJSON() {

        keyClient = KeyClient.getInstance();
        Call<Success> call = keyClient.getAvailableKeys();
        call.enqueue(new Callback<Success>() {

            @Override
            public void onResponse(Call<Success> call, Response<Success> response) {                 //Assigns response.body() to washPostFeed
                Success success = response.body();
                List<AvailableKey> availableKeys = success.getAvailableKeys();
                Log.d(TAG, "Success: " + response.body().getAvailableKeys());
            }

            @Override
            public void onFailure(Call<Success> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }
}
