package com.amazon.alexa.handsfree.audio.metrics.wakeword;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WakeWordMobilyticsMetadata {
    private final String mWWModelID;
    private final int mWakeWordConfidence;

    public WakeWordMobilyticsMetadata(@Nullable String str, int i) {
        this.mWWModelID = str;
        this.mWakeWordConfidence = i;
    }

    public String getWWModelID() {
        return Objects.toString(this.mWWModelID, "");
    }

    public String getWakeWordConfidence() {
        return String.valueOf(this.mWakeWordConfidence);
    }

    public int getWakeWordConfidenceInt() {
        return this.mWakeWordConfidence;
    }
}
