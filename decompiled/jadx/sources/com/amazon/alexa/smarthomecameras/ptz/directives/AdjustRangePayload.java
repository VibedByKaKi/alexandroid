package com.amazon.alexa.smarthomecameras.ptz.directives;

import com.amazon.alexa.smarthomecameras.directives.AlexaPayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AdjustRangePayload implements AlexaPayload {
    private final long rangeValueDelta;
    private final boolean rangeValueDeltaDefault;

    private AdjustRangePayload(long j, boolean z) {
        this.rangeValueDelta = j;
        this.rangeValueDeltaDefault = z;
    }

    public static AdjustRangePayload create(long j) {
        return new AdjustRangePayload(j, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdjustRangePayload adjustRangePayload = (AdjustRangePayload) obj;
            if (this.rangeValueDelta == adjustRangePayload.rangeValueDelta && this.rangeValueDeltaDefault == adjustRangePayload.rangeValueDeltaDefault) {
                return true;
            }
        }
        return false;
    }

    public long getRangeValueDelta() {
        return this.rangeValueDelta;
    }

    public boolean getRangeValueDeltaDefault() {
        return this.rangeValueDeltaDefault;
    }
}
