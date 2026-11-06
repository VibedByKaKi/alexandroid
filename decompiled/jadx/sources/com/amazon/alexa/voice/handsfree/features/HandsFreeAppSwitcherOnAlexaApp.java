package com.amazon.alexa.voice.handsfree.features;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeAppSwitcher;
import com.amazon.alexa.handsfree.protocols.features.HostAppIndex;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HandsFreeAppSwitcherOnAlexaApp implements HandsFreeAppSwitcher {
    private static final int POSITION_OF_ALEXA_APP = HostAppIndex.ALEXA_APP_INDEX.getHostAppIndex();
    private final DeviceInformation mDeviceInformation;

    public HandsFreeAppSwitcherOnAlexaApp(@NonNull Context context) {
        this(DeviceTypeInformationProvider.getInstance(context).getSupportedDeviceInformation(context));
    }

    @Override // com.amazon.alexa.handsfree.protocols.features.HandsFreeAppSwitcher
    @Nullable
    public String getWeblab() {
        List<String> weblabList = this.mDeviceInformation.getWeblabList();
        if (weblabList == null) {
            return null;
        }
        int size = weblabList.size();
        int i = POSITION_OF_ALEXA_APP;
        if (size <= i || weblabList.get(i) == null || weblabList.get(i).equals("")) {
            return null;
        }
        return weblabList.get(i);
    }

    @VisibleForTesting
    public HandsFreeAppSwitcherOnAlexaApp(@NonNull DeviceInformation deviceInformation) {
        this.mDeviceInformation = deviceInformation;
    }
}
