package com.leanway.component_mine;

import android.app.Application;

import com.leanway.base_lib.IAppComponent;
import com.leanway.base_lib.ServiceFactory;


public class MineApp extends Application implements IAppComponent {

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
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
