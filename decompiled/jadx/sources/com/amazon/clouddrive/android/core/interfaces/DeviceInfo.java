package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DeviceInfo {
    @NonNull
    String getCantileverOSName();

    @NonNull
    String getDeviceClass();

    @WorkerThread
    String getDeviceId();

    @NonNull
    String getDeviceModel();

    @Nullable
    @WorkerThread
    String getDeviceName();

    @NonNull
    String getDevicePlatform();

    @NonNull
    @WorkerThread
    String getDeviceSerialNumber();

    String getDeviceTypeId();

    @NonNull
    String getDeviceVersion();

    boolean isAtLeastAPI(int i);

    boolean isInPowerSaverMode();

    boolean isSignOutAllowed();

    boolean isTelephonyServiceAvailable();
}
