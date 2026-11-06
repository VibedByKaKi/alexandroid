package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommunicationDeviceProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceChangeListener {
        void onDeviceChanged();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DeviceType {
        BT_SCO_HEADSET,
        BT_SCO_SPEAKER,
        WIRED_HEADSET,
        BUILTIN_SPEAKER,
        NONE
    }

    void captureState();

    void clearDevice();

    List<DeviceType> getAvailableDevices();

    DeviceType getCurrentDevice();

    void registerDeviceChangeListener(DeviceChangeListener deviceChangeListener, Handler handler);

    void restoreDevice();

    boolean selectDevice(DeviceType deviceType);

    void unregisterDeviceChangeListener();
}
