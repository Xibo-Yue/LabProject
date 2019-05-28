package com.leanway.component_login;

import android.app.Application;

import com.leanway.base_lib.IAppComponent;
import com.leanway.base_lib.ServiceFactory;


public class LoginApp extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }

}
