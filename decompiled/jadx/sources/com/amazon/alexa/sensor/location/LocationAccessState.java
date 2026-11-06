package com.amazon.alexa.sensor.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LocationAccessState {
    public final boolean backgroundLocationGranted;
    public final boolean coarseLocationGranted;
    public final boolean fineLocationGranted;
    public final boolean googlePlayServicesAvailable;
    public final boolean locationHardwareAvailable;
    public final boolean locationServicesEnabled;
    public final boolean playServicesResolvableByUser;

    public LocationAccessState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.fineLocationGranted = z;
        this.coarseLocationGranted = z2;
        this.backgroundLocationGranted = z3;
        this.locationServicesEnabled = z4;
        this.googlePlayServicesAvailable = z5;
        this.playServicesResolvableByUser = z6;
        this.locationHardwareAvailable = z7;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationAccessState)) {
            return false;
        }
        LocationAccessState locationAccessState = (LocationAccessState) obj;
        return this.fineLocationGranted == locationAccessState.fineLocationGranted && this.coarseLocationGranted == locationAccessState.coarseLocationGranted && this.backgroundLocationGranted == locationAccessState.backgroundLocationGranted && this.locationServicesEnabled == locationAccessState.locationServicesEnabled && this.googlePlayServicesAvailable == locationAccessState.googlePlayServicesAvailable && this.playServicesResolvableByUser == locationAccessState.playServicesResolvableByUser && this.locationHardwareAvailable == locationAccessState.locationHardwareAvailable;
    }

    public int hashCode() {
        return ((((((((((((this.fineLocationGranted ? 1 : 0) * 31) + (this.coarseLocationGranted ? 1 : 0)) * 31) + (this.backgroundLocationGranted ? 1 : 0)) * 31) + (this.locationServicesEnabled ? 1 : 0)) * 31) + (this.googlePlayServicesAvailable ? 1 : 0)) * 31) + (this.playServicesResolvableByUser ? 1 : 0)) * 31) + (this.locationHardwareAvailable ? 1 : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationAccessState{fine=");
        sb.append(this.fineLocationGranted);
        sb.append(", coarse=");
        sb.append(this.coarseLocationGranted);
        sb.append(", background=");
        sb.append(this.backgroundLocationGranted);
        sb.append(", locationServices=");
        sb.append(this.locationServicesEnabled);
        sb.append(", playServices=");
        sb.append(this.googlePlayServicesAvailable);
        sb.append(", playServicesFixable=");
        sb.append(this.playServicesResolvableByUser);
        sb.append(", hardware=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.locationHardwareAvailable, AbstractJsonLexerKt.END_OBJ);
    }
}
