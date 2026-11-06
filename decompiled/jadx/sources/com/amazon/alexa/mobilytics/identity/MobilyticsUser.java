package com.amazon.alexa.mobilytics.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.common.metrics.MetricKeys;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsUser {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Attribute {
        HASHED_COMMS_ID(MetricKeys.META_HASHED_COMMS_ID),
        HOUSEHOLD_ID("householdId");

        private String id;

        Attribute(String str) {
            this.id = str;
        }

        public String id() {
            return this.id;
        }
    }

    @Nullable
    String attribute(Attribute attribute);

    @Nullable
    default String countryOfResidence() {
        return "Unknown";
    }

    @Nullable
    String directedId();

    default String getTreatmentForExperiment(@NonNull String str) {
        return "C";
    }

    default boolean hasAccessToExperiment(@NonNull String str) {
        return false;
    }

    default boolean hasAccessToFeatureAndExperimentWithRecordTrigger(@NonNull String str, @NonNull String str2) {
        return false;
    }

    boolean hasFeature(@NonNull String str);

    default boolean isChildProfile() {
        return false;
    }

    @Nullable
    String marketplaceId();

    @Nullable
    String personId();

    @Nullable
    default String personIdv2() {
        return "Unknown";
    }
}
