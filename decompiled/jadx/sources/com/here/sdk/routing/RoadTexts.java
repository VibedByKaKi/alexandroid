package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LocalizedTexts;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RoadTexts {

    @NonNull
    public LocalizedTexts names = new LocalizedTexts();

    @NonNull
    public LocalizedRoadNumbers numbersWithDirection = new LocalizedRoadNumbers();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoadTexts)) {
            return false;
        }
        RoadTexts roadTexts = (RoadTexts) obj;
        return Objects.equals(this.names, roadTexts.names) && Objects.equals(this.numbersWithDirection, roadTexts.numbersWithDirection);
    }

    public int hashCode() {
        LocalizedTexts localizedTexts = this.names;
        int hashCode = (JfifUtil.MARKER_EOI + (localizedTexts != null ? localizedTexts.hashCode() : 0)) * 31;
        LocalizedRoadNumbers localizedRoadNumbers = this.numbersWithDirection;
        return hashCode + (localizedRoadNumbers != null ? localizedRoadNumbers.hashCode() : 0);
    }
}
