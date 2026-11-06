package com.amazon.alexa.elements.turbomodules.elementsutility;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsUtilityAPI {
    void encryptStringAES(String str, String str2, String str3, Promise promise);

    void encryptStringPKCS7(String str, String str2, Promise promise);

    void encryptStringRSA(String str, boolean z, String str2, Promise promise);

    void generateAESKey(Promise promise);

    void openUniversalDeeplinkUrl(String str, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void verifyWithECDSA(String str, String str2, String str3, String str4, Promise promise);

    void verifyWithRSA(String str, String str2, String str3, Promise promise);
}
