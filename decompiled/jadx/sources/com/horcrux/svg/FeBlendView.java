package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.FilterProperties;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
class FeBlendView extends FilterPrimitiveView {
    String mIn1;
    String mIn2;
    FilterProperties.FeBlendMode mMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.horcrux.svg.FeBlendView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode;

        static {
            int[] iArr = new int[FilterProperties.FeBlendMode.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode = iArr;
            try {
                iArr[FilterProperties.FeBlendMode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public FeBlendView(ReactContext reactContext) {
        super(reactContext);
        this.mFilterSubregion.mX = new SVGLength(0.0d);
        this.mFilterSubregion.mY = new SVGLength(0.0d);
        this.mFilterSubregion.mW = new SVGLength("100%");
        this.mFilterSubregion.mH = new SVGLength("100%");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float[] lambda$applyFilter$0(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[1];
        float m = (f3 * f * f4 * f2) + ErrorUtils$$ExternalSyntheticOutline0.m(1.0f, f, f4 * f2, (1.0f - f2) * f3 * f);
        float f5 = fArr[2];
        float f6 = fArr2[2];
        float m2 = (f5 * f * f6 * f2) + ErrorUtils$$ExternalSyntheticOutline0.m(1.0f, f, f6 * f2, (1.0f - f2) * f5 * f);
        float f7 = fArr[3];
        float f8 = fArr2[3];
        return new float[]{1.0f - ((1.0f - f2) * (1.0f - f)), m, m2, (f7 * f * f8 * f2) + ErrorUtils$$ExternalSyntheticOutline0.m(1.0f, f, f8 * f2, (1.0f - f2) * f7 * f)};
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap applyFilter(HashMap<String, Bitmap> hashMap, Bitmap bitmap) {
        Bitmap source = FilterPrimitiveView.getSource(hashMap, bitmap, this.mIn1);
        Bitmap source2 = FilterPrimitiveView.getSource(hashMap, bitmap, this.mIn2);
        if (this.mMode == FilterProperties.FeBlendMode.MULTIPLY) {
            return CustomFilter.apply(source, source2, new FeBlendView$$ExternalSyntheticLambda0());
        }
        Bitmap createBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[this.mMode.ordinal()];
        if (i == 1 || i == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(source2, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void setIn1(String str) {
        this.mIn1 = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.mIn2 = str;
        invalidate();
    }

    public void setMode(String str) {
        this.mMode = FilterProperties.FeBlendMode.getEnum(str);
        invalidate();
    }
}
