package com.amazon.alexa.elements.turbomodules.permissionservice;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "PermissionServiceModule")
/* loaded from: classes17.dex */
public class PermissionServiceModule extends NativePermissionServiceSpec {
    public static final String NAME = "PermissionServiceModule";
    private final PermissionServiceAPI permissionServiceAPI;

    public PermissionServiceModule(ReactApplicationContext reactApplicationContext, PermissionServiceAPI permissionServiceAPI) {
        super(reactApplicationContext);
        this.permissionServiceAPI = permissionServiceAPI;
        permissionServiceAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getBackgroundLocationPermissionStatus(Promise promise) {
        this.permissionServiceAPI.getBackgroundLocationPermissionStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getLocationAccuracyStatus(Promise promise) {
        this.permissionServiceAPI.getLocationAccuracyStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getLocationPermissionStatus(Promise promise) {
        this.permissionServiceAPI.getLocationPermissionStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getLocationPermissionsStatus(Promise promise) {
        this.permissionServiceAPI.getLocationPermissionsStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PermissionServiceModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getNetworkStatus(Promise promise) {
        this.permissionServiceAPI.getNetworkStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getPermissionStatus(String str, Promise promise) {
        this.permissionServiceAPI.getPermissionStatus(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void getUserLocationStatus(Promise promise) {
        this.permissionServiceAPI.getUserLocationStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void hasFullScreenIntentPermission(Promise promise) {
        this.permissionServiceAPI.hasFullScreenIntentPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void hasLocationPermission(Promise promise) {
        this.permissionServiceAPI.hasLocationPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void hasScheduleExactAlarmPermission(Promise promise) {
        this.permissionServiceAPI.hasScheduleExactAlarmPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void hasUserSeenNotificationPermissions(Promise promise) {
        this.permissionServiceAPI.hasUserSeenNotificationPermissions(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void havePermissionsForAccessorySetup(Promise promise) {
        this.permissionServiceAPI.havePermissionsForAccessorySetup(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void locationEventWasReceived() {
        this.permissionServiceAPI.locationEventWasReceived();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void navigateToApplicationDetailsSettings(Promise promise) {
        this.permissionServiceAPI.navigateToApplicationDetailsSettings(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void registerForRemoteNotifications(Promise promise) {
        this.permissionServiceAPI.registerForRemoteNotifications(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestBackgroundLocationPermission(Promise promise) {
        this.permissionServiceAPI.requestBackgroundLocationPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestBluetoothLocationPermission(Promise promise) {
        this.permissionServiceAPI.requestBluetoothLocationPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestBluetoothPermission(Promise promise) {
        this.permissionServiceAPI.requestBluetoothPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestCameraPermission(Promise promise) {
        this.permissionServiceAPI.requestCameraPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestFullScreenIntentPermission(Promise promise) {
        this.permissionServiceAPI.requestFullScreenIntentPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestLocationPermission(Promise promise) {
        this.permissionServiceAPI.requestLocationPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestLocationPermissionAlways(Promise promise) {
        this.permissionServiceAPI.requestLocationPermissionAlways(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestLocationPermissionWhenInUse(Promise promise) {
        this.permissionServiceAPI.requestLocationPermissionWhenInUse(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestMicrophonePermission(Promise promise) {
        this.permissionServiceAPI.requestMicrophonePermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestNearbyWifiDevicesPermission(Promise promise) {
        this.permissionServiceAPI.requestNearbyWifiDevicesPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        this.permissionServiceAPI.requestPermission(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestPermissionsForAccessorySetup(Promise promise) {
        this.permissionServiceAPI.requestPermissionsForAccessorySetup(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestScheduleExactAlarmPermission(Promise promise) {
        this.permissionServiceAPI.requestScheduleExactAlarmPermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestTemporaryFullAccuracyAuthorization(Promise promise) {
        this.permissionServiceAPI.requestTemporaryFullAccuracyAuthorization(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void requestWifiEnable(Promise promise) {
        this.permissionServiceAPI.requestWifiEnable(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        this.permissionServiceAPI.shouldShowRequestPermissionRationale(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePermissionServiceSpec
    @ReactMethod
    public void unregisterForRemoteNotifications(Promise promise) {
        this.permissionServiceAPI.unregisterForRemoteNotifications(promise);
    }
}
