package com.mapbox.maps.plugin.gestures.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001AB\u0099\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u00102\u001a\u000203HÖ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00107\u001a\u000203H\u0016J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020;H\u0016J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000203HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010 \u001a\u0004\b/\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006B"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "Landroid/os/Parcelable;", "rotateEnabled", "", "pinchToZoomEnabled", ReactProperties.SCROLL_ENABLED, "simultaneousRotateAndPinchToZoomEnabled", "pitchEnabled", "scrollMode", "Lcom/mapbox/maps/plugin/ScrollMode;", "doubleTapToZoomInEnabled", "doubleTouchToZoomOutEnabled", "quickZoomEnabled", "focalPoint", "Lcom/mapbox/maps/ScreenCoordinate;", "pinchToZoomDecelerationEnabled", "rotateDecelerationEnabled", "scrollDecelerationEnabled", "increaseRotateThresholdWhenPinchingToZoom", "increasePinchToZoomThresholdWhenRotating", "zoomAnimationAmount", "", "pinchScrollEnabled", "useNativeFlingDeceleration", "(ZZZZZLcom/mapbox/maps/plugin/ScrollMode;ZZZLcom/mapbox/maps/ScreenCoordinate;ZZZZZFZZ)V", "getDoubleTapToZoomInEnabled", "()Z", "getDoubleTouchToZoomOutEnabled", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "getIncreasePinchToZoomThresholdWhenRotating", "getIncreaseRotateThresholdWhenPinchingToZoom$annotations", "()V", "getIncreaseRotateThresholdWhenPinchingToZoom", "getPinchScrollEnabled", "getPinchToZoomDecelerationEnabled", "getPinchToZoomEnabled", "getPitchEnabled", "getQuickZoomEnabled", "getRotateDecelerationEnabled", "getRotateEnabled", "getScrollDecelerationEnabled", "getScrollEnabled", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "getSimultaneousRotateAndPinchToZoomEnabled", "getUseNativeFlingDeceleration$annotations", "getUseNativeFlingDeceleration", "getZoomAnimationAmount", "()F", "describeContents", "", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class GesturesSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GesturesSettings> CREATOR = new Creator();
    private final boolean doubleTapToZoomInEnabled;
    private final boolean doubleTouchToZoomOutEnabled;

    @Nullable
    private final ScreenCoordinate focalPoint;
    private final boolean increasePinchToZoomThresholdWhenRotating;
    private final boolean increaseRotateThresholdWhenPinchingToZoom;
    private final boolean pinchScrollEnabled;
    private final boolean pinchToZoomDecelerationEnabled;
    private final boolean pinchToZoomEnabled;
    private final boolean pitchEnabled;
    private final boolean quickZoomEnabled;
    private final boolean rotateDecelerationEnabled;
    private final boolean rotateEnabled;
    private final boolean scrollDecelerationEnabled;
    private final boolean scrollEnabled;

    @NotNull
    private final ScrollMode scrollMode;
    private final boolean simultaneousRotateAndPinchToZoomEnabled;
    private final boolean useNativeFlingDeceleration;
    private final float zoomAnimationAmount;

    private GesturesSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ScrollMode scrollMode, boolean z6, boolean z7, boolean z8, ScreenCoordinate screenCoordinate, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, float f, boolean z14, boolean z15) {
        this.rotateEnabled = z;
        this.pinchToZoomEnabled = z2;
        this.scrollEnabled = z3;
        this.simultaneousRotateAndPinchToZoomEnabled = z4;
        this.pitchEnabled = z5;
        this.scrollMode = scrollMode;
        this.doubleTapToZoomInEnabled = z6;
        this.doubleTouchToZoomOutEnabled = z7;
        this.quickZoomEnabled = z8;
        this.focalPoint = screenCoordinate;
        this.pinchToZoomDecelerationEnabled = z9;
        this.rotateDecelerationEnabled = z10;
        this.scrollDecelerationEnabled = z11;
        this.increaseRotateThresholdWhenPinchingToZoom = z12;
        this.increasePinchToZoomThresholdWhenRotating = z13;
        this.zoomAnimationAmount = f;
        this.pinchScrollEnabled = z14;
        this.useNativeFlingDeceleration = z15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(GesturesSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        GesturesSettings gesturesSettings = (GesturesSettings) other;
        return this.rotateEnabled == gesturesSettings.rotateEnabled && this.pinchToZoomEnabled == gesturesSettings.pinchToZoomEnabled && this.scrollEnabled == gesturesSettings.scrollEnabled && this.simultaneousRotateAndPinchToZoomEnabled == gesturesSettings.simultaneousRotateAndPinchToZoomEnabled && this.pitchEnabled == gesturesSettings.pitchEnabled && this.scrollMode == gesturesSettings.scrollMode && this.doubleTapToZoomInEnabled == gesturesSettings.doubleTapToZoomInEnabled && this.doubleTouchToZoomOutEnabled == gesturesSettings.doubleTouchToZoomOutEnabled && this.quickZoomEnabled == gesturesSettings.quickZoomEnabled && Intrinsics.areEqual(this.focalPoint, gesturesSettings.focalPoint) && this.pinchToZoomDecelerationEnabled == gesturesSettings.pinchToZoomDecelerationEnabled && this.rotateDecelerationEnabled == gesturesSettings.rotateDecelerationEnabled && this.scrollDecelerationEnabled == gesturesSettings.scrollDecelerationEnabled && this.increaseRotateThresholdWhenPinchingToZoom == gesturesSettings.increaseRotateThresholdWhenPinchingToZoom && this.increasePinchToZoomThresholdWhenRotating == gesturesSettings.increasePinchToZoomThresholdWhenRotating && Float.compare(this.zoomAnimationAmount, gesturesSettings.zoomAnimationAmount) == 0 && this.pinchScrollEnabled == gesturesSettings.pinchScrollEnabled && this.useNativeFlingDeceleration == gesturesSettings.useNativeFlingDeceleration;
    }

    public final boolean getDoubleTapToZoomInEnabled() {
        return this.doubleTapToZoomInEnabled;
    }

    public final boolean getDoubleTouchToZoomOutEnabled() {
        return this.doubleTouchToZoomOutEnabled;
    }

    @Nullable
    public final ScreenCoordinate getFocalPoint() {
        return this.focalPoint;
    }

    public final boolean getIncreasePinchToZoomThresholdWhenRotating() {
        return this.increasePinchToZoomThresholdWhenRotating;
    }

    public final boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
        return this.increaseRotateThresholdWhenPinchingToZoom;
    }

    public final boolean getPinchScrollEnabled() {
        return this.pinchScrollEnabled;
    }

    public final boolean getPinchToZoomDecelerationEnabled() {
        return this.pinchToZoomDecelerationEnabled;
    }

    public final boolean getPinchToZoomEnabled() {
        return this.pinchToZoomEnabled;
    }

    public final boolean getPitchEnabled() {
        return this.pitchEnabled;
    }

    public final boolean getQuickZoomEnabled() {
        return this.quickZoomEnabled;
    }

    public final boolean getRotateDecelerationEnabled() {
        return this.rotateDecelerationEnabled;
    }

    public final boolean getRotateEnabled() {
        return this.rotateEnabled;
    }

    public final boolean getScrollDecelerationEnabled() {
        return this.scrollDecelerationEnabled;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    @NotNull
    public final ScrollMode getScrollMode() {
        return this.scrollMode;
    }

    public final boolean getSimultaneousRotateAndPinchToZoomEnabled() {
        return this.simultaneousRotateAndPinchToZoomEnabled;
    }

    public final boolean getUseNativeFlingDeceleration() {
        return this.useNativeFlingDeceleration;
    }

    public final float getZoomAnimationAmount() {
        return this.zoomAnimationAmount;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.rotateEnabled), Boolean.valueOf(this.pinchToZoomEnabled), Boolean.valueOf(this.scrollEnabled), Boolean.valueOf(this.simultaneousRotateAndPinchToZoomEnabled), Boolean.valueOf(this.pitchEnabled), this.scrollMode, Boolean.valueOf(this.doubleTapToZoomInEnabled), Boolean.valueOf(this.doubleTouchToZoomOutEnabled), Boolean.valueOf(this.quickZoomEnabled), this.focalPoint, Boolean.valueOf(this.pinchToZoomDecelerationEnabled), Boolean.valueOf(this.rotateDecelerationEnabled), Boolean.valueOf(this.scrollDecelerationEnabled), Boolean.valueOf(this.increaseRotateThresholdWhenPinchingToZoom), Boolean.valueOf(this.increasePinchToZoomThresholdWhenRotating), Float.valueOf(this.zoomAnimationAmount), Boolean.valueOf(this.pinchScrollEnabled), Boolean.valueOf(this.useNativeFlingDeceleration));
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setRotateEnabled(this.rotateEnabled).setPinchToZoomEnabled(this.pinchToZoomEnabled).setScrollEnabled(this.scrollEnabled).setSimultaneousRotateAndPinchToZoomEnabled(this.simultaneousRotateAndPinchToZoomEnabled).setPitchEnabled(this.pitchEnabled).setScrollMode(this.scrollMode).setDoubleTapToZoomInEnabled(this.doubleTapToZoomInEnabled).setDoubleTouchToZoomOutEnabled(this.doubleTouchToZoomOutEnabled).setQuickZoomEnabled(this.quickZoomEnabled).setFocalPoint(this.focalPoint).setPinchToZoomDecelerationEnabled(this.pinchToZoomDecelerationEnabled).setRotateDecelerationEnabled(this.rotateDecelerationEnabled).setScrollDecelerationEnabled(this.scrollDecelerationEnabled).setIncreaseRotateThresholdWhenPinchingToZoom(this.increaseRotateThresholdWhenPinchingToZoom).setIncreasePinchToZoomThresholdWhenRotating(this.increasePinchToZoomThresholdWhenRotating).setZoomAnimationAmount(this.zoomAnimationAmount).setPinchScrollEnabled(this.pinchScrollEnabled).setUseNativeFlingDeceleration(this.useNativeFlingDeceleration);
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("GesturesSettings(rotateEnabled=" + this.rotateEnabled + ",\n      pinchToZoomEnabled=" + this.pinchToZoomEnabled + ", scrollEnabled=" + this.scrollEnabled + ",\n      simultaneousRotateAndPinchToZoomEnabled=" + this.simultaneousRotateAndPinchToZoomEnabled + ",\n      pitchEnabled=" + this.pitchEnabled + ", scrollMode=" + this.scrollMode + ",\n      doubleTapToZoomInEnabled=" + this.doubleTapToZoomInEnabled + ",\n      doubleTouchToZoomOutEnabled=" + this.doubleTouchToZoomOutEnabled + ", quickZoomEnabled=" + this.quickZoomEnabled + ",\n      focalPoint=" + this.focalPoint + ", pinchToZoomDecelerationEnabled=" + this.pinchToZoomDecelerationEnabled + ",\n      rotateDecelerationEnabled=" + this.rotateDecelerationEnabled + ",\n      scrollDecelerationEnabled=" + this.scrollDecelerationEnabled + ",\n      increaseRotateThresholdWhenPinchingToZoom=" + this.increaseRotateThresholdWhenPinchingToZoom + ",\n      increasePinchToZoomThresholdWhenRotating=" + this.increasePinchToZoomThresholdWhenRotating + ",\n      zoomAnimationAmount=" + this.zoomAnimationAmount + ", pinchScrollEnabled=" + this.pinchScrollEnabled + ",\n      useNativeFlingDeceleration=" + this.useNativeFlingDeceleration + ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.rotateEnabled ? 1 : 0);
        parcel.writeInt(this.pinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.scrollEnabled ? 1 : 0);
        parcel.writeInt(this.simultaneousRotateAndPinchToZoomEnabled ? 1 : 0);
        parcel.writeInt(this.pitchEnabled ? 1 : 0);
        parcel.writeString(this.scrollMode.name());
        parcel.writeInt(this.doubleTapToZoomInEnabled ? 1 : 0);
        parcel.writeInt(this.doubleTouchToZoomOutEnabled ? 1 : 0);
        parcel.writeInt(this.quickZoomEnabled ? 1 : 0);
        parcel.writeSerializable(this.focalPoint);
        parcel.writeInt(this.pinchToZoomDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.rotateDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.scrollDecelerationEnabled ? 1 : 0);
        parcel.writeInt(this.increaseRotateThresholdWhenPinchingToZoom ? 1 : 0);
        parcel.writeInt(this.increasePinchToZoomThresholdWhenRotating ? 1 : 0);
        parcel.writeFloat(this.zoomAnimationAmount);
        parcel.writeInt(this.pinchScrollEnabled ? 1 : 0);
        parcel.writeInt(this.useNativeFlingDeceleration ? 1 : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010H\u001a\u00020IJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0004J\u000e\u00109\u001a\u00020\u00002\u0006\u00106\u001a\u000205J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004H\u0007J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR,\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR$\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR$\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR$\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR$\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR$\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR$\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR$\u00106\u001a\u0002052\u0006\u0010\u0003\u001a\u000205@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR,\u0010>\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR$\u0010C\u001a\u00020B2\u0006\u0010\u0003\u001a\u00020B@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "", "()V", "<set-?>", "", "doubleTapToZoomInEnabled", "getDoubleTapToZoomInEnabled", "()Z", "setDoubleTapToZoomInEnabled", "(Z)V", "doubleTouchToZoomOutEnabled", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "Lcom/mapbox/maps/ScreenCoordinate;", "focalPoint", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "increasePinchToZoomThresholdWhenRotating", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "increaseRotateThresholdWhenPinchingToZoom", "getIncreaseRotateThresholdWhenPinchingToZoom$annotations", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "pinchScrollEnabled", "getPinchScrollEnabled", "setPinchScrollEnabled", "pinchToZoomDecelerationEnabled", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "pinchToZoomEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "pitchEnabled", "getPitchEnabled", "setPitchEnabled", "quickZoomEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "rotateDecelerationEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "rotateEnabled", "getRotateEnabled", "setRotateEnabled", "scrollDecelerationEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", ReactProperties.SCROLL_ENABLED, "getScrollEnabled", "setScrollEnabled", "Lcom/mapbox/maps/plugin/ScrollMode;", "scrollMode", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "simultaneousRotateAndPinchToZoomEnabled", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "useNativeFlingDeceleration", "getUseNativeFlingDeceleration$annotations", "getUseNativeFlingDeceleration", "setUseNativeFlingDeceleration", "", "zoomAnimationAmount", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private ScreenCoordinate focalPoint;
        private boolean useNativeFlingDeceleration;
        private boolean rotateEnabled = true;
        private boolean pinchToZoomEnabled = true;
        private boolean scrollEnabled = true;
        private boolean simultaneousRotateAndPinchToZoomEnabled = true;
        private boolean pitchEnabled = true;

        @NotNull
        private ScrollMode scrollMode = ScrollMode.HORIZONTAL_AND_VERTICAL;
        private boolean doubleTapToZoomInEnabled = true;
        private boolean doubleTouchToZoomOutEnabled = true;
        private boolean quickZoomEnabled = true;
        private boolean pinchToZoomDecelerationEnabled = true;
        private boolean rotateDecelerationEnabled = true;
        private boolean scrollDecelerationEnabled = true;
        private boolean increaseRotateThresholdWhenPinchingToZoom = true;
        private boolean increasePinchToZoomThresholdWhenRotating = true;
        private float zoomAnimationAmount = 1.0f;
        private boolean pinchScrollEnabled = true;

        @NotNull
        public final GesturesSettings build() {
            return new GesturesSettings(this.rotateEnabled, this.pinchToZoomEnabled, this.scrollEnabled, this.simultaneousRotateAndPinchToZoomEnabled, this.pitchEnabled, this.scrollMode, this.doubleTapToZoomInEnabled, this.doubleTouchToZoomOutEnabled, this.quickZoomEnabled, this.focalPoint, this.pinchToZoomDecelerationEnabled, this.rotateDecelerationEnabled, this.scrollDecelerationEnabled, this.increaseRotateThresholdWhenPinchingToZoom, this.increasePinchToZoomThresholdWhenRotating, this.zoomAnimationAmount, this.pinchScrollEnabled, this.useNativeFlingDeceleration, null);
        }

        public final boolean getDoubleTapToZoomInEnabled() {
            return this.doubleTapToZoomInEnabled;
        }

        public final boolean getDoubleTouchToZoomOutEnabled() {
            return this.doubleTouchToZoomOutEnabled;
        }

        @Nullable
        public final ScreenCoordinate getFocalPoint() {
            return this.focalPoint;
        }

        public final boolean getIncreasePinchToZoomThresholdWhenRotating() {
            return this.increasePinchToZoomThresholdWhenRotating;
        }

        public final boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
            return this.increaseRotateThresholdWhenPinchingToZoom;
        }

        public final boolean getPinchScrollEnabled() {
            return this.pinchScrollEnabled;
        }

        public final boolean getPinchToZoomDecelerationEnabled() {
            return this.pinchToZoomDecelerationEnabled;
        }

        public final boolean getPinchToZoomEnabled() {
            return this.pinchToZoomEnabled;
        }

        public final boolean getPitchEnabled() {
            return this.pitchEnabled;
        }

        public final boolean getQuickZoomEnabled() {
            return this.quickZoomEnabled;
        }

        public final boolean getRotateDecelerationEnabled() {
            return this.rotateDecelerationEnabled;
        }

        public final boolean getRotateEnabled() {
            return this.rotateEnabled;
        }

        public final boolean getScrollDecelerationEnabled() {
            return this.scrollDecelerationEnabled;
        }

        public final boolean getScrollEnabled() {
            return this.scrollEnabled;
        }

        @NotNull
        public final ScrollMode getScrollMode() {
            return this.scrollMode;
        }

        public final boolean getSimultaneousRotateAndPinchToZoomEnabled() {
            return this.simultaneousRotateAndPinchToZoomEnabled;
        }

        public final boolean getUseNativeFlingDeceleration() {
            return this.useNativeFlingDeceleration;
        }

        public final float getZoomAnimationAmount() {
            return this.zoomAnimationAmount;
        }

        /* renamed from: setDoubleTapToZoomInEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24799setDoubleTapToZoomInEnabled(boolean z) {
            this.doubleTapToZoomInEnabled = z;
        }

        /* renamed from: setDoubleTouchToZoomOutEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24800setDoubleTouchToZoomOutEnabled(boolean z) {
            this.doubleTouchToZoomOutEnabled = z;
        }

        /* renamed from: setFocalPoint, reason: collision with other method in class */
        public final /* synthetic */ void m24801setFocalPoint(ScreenCoordinate screenCoordinate) {
            this.focalPoint = screenCoordinate;
        }

        /* renamed from: setIncreasePinchToZoomThresholdWhenRotating, reason: collision with other method in class */
        public final /* synthetic */ void m24802setIncreasePinchToZoomThresholdWhenRotating(boolean z) {
            this.increasePinchToZoomThresholdWhenRotating = z;
        }

        /* renamed from: setIncreaseRotateThresholdWhenPinchingToZoom, reason: collision with other method in class */
        public final /* synthetic */ void m24803setIncreaseRotateThresholdWhenPinchingToZoom(boolean z) {
            this.increaseRotateThresholdWhenPinchingToZoom = z;
        }

        /* renamed from: setPinchScrollEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24804setPinchScrollEnabled(boolean z) {
            this.pinchScrollEnabled = z;
        }

        /* renamed from: setPinchToZoomDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24805setPinchToZoomDecelerationEnabled(boolean z) {
            this.pinchToZoomDecelerationEnabled = z;
        }

        /* renamed from: setPinchToZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24806setPinchToZoomEnabled(boolean z) {
            this.pinchToZoomEnabled = z;
        }

        /* renamed from: setPitchEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24807setPitchEnabled(boolean z) {
            this.pitchEnabled = z;
        }

        /* renamed from: setQuickZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24808setQuickZoomEnabled(boolean z) {
            this.quickZoomEnabled = z;
        }

        /* renamed from: setRotateDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24809setRotateDecelerationEnabled(boolean z) {
            this.rotateDecelerationEnabled = z;
        }

        /* renamed from: setRotateEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24810setRotateEnabled(boolean z) {
            this.rotateEnabled = z;
        }

        /* renamed from: setScrollDecelerationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24811setScrollDecelerationEnabled(boolean z) {
            this.scrollDecelerationEnabled = z;
        }

        /* renamed from: setScrollEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24812setScrollEnabled(boolean z) {
            this.scrollEnabled = z;
        }

        /* renamed from: setScrollMode, reason: collision with other method in class */
        public final /* synthetic */ void m24813setScrollMode(ScrollMode scrollMode) {
            scrollMode.getClass();
            this.scrollMode = scrollMode;
        }

        /* renamed from: setSimultaneousRotateAndPinchToZoomEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24814setSimultaneousRotateAndPinchToZoomEnabled(boolean z) {
            this.simultaneousRotateAndPinchToZoomEnabled = z;
        }

        /* renamed from: setUseNativeFlingDeceleration, reason: collision with other method in class */
        public final /* synthetic */ void m24815setUseNativeFlingDeceleration(boolean z) {
            this.useNativeFlingDeceleration = z;
        }

        /* renamed from: setZoomAnimationAmount, reason: collision with other method in class */
        public final /* synthetic */ void m24816setZoomAnimationAmount(float f) {
            this.zoomAnimationAmount = f;
        }

        @NotNull
        public final Builder setDoubleTapToZoomInEnabled(boolean doubleTapToZoomInEnabled) {
            this.doubleTapToZoomInEnabled = doubleTapToZoomInEnabled;
            return this;
        }

        @NotNull
        public final Builder setDoubleTouchToZoomOutEnabled(boolean doubleTouchToZoomOutEnabled) {
            this.doubleTouchToZoomOutEnabled = doubleTouchToZoomOutEnabled;
            return this;
        }

        @NotNull
        public final Builder setFocalPoint(@Nullable ScreenCoordinate focalPoint) {
            this.focalPoint = focalPoint;
            return this;
        }

        @NotNull
        public final Builder setIncreasePinchToZoomThresholdWhenRotating(boolean increasePinchToZoomThresholdWhenRotating) {
            this.increasePinchToZoomThresholdWhenRotating = increasePinchToZoomThresholdWhenRotating;
            return this;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "This property has no effect", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @NotNull
        public final Builder setIncreaseRotateThresholdWhenPinchingToZoom(boolean increaseRotateThresholdWhenPinchingToZoom) {
            this.increaseRotateThresholdWhenPinchingToZoom = increaseRotateThresholdWhenPinchingToZoom;
            return this;
        }

        @NotNull
        public final Builder setPinchScrollEnabled(boolean pinchScrollEnabled) {
            this.pinchScrollEnabled = pinchScrollEnabled;
            return this;
        }

        @NotNull
        public final Builder setPinchToZoomDecelerationEnabled(boolean pinchToZoomDecelerationEnabled) {
            this.pinchToZoomDecelerationEnabled = pinchToZoomDecelerationEnabled;
            return this;
        }

        @NotNull
        public final Builder setPinchToZoomEnabled(boolean pinchToZoomEnabled) {
            this.pinchToZoomEnabled = pinchToZoomEnabled;
            return this;
        }

        @NotNull
        public final Builder setPitchEnabled(boolean pitchEnabled) {
            this.pitchEnabled = pitchEnabled;
            return this;
        }

        @NotNull
        public final Builder setQuickZoomEnabled(boolean quickZoomEnabled) {
            this.quickZoomEnabled = quickZoomEnabled;
            return this;
        }

        @NotNull
        public final Builder setRotateDecelerationEnabled(boolean rotateDecelerationEnabled) {
            this.rotateDecelerationEnabled = rotateDecelerationEnabled;
            return this;
        }

        @NotNull
        public final Builder setRotateEnabled(boolean rotateEnabled) {
            this.rotateEnabled = rotateEnabled;
            return this;
        }

        @NotNull
        public final Builder setScrollDecelerationEnabled(boolean scrollDecelerationEnabled) {
            this.scrollDecelerationEnabled = scrollDecelerationEnabled;
            return this;
        }

        @NotNull
        public final Builder setScrollEnabled(boolean scrollEnabled) {
            this.scrollEnabled = scrollEnabled;
            return this;
        }

        @NotNull
        public final Builder setSimultaneousRotateAndPinchToZoomEnabled(boolean simultaneousRotateAndPinchToZoomEnabled) {
            this.simultaneousRotateAndPinchToZoomEnabled = simultaneousRotateAndPinchToZoomEnabled;
            return this;
        }

        @MapboxExperimental
        @NotNull
        public final Builder setUseNativeFlingDeceleration(boolean useNativeFlingDeceleration) {
            this.useNativeFlingDeceleration = useNativeFlingDeceleration;
            return this;
        }

        @NotNull
        public final Builder setZoomAnimationAmount(float zoomAnimationAmount) {
            this.zoomAnimationAmount = zoomAnimationAmount;
            return this;
        }

        @NotNull
        public final Builder setScrollMode(@NotNull ScrollMode scrollMode) {
            scrollMode.getClass();
            this.scrollMode = scrollMode;
            return this;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "This property has no effect", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static /* synthetic */ void getIncreaseRotateThresholdWhenPinchingToZoom$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getUseNativeFlingDeceleration$annotations() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GesturesSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GesturesSettings createFromParcel(@NotNull Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            ScrollMode scrollMode;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            ScreenCoordinate screenCoordinate;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            parcel.getClass();
            boolean z17 = false;
            boolean z18 = true;
            boolean z19 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z17 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z18 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            ScrollMode valueOf = ScrollMode.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z5 = z4;
            } else {
                z5 = z4;
                z4 = z3;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
                scrollMode = valueOf;
                z7 = z5;
            } else {
                z6 = z3;
                scrollMode = valueOf;
                z7 = z6;
            }
            if (parcel.readInt() != 0) {
                z8 = z5;
            } else {
                z8 = z5;
                z5 = z6;
            }
            ScreenCoordinate screenCoordinate2 = (ScreenCoordinate) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z9 = z8;
            } else {
                z9 = z8;
                z8 = z6;
            }
            if (parcel.readInt() != 0) {
                z10 = z6;
                screenCoordinate = screenCoordinate2;
                z11 = z9;
            } else {
                z10 = z6;
                screenCoordinate = screenCoordinate2;
                z11 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z9;
            } else {
                z12 = z9;
                z9 = z10;
            }
            if (parcel.readInt() != 0) {
                z13 = z10;
                z10 = z12;
            } else {
                z13 = z10;
            }
            if (parcel.readInt() != 0) {
                z14 = z12;
                z15 = z13;
            } else {
                z14 = z12;
                z12 = z13;
                z15 = z12;
            }
            float readFloat = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z16 = z14;
            } else {
                z16 = z14;
                z14 = z15;
            }
            if (parcel.readInt() != 0) {
                z15 = z16;
            }
            return new GesturesSettings(z19, z17, z18, z, z2, scrollMode, z4, z7, z5, screenCoordinate, z8, z11, z9, z10, z12, readFloat, z14, z15, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GesturesSettings[] newArray(int i) {
            return new GesturesSettings[i];
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This property has no effect", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void getIncreaseRotateThresholdWhenPinchingToZoom$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getUseNativeFlingDeceleration$annotations() {
    }

    public /* synthetic */ GesturesSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ScrollMode scrollMode, boolean z6, boolean z7, boolean z8, ScreenCoordinate screenCoordinate, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, float f, boolean z14, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5, scrollMode, z6, z7, z8, screenCoordinate, z9, z10, z11, z12, z13, f, z14, z15);
    }
}
