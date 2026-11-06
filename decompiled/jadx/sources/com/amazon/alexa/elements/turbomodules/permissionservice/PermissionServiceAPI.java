package com.amazon.alexa.elements.turbomodules.permissionservice;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface PermissionServiceAPI {
    void getBackgroundLocationPermissionStatus(Promise promise);

    void getLocationAccuracyStatus(Promise promise);

    void getLocationPermissionStatus(Promise promise);

    void getLocationPermissionsStatus(Promise promise);

    void getNetworkStatus(Promise promise);

    void getPermissionStatus(String str, Promise promise);

    void getUserLocationStatus(Promise promise);

    void hasFullScreenIntentPermission(Promise promise);

    void hasLocationPermission(Promise promise);

    void hasScheduleExactAlarmPermission(Promise promise);

    void hasUserSeenNotificationPermissions(Promise promise);

    void havePermissionsForAccessorySetup(Promise promise);

    void locationEventWasReceived();

    void navigateToApplicationDetailsSettings(Promise promise);

    void registerForRemoteNotifications(Promise promise);

    void requestBackgroundLocationPermission(Promise promise);

    void requestBluetoothLocationPermission(Promise promise);

    void requestBluetoothPermission(Promise promise);

    void requestCameraPermission(Promise promise);

    void requestFullScreenIntentPermission(Promise promise);

    void requestLocationPermission(Promise promise);

    void requestLocationPermissionAlways(Promise promise);

    void requestLocationPermissionWhenInUse(Promise promise);

    void requestMicrophonePermission(Promise promise);

    void requestNearbyWifiDevicesPermission(Promise promise);

    void requestPermission(String str, Promise promise);

    void requestPermissionsForAccessorySetup(Promise promise);

    void requestScheduleExactAlarmPermission(Promise promise);

    void requestTemporaryFullAccuracyAuthorization(Promise promise);

    void requestWifiEnable(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void shouldShowRequestPermissionRationale(String str, Promise promise);

    void unregisterForRemoteNotifications(Promise promise);
}
