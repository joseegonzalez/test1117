package nyc.c4q.josegonzalez.test11117.Internet;

import nyc.c4q.josegonzalez.test11117.Model.Success;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mathcore on 1/11/17.
 */

public interface KeyService {

    @GET("cgi-bin/1_11_2017_exam.pl")
    Call<Success> getAvailableKeys();

}
