package com.here.sdk.routing;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LocalizedText;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SignpostLabel {

    @Nullable
    public LocalizedText localizedText = null;

    @Nullable
    public LocalizedRoadNumber localizedRoadNumber = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignpostLabel)) {
            return false;
        }
        SignpostLabel signpostLabel = (SignpostLabel) obj;
        return Objects.equals(this.localizedText, signpostLabel.localizedText) && Objects.equals(this.localizedRoadNumber, signpostLabel.localizedRoadNumber);
    }

    public int hashCode() {
        LocalizedText localizedText = this.localizedText;
        int hashCode = (JfifUtil.MARKER_EOI + (localizedText != null ? localizedText.hashCode() : 0)) * 31;
        LocalizedRoadNumber localizedRoadNumber = this.localizedRoadNumber;
        return hashCode + (localizedRoadNumber != null ? localizedRoadNumber.hashCode() : 0);
    }
}
