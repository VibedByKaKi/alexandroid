package com.facebook.common.memory;

import com.facebook.infer.annotation.Nullsafe;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public enum MemoryTrimType {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackgroundLowSeverity(1.0d),
    OnSystemModerateMemory(0.5d),
    OnAppBackgrounded(1.0d),
    OnJavaMemoryRed(1.0d),
    OnJavaMemoryYellow(0.5d),
    OnSystemMemoryRed(1.0d),
    OnSystemMemoryYellow(0.5d);

    private double mSuggestedTrimRatio;

    MemoryTrimType(double d) {
        this.mSuggestedTrimRatio = d;
    }

    public static MemoryTrimType fromInt(int i) {
        for (MemoryTrimType memoryTrimType : values()) {
            if (memoryTrimType.ordinal() == i) {
                return memoryTrimType;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown type: "));
        return null;
    }

    public double getSuggestedTrimRatio() {
        return this.mSuggestedTrimRatio;
    }
}
