package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AuthenticationData {

    @NonNull
    public String token = "";

    @NonNull
    public Duration expiryTime = Duration.ofSeconds(0);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthenticationData)) {
            return false;
        }
        AuthenticationData authenticationData = (AuthenticationData) obj;
        return Objects.equals(this.token, authenticationData.token) && Objects.equals(this.expiryTime, authenticationData.expiryTime);
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        Duration duration = this.expiryTime;
        return hashCode + (duration != null ? duration.hashCode() : 0);
    }
}
