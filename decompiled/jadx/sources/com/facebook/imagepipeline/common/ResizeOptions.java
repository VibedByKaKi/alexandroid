package com.facebook.imagepipeline.common;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.common.util.HashCodeUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/imagepipeline/common/ResizeOptions;", "", "width", "", "height", "maxBitmapDimension", "", "roundUpFraction", "<init>", "(IIFF)V", "hashCode", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", "Companion", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResizeOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float DEFAULT_ROUNDUP_FRACTION = 0.6666667f;

    @JvmField
    public final int height;

    @JvmField
    public final float maxBitmapDimension;

    @JvmField
    public final float roundUpFraction;

    @JvmField
    public final int width;

    @JvmOverloads
    public ResizeOptions(int i, int i2, float f, float f2) {
        this.width = i;
        this.height = i2;
        this.maxBitmapDimension = f;
        this.roundUpFraction = f2;
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
        throw null;
    }

    @JvmStatic
    @Nullable
    public static final ResizeOptions forDimensions(int i, int i2) {
        return INSTANCE.forDimensions(i, i2);
    }

    @JvmStatic
    @Nullable
    public static final ResizeOptions forSquareSize(int i) {
        return INSTANCE.forSquareSize(i);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) other;
        return this.width == resizeOptions.width && this.height == resizeOptions.height;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(this.width, this.height);
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}, 2));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/imagepipeline/common/ResizeOptions$Companion;", "", "<init>", "()V", "DEFAULT_ROUNDUP_FRACTION", "", "forDimensions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "width", "", "height", "forSquareSize", "size", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ResizeOptions forDimensions(int width, int height) {
            if (width <= 0 || height <= 0) {
                return null;
            }
            return new ResizeOptions(width, height, 0.0f, 0.0f, 12, null);
        }

        @JvmStatic
        @Nullable
        public final ResizeOptions forSquareSize(int size) {
            if (size <= 0) {
                return null;
            }
            return new ResizeOptions(size, size, 0.0f, 0.0f, 12, null);
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public ResizeOptions(int i, int i2, float f) {
        this(i, i2, f, 0.0f, 8, null);
    }

    @JvmOverloads
    public ResizeOptions(int i, int i2) {
        this(i, i2, 0.0f, 0.0f, 12, null);
    }

    public /* synthetic */ ResizeOptions(int i, int i2, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 2048.0f : f, (i3 & 8) != 0 ? 0.6666667f : f2);
    }
}
