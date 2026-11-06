package com.facebook.fresco.vito.source;

import android.graphics.Bitmap;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/fresco/vito/source/BitmapImageSource;", "Lcom/facebook/fresco/vito/source/ImageSource;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "copy", "toString", "", "source_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BitmapImageSource implements ImageSource {

    @NotNull
    private final Bitmap bitmap;

    public BitmapImageSource(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        this.bitmap = bitmap;
    }

    public static /* synthetic */ BitmapImageSource copy$default(BitmapImageSource bitmapImageSource, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = bitmapImageSource.bitmap;
        }
        return bitmapImageSource.copy(bitmap);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final BitmapImageSource copy(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        return new BitmapImageSource(bitmap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BitmapImageSource.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Bitmap bitmap = this.bitmap;
        other.getClass();
        return Intrinsics.areEqual(bitmap, ((BitmapImageSource) other).bitmap);
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public int hashCode() {
        return this.bitmap.hashCode();
    }

    @NotNull
    public String toString() {
        return "BitmapImageSource(bitmap=" + this.bitmap + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
