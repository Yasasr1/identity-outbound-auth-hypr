package org.wso2.carbon.identity.application.authenticator.hypr.internal;

import org.wso2.carbon.user.core.service.RealmService;

public class PasswordlessAuthenticatorServiceDataHolder {
    private static final PasswordlessAuthenticatorServiceDataHolder PasswordlessAuthenticatorServiceDataHolder =
            new PasswordlessAuthenticatorServiceDataHolder();

    private RealmService realmService;

    private PasswordlessAuthenticatorServiceDataHolder() {

    }

    public static PasswordlessAuthenticatorServiceDataHolder getInstance() {

        return PasswordlessAuthenticatorServiceDataHolder;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

}
