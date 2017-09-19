package tn.com.wihraiech.loginapplication.service;

/**
 * Created by lenovo on 16/08/2016.
 */
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import tn.com.wihraiech.loginapplication.server.ServerRequest;
import tn.com.wihraiech.loginapplication.server.ServerResponse;

public interface RequestInterface {

    @POST("login_register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
