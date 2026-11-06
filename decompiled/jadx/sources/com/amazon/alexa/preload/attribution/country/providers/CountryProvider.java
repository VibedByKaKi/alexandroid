package com.amazon.alexa.preload.attribution.country.providers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class CountryProvider {
    private final boolean mShouldUseSourceAsRegionCode;
    private final String mSourceId;

    public CountryProvider(@NonNull String str, boolean z) {
        this.mSourceId = str;
        this.mShouldUseSourceAsRegionCode = z;
    }

    @Nullable
    public abstract String getCountryCode();

    public String getSourceId() {
        return this.mSourceId;
    }

    public boolean shouldUseSourceAsRegionId() {
        return this.mShouldUseSourceAsRegionCode;
    }
}
