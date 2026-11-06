package com.amazon.alexa.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class LocationNetworkServiceConfig {

    @NonNull
    private final String authToken;

    @NonNull
    private final String buildStage;

    @Nullable
    private final String personId;

    @NonNull
    private final String preferredMarketplace;

    public LocationNetworkServiceConfig(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        this.authToken = str;
        this.buildStage = str2;
        this.preferredMarketplace = str3;
        this.personId = str4;
    }

    @NonNull
    public String getAuthToken() {
        return this.authToken;
    }

    @NonNull
    public String getBuildStage() {
        return this.buildStage;
    }

    @Nullable
    public String getPersonId() {
        return this.personId;
    }

    @NonNull
    public String getPreferredMarketplace() {
        return this.preferredMarketplace;
    }
}
