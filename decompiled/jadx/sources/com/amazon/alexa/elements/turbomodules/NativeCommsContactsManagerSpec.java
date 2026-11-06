package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsContactsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsContactsManagerModule";

    public NativeCommsContactsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void callContact(String str, String str2, String str3, String str4, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void dropInIntraHome(String str, String str2, ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getBlockContacts(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCachedBlockContacts(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getDeviceId(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getHomeGroupsThatCanDropIn(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMAPDeviceName(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsContactsManagerModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getSendSmsPreference(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getShowCallerIdPreference(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getTranscriptionImprovementPreference(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void nativeCallAction(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void notifyContactsEvent(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setContactCanDropInOnUser(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setContactIsBlocked(boolean z, String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setSendSmsPreference(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setShowCallerIdPreference(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setTranscriptionImprovementPreference(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void showDropInBottomSheet(ReadableArray readableArray, ReadableArray readableArray2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void startSkypeAction(String str, String str2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void updateContact(String str, String str2, String str3, String str4, String str5, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void updatePhoneContact(ReadableMap readableMap, Promise promise);
}
