package com.amazon.alexa.elements.turbomodules.identity;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsIdentityAPI {
    void authorizeLinkCode(String str, Promise promise);

    void getAccessToken(@Nullable String str, Promise promise);

    void getAccessTokenForPerson(@Nullable String str, Promise promise);

    void getActorCookies(@Nullable String str, @Nullable String str2, @Nullable String str3, Promise promise);

    void getCookies(@Nullable String str, @Nullable String str2, Promise promise);

    void getPreauthorizedLinkCode(Promise promise);

    void getSessionId(Promise promise);

    void getUser(Promise promise);

    @Nullable
    WritableMap getUserSync();

    void initiateDelegation(ReadableMap readableMap, Promise promise);

    void initiateProfileToAccountTransition(String str, Promise promise);

    void requestReAuthentication(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setUpSSOForWebRequest(@Nullable String str, Promise promise);

    void signOut(Promise promise);

    void terminateDelegation(Promise promise);
}
