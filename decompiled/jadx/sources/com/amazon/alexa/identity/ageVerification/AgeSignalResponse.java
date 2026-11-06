package com.amazon.alexa.identity.ageVerification;

import androidx.annotation.Nullable;
import com.google.android.play.agesignals.AgeSignalsResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class AgeSignalResponse {

    @Nullable
    public final Integer ageLower;

    @Nullable
    public final Integer ageUpper;

    @Nullable
    public final Integer userStatus;

    public AgeSignalResponse(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.userStatus = num;
        this.ageLower = num2;
        this.ageUpper = num3;
    }

    public static AgeSignalResponse fromAgeSignalsResult(@Nullable AgeSignalsResult ageSignalsResult) {
        return ageSignalsResult == null ? new AgeSignalResponse(null, null, null) : new AgeSignalResponse(ageSignalsResult.userStatus(), ageSignalsResult.ageLower(), ageSignalsResult.ageUpper());
    }

    @Nullable
    public Integer getAgeLower() {
        return this.ageLower;
    }

    @Nullable
    public Integer getAgeUpper() {
        return this.ageUpper;
    }

    @Nullable
    public Integer getUserStatus() {
        return this.userStatus;
    }
}
