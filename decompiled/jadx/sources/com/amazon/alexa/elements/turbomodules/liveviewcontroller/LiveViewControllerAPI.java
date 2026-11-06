package com.amazon.alexa.elements.turbomodules.liveviewcontroller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface LiveViewControllerAPI {
    public static final String E_NOT_IMPLEMENTED = "E_NOT_IMPLEMENTED";

    default void getCameraConnectionErrors(Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "getCameraConnectionErrors is not implemented on this platform");
    }

    default void getMicrophonePermissionStatus(Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "getMicrophonePermissionStatus is not implemented on this platform");
    }

    default void getSearchResultsPayload(Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "getSearchResultsPayload is not implemented on this platform");
    }

    default void getSessions(Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "getSessions is not implemented on this platform");
    }

    default void requestMicrophonePermission(Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "requestMicrophonePermission is not implemented on this platform");
    }

    default void sendAVSEvent(String str, String str2, String str3, Promise promise) {
        promise.reject(E_NOT_IMPLEMENTED, "sendAVSEvent is not implemented on this platform");
    }

    default void closeAllActiveSessions() {
    }

    default void addListener(String str) {
    }

    default void closeSession(String str) {
    }

    default void releaseReactContext(@NonNull ReactApplicationContext reactApplicationContext) {
    }

    default void removeListeners(double d) {
    }

    default void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
    }
}
