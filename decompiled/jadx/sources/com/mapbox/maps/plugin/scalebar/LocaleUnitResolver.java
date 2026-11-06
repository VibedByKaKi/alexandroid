package com.mapbox.maps.plugin.scalebar;

import com.mapbox.maps.plugin.DistanceUnits;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/LocaleUnitResolver;", "", "()V", "distanceUnits", "Lcom/mapbox/maps/plugin/DistanceUnits;", "getDistanceUnits", "()Lcom/mapbox/maps/plugin/DistanceUnits;", "isMetricSystem", "", "()Z", "ImperialCountryCode", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class LocaleUnitResolver {

    @NotNull
    public static final LocaleUnitResolver INSTANCE = new LocaleUnitResolver();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/LocaleUnitResolver$ImperialCountryCode;", "", "()V", "LIBERIA", "", "MYANMAR", "US", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImperialCountryCode {

        @NotNull
        public static final ImperialCountryCode INSTANCE = new ImperialCountryCode();

        @NotNull
        public static final String LIBERIA = "LR";

        @NotNull
        public static final String MYANMAR = "MM";

        @NotNull
        public static final String US = "US";

        private ImperialCountryCode() {
        }
    }

    private LocaleUnitResolver() {
    }

    @NotNull
    public final DistanceUnits getDistanceUnits() {
        return isMetricSystem() ? DistanceUnits.METRIC : DistanceUnits.IMPERIAL;
    }

    public final boolean isMetricSystem() {
        String country = Locale.getDefault().getCountry();
        country.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = country.toUpperCase(locale);
        upperCase.getClass();
        int hashCode = upperCase.hashCode();
        return hashCode != 2438 ? hashCode != 2464 ? (hashCode == 2718 && upperCase.equals("US")) ? false : true : !upperCase.equals(ImperialCountryCode.MYANMAR) : !upperCase.equals(ImperialCountryCode.LIBERIA);
    }
}
