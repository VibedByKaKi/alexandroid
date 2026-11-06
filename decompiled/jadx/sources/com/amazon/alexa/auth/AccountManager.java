package com.amazon.alexa.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AccountManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResultCallback<T> {
        void onError(Exception exc);

        void onResult(T t);
    }

    void addAccountChangedListener(AccountChangedListener accountChangedListener);

    void clearCache();

    void getActorToken(String str, ResultCallback<AccessToken> resultCallback);

    void getDeviceSerialNumber(ResultCallback<String> resultCallback);

    void getDirectedID(ResultCallback<String> resultCallback);

    void getMarketplace(ResultCallback<String> resultCallback);

    void getToken(ResultCallback<AccessToken> resultCallback);

    void isChildProfile(ResultCallback<Boolean> resultCallback);

    void isLoggedIn(ResultCallback<Boolean> resultCallback);

    void removeAccountChangedListener(AccountChangedListener accountChangedListener);

    void teardown();
}
