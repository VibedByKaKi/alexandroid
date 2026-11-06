package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LanguageCode;
import com.here.sdk.core.UnitSystem;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RouteTextOptions {

    @NonNull
    public LanguageCode language = LanguageCode.EN_US;

    @NonNull
    public UnitSystem unitSystem = UnitSystem.METRIC;

    @NonNull
    public TextUsageOptions textUsageOptions = new TextUsageOptions();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RouteTextOptions)) {
            return false;
        }
        RouteTextOptions routeTextOptions = (RouteTextOptions) obj;
        return Objects.equals(this.language, routeTextOptions.language) && Objects.equals(this.unitSystem, routeTextOptions.unitSystem) && Objects.equals(this.textUsageOptions, routeTextOptions.textUsageOptions);
    }

    public int hashCode() {
        LanguageCode languageCode = this.language;
        int hashCode = (JfifUtil.MARKER_EOI + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        UnitSystem unitSystem = this.unitSystem;
        int hashCode2 = (hashCode + (unitSystem != null ? unitSystem.hashCode() : 0)) * 31;
        TextUsageOptions textUsageOptions = this.textUsageOptions;
        return hashCode2 + (textUsageOptions != null ? textUsageOptions.hashCode() : 0);
    }
}
