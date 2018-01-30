package retrodemo.ram.com.retrodemobyram.API;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "http://ec2-54-145-233-77.compute-1.amazonaws.com/";
//http://ec2-54-145-233-77.compute-1.amazonaws.com/m-passenger-register
    public static ApiServiceInterface getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiServiceInterface.class);
    }
}
