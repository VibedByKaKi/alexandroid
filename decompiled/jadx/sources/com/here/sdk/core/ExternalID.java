package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ExternalID {

    @NonNull
    public String source = "";

    @NonNull
    public String id = "";

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalID)) {
            return false;
        }
        ExternalID externalID = (ExternalID) obj;
        return Objects.equals(this.source, externalID.source) && Objects.equals(this.id, externalID.id);
    }

    public int hashCode() {
        String str = this.source;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
