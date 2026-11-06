package com.mapbox.maps.plugin.indoorselector.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.MapboxExperimental;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001#B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings;", "Landroid/os/Parcelable;", "enabled", "", "position", "", ViewProps.MARGIN_LEFT, "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_BOTTOM, "(ZIFFFF)V", "getEnabled", "()Z", "getMarginBottom", "()F", "getMarginLeft", "getMarginRight", "getMarginTop", "getPosition", "()I", "describeContents", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public final class IndoorSelectorSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndoorSelectorSettings> CREATOR = new Creator();
    private final boolean enabled;
    private final float marginBottom;
    private final float marginLeft;
    private final float marginRight;
    private final float marginTop;
    private final int position;

    private IndoorSelectorSettings(boolean z, int i, float f, float f2, float f3, float f4) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(IndoorSelectorSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        IndoorSelectorSettings indoorSelectorSettings = (IndoorSelectorSettings) other;
        return this.enabled == indoorSelectorSettings.enabled && this.position == indoorSelectorSettings.position && Float.compare(this.marginLeft, indoorSelectorSettings.marginLeft) == 0 && Float.compare(this.marginTop, indoorSelectorSettings.marginTop) == 0 && Float.compare(this.marginRight, indoorSelectorSettings.marginRight) == 0 && Float.compare(this.marginBottom, indoorSelectorSettings.marginBottom) == 0;
    }

    public final boolean getEnabled() {
        return this.enabled;
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

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom));
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setEnabled(this.enabled).setPosition(this.position).setMarginLeft(this.marginLeft).setMarginTop(this.marginTop).setMarginRight(this.marginRight).setMarginBottom(this.marginBottom);
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("IndoorSelectorSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ')');
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
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings$Builder;", "", "()V", "<set-?>", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "", "position", "getPosition", "()I", "setPosition", "(I)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean enabled = true;
        private int position = 8388661;
        private float marginLeft = 8.0f;
        private float marginTop = 60.0f;
        private float marginRight = 8.0f;
        private float marginBottom = 8.0f;

        @NotNull
        public final IndoorSelectorSettings build() {
            return new IndoorSelectorSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, null);
        }

        public final boolean getEnabled() {
            return this.enabled;
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

        /* renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24820setEnabled(boolean z) {
            this.enabled = z;
        }

        /* renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m24821setMarginBottom(float f) {
            this.marginBottom = f;
        }

        /* renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m24822setMarginLeft(float f) {
            this.marginLeft = f;
        }

        /* renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m24823setMarginRight(float f) {
            this.marginRight = f;
        }

        /* renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m24824setMarginTop(float f) {
            this.marginTop = f;
        }

        /* renamed from: setPosition, reason: collision with other method in class */
        public final /* synthetic */ void m24825setPosition(int i) {
            this.position = i;
        }

        @NotNull
        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
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
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndoorSelectorSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndoorSelectorSettings createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new IndoorSelectorSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndoorSelectorSettings[] newArray(int i) {
            return new IndoorSelectorSettings[i];
        }
    }

    public /* synthetic */ IndoorSelectorSettings(boolean z, int i, float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, f, f2, f3, f4);
    }
}
