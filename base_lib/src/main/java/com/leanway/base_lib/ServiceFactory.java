package com.leanway.base_lib;


import com.leanway.base_lib.impl.EmptyLoginService;
import com.leanway.base_lib.impl.EmptyMineService;
import com.leanway.base_lib.service.IMineService;
import com.leanway.base_lib.service.IloginService;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ServiceFactory() {
    }

    private IloginService mLoginService;
    private IMineService mMineService;

    public IloginService getLoginService() {
        if (mLoginService == null) {
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(IloginService loginService) {
        mLoginService = loginService;
    }

    public IMineService getMineService() {
        if (mMineService == null) {
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setMineService(IMineService mineService) {
        mMineService = mineService;
    }

}
