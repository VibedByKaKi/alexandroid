package io.noties.markwon.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.image.ImageSize;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ImageSizeResolverDef extends ImageSizeResolver {
    protected static final String UNIT_EM = "em";
    protected static final String UNIT_PERCENT = "%";

    public int resolveAbsolute(@NonNull ImageSize.Dimension dimension, int i, float f) {
        boolean equals = UNIT_EM.equals(dimension.unit);
        float f2 = dimension.value;
        if (equals) {
            f2 *= f;
        }
        return (int) (f2 + 0.5f);
    }

    @NonNull
    public Rect resolveImageSize(@Nullable ImageSize imageSize, @NonNull Rect rect, int i, float f) {
        if (imageSize == null) {
            int width = rect.width();
            if (width > i) {
                return new Rect(0, 0, i, (int) ((rect.height() / (width / i)) + 0.5f));
            }
            return rect;
        }
        ImageSize.Dimension dimension = imageSize.width;
        ImageSize.Dimension dimension2 = imageSize.height;
        int width2 = rect.width();
        int height = rect.height();
        float f2 = width2 / height;
        if (dimension != null) {
            int resolveAbsolute = UNIT_PERCENT.equals(dimension.unit) ? (int) (((dimension.value / 100.0f) * i) + 0.5f) : resolveAbsolute(dimension, width2, f);
            return new Rect(0, 0, resolveAbsolute, (dimension2 == null || UNIT_PERCENT.equals(dimension2.unit)) ? (int) ((resolveAbsolute / f2) + 0.5f) : resolveAbsolute(dimension2, height, f));
        }
        if (dimension2 == null || UNIT_PERCENT.equals(dimension2.unit)) {
            return rect;
        }
        int resolveAbsolute2 = resolveAbsolute(dimension2, height, f);
        return new Rect(0, 0, (int) ((resolveAbsolute2 * f2) + 0.5f), resolveAbsolute2);
    }

    @Override // io.noties.markwon.image.ImageSizeResolver
    @NonNull
    public Rect resolveImageSize(@NonNull AsyncDrawable asyncDrawable) {
        return resolveImageSize(asyncDrawable.getImageSize(), asyncDrawable.getResult().getBounds(), asyncDrawable.getLastKnownCanvasWidth(), asyncDrawable.getLastKnowTextSize());
    }
}
