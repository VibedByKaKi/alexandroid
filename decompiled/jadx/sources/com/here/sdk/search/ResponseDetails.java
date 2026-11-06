package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ResponseDetails {

    @NonNull
    public String correlationId;

    @NonNull
    public String requestId;

    public ResponseDetails(@NonNull String str, @NonNull String str2) {
        this.correlationId = str;
        this.requestId = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseDetails)) {
            return false;
        }
        ResponseDetails responseDetails = (ResponseDetails) obj;
        return Objects.equals(this.correlationId, responseDetails.correlationId) && Objects.equals(this.requestId, responseDetails.requestId);
    }

    public int hashCode() {
        String str = this.correlationId;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.requestId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
