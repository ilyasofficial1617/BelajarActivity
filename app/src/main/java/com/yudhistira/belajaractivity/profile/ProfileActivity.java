package com.yudhistira.belajaractivity.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.yudhistira.belajaractivity.R;
import com.yudhistira.belajaractivity.base.Profile;

public class ProfileActivity extends AppCompatActivity implements ProfileContract.View{

    TextView usernameText;
    TextView passwordText;

    ProfileContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.usernameText = findViewById(R.id.UsernameText);
        this.passwordText = findViewById(R.id.PasswordText);

        Intent intent = getIntent();
        Profile profile  = (Profile) intent.getSerializableExtra("profile");

        usernameText.setText( profile.getName() );
        passwordText.setText( profile.getPassword() );
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        this.presenter = presenter;
    }
}