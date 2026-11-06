package com.amazon.alexa.elements.turbomodules.systeminfo;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SystemInfoAPI {
    void addListener(String str);

    void connectToBTClassic(String str, String str2, Promise promise);

    void getAvailableMapApps(Promise promise);

    void getBluetoothPermission(Promise promise);

    void getBluetoothStatus(Promise promise);

    default Map<String, Object> getConstants() {
        return Collections.EMPTY_MAP;
    }

    void getIsiOSVersionAtLeast(String str, String str2, Promise promise);

    void navigateToBluetoothSettings(Promise promise);

    void pauseTestSound(Promise promise);

    void playTestSound(Promise promise);

    void removeListeners(double d);

    void setDefaultLatency(double d, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setTestSoundLooping(boolean z);

    void showBluetoothAccessoryPicker(String str, Promise promise);

    void showBluetoothAccessoryPickerForResult(String str, Promise promise);

    void startCalibration(Promise promise);

    void stopCalibration(Promise promise);
}
