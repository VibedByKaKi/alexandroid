package com.mapbox.maps;

import com.amazon.appmanager.lib.Constants;
import com.amazon.coral.profiler.ProfilerCategory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum RequestErrorType {
    SUCCESS("Success"),
    NOT_FOUND(Constants.NOT_FOUND),
    SERVER("Server"),
    CONNECTION("Connection"),
    RATE_LIMIT("RateLimit"),
    IN_OFFLINE_MODE("InOfflineMode"),
    OTHER(ProfilerCategory.OTHER);

    private String str;

    RequestErrorType(String str) {
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
