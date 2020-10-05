package com.yudhistira.belajaractivity.profile;

import com.yudhistira.belajaractivity.base.BasePresenter;
import com.yudhistira.belajaractivity.base.BaseView;
import com.yudhistira.belajaractivity.base.Profile;

public interface ProfileContract {
    interface View extends BaseView<ProfileContract.Presenter> {
    }

    interface Presenter extends BasePresenter {
    }
}
