package com.amazon.apl.android.image;

import android.graphics.RectF;
import com.amazon.apl.android.image.AutoValue_ImageShadowBoundsCalculator;
import com.amazon.apl.android.primitive.Rect;
import com.amazon.apl.enums.ImageAlign;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ImageShadowBoundsCalculator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.image.ImageShadowBoundsCalculator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$ImageAlign;

        static {
            int[] iArr = new int[ImageAlign.values().length];
            $SwitchMap$com$amazon$apl$enums$ImageAlign = iArr;
            try {
                iArr[ImageAlign.kImageAlignBottom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignBottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignBottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignLeft.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignTopLeft.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$ImageAlign[ImageAlign.kImageAlignTopRight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder align(ImageAlign imageAlign);

        public abstract Builder bounds(Rect rect);

        public abstract ImageShadowBoundsCalculator build();

        public abstract Builder imageBounds(android.graphics.Rect rect);

        public abstract Builder innerBounds(Rect rect);

        public abstract Builder offsetX(int i);

        public abstract Builder offsetY(int i);
    }

    public static Builder builder() {
        return new AutoValue_ImageShadowBoundsCalculator.Builder();
    }

    public abstract ImageAlign align();

    public abstract Rect bounds();

    public RectF calculateShadowBounds() {
        int width;
        int height;
        RectF rectF = new RectF();
        Rect bounds = bounds();
        Rect innerBounds = innerBounds();
        float left = innerBounds.getLeft() + bounds.getLeft();
        float top = innerBounds.getTop() + bounds.getTop();
        float width2 = innerBounds.getWidth() + left;
        float height2 = innerBounds.getHeight() + top;
        switch (AnonymousClass1.$SwitchMap$com$amazon$apl$enums$ImageAlign[align().ordinal()]) {
            case 1:
                top = height2 - imageBounds().height();
                left += ImagePositionUtil.center(innerBounds.intWidth(), imageBounds().width());
                width = imageBounds().width();
                width2 = width + left;
                break;
            case 2:
                height2 = top + imageBounds().height();
                left += ImagePositionUtil.center(innerBounds.intWidth(), imageBounds().width());
                width = imageBounds().width();
                width2 = width + left;
                break;
            case 3:
                top = height2 - imageBounds().height();
                width = imageBounds().width();
                width2 = width + left;
                break;
            case 4:
                top = height2 - imageBounds().height();
                left = width2 - imageBounds().width();
                break;
            case 5:
                width2 = imageBounds().width() + left;
                top += ImagePositionUtil.center(innerBounds.intHeight(), imageBounds().height());
                height = imageBounds().height();
                height2 = top + height;
                break;
            case 6:
                left = width2 - imageBounds().width();
                top += ImagePositionUtil.center(innerBounds.intHeight(), imageBounds().height());
                height = imageBounds().height();
                height2 = top + height;
                break;
            case 7:
                width2 = imageBounds().width() + left;
                height = imageBounds().height();
                height2 = top + height;
                break;
            case 8:
                left = width2 - imageBounds().width();
                height = imageBounds().height();
                height2 = top + height;
                break;
            default:
                top += ImagePositionUtil.center(innerBounds.intHeight(), imageBounds().height());
                left += ImagePositionUtil.center(innerBounds.intWidth(), imageBounds().width());
                width2 = imageBounds().width() + left;
                height = imageBounds().height();
                height2 = top + height;
                break;
        }
        rectF.set(left + offsetX(), top + offsetY(), width2 + offsetX(), height2 + offsetY());
        return rectF;
    }

    public abstract android.graphics.Rect imageBounds();

    public abstract Rect innerBounds();

    public abstract int offsetX();

    public abstract int offsetY();
}
