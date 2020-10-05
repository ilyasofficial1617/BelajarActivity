package com.yudhistira.belajaractivity.modul.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.yudhistira.belajaractivity.R;
import com.yudhistira.belajaractivity.base.Profile;
import com.yudhistira.belajaractivity.profile.ProfileActivity;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    LoginContract.Presenter presenter;

    Button loginButton;
    TextInputLayout usernameField;
    TextInputLayout passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.LoginButton);
        usernameField = findViewById(R.id.TextInputUsername);
        passwordField = findViewById(R.id.TextInputPassword);

        loginButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getEditText().getText().toString();
                String password = passwordField.getEditText().getText().toString();
                presenter.performLogin(username,password);
            }
        });

        setPresenter(new LoginPresenter(this));
    }

    @Override
    public void redirectToProfile(Profile profile) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("profile",profile);
        startActivity(intent);
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }
}