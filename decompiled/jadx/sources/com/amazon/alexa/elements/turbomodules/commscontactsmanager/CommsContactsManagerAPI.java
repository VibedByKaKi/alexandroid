package com.amazon.alexa.elements.turbomodules.commscontactsmanager;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsContactsManagerAPI {
    void callContact(String str, String str2, String str3, String str4, Promise promise);

    void dropInIntraHome(String str, String str2, ReadableArray readableArray, Promise promise);

    void getBlockContacts(Promise promise);

    void getCachedBlockContacts(Promise promise);

    void getDeviceId(Promise promise);

    void getHomeGroupsThatCanDropIn(Promise promise);

    void getMAPDeviceName(Promise promise);

    void getSendSmsPreference(Promise promise);

    void getShowCallerIdPreference(Promise promise);

    void getTranscriptionImprovementPreference(Promise promise);

    void nativeCallAction(String str, Promise promise);

    void notifyContactsEvent(String str, Promise promise);

    void setContactCanDropInOnUser(String str, boolean z, Promise promise);

    void setContactIsBlocked(boolean z, String str, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setSendSmsPreference(boolean z, Promise promise);

    void setShowCallerIdPreference(boolean z, Promise promise);

    void setTranscriptionImprovementPreference(boolean z, Promise promise);

    void showDropInBottomSheet(ReadableArray readableArray, ReadableArray readableArray2, Promise promise);

    void startSkypeAction(String str, String str2, Promise promise);

    void updateContact(String str, String str2, String str3, String str4, String str5, Promise promise);

    void updatePhoneContact(ReadableMap readableMap, Promise promise);
}
