package com.amazon.alexa.handsfree.protocols.uservoicerecognition.api;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UVRContract {
    private final UVREnroller mEnroller;
    private final UVRTuningSettings mTuningSettings;
    private final UVRConnector mUVRConnector;
    private final UVRVendorSettings mVendorSettings;

    public UVRContract(@NonNull UVREnroller uVREnroller, @NonNull UVRTuningSettings uVRTuningSettings, @NonNull UVRVendorSettings uVRVendorSettings, @NonNull UVRConnector uVRConnector) {
        Objects.requireNonNull(uVREnroller, "UVR Enroller must not be null.");
        this.mEnroller = uVREnroller;
        Objects.requireNonNull(uVRTuningSettings, "UVR Tuning Settings must not be null.");
        this.mTuningSettings = uVRTuningSettings;
        Objects.requireNonNull(uVRVendorSettings, "UVR Vendor Settings must not be null.");
        this.mVendorSettings = uVRVendorSettings;
        Objects.requireNonNull(uVRConnector, "UVR Connector must not be null.");
        this.mUVRConnector = uVRConnector;
    }

    @NonNull
    public UVREnroller getEnroller() {
        return this.mEnroller;
    }

    @NonNull
    public UVRTuningSettings getTuningSettings() {
        return this.mTuningSettings;
    }

    @NonNull
    public UVRConnector getUVRConnector() {
        return this.mUVRConnector;
    }

    @NonNull
    public UVRVendorSettings getVendorSettings() {
        return this.mVendorSettings;
    }
}
