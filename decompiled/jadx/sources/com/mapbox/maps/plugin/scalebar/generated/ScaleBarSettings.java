package com.mapbox.maps.plugin.scalebar.generated;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.plugin.DistanceUnits;
import com.reactcommunity.rndatetimepicker.Common;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001DB§\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0005HÖ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020\u0005H\u0016J\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020>H\u0016J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b\u0013\u0010!R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!¨\u0006E"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "Landroid/os/Parcelable;", "enabled", "", "position", "", ViewProps.MARGIN_LEFT, "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_BOTTOM, Common.TEXT_COLOR, "primaryColor", "secondaryColor", ViewProps.BORDER_WIDTH, "height", "textBarMargin", "textBorderWidth", "textSize", "isMetricUnits", "distanceUnits", "Lcom/mapbox/maps/plugin/DistanceUnits;", "refreshInterval", "", "showTextBorder", "ratio", "useContinuousRendering", "(ZIFFFFIIIFFFFFZLcom/mapbox/maps/plugin/DistanceUnits;JZFZ)V", "getBorderWidth", "()F", "getDistanceUnits", "()Lcom/mapbox/maps/plugin/DistanceUnits;", "getEnabled", "()Z", "getHeight", "isMetricUnits$annotations", "()V", "getMarginBottom", "getMarginLeft", "getMarginRight", "getMarginTop", "getPosition", "()I", "getPrimaryColor", "getRatio", "getRefreshInterval", "()J", "getSecondaryColor", "getShowTextBorder", "getTextBarMargin", "getTextBorderWidth", "getTextColor", "getTextSize", "getUseContinuousRendering", "describeContents", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ScaleBarSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScaleBarSettings> CREATOR = new Creator();
    private final float borderWidth;

    @NotNull
    private final DistanceUnits distanceUnits;
    private final boolean enabled;
    private final float height;
    private final boolean isMetricUnits;
    private final float marginBottom;
    private final float marginLeft;
    private final float marginRight;
    private final float marginTop;
    private final int position;
    private final int primaryColor;
    private final float ratio;
    private final long refreshInterval;
    private final int secondaryColor;
    private final boolean showTextBorder;
    private final float textBarMargin;
    private final float textBorderWidth;
    private final int textColor;
    private final float textSize;
    private final boolean useContinuousRendering;

    private ScaleBarSettings(boolean z, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, float f5, float f6, float f7, float f8, float f9, boolean z2, DistanceUnits distanceUnits, long j, boolean z3, float f10, boolean z4) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.textColor = i2;
        this.primaryColor = i3;
        this.secondaryColor = i4;
        this.borderWidth = f5;
        this.height = f6;
        this.textBarMargin = f7;
        this.textBorderWidth = f8;
        this.textSize = f9;
        this.isMetricUnits = z2;
        this.distanceUnits = distanceUnits;
        this.refreshInterval = j;
        this.showTextBorder = z3;
        this.ratio = f10;
        this.useContinuousRendering = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ScaleBarSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ScaleBarSettings scaleBarSettings = (ScaleBarSettings) other;
        return this.enabled == scaleBarSettings.enabled && this.position == scaleBarSettings.position && Float.compare(this.marginLeft, scaleBarSettings.marginLeft) == 0 && Float.compare(this.marginTop, scaleBarSettings.marginTop) == 0 && Float.compare(this.marginRight, scaleBarSettings.marginRight) == 0 && Float.compare(this.marginBottom, scaleBarSettings.marginBottom) == 0 && this.textColor == scaleBarSettings.textColor && this.primaryColor == scaleBarSettings.primaryColor && this.secondaryColor == scaleBarSettings.secondaryColor && Float.compare(this.borderWidth, scaleBarSettings.borderWidth) == 0 && Float.compare(this.height, scaleBarSettings.height) == 0 && Float.compare(this.textBarMargin, scaleBarSettings.textBarMargin) == 0 && Float.compare(this.textBorderWidth, scaleBarSettings.textBorderWidth) == 0 && Float.compare(this.textSize, scaleBarSettings.textSize) == 0 && this.isMetricUnits == scaleBarSettings.isMetricUnits && Intrinsics.areEqual(this.distanceUnits, scaleBarSettings.distanceUnits) && this.refreshInterval == scaleBarSettings.refreshInterval && this.showTextBorder == scaleBarSettings.showTextBorder && Float.compare(this.ratio, scaleBarSettings.ratio) == 0 && this.useContinuousRendering == scaleBarSettings.useContinuousRendering;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    @NotNull
    public final DistanceUnits getDistanceUnits() {
        return this.distanceUnits;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    public final float getMarginRight() {
        return this.marginRight;
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final long getRefreshInterval() {
        return this.refreshInterval;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final boolean getShowTextBorder() {
        return this.showTextBorder;
    }

    public final float getTextBarMargin() {
        return this.textBarMargin;
    }

    public final float getTextBorderWidth() {
        return this.textBorderWidth;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final boolean getUseContinuousRendering() {
        return this.useContinuousRendering;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom), Integer.valueOf(this.textColor), Integer.valueOf(this.primaryColor), Integer.valueOf(this.secondaryColor), Float.valueOf(this.borderWidth), Float.valueOf(this.height), Float.valueOf(this.textBarMargin), Float.valueOf(this.textBorderWidth), Float.valueOf(this.textSize), Boolean.valueOf(this.isMetricUnits), this.distanceUnits, Long.valueOf(this.refreshInterval), Boolean.valueOf(this.showTextBorder), Float.valueOf(this.ratio), Boolean.valueOf(this.useContinuousRendering));
    }

    /* renamed from: isMetricUnits, reason: from getter */
    public final boolean getIsMetricUnits() {
        return this.isMetricUnits;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setEnabled(this.enabled).setPosition(this.position).setMarginLeft(this.marginLeft).setMarginTop(this.marginTop).setMarginRight(this.marginRight).setMarginBottom(this.marginBottom).setTextColor(this.textColor).setPrimaryColor(this.primaryColor).setSecondaryColor(this.secondaryColor).setBorderWidth(this.borderWidth).setHeight(this.height).setTextBarMargin(this.textBarMargin).setTextBorderWidth(this.textBorderWidth).setTextSize(this.textSize).setIsMetricUnits(this.isMetricUnits).setDistanceUnits(this.distanceUnits).setRefreshInterval(this.refreshInterval).setShowTextBorder(this.showTextBorder).setRatio(this.ratio).setUseContinuousRendering(this.useContinuousRendering);
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("ScaleBarSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", textColor=" + this.textColor + ", primaryColor=" + this.primaryColor + ",\n      secondaryColor=" + this.secondaryColor + ", borderWidth=" + this.borderWidth + ", height=" + this.height + ",\n      textBarMargin=" + this.textBarMargin + ", textBorderWidth=" + this.textBorderWidth + ", textSize=" + this.textSize + ",\n      isMetricUnits=" + this.isMetricUnits + ", distanceUnits=" + this.distanceUnits + ", refreshInterval=" + this.refreshInterval + ",\n      showTextBorder=" + this.showTextBorder + ", ratio=" + this.ratio + ",\n      useContinuousRendering=" + this.useContinuousRendering + ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.primaryColor);
        parcel.writeInt(this.secondaryColor);
        parcel.writeFloat(this.borderWidth);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.textBarMargin);
        parcel.writeFloat(this.textBorderWidth);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.isMetricUnits ? 1 : 0);
        this.distanceUnits.writeToParcel(parcel, flags);
        parcel.writeLong(this.refreshInterval);
        parcel.writeInt(this.showTextBorder ? 1 : 0);
        parcel.writeFloat(this.ratio);
        parcel.writeInt(this.useContinuousRendering ? 1 : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010O\u001a\u00020PJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(J\u000e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020(J\u000e\u00103\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004J\u000e\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010:\u001a\u00020(J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0010J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0004J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0004J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010F\u001a\u00020(J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0004J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0010R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR,\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR$\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR$\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR$\u00105\u001a\u0002042\u0006\u0010\u0003\u001a\u000204@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010=\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R$\u0010@\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR$\u0010C\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR$\u0010F\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R$\u0010I\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR$\u0010L\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015¨\u0006R"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "", "()V", "<set-?>", "", ViewProps.BORDER_WIDTH, "getBorderWidth", "()F", "setBorderWidth", "(F)V", "Lcom/mapbox/maps/plugin/DistanceUnits;", "distanceUnits", "getDistanceUnits", "()Lcom/mapbox/maps/plugin/DistanceUnits;", "setDistanceUnits", "(Lcom/mapbox/maps/plugin/DistanceUnits;)V", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "height", "getHeight", "setHeight", "isMetricUnits", "isMetricUnits$annotations", "setMetricUnits", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "setMarginBottom", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "", "position", "getPosition", "()I", "setPosition", "(I)V", "primaryColor", "getPrimaryColor", "setPrimaryColor", "ratio", "getRatio", "setRatio", "", "refreshInterval", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "secondaryColor", "getSecondaryColor", "setSecondaryColor", "showTextBorder", "getShowTextBorder", "setShowTextBorder", "textBarMargin", "getTextBarMargin", "setTextBarMargin", "textBorderWidth", "getTextBorderWidth", "setTextBorderWidth", Common.TEXT_COLOR, "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "useContinuousRendering", "getUseContinuousRendering", "setUseContinuousRendering", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setIsMetricUnits", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean useContinuousRendering;
        private boolean enabled = true;
        private int position = 8388659;
        private float marginLeft = 4.0f;
        private float marginTop = 4.0f;
        private float marginRight = 4.0f;
        private float marginBottom = 4.0f;
        private int textColor = ViewCompat.MEASURED_STATE_MASK;
        private int primaryColor = ViewCompat.MEASURED_STATE_MASK;
        private int secondaryColor = -1;
        private float borderWidth = 2.0f;
        private float height = 2.0f;
        private float textBarMargin = 8.0f;
        private float textBorderWidth = 2.0f;
        private float textSize = 8.0f;
        private boolean isMetricUnits = true;

        @NotNull
        private DistanceUnits distanceUnits = DistanceUnits.METRIC;
        private long refreshInterval = 15;
        private boolean showTextBorder = true;
        private float ratio = 0.5f;

        @NotNull
        public final ScaleBarSettings build() {
            return new ScaleBarSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.textColor, this.primaryColor, this.secondaryColor, this.borderWidth, this.height, this.textBarMargin, this.textBorderWidth, this.textSize, this.isMetricUnits, this.distanceUnits, this.refreshInterval, this.showTextBorder, this.ratio, this.useContinuousRendering, null);
        }

        public final float getBorderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final DistanceUnits getDistanceUnits() {
            return this.distanceUnits;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getMarginBottom() {
            return this.marginBottom;
        }

        public final float getMarginLeft() {
            return this.marginLeft;
        }

        public final float getMarginRight() {
            return this.marginRight;
        }

        public final float getMarginTop() {
            return this.marginTop;
        }

        public final int getPosition() {
            return this.position;
        }

        public final int getPrimaryColor() {
            return this.primaryColor;
        }

        public final float getRatio() {
            return this.ratio;
        }

        public final long getRefreshInterval() {
            return this.refreshInterval;
        }

        public final int getSecondaryColor() {
            return this.secondaryColor;
        }

        public final boolean getShowTextBorder() {
            return this.showTextBorder;
        }

        public final float getTextBarMargin() {
            return this.textBarMargin;
        }

        public final float getTextBorderWidth() {
            return this.textBorderWidth;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public final boolean getUseContinuousRendering() {
            return this.useContinuousRendering;
        }

        /* renamed from: isMetricUnits, reason: from getter */
        public final boolean getIsMetricUnits() {
            return this.isMetricUnits;
        }

        /* renamed from: setBorderWidth, reason: collision with other method in class */
        public final /* synthetic */ void m24849setBorderWidth(float f) {
            this.borderWidth = f;
        }

        /* renamed from: setDistanceUnits, reason: collision with other method in class */
        public final /* synthetic */ void m24850setDistanceUnits(DistanceUnits distanceUnits) {
            distanceUnits.getClass();
            this.distanceUnits = distanceUnits;
        }

        /* renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24851setEnabled(boolean z) {
            this.enabled = z;
        }

        /* renamed from: setHeight, reason: collision with other method in class */
        public final /* synthetic */ void m24852setHeight(float f) {
            this.height = f;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use distanceUnits instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @NotNull
        public final Builder setIsMetricUnits(boolean isMetricUnits) {
            this.isMetricUnits = isMetricUnits;
            return this;
        }

        /* renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m24853setMarginBottom(float f) {
            this.marginBottom = f;
        }

        /* renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m24854setMarginLeft(float f) {
            this.marginLeft = f;
        }

        /* renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m24855setMarginRight(float f) {
            this.marginRight = f;
        }

        /* renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m24856setMarginTop(float f) {
            this.marginTop = f;
        }

        public final /* synthetic */ void setMetricUnits(boolean z) {
            this.isMetricUnits = z;
        }

        /* renamed from: setPosition, reason: collision with other method in class */
        public final /* synthetic */ void m24857setPosition(int i) {
            this.position = i;
        }

        /* renamed from: setPrimaryColor, reason: collision with other method in class */
        public final /* synthetic */ void m24858setPrimaryColor(int i) {
            this.primaryColor = i;
        }

        /* renamed from: setRatio, reason: collision with other method in class */
        public final /* synthetic */ void m24859setRatio(float f) {
            this.ratio = f;
        }

        /* renamed from: setRefreshInterval, reason: collision with other method in class */
        public final /* synthetic */ void m24860setRefreshInterval(long j) {
            this.refreshInterval = j;
        }

        /* renamed from: setSecondaryColor, reason: collision with other method in class */
        public final /* synthetic */ void m24861setSecondaryColor(int i) {
            this.secondaryColor = i;
        }

        /* renamed from: setShowTextBorder, reason: collision with other method in class */
        public final /* synthetic */ void m24862setShowTextBorder(boolean z) {
            this.showTextBorder = z;
        }

        /* renamed from: setTextBarMargin, reason: collision with other method in class */
        public final /* synthetic */ void m24863setTextBarMargin(float f) {
            this.textBarMargin = f;
        }

        /* renamed from: setTextBorderWidth, reason: collision with other method in class */
        public final /* synthetic */ void m24864setTextBorderWidth(float f) {
            this.textBorderWidth = f;
        }

        /* renamed from: setTextColor, reason: collision with other method in class */
        public final /* synthetic */ void m24865setTextColor(int i) {
            this.textColor = i;
        }

        /* renamed from: setTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m24866setTextSize(float f) {
            this.textSize = f;
        }

        /* renamed from: setUseContinuousRendering, reason: collision with other method in class */
        public final /* synthetic */ void m24867setUseContinuousRendering(boolean z) {
            this.useContinuousRendering = z;
        }

        @NotNull
        public final Builder setBorderWidth(float borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        @NotNull
        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @NotNull
        public final Builder setHeight(float height) {
            this.height = height;
            return this;
        }

        @NotNull
        public final Builder setMarginBottom(float marginBottom) {
            this.marginBottom = marginBottom;
            return this;
        }

        @NotNull
        public final Builder setMarginLeft(float marginLeft) {
            this.marginLeft = marginLeft;
            return this;
        }

        @NotNull
        public final Builder setMarginRight(float marginRight) {
            this.marginRight = marginRight;
            return this;
        }

        @NotNull
        public final Builder setMarginTop(float marginTop) {
            this.marginTop = marginTop;
            return this;
        }

        @NotNull
        public final Builder setPosition(int position) {
            this.position = position;
            return this;
        }

        @NotNull
        public final Builder setPrimaryColor(int primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        @NotNull
        public final Builder setRatio(float ratio) {
            this.ratio = ratio;
            return this;
        }

        @NotNull
        public final Builder setRefreshInterval(long refreshInterval) {
            this.refreshInterval = refreshInterval;
            return this;
        }

        @NotNull
        public final Builder setSecondaryColor(int secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
        }

        @NotNull
        public final Builder setShowTextBorder(boolean showTextBorder) {
            this.showTextBorder = showTextBorder;
            return this;
        }

        @NotNull
        public final Builder setTextBarMargin(float textBarMargin) {
            this.textBarMargin = textBarMargin;
            return this;
        }

        @NotNull
        public final Builder setTextBorderWidth(float textBorderWidth) {
            this.textBorderWidth = textBorderWidth;
            return this;
        }

        @NotNull
        public final Builder setTextColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        @NotNull
        public final Builder setTextSize(float textSize) {
            this.textSize = textSize;
            return this;
        }

        @NotNull
        public final Builder setUseContinuousRendering(boolean useContinuousRendering) {
            this.useContinuousRendering = useContinuousRendering;
            return this;
        }

        @NotNull
        public final Builder setDistanceUnits(@NotNull DistanceUnits distanceUnits) {
            distanceUnits.getClass();
            this.distanceUnits = distanceUnits;
            return this;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use distanceUnits instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static /* synthetic */ void isMetricUnits$annotations() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScaleBarSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScaleBarSettings createFromParcel(@NotNull Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            parcel.getClass();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            boolean z5 = z2;
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            float readFloat5 = parcel.readFloat();
            float readFloat6 = parcel.readFloat();
            float readFloat7 = parcel.readFloat();
            boolean z6 = true;
            float readFloat8 = parcel.readFloat();
            boolean z7 = z5;
            float readFloat9 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z7;
            }
            boolean z8 = z;
            DistanceUnits createFromParcel = DistanceUnits.CREATOR.createFromParcel(parcel);
            boolean z9 = z3;
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z4 = z9;
            } else {
                z4 = z9;
                z9 = z7;
            }
            float readFloat10 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z7 = z4;
            }
            return new ScaleBarSettings(z8, readInt, readFloat, readFloat2, readFloat3, readFloat4, readInt2, readInt3, readInt4, readFloat5, readFloat6, readFloat7, readFloat8, readFloat9, z6, createFromParcel, readLong, z9, readFloat10, z7, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScaleBarSettings[] newArray(int i) {
            return new ScaleBarSettings[i];
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use distanceUnits instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void isMetricUnits$annotations() {
    }

    public /* synthetic */ ScaleBarSettings(boolean z, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4, float f5, float f6, float f7, float f8, float f9, boolean z2, DistanceUnits distanceUnits, long j, boolean z3, float f10, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, f, f2, f3, f4, i2, i3, i4, f5, f6, f7, f8, f9, z2, distanceUnits, j, z3, f10, z4);
    }
}
