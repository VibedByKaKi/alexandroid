package com.mapbox.maps.plugin.locationcomponent.generated;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00016Bu\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020\rH\u0016J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001c¨\u00067"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "Landroid/os/Parcelable;", "enabled", "", "pulsingEnabled", "pulsingColor", "", "pulsingMaxRadius", "", "showAccuracyRing", "accuracyRingColor", "accuracyRingBorderColor", "layerAbove", "", "layerBelow", "puckBearingEnabled", "puckBearing", "Lcom/mapbox/maps/plugin/PuckBearing;", "slot", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "(ZZIFZIILjava/lang/String;Ljava/lang/String;ZLcom/mapbox/maps/plugin/PuckBearing;Ljava/lang/String;Lcom/mapbox/maps/plugin/LocationPuck;)V", "getAccuracyRingBorderColor", "()I", "getAccuracyRingColor", "getEnabled", "()Z", "getLayerAbove", "()Ljava/lang/String;", "getLayerBelow", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "getPuckBearingEnabled", "getPulsingColor", "getPulsingEnabled", "getPulsingMaxRadius", "()F", "getShowAccuracyRing", "getSlot", "describeContents", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationComponentSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocationComponentSettings> CREATOR = new Creator();
    private final int accuracyRingBorderColor;
    private final int accuracyRingColor;
    private final boolean enabled;

    @Nullable
    private final String layerAbove;

    @Nullable
    private final String layerBelow;

    @NotNull
    private final LocationPuck locationPuck;

    @NotNull
    private final PuckBearing puckBearing;
    private final boolean puckBearingEnabled;
    private final int pulsingColor;
    private final boolean pulsingEnabled;
    private final float pulsingMaxRadius;
    private final boolean showAccuracyRing;

    @Nullable
    private final String slot;

    private LocationComponentSettings(boolean z, boolean z2, int i, float f, boolean z3, int i2, int i3, String str, String str2, boolean z4, PuckBearing puckBearing, String str3, LocationPuck locationPuck) {
        this.enabled = z;
        this.pulsingEnabled = z2;
        this.pulsingColor = i;
        this.pulsingMaxRadius = f;
        this.showAccuracyRing = z3;
        this.accuracyRingColor = i2;
        this.accuracyRingBorderColor = i3;
        this.layerAbove = str;
        this.layerBelow = str2;
        this.puckBearingEnabled = z4;
        this.puckBearing = puckBearing;
        this.slot = str3;
        this.locationPuck = locationPuck;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(LocationComponentSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        LocationComponentSettings locationComponentSettings = (LocationComponentSettings) other;
        return this.enabled == locationComponentSettings.enabled && this.pulsingEnabled == locationComponentSettings.pulsingEnabled && this.pulsingColor == locationComponentSettings.pulsingColor && Float.compare(this.pulsingMaxRadius, locationComponentSettings.pulsingMaxRadius) == 0 && this.showAccuracyRing == locationComponentSettings.showAccuracyRing && this.accuracyRingColor == locationComponentSettings.accuracyRingColor && this.accuracyRingBorderColor == locationComponentSettings.accuracyRingBorderColor && Intrinsics.areEqual(this.layerAbove, locationComponentSettings.layerAbove) && Intrinsics.areEqual(this.layerBelow, locationComponentSettings.layerBelow) && this.puckBearingEnabled == locationComponentSettings.puckBearingEnabled && this.puckBearing == locationComponentSettings.puckBearing && Intrinsics.areEqual(this.slot, locationComponentSettings.slot) && Intrinsics.areEqual(this.locationPuck, locationComponentSettings.locationPuck);
    }

    public final int getAccuracyRingBorderColor() {
        return this.accuracyRingBorderColor;
    }

    public final int getAccuracyRingColor() {
        return this.accuracyRingColor;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getLayerAbove() {
        return this.layerAbove;
    }

    @Nullable
    public final String getLayerBelow() {
        return this.layerBelow;
    }

    @NotNull
    public final LocationPuck getLocationPuck() {
        return this.locationPuck;
    }

    @NotNull
    public final PuckBearing getPuckBearing() {
        return this.puckBearing;
    }

    public final boolean getPuckBearingEnabled() {
        return this.puckBearingEnabled;
    }

    public final int getPulsingColor() {
        return this.pulsingColor;
    }

    public final boolean getPulsingEnabled() {
        return this.pulsingEnabled;
    }

    public final float getPulsingMaxRadius() {
        return this.pulsingMaxRadius;
    }

    public final boolean getShowAccuracyRing() {
        return this.showAccuracyRing;
    }

    @Nullable
    public final String getSlot() {
        return this.slot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Boolean.valueOf(this.pulsingEnabled), Integer.valueOf(this.pulsingColor), Float.valueOf(this.pulsingMaxRadius), Boolean.valueOf(this.showAccuracyRing), Integer.valueOf(this.accuracyRingColor), Integer.valueOf(this.accuracyRingBorderColor), this.layerAbove, this.layerBelow, Boolean.valueOf(this.puckBearingEnabled), this.puckBearing, this.slot, this.locationPuck);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this.locationPuck).setEnabled(this.enabled).setPulsingEnabled(this.pulsingEnabled).setPulsingColor(this.pulsingColor).setPulsingMaxRadius(this.pulsingMaxRadius).setShowAccuracyRing(this.showAccuracyRing).setAccuracyRingColor(this.accuracyRingColor).setAccuracyRingBorderColor(this.accuracyRingBorderColor).setLayerAbove(this.layerAbove).setLayerBelow(this.layerBelow).setPuckBearingEnabled(this.puckBearingEnabled).setPuckBearing(this.puckBearing).setSlot(this.slot).setLocationPuck(this.locationPuck);
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("LocationComponentSettings(enabled=" + this.enabled + ",\n      pulsingEnabled=" + this.pulsingEnabled + ", pulsingColor=" + this.pulsingColor + ",\n      pulsingMaxRadius=" + this.pulsingMaxRadius + ", showAccuracyRing=" + this.showAccuracyRing + ",\n      accuracyRingColor=" + this.accuracyRingColor + ", accuracyRingBorderColor=" + this.accuracyRingBorderColor + ",\n      layerAbove=" + this.layerAbove + ", layerBelow=" + this.layerBelow + ", puckBearingEnabled=" + this.puckBearingEnabled + ",\n      puckBearing=" + this.puckBearing + ", slot=" + this.slot + ", locationPuck=" + this.locationPuck + ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.pulsingEnabled ? 1 : 0);
        parcel.writeInt(this.pulsingColor);
        parcel.writeFloat(this.pulsingMaxRadius);
        parcel.writeInt(this.showAccuracyRing ? 1 : 0);
        parcel.writeInt(this.accuracyRingColor);
        parcel.writeInt(this.accuracyRingBorderColor);
        parcel.writeString(this.layerAbove);
        parcel.writeString(this.layerBelow);
        parcel.writeInt(this.puckBearingEnabled ? 1 : 0);
        parcel.writeString(this.puckBearing.name());
        parcel.writeString(this.slot);
        parcel.writeParcelable(this.locationPuck, flags);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010<\u001a\u00020=J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000fJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000fJ\u000e\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u000200J\u000e\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000fJ\u0010\u0010;\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0015R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0004R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u000200@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R(\u00109\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001a¨\u0006>"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "<set-?>", "", "accuracyRingBorderColor", "getAccuracyRingBorderColor", "()I", "setAccuracyRingBorderColor", "(I)V", "accuracyRingColor", "getAccuracyRingColor", "setAccuracyRingColor", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "layerAbove", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "layerBelow", "getLayerBelow", "setLayerBelow", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "Lcom/mapbox/maps/plugin/PuckBearing;", "puckBearing", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "puckBearingEnabled", "getPuckBearingEnabled", "setPuckBearingEnabled", "pulsingColor", "getPulsingColor", "setPulsingColor", "pulsingEnabled", "getPulsingEnabled", "setPulsingEnabled", "", "pulsingMaxRadius", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "showAccuracyRing", "getShowAccuracyRing", "setShowAccuracyRing", "slot", "getSlot", "setSlot", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private int accuracyRingBorderColor;
        private int accuracyRingColor;
        private boolean enabled;

        @Nullable
        private String layerAbove;

        @Nullable
        private String layerBelow;

        @NotNull
        private LocationPuck locationPuck;

        @NotNull
        private PuckBearing puckBearing;
        private boolean puckBearingEnabled;
        private int pulsingColor;
        private boolean pulsingEnabled;
        private float pulsingMaxRadius;
        private boolean showAccuracyRing;

        @Nullable
        private String slot;

        public Builder(@NotNull LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
            this.pulsingColor = Color.parseColor("#4A90E2");
            this.pulsingMaxRadius = 10.0f;
            this.accuracyRingColor = Color.parseColor("#4d89cff0");
            this.accuracyRingBorderColor = Color.parseColor("#4d89cff0");
            this.puckBearing = PuckBearing.HEADING;
        }

        @NotNull
        public final LocationComponentSettings build() {
            return new LocationComponentSettings(this.enabled, this.pulsingEnabled, this.pulsingColor, this.pulsingMaxRadius, this.showAccuracyRing, this.accuracyRingColor, this.accuracyRingBorderColor, this.layerAbove, this.layerBelow, this.puckBearingEnabled, this.puckBearing, this.slot, this.locationPuck, null);
        }

        public final int getAccuracyRingBorderColor() {
            return this.accuracyRingBorderColor;
        }

        public final int getAccuracyRingColor() {
            return this.accuracyRingColor;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        public final String getLayerAbove() {
            return this.layerAbove;
        }

        @Nullable
        public final String getLayerBelow() {
            return this.layerBelow;
        }

        @NotNull
        public final LocationPuck getLocationPuck() {
            return this.locationPuck;
        }

        @NotNull
        public final PuckBearing getPuckBearing() {
            return this.puckBearing;
        }

        public final boolean getPuckBearingEnabled() {
            return this.puckBearingEnabled;
        }

        public final int getPulsingColor() {
            return this.pulsingColor;
        }

        public final boolean getPulsingEnabled() {
            return this.pulsingEnabled;
        }

        public final float getPulsingMaxRadius() {
            return this.pulsingMaxRadius;
        }

        public final boolean getShowAccuracyRing() {
            return this.showAccuracyRing;
        }

        @Nullable
        public final String getSlot() {
            return this.slot;
        }

        /* renamed from: setAccuracyRingBorderColor, reason: collision with other method in class */
        public final /* synthetic */ void m24828setAccuracyRingBorderColor(int i) {
            this.accuracyRingBorderColor = i;
        }

        /* renamed from: setAccuracyRingColor, reason: collision with other method in class */
        public final /* synthetic */ void m24829setAccuracyRingColor(int i) {
            this.accuracyRingColor = i;
        }

        /* renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24830setEnabled(boolean z) {
            this.enabled = z;
        }

        /* renamed from: setLayerAbove, reason: collision with other method in class */
        public final /* synthetic */ void m24831setLayerAbove(String str) {
            this.layerAbove = str;
        }

        /* renamed from: setLayerBelow, reason: collision with other method in class */
        public final /* synthetic */ void m24832setLayerBelow(String str) {
            this.layerBelow = str;
        }

        /* renamed from: setLocationPuck, reason: collision with other method in class */
        public final /* synthetic */ void m24833setLocationPuck(LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
        }

        /* renamed from: setPuckBearing, reason: collision with other method in class */
        public final /* synthetic */ void m24834setPuckBearing(PuckBearing puckBearing) {
            puckBearing.getClass();
            this.puckBearing = puckBearing;
        }

        /* renamed from: setPuckBearingEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24835setPuckBearingEnabled(boolean z) {
            this.puckBearingEnabled = z;
        }

        /* renamed from: setPulsingColor, reason: collision with other method in class */
        public final /* synthetic */ void m24836setPulsingColor(int i) {
            this.pulsingColor = i;
        }

        /* renamed from: setPulsingEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24837setPulsingEnabled(boolean z) {
            this.pulsingEnabled = z;
        }

        /* renamed from: setPulsingMaxRadius, reason: collision with other method in class */
        public final /* synthetic */ void m24838setPulsingMaxRadius(float f) {
            this.pulsingMaxRadius = f;
        }

        /* renamed from: setShowAccuracyRing, reason: collision with other method in class */
        public final /* synthetic */ void m24839setShowAccuracyRing(boolean z) {
            this.showAccuracyRing = z;
        }

        /* renamed from: setSlot, reason: collision with other method in class */
        public final /* synthetic */ void m24840setSlot(String str) {
            this.slot = str;
        }

        @NotNull
        public final Builder setAccuracyRingBorderColor(int accuracyRingBorderColor) {
            this.accuracyRingBorderColor = accuracyRingBorderColor;
            return this;
        }

        @NotNull
        public final Builder setAccuracyRingColor(int accuracyRingColor) {
            this.accuracyRingColor = accuracyRingColor;
            return this;
        }

        @NotNull
        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @NotNull
        public final Builder setLayerAbove(@Nullable String layerAbove) {
            this.layerAbove = layerAbove;
            return this;
        }

        @NotNull
        public final Builder setLayerBelow(@Nullable String layerBelow) {
            this.layerBelow = layerBelow;
            return this;
        }

        @NotNull
        public final Builder setPuckBearingEnabled(boolean puckBearingEnabled) {
            this.puckBearingEnabled = puckBearingEnabled;
            return this;
        }

        @NotNull
        public final Builder setPulsingColor(int pulsingColor) {
            this.pulsingColor = pulsingColor;
            return this;
        }

        @NotNull
        public final Builder setPulsingEnabled(boolean pulsingEnabled) {
            this.pulsingEnabled = pulsingEnabled;
            return this;
        }

        @NotNull
        public final Builder setPulsingMaxRadius(float pulsingMaxRadius) {
            this.pulsingMaxRadius = pulsingMaxRadius;
            return this;
        }

        @NotNull
        public final Builder setShowAccuracyRing(boolean showAccuracyRing) {
            this.showAccuracyRing = showAccuracyRing;
            return this;
        }

        @NotNull
        public final Builder setSlot(@Nullable String slot) {
            this.slot = slot;
            return this;
        }

        @NotNull
        public final Builder setLocationPuck(@NotNull LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
            return this;
        }

        @NotNull
        public final Builder setPuckBearing(@NotNull PuckBearing puckBearing) {
            puckBearing.getClass();
            this.puckBearing = puckBearing;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationComponentSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocationComponentSettings createFromParcel(@NotNull Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            parcel.getClass();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            int readInt = parcel.readInt();
            boolean z6 = z2;
            float readFloat = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = z6;
            } else {
                z3 = z6;
                z6 = z;
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            boolean z7 = z3;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                z7 = z;
            }
            return new LocationComponentSettings(z4, z5, readInt, readFloat, z6, readInt2, readInt3, readString, readString2, z7, PuckBearing.valueOf(parcel.readString()), parcel.readString(), (LocationPuck) parcel.readParcelable(LocationComponentSettings.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocationComponentSettings[] newArray(int i) {
            return new LocationComponentSettings[i];
        }
    }

    public /* synthetic */ LocationComponentSettings(boolean z, boolean z2, int i, float f, boolean z3, int i2, int i3, String str, String str2, boolean z4, PuckBearing puckBearing, String str3, LocationPuck locationPuck, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, f, z3, i2, i3, str, str2, z4, puckBearing, str3, locationPuck);
    }
}
