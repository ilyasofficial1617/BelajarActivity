package com.yudhistira.belajaractivity.modul.login;

import com.yudhistira.belajaractivity.base.Profile;

/**
 * Created by fahrul on 13/03/19.
 */

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String username, final String password){
        //proses login
        Profile profile = new Profile(username, password);
        //if login success call redirect to profile
        view.redirectToProfile(profile);
    }

}
