package com.mapbox.maps;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0002\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/ImageHolder;", "Landroid/os/Parcelable;", "drawableId", "", "bitmap", "Landroid/graphics/Bitmap;", "image", "Lcom/mapbox/maps/Image;", "(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getDrawableId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Lcom/mapbox/maps/Image;", "describeContents", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageHolder implements Parcelable {

    @Nullable
    private final Bitmap bitmap;

    @Nullable
    private final Integer drawableId;

    @Nullable
    private final Image image;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ImageHolder> CREATOR = new Creator();

    private ImageHolder(@DrawableRes Integer num, Bitmap bitmap, Image image) {
        this.drawableId = num;
        this.bitmap = bitmap;
        this.image = image;
    }

    @JvmStatic
    @NotNull
    public static final ImageHolder from(@DrawableRes int i) {
        return INSTANCE.from(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ImageHolder.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        ImageHolder imageHolder = (ImageHolder) other;
        return Intrinsics.areEqual(this.drawableId, imageHolder.drawableId) && Intrinsics.areEqual(this.bitmap, imageHolder.bitmap) && Intrinsics.areEqual(this.image, imageHolder.image);
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Integer getDrawableId() {
        return this.drawableId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return Objects.hash(this.drawableId, this.bitmap, this.image);
    }

    @NotNull
    public String toString() {
        return "ImageHolder(bitmap=" + this.bitmap + ", drawableId=" + this.drawableId + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int intValue;
        parcel.getClass();
        Integer num = this.drawableId;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeParcelable(this.bitmap, flags);
        parcel.writeSerializable(this.image);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/ImageHolder$Companion;", "", "()V", "from", "Lcom/mapbox/maps/ImageHolder;", "bitmap", "Landroid/graphics/Bitmap;", "image", "Lcom/mapbox/maps/Image;", "drawableId", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final ImageHolder from(@DrawableRes int drawableId) {
            return new ImageHolder(Integer.valueOf(drawableId), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final ImageHolder from(@NotNull Bitmap bitmap) {
            bitmap.getClass();
            return new ImageHolder(null, bitmap, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final ImageHolder from(@NotNull Image image) {
            image.getClass();
            return new ImageHolder(null, 0 == true ? 1 : 0, image, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ImageHolder createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ImageHolder(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Bitmap) parcel.readParcelable(ImageHolder.class.getClassLoader()), (Image) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ImageHolder[] newArray(int i) {
            return new ImageHolder[i];
        }
    }

    @JvmStatic
    @NotNull
    public static final ImageHolder from(@NotNull Bitmap bitmap) {
        return INSTANCE.from(bitmap);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final ImageHolder from(@NotNull Image image) {
        return INSTANCE.from(image);
    }

    public /* synthetic */ ImageHolder(Integer num, Bitmap bitmap, Image image, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, bitmap, image);
    }
}
