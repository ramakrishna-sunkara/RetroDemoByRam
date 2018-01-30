package retrodemo.ram.com.retrodemobyram;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrodemo.ram.com.retrodemobyram.API.ApiServiceInterface;
import retrodemo.ram.com.retrodemobyram.API.ApiUtils;
import retrodemo.ram.com.retrodemobyram.models.RegisterRequestModel;
import retrodemo.ram.com.retrodemobyram.models.RegisterResponseModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = RegisterActivity.class.getSimpleName();

    private EditText edtServiceName, edtFirstName, edtLastName, edtEmailId, edtGender, edtPassword, edtRegisterType;
    private Button btnRegister;
    private TextView txtResponse;
    private ApiServiceInterface apiServiceInterface;

    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtServiceName = findViewById(R.id.edtServiceName);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmailId = findViewById(R.id.edtEmailId);
        edtGender = findViewById(R.id.edtGender);
        edtPassword = findViewById(R.id.edtPassword);
        edtRegisterType = findViewById(R.id.edtRegisterType);

        btnRegister = findViewById(R.id.btnRegister);
        txtResponse = findViewById(R.id.txResponse);

        progress = new ProgressDialog(this);
        progress = new ProgressDialog(this);
        progress.setMessage("Sending data...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);

        apiServiceInterface = ApiUtils.getAPIService();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.show();
                doRegister();
            }
        });

    }

    private void doRegister() {
        RegisterRequestModel registerRequestModel = new RegisterRequestModel();
        registerRequestModel.setSocialName(edtServiceName.getText().toString());
        registerRequestModel.setFirstName(edtFirstName.getText().toString());
        registerRequestModel.setLastName(edtLastName.getText().toString());
        registerRequestModel.setEmailId(edtEmailId.getText().toString());
        registerRequestModel.setGender(edtGender.getText().toString());
        registerRequestModel.setPassword(edtPassword.getText().toString());
        registerRequestModel.setRegiType(edtRegisterType.getText().toString());

        apiServiceInterface.callRegister(registerRequestModel).enqueue(new Callback<RegisterResponseModel>() {
            @Override
            public void onResponse(Call<RegisterResponseModel> call, Response<RegisterResponseModel> response) {

                if (response.isSuccessful()) {
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                    if (response.body().getStatus().equalsIgnoreCase("success")) {
                        //Handel success response here
                        showSuccessResponse(response.body());
                    } else {
                        //Handel failed response here
                        showFailedResponse(response.body());
                    }
                }
            }

            @Override
            public void onFailure(Call<RegisterResponseModel> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
                //error handling here
                showErrorResponse(t.getMessage());
            }
        });
    }

    //for error handling
    private void showErrorResponse(String message) {
        if (progress.isShowing()) {
            progress.hide();
        }
        txtResponse.setText(message);
    }

    //for failed response handling
    private void showFailedResponse(RegisterResponseModel registerResponseModel) {
        if (progress.isShowing()) {
            progress.hide();
        }
        txtResponse.setText(registerResponseModel.getMessage());
    }

    //for success response handling
    private void showSuccessResponse(RegisterResponseModel registerResponseModel) {
        if (progress.isShowing()) {
            progress.hide();
        }
        txtResponse.setText(registerResponseModel.getMessage());
    }
}
