package com.mapbox.maps.plugin.scalebar.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010U\u001a\u00020VH$J\b\u0010W\u001a\u00020\u001aH\u0016J!\u0010X\u001a\u00020V2\u0017\u0010Y\u001a\u0013\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020V0Z¢\u0006\u0002\b\\H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u0018\u0010\u0019\u001a\u00020\u001aX¤\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b \u0010\u0002\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b!\u0010\u0015R$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR$\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR$\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR$\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR$\u0010;\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020:8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010@\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u00101\"\u0004\bB\u00103R$\u0010C\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R$\u0010F\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR$\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR$\u0010L\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u00101\"\u0004\bN\u00103R$\u0010O\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR$\u0010R\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0013\"\u0004\bT\u0010\u0015¨\u0006]"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsBase;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsInterface;", "()V", "value", "", ViewProps.BORDER_WIDTH, "getBorderWidth", "()F", "setBorderWidth", "(F)V", "Lcom/mapbox/maps/plugin/DistanceUnits;", "distanceUnits", "getDistanceUnits", "()Lcom/mapbox/maps/plugin/DistanceUnits;", "setDistanceUnits", "(Lcom/mapbox/maps/plugin/DistanceUnits;)V", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "height", "getHeight", "setHeight", "internalSettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;)V", "isMetricUnits", "isMetricUnits$annotations", "setMetricUnits", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "setMarginBottom", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "", "position", "getPosition", "()I", "setPosition", "(I)V", "primaryColor", "getPrimaryColor", "setPrimaryColor", "ratio", "getRatio", "setRatio", "", "refreshInterval", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "secondaryColor", "getSecondaryColor", "setSecondaryColor", "showTextBorder", "getShowTextBorder", "setShowTextBorder", "textBarMargin", "getTextBarMargin", "setTextBarMargin", "textBorderWidth", "getTextBorderWidth", "setTextBorderWidth", Common.TEXT_COLOR, "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "useContinuousRendering", "getUseContinuousRendering", "setUseContinuousRendering", "applySettings", "", "getSettings", "updateSettings", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ScaleBarSettingsBase implements ScaleBarSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getBorderWidth() {
        return getInternalSettings().getBorderWidth();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    @NotNull
    public DistanceUnits getDistanceUnits() {
        return getInternalSettings().getDistanceUnits();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getHeight() {
        return getInternalSettings().getHeight();
    }

    @NotNull
    public abstract ScaleBarSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getPrimaryColor() {
        return getInternalSettings().getPrimaryColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getRatio() {
        return getInternalSettings().getRatio();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public long getRefreshInterval() {
        return getInternalSettings().getRefreshInterval();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getSecondaryColor() {
        return getInternalSettings().getSecondaryColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    @NotNull
    public ScaleBarSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getShowTextBorder() {
        return getInternalSettings().getShowTextBorder();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextBarMargin() {
        return getInternalSettings().getTextBarMargin();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextBorderWidth() {
        return getInternalSettings().getTextBorderWidth();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getTextColor() {
        return getInternalSettings().getTextColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextSize() {
        return getInternalSettings().getTextSize();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getUseContinuousRendering() {
        return getInternalSettings().getUseContinuousRendering();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean isMetricUnits() {
        return getInternalSettings().getIsMetricUnits();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setBorderWidth(float f) {
        if (getInternalSettings().getBorderWidth() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setBorderWidth(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setDistanceUnits(@NotNull DistanceUnits distanceUnits) {
        distanceUnits.getClass();
        if (Intrinsics.areEqual(getInternalSettings().getDistanceUnits(), distanceUnits) && getInternalSettings().getIsMetricUnits() == Intrinsics.areEqual(distanceUnits, DistanceUnits.METRIC)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setDistanceUnits(distanceUnits).setIsMetricUnits(Intrinsics.areEqual(distanceUnits, DistanceUnits.METRIC)).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setEnabled(boolean z) {
        if (getInternalSettings().getEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setHeight(float f) {
        if (getInternalSettings().getHeight() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setHeight(f).build());
        applySettings();
    }

    public abstract void setInternalSettings(@NotNull ScaleBarSettings scaleBarSettings);

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginBottom(float f) {
        if (getInternalSettings().getMarginBottom() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginLeft(float f) {
        if (getInternalSettings().getMarginLeft() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginRight(float f) {
        if (getInternalSettings().getMarginRight() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginTop(float f) {
        if (getInternalSettings().getMarginTop() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMetricUnits(boolean z) {
        DistanceUnits distanceUnits = z ? DistanceUnits.METRIC : DistanceUnits.IMPERIAL;
        if (getInternalSettings().getIsMetricUnits() == z && Intrinsics.areEqual(getInternalSettings().getDistanceUnits(), distanceUnits)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setIsMetricUnits(z).setDistanceUnits(distanceUnits).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setPosition(int i) {
        if (getInternalSettings().getPosition() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setPrimaryColor(int i) {
        if (getInternalSettings().getPrimaryColor() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setPrimaryColor(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setRatio(float f) {
        if (getInternalSettings().getRatio() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setRatio(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setRefreshInterval(long j) {
        if (getInternalSettings().getRefreshInterval() != j) {
            setInternalSettings(getInternalSettings().toBuilder().setRefreshInterval(j).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setSecondaryColor(int i) {
        if (getInternalSettings().getSecondaryColor() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setSecondaryColor(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setShowTextBorder(boolean z) {
        if (getInternalSettings().getShowTextBorder() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setShowTextBorder(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextBarMargin(float f) {
        if (getInternalSettings().getTextBarMargin() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextBarMargin(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextBorderWidth(float f) {
        if (getInternalSettings().getTextBorderWidth() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextBorderWidth(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextColor(int i) {
        if (getInternalSettings().getTextColor() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setTextColor(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextSize(float f) {
        if (getInternalSettings().getTextSize() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextSize(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setUseContinuousRendering(boolean z) {
        if (getInternalSettings().getUseContinuousRendering() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setUseContinuousRendering(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void updateSettings(@NotNull Function1<? super ScaleBarSettings.Builder, Unit> block) {
        block.getClass();
        ScaleBarSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        ScaleBarSettings internalSettings = getInternalSettings();
        if (!Intrinsics.areEqual(builder.getDistanceUnits(), internalSettings.getDistanceUnits())) {
            builder.setMetricUnits(Intrinsics.areEqual(builder.getDistanceUnits(), DistanceUnits.METRIC));
        } else if (builder.getIsMetricUnits() != internalSettings.getIsMetricUnits()) {
            builder.m24850setDistanceUnits(builder.getIsMetricUnits() ? DistanceUnits.METRIC : DistanceUnits.IMPERIAL);
        }
        ScaleBarSettings build = builder.build();
        setEnabled(build.getEnabled());
        setInternalSettings(build);
        applySettings();
    }

    @Deprecated(message = "Use distanceUnits instead.")
    public static /* synthetic */ void isMetricUnits$annotations() {
    }
}
