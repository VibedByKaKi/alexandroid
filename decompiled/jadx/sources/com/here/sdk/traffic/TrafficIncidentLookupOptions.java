package com.here.sdk.traffic;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LanguageCode;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficIncidentLookupOptions {

    @Nullable
    public LanguageCode languageCode = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrafficIncidentLookupOptions) {
            return Objects.equals(this.languageCode, ((TrafficIncidentLookupOptions) obj).languageCode);
        }
        return false;
    }

    public int hashCode() {
        LanguageCode languageCode = this.languageCode;
        return JfifUtil.MARKER_EOI + (languageCode != null ? languageCode.hashCode() : 0);
    }
}
