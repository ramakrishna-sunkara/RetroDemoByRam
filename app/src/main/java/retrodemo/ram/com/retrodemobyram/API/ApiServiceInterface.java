package retrodemo.ram.com.retrodemobyram.API;

import retrodemo.ram.com.retrodemobyram.models.RegisterRequestModel;
import retrodemo.ram.com.retrodemobyram.models.RegisterResponseModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServiceInterface {
        @POST("/m-passenger-register")
        Call<RegisterResponseModel> callRegister(@Body RegisterRequestModel registerRequestModel);
}
