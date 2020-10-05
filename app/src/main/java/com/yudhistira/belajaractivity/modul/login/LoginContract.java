package com.yudhistira.belajaractivity.modul.login;

import com.yudhistira.belajaractivity.base.BasePresenter;
import com.yudhistira.belajaractivity.base.BaseView;
import com.yudhistira.belajaractivity.base.Profile;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(Profile profile);
    }

    interface Presenter extends BasePresenter {
        void performLogin(String username, String password);
    }
}
