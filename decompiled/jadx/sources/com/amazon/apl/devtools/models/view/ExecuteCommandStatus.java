package com.amazon.apl.devtools.models.view;

import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.constants.FeatureServiceMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ExecuteCommandStatus {
    COMPLETED(FeatureServiceMetrics.EventType.PREFETCH_COMPLETED),
    TERMINATED("terminated");

    private final String mStatus;

    ExecuteCommandStatus(String str) {
        this.mStatus = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mStatus;
    }
}
