package com.mapbox.maps.plugin.scalebar;

import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/ScaleBar;", "", "distancePerPixel", "", "getDistancePerPixel", "()F", "setDistancePerPixel", "(F)V", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "mapViewWidth", "getMapViewWidth", "setMapViewWidth", "pixelRatio", "getPixelRatio", "setPixelRatio", "settings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setSettings", "(Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;)V", "useContinuousRendering", "getUseContinuousRendering", "setUseContinuousRendering", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ScaleBar {
    float getDistancePerPixel();

    boolean getEnable();

    float getMapViewWidth();

    float getPixelRatio();

    @NotNull
    ScaleBarSettings getSettings();

    boolean getUseContinuousRendering();

    void setDistancePerPixel(float f);

    void setEnable(boolean z);

    void setMapViewWidth(float f);

    void setPixelRatio(float f);

    void setSettings(@NotNull ScaleBarSettings scaleBarSettings);

    void setUseContinuousRendering(boolean z);
}
