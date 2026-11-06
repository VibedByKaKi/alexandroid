package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TextUsageOptions {

    @NonNull
    public LocalizedTextPreference roadNumber;

    @NonNull
    public LocalizedTextPreference signpostDirection;

    @NonNull
    public LocalizedTextPreference streetName;

    public TextUsageOptions() {
        LocalizedTextPreference localizedTextPreference = LocalizedTextPreference.USE_ALWAYS;
        this.streetName = localizedTextPreference;
        this.roadNumber = localizedTextPreference;
        this.signpostDirection = localizedTextPreference;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextUsageOptions)) {
            return false;
        }
        TextUsageOptions textUsageOptions = (TextUsageOptions) obj;
        return Objects.equals(this.streetName, textUsageOptions.streetName) && Objects.equals(this.roadNumber, textUsageOptions.roadNumber) && Objects.equals(this.signpostDirection, textUsageOptions.signpostDirection);
    }

    public int hashCode() {
        LocalizedTextPreference localizedTextPreference = this.streetName;
        int hashCode = (JfifUtil.MARKER_EOI + (localizedTextPreference != null ? localizedTextPreference.hashCode() : 0)) * 31;
        LocalizedTextPreference localizedTextPreference2 = this.roadNumber;
        int hashCode2 = (hashCode + (localizedTextPreference2 != null ? localizedTextPreference2.hashCode() : 0)) * 31;
        LocalizedTextPreference localizedTextPreference3 = this.signpostDirection;
        return hashCode2 + (localizedTextPreference3 != null ? localizedTextPreference3.hashCode() : 0);
    }
}
