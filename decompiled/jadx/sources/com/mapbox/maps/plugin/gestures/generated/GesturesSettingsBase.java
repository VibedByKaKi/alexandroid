package com.mapbox.maps.plugin.gestures.generated;

import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010N\u001a\u00020OH$J\b\u0010P\u001a\u00020\u001bH\u0016J!\u0010Q\u001a\u00020O2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020O0S¢\u0006\u0002\bUH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u0018\u0010\u001a\u001a\u00020\u001bX¤\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR$\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR$\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR$\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR$\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR$\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR$\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR$\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR$\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR*\u0010D\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR$\u0010I\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020H8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006V"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsBase;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsInterface;", "()V", "value", "", "doubleTapToZoomInEnabled", "getDoubleTapToZoomInEnabled", "()Z", "setDoubleTapToZoomInEnabled", "(Z)V", "doubleTouchToZoomOutEnabled", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "Lcom/mapbox/maps/ScreenCoordinate;", "focalPoint", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "increasePinchToZoomThresholdWhenRotating", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "increaseRotateThresholdWhenPinchingToZoom", "getIncreaseRotateThresholdWhenPinchingToZoom$annotations", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "internalSettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;)V", "pinchScrollEnabled", "getPinchScrollEnabled", "setPinchScrollEnabled", "pinchToZoomDecelerationEnabled", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "pinchToZoomEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "pitchEnabled", "getPitchEnabled", "setPitchEnabled", "quickZoomEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "rotateDecelerationEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "rotateEnabled", "getRotateEnabled", "setRotateEnabled", "scrollDecelerationEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", ReactProperties.SCROLL_ENABLED, "getScrollEnabled", "setScrollEnabled", "Lcom/mapbox/maps/plugin/ScrollMode;", "scrollMode", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "simultaneousRotateAndPinchToZoomEnabled", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "useNativeFlingDeceleration", "getUseNativeFlingDeceleration$annotations", "getUseNativeFlingDeceleration", "setUseNativeFlingDeceleration", "", "zoomAnimationAmount", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", "applySettings", "", "getSettings", "updateSettings", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class GesturesSettingsBase implements GesturesSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getDoubleTapToZoomInEnabled() {
        return getInternalSettings().getDoubleTapToZoomInEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getDoubleTouchToZoomOutEnabled() {
        return getInternalSettings().getDoubleTouchToZoomOutEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    @Nullable
    public ScreenCoordinate getFocalPoint() {
        return getInternalSettings().getFocalPoint();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getIncreasePinchToZoomThresholdWhenRotating() {
        return getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
        return getInternalSettings().getIncreaseRotateThresholdWhenPinchingToZoom();
    }

    @NotNull
    public abstract GesturesSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchScrollEnabled() {
        return getInternalSettings().getPinchScrollEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchToZoomDecelerationEnabled() {
        return getInternalSettings().getPinchToZoomDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchToZoomEnabled() {
        return getInternalSettings().getPinchToZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPitchEnabled() {
        return getInternalSettings().getPitchEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getQuickZoomEnabled() {
        return getInternalSettings().getQuickZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getRotateDecelerationEnabled() {
        return getInternalSettings().getRotateDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getRotateEnabled() {
        return getInternalSettings().getRotateEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getScrollDecelerationEnabled() {
        return getInternalSettings().getScrollDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getScrollEnabled() {
        return getInternalSettings().getScrollEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    @NotNull
    public ScrollMode getScrollMode() {
        return getInternalSettings().getScrollMode();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    @NotNull
    public GesturesSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getSimultaneousRotateAndPinchToZoomEnabled() {
        return getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getUseNativeFlingDeceleration() {
        return getInternalSettings().getUseNativeFlingDeceleration();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public float getZoomAnimationAmount() {
        return getInternalSettings().getZoomAnimationAmount();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setDoubleTapToZoomInEnabled(boolean z) {
        if (getInternalSettings().getDoubleTapToZoomInEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setDoubleTapToZoomInEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setDoubleTouchToZoomOutEnabled(boolean z) {
        if (getInternalSettings().getDoubleTouchToZoomOutEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setDoubleTouchToZoomOutEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setFocalPoint(@Nullable ScreenCoordinate screenCoordinate) {
        if (Intrinsics.areEqual(getInternalSettings().getFocalPoint(), screenCoordinate)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setFocalPoint(screenCoordinate).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setIncreasePinchToZoomThresholdWhenRotating(boolean z) {
        if (getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setIncreasePinchToZoomThresholdWhenRotating(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setIncreaseRotateThresholdWhenPinchingToZoom(boolean z) {
        if (getInternalSettings().getIncreaseRotateThresholdWhenPinchingToZoom() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setIncreaseRotateThresholdWhenPinchingToZoom(z).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(@NotNull GesturesSettings gesturesSettings);

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchScrollEnabled(boolean z) {
        if (getInternalSettings().getPinchScrollEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchScrollEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchToZoomDecelerationEnabled(boolean z) {
        if (getInternalSettings().getPinchToZoomDecelerationEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchToZoomDecelerationEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchToZoomEnabled(boolean z) {
        if (getInternalSettings().getPinchToZoomEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchToZoomEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPitchEnabled(boolean z) {
        if (getInternalSettings().getPitchEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setPitchEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setQuickZoomEnabled(boolean z) {
        if (getInternalSettings().getQuickZoomEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setQuickZoomEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setRotateDecelerationEnabled(boolean z) {
        if (getInternalSettings().getRotateDecelerationEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setRotateDecelerationEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setRotateEnabled(boolean z) {
        if (getInternalSettings().getRotateEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setRotateEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollDecelerationEnabled(boolean z) {
        if (getInternalSettings().getScrollDecelerationEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollDecelerationEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollEnabled(boolean z) {
        if (getInternalSettings().getScrollEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollMode(@NotNull ScrollMode scrollMode) {
        scrollMode.getClass();
        if (getInternalSettings().getScrollMode() != scrollMode) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollMode(scrollMode).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setSimultaneousRotateAndPinchToZoomEnabled(boolean z) {
        if (getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setSimultaneousRotateAndPinchToZoomEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setUseNativeFlingDeceleration(boolean z) {
        if (getInternalSettings().getUseNativeFlingDeceleration() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setUseNativeFlingDeceleration(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setZoomAnimationAmount(float f) {
        if (getInternalSettings().getZoomAnimationAmount() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setZoomAnimationAmount(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void updateSettings(@NotNull Function1<? super GesturesSettings.Builder, Unit> block) {
        block.getClass();
        GesturesSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }

    @Deprecated(message = "This property has no effect")
    public static /* synthetic */ void getIncreaseRotateThresholdWhenPinchingToZoom$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getUseNativeFlingDeceleration$annotations() {
    }
}
