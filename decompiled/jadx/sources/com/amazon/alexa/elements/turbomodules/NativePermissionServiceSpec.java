package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativePermissionServiceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PermissionServiceModule";

    public NativePermissionServiceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getBackgroundLocationPermissionStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getLocationAccuracyStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getLocationPermissionStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getLocationPermissionsStatus(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PermissionServiceModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getNetworkStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getPermissionStatus(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getUserLocationStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasFullScreenIntentPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasLocationPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasScheduleExactAlarmPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void hasUserSeenNotificationPermissions(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void havePermissionsForAccessorySetup(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void locationEventWasReceived();

    @DoNotStrip
    @ReactMethod
    public abstract void navigateToApplicationDetailsSettings(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registerForRemoteNotifications(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestBackgroundLocationPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestBluetoothLocationPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestBluetoothPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestCameraPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestFullScreenIntentPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestLocationPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestLocationPermissionAlways(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestLocationPermissionWhenInUse(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestMicrophonePermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestNearbyWifiDevicesPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestPermission(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestPermissionsForAccessorySetup(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestScheduleExactAlarmPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestTemporaryFullAccuracyAuthorization(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestWifiEnable(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldShowRequestPermissionRationale(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void unregisterForRemoteNotifications(Promise promise);
}
