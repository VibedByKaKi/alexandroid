package com.mapbox.maps.plugin.compass.generated;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.maps.ImageHolder;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00011Bi\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\u0005H\u0016J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020+H\u0016J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00062"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "Landroid/os/Parcelable;", "enabled", "", "position", "", ViewProps.MARGIN_LEFT, "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_BOTTOM, "opacity", "rotation", "visibility", "fadeWhenFacingNorth", "clickable", "image", "Lcom/mapbox/maps/ImageHolder;", "(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V", "getClickable", "()Z", "getEnabled", "getFadeWhenFacingNorth", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "getMarginBottom", "()F", "getMarginLeft", "getMarginRight", "getMarginTop", "getOpacity", "getPosition", "()I", "getRotation", "getVisibility", "describeContents", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CompassSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CompassSettings> CREATOR = new Creator();
    private final boolean clickable;
    private final boolean enabled;
    private final boolean fadeWhenFacingNorth;

    @Nullable
    private final ImageHolder image;
    private final float marginBottom;
    private final float marginLeft;
    private final float marginRight;
    private final float marginTop;
    private final float opacity;
    private final int position;
    private final float rotation;
    private final boolean visibility;

    private CompassSettings(boolean z, int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3, boolean z4, ImageHolder imageHolder) {
        this.enabled = z;
        this.position = i;
        this.marginLeft = f;
        this.marginTop = f2;
        this.marginRight = f3;
        this.marginBottom = f4;
        this.opacity = f5;
        this.rotation = f6;
        this.visibility = z2;
        this.fadeWhenFacingNorth = z3;
        this.clickable = z4;
        this.image = imageHolder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CompassSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        CompassSettings compassSettings = (CompassSettings) other;
        return this.enabled == compassSettings.enabled && this.position == compassSettings.position && Float.compare(this.marginLeft, compassSettings.marginLeft) == 0 && Float.compare(this.marginTop, compassSettings.marginTop) == 0 && Float.compare(this.marginRight, compassSettings.marginRight) == 0 && Float.compare(this.marginBottom, compassSettings.marginBottom) == 0 && Float.compare(this.opacity, compassSettings.opacity) == 0 && Float.compare(this.rotation, compassSettings.rotation) == 0 && this.visibility == compassSettings.visibility && this.fadeWhenFacingNorth == compassSettings.fadeWhenFacingNorth && this.clickable == compassSettings.clickable && Intrinsics.areEqual(this.image, compassSettings.image);
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFadeWhenFacingNorth() {
        return this.fadeWhenFacingNorth;
    }

    @Nullable
    public final ImageHolder getImage() {
        return this.image;
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

    public final float getOpacity() {
        return this.opacity;
    }

    public final int getPosition() {
        return this.position;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.position), Float.valueOf(this.marginLeft), Float.valueOf(this.marginTop), Float.valueOf(this.marginRight), Float.valueOf(this.marginBottom), Float.valueOf(this.opacity), Float.valueOf(this.rotation), Boolean.valueOf(this.visibility), Boolean.valueOf(this.fadeWhenFacingNorth), Boolean.valueOf(this.clickable), this.image);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder().setEnabled(this.enabled).setPosition(this.position).setMarginLeft(this.marginLeft).setMarginTop(this.marginTop).setMarginRight(this.marginRight).setMarginBottom(this.marginBottom).setOpacity(this.opacity).setRotation(this.rotation).setVisibility(this.visibility).setFadeWhenFacingNorth(this.fadeWhenFacingNorth).setClickable(this.clickable).setImage(this.image);
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("CompassSettings(enabled=" + this.enabled + ", position=" + this.position + ",\n      marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ",\n      marginBottom=" + this.marginBottom + ", opacity=" + this.opacity + ", rotation=" + this.rotation + ", visibility=" + this.visibility + ",\n      fadeWhenFacingNorth=" + this.fadeWhenFacingNorth + ", clickable=" + this.clickable + ", image=" + this.image + ')');
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
        parcel.writeFloat(this.opacity);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.visibility ? 1 : 0);
        parcel.writeInt(this.fadeWhenFacingNorth ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        ImageHolder imageHolder = this.image;
        if (imageHolder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00104\u001a\u000205J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(J\u000e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0016J\u000e\u00103\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0004R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR$\u0010%\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR$\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR$\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\t¨\u00066"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "", "()V", "<set-?>", "", "clickable", "getClickable", "()Z", "setClickable", "(Z)V", "enabled", "getEnabled", "setEnabled", "fadeWhenFacingNorth", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "Lcom/mapbox/maps/ImageHolder;", "image", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", "", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "opacity", "getOpacity", "setOpacity", "", "position", "getPosition", "()I", "setPosition", "(I)V", "rotation", "getRotation", "setRotation", "visibility", "getVisibility", "setVisibility", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private ImageHolder image;
        private float rotation;
        private boolean enabled = true;
        private int position = 8388661;
        private float marginLeft = 4.0f;
        private float marginTop = 4.0f;
        private float marginRight = 4.0f;
        private float marginBottom = 4.0f;
        private float opacity = 1.0f;
        private boolean visibility = true;
        private boolean fadeWhenFacingNorth = true;
        private boolean clickable = true;

        @NotNull
        public final CompassSettings build() {
            return new CompassSettings(this.enabled, this.position, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.opacity, this.rotation, this.visibility, this.fadeWhenFacingNorth, this.clickable, this.image, null);
        }

        public final boolean getClickable() {
            return this.clickable;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getFadeWhenFacingNorth() {
            return this.fadeWhenFacingNorth;
        }

        @Nullable
        public final ImageHolder getImage() {
            return this.image;
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

        public final float getOpacity() {
            return this.opacity;
        }

        public final int getPosition() {
            return this.position;
        }

        public final float getRotation() {
            return this.rotation;
        }

        public final boolean getVisibility() {
            return this.visibility;
        }

        /* renamed from: setClickable, reason: collision with other method in class */
        public final /* synthetic */ void m24785setClickable(boolean z) {
            this.clickable = z;
        }

        /* renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m24786setEnabled(boolean z) {
            this.enabled = z;
        }

        /* renamed from: setFadeWhenFacingNorth, reason: collision with other method in class */
        public final /* synthetic */ void m24787setFadeWhenFacingNorth(boolean z) {
            this.fadeWhenFacingNorth = z;
        }

        /* renamed from: setImage, reason: collision with other method in class */
        public final /* synthetic */ void m24788setImage(ImageHolder imageHolder) {
            this.image = imageHolder;
        }

        /* renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m24789setMarginBottom(float f) {
            this.marginBottom = f;
        }

        /* renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m24790setMarginLeft(float f) {
            this.marginLeft = f;
        }

        /* renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m24791setMarginRight(float f) {
            this.marginRight = f;
        }

        /* renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m24792setMarginTop(float f) {
            this.marginTop = f;
        }

        /* renamed from: setOpacity, reason: collision with other method in class */
        public final /* synthetic */ void m24793setOpacity(float f) {
            this.opacity = f;
        }

        /* renamed from: setPosition, reason: collision with other method in class */
        public final /* synthetic */ void m24794setPosition(int i) {
            this.position = i;
        }

        /* renamed from: setRotation, reason: collision with other method in class */
        public final /* synthetic */ void m24795setRotation(float f) {
            this.rotation = f;
        }

        /* renamed from: setVisibility, reason: collision with other method in class */
        public final /* synthetic */ void m24796setVisibility(boolean z) {
            this.visibility = z;
        }

        @NotNull
        public final Builder setClickable(boolean clickable) {
            this.clickable = clickable;
            return this;
        }

        @NotNull
        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @NotNull
        public final Builder setFadeWhenFacingNorth(boolean fadeWhenFacingNorth) {
            this.fadeWhenFacingNorth = fadeWhenFacingNorth;
            return this;
        }

        @NotNull
        public final Builder setImage(@Nullable ImageHolder image) {
            this.image = image;
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
        public final Builder setOpacity(float opacity) {
            this.opacity = opacity;
            return this;
        }

        @NotNull
        public final Builder setPosition(int position) {
            this.position = position;
            return this;
        }

        @NotNull
        public final Builder setRotation(float rotation) {
            this.rotation = rotation;
            return this;
        }

        @NotNull
        public final Builder setVisibility(boolean visibility) {
            this.visibility = visibility;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompassSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CompassSettings createFromParcel(@NotNull Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            parcel.getClass();
            boolean z5 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            int readInt = parcel.readInt();
            boolean z6 = z2;
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            float readFloat5 = parcel.readFloat();
            boolean z7 = z6;
            float readFloat6 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = z7;
            } else {
                z3 = z7;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new CompassSettings(z5, readInt, readFloat, readFloat2, readFloat3, readFloat4, readFloat5, readFloat6, z7, z3, z4, parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CompassSettings[] newArray(int i) {
            return new CompassSettings[i];
        }
    }

    public /* synthetic */ CompassSettings(boolean z, int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3, boolean z4, ImageHolder imageHolder, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, f, f2, f3, f4, f5, f6, z2, z3, z4, imageHolder);
    }
}
