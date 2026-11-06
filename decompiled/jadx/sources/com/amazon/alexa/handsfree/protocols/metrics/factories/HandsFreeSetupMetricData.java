package com.amazon.alexa.handsfree.protocols.metrics.factories;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HandsFreeSetupMetricData {
    private final String mActionType;
    private final String mComponent;
    private final String mEventType;
    private final String mPageType;
    private final String mSubPageType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum SubPageType {
        NONE
    }

    public HandsFreeSetupMetricData(@NonNull Enum r1, @NonNull Enum r2, @NonNull Enum r3, @NonNull Enum r4, @NonNull Enum r5) {
        this.mActionType = r1.name();
        this.mEventType = r2.name();
        this.mComponent = r3.name();
        this.mPageType = r4.name();
        this.mSubPageType = r5.name();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HandsFreeSetupMetricData handsFreeSetupMetricData = (HandsFreeSetupMetricData) obj;
            if (handsFreeSetupMetricData.mActionType.equals(this.mActionType) && handsFreeSetupMetricData.mComponent.equals(this.mComponent) && handsFreeSetupMetricData.mEventType.equals(this.mEventType) && handsFreeSetupMetricData.mPageType.equals(this.mPageType) && handsFreeSetupMetricData.mSubPageType.equals(this.mSubPageType)) {
                return true;
            }
        }
        return false;
    }

    public String getActionType() {
        return this.mActionType;
    }

    public String getComponent() {
        return this.mComponent;
    }

    public String getEventType() {
        return this.mEventType;
    }

    public String getPageType() {
        return this.mPageType;
    }

    public String getSubPageType() {
        return this.mSubPageType;
    }

    public int hashCode() {
        return Objects.hash(this.mActionType, this.mComponent, this.mEventType, this.mPageType, this.mSubPageType);
    }

    public HandsFreeSetupMetricData(@NonNull Enum r7, @NonNull Enum r8, @NonNull Enum r9, @NonNull Enum r10) {
        this(r7, r8, r9, r10, SubPageType.NONE);
    }
}
