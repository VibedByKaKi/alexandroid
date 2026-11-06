package com.amazon.clouddrive.cdasdk.dps;

import androidx.annotation.NonNull;
import com.amazon.clouddrive.cdasdk.dps.collections.DPSCollectionsCalls;
import com.amazon.clouddrive.cdasdk.dps.devices.DPSDevicesCalls;
import com.amazon.clouddrive.cdasdk.dps.event.DPSEventCalls;
import com.amazon.clouddrive.cdasdk.dps.settings.DPSSettingsCalls;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DPSCalls {
    @NonNull
    DPSCollectionsCalls getCollectionCalls();

    @NonNull
    DPSDevicesCalls getDevicesCalls();

    @NonNull
    DPSEventCalls getEventCalls();

    @NonNull
    DPSSettingsCalls getSettingsCalls();
}
