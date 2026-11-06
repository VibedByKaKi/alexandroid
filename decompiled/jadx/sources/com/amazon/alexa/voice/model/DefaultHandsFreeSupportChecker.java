package com.amazon.alexa.voice.model;

import android.content.Context;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.voice.wakeword.AbiCompatibilityInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultHandsFreeSupportChecker implements HandsFreeSupportChecker {
    private final AbiCompatibilityInterface abiCompatibilityInterface;
    private final boolean isAmpdHandsFreeDevice;

    public DefaultHandsFreeSupportChecker(Context context, AbiCompatibilityInterface abiCompatibilityInterface) {
        this.isAmpdHandsFreeDevice = AMPDInformationProvider.getInstance(context).isAMPDDevice();
        this.abiCompatibilityInterface = abiCompatibilityInterface;
    }

    @Override // com.amazon.alexa.voice.model.HandsFreeSupportChecker
    public boolean isHandsfreeSupported() {
        return !this.isAmpdHandsFreeDevice && this.abiCompatibilityInterface.isCompatible();
    }
}
