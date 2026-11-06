package com.mapbox.common;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum TelemetryCollectionState {
    ENABLED("Enabled"),
    TURNSTILE_EVENTS_ONLY("TurnstileEventsOnly"),
    UNKNOWN("Unknown"),
    BACKGROUND_LOCATIONS_DISABLED("BackgroundLocationsDisabled");

    private String str;

    TelemetryCollectionState(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
