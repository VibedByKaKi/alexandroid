package com.amazon.alexa.elements.turbomodules.commscontactsmanager;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsContactsManagerModule")
/* loaded from: classes17.dex */
public class CommsContactsManagerModule extends NativeCommsContactsManagerSpec {
    public static final String NAME = "CommsContactsManagerModule";
    private final CommsContactsManagerAPI commsContactsManagerAPI;

    public CommsContactsManagerModule(ReactApplicationContext reactApplicationContext, CommsContactsManagerAPI commsContactsManagerAPI) {
        super(reactApplicationContext);
        this.commsContactsManagerAPI = commsContactsManagerAPI;
        commsContactsManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void callContact(String str, String str2, String str3, String str4, Promise promise) {
        this.commsContactsManagerAPI.callContact(str, str2, str3, str4, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void dropInIntraHome(String str, String str2, ReadableArray readableArray, Promise promise) {
        this.commsContactsManagerAPI.dropInIntraHome(str, str2, readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getBlockContacts(Promise promise) {
        this.commsContactsManagerAPI.getBlockContacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getCachedBlockContacts(Promise promise) {
        this.commsContactsManagerAPI.getCachedBlockContacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getDeviceId(Promise promise) {
        this.commsContactsManagerAPI.getDeviceId(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getHomeGroupsThatCanDropIn(Promise promise) {
        this.commsContactsManagerAPI.getHomeGroupsThatCanDropIn(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getMAPDeviceName(Promise promise) {
        this.commsContactsManagerAPI.getMAPDeviceName(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsContactsManagerModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getSendSmsPreference(Promise promise) {
        this.commsContactsManagerAPI.getSendSmsPreference(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getShowCallerIdPreference(Promise promise) {
        this.commsContactsManagerAPI.getShowCallerIdPreference(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void getTranscriptionImprovementPreference(Promise promise) {
        this.commsContactsManagerAPI.getTranscriptionImprovementPreference(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void nativeCallAction(String str, Promise promise) {
        this.commsContactsManagerAPI.nativeCallAction(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void notifyContactsEvent(String str, Promise promise) {
        this.commsContactsManagerAPI.notifyContactsEvent(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void setContactCanDropInOnUser(String str, boolean z, Promise promise) {
        this.commsContactsManagerAPI.setContactCanDropInOnUser(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void setContactIsBlocked(boolean z, String str, Promise promise) {
        this.commsContactsManagerAPI.setContactIsBlocked(z, str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void setSendSmsPreference(boolean z, Promise promise) {
        this.commsContactsManagerAPI.setSendSmsPreference(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void setShowCallerIdPreference(boolean z, Promise promise) {
        this.commsContactsManagerAPI.setShowCallerIdPreference(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void setTranscriptionImprovementPreference(boolean z, Promise promise) {
        this.commsContactsManagerAPI.setTranscriptionImprovementPreference(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void showDropInBottomSheet(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        this.commsContactsManagerAPI.showDropInBottomSheet(readableArray, readableArray2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void startSkypeAction(String str, String str2, Promise promise) {
        this.commsContactsManagerAPI.startSkypeAction(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void updateContact(String str, String str2, String str3, String str4, String str5, Promise promise) {
        this.commsContactsManagerAPI.updateContact(str, str2, str3, str4, str5, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsContactsManagerSpec
    @ReactMethod
    public void updatePhoneContact(ReadableMap readableMap, Promise promise) {
        this.commsContactsManagerAPI.updatePhoneContact(readableMap, promise);
    }
}
