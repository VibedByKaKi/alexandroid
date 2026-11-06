package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SessionTimeout implements Serializable {

    @NonNull
    @SerializedName("isEligibleForExtension")
    private final boolean isEligibleForExtension;

    @NonNull
    @SerializedName("timeoutInMilliseconds")
    private final int timeoutInMilliseconds;

    public SessionTimeout(int i, boolean z) {
        this.timeoutInMilliseconds = i;
        this.isEligibleForExtension = z;
    }

    public int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public boolean isEligibleForExtension() {
        return this.isEligibleForExtension;
    }
}
