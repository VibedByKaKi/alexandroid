package com.mapbox.maps.plugin.locationcomponent.generated;

import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010;\u001a\u00020<H&J!\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020>0@¢\u0006\u0002\bBH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0018\u0010\u001a\u001a\u00020\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u00020!X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u0018\u0010/\u001a\u000200X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R\u001a\u00108\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016¨\u0006C"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsInterface;", "", "accuracyRingBorderColor", "", "getAccuracyRingBorderColor", "()I", "setAccuracyRingBorderColor", "(I)V", "accuracyRingColor", "getAccuracyRingColor", "setAccuracyRingColor", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "layerAbove", "", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "layerBelow", "getLayerBelow", "setLayerBelow", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "puckBearing", "Lcom/mapbox/maps/plugin/PuckBearing;", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "puckBearingEnabled", "getPuckBearingEnabled", "setPuckBearingEnabled", "pulsingColor", "getPulsingColor", "setPulsingColor", "pulsingEnabled", "getPulsingEnabled", "setPulsingEnabled", "pulsingMaxRadius", "", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "showAccuracyRing", "getShowAccuracyRing", "setShowAccuracyRing", "slot", "getSlot", "setSlot", "getSettings", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "updateSettings", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface LocationComponentSettingsInterface {
    int getAccuracyRingBorderColor();

    int getAccuracyRingColor();

    boolean getEnabled();

    @Nullable
    String getLayerAbove();

    @Nullable
    String getLayerBelow();

    @NotNull
    LocationPuck getLocationPuck();

    @NotNull
    PuckBearing getPuckBearing();

    boolean getPuckBearingEnabled();

    int getPulsingColor();

    boolean getPulsingEnabled();

    float getPulsingMaxRadius();

    @NotNull
    LocationComponentSettings getSettings();

    boolean getShowAccuracyRing();

    @Nullable
    String getSlot();

    void setAccuracyRingBorderColor(int i);

    void setAccuracyRingColor(int i);

    void setEnabled(boolean z);

    void setLayerAbove(@Nullable String str);

    void setLayerBelow(@Nullable String str);

    void setLocationPuck(@NotNull LocationPuck locationPuck);

    void setPuckBearing(@NotNull PuckBearing puckBearing);

    void setPuckBearingEnabled(boolean z);

    void setPulsingColor(int i);

    void setPulsingEnabled(boolean z);

    void setPulsingMaxRadius(float f);

    void setShowAccuracyRing(boolean z);

    void setSlot(@Nullable String str);

    void updateSettings(@NotNull Function1<? super LocationComponentSettings.Builder, Unit> block);
}
