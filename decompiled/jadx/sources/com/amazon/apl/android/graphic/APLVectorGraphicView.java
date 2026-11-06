package com.amazon.apl.android.graphic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.IAPLViewPresenter;
import com.amazon.apl.android.bitmap.IBitmapFactory;
import com.amazon.apl.enums.VectorGraphicAlign;
import com.amazon.apl.enums.VectorGraphicScale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"AppCompatCustomView", "ViewConstructor"})
/* loaded from: classes20.dex */
public class APLVectorGraphicView extends ImageView {
    private static final String TAG = "APLVectorGraphicView";
    private final IBitmapFactory mBitmapFactory;
    private boolean mFrameSet;

    @NonNull
    private VectorGraphicAlign mVectorGraphicAlign;

    @NonNull
    private VectorGraphicScale mVectorGraphicScale;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.graphic.APLVectorGraphicView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$VectorGraphicScale;

        static {
            int[] iArr = new int[VectorGraphicScale.values().length];
            $SwitchMap$com$amazon$apl$enums$VectorGraphicScale = iArr;
            try {
                iArr[VectorGraphicScale.kVectorGraphicScaleNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicScale[VectorGraphicScale.kVectorGraphicScaleBestFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicScale[VectorGraphicScale.kVectorGraphicScaleBestFit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VectorGraphicAlign.values().length];
            $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign = iArr2;
            try {
                iArr2[VectorGraphicAlign.kVectorGraphicAlignBottom.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignBottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignTopRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignLeft.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[VectorGraphicAlign.kVectorGraphicAlignBottomLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public APLVectorGraphicView(@NonNull Context context, @NonNull IAPLViewPresenter iAPLViewPresenter) {
        super(context);
        this.mVectorGraphicScale = VectorGraphicScale.kVectorGraphicScaleNone;
        this.mVectorGraphicAlign = VectorGraphicAlign.kVectorGraphicAlignCenter;
        this.mBitmapFactory = iAPLViewPresenter.getBitmapFactory();
    }

    private void updateMatrix() {
        Drawable drawable = getDrawable();
        if (drawable == null || !this.mFrameSet) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (this.mVectorGraphicScale == VectorGraphicScale.kVectorGraphicScaleFill || (width == intrinsicWidth && height == intrinsicHeight)) {
            drawable.setBounds(0, 0, width, height);
            setImageMatrix(null);
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float calculateScale = calculateScale(width, height, intrinsicWidth, intrinsicHeight);
        int deltaLeft = deltaLeft(width, intrinsicWidth * calculateScale);
        int deltaTop = deltaTop(height, intrinsicHeight * calculateScale);
        Matrix matrix = new Matrix();
        matrix.setScale(calculateScale, calculateScale);
        matrix.postTranslate(deltaLeft, deltaTop);
        setImageMatrix(matrix);
    }

    @VisibleForTesting
    public float calculateScale(int i, int i2, int i3, int i4) {
        int i5 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$VectorGraphicScale[this.mVectorGraphicScale.ordinal()];
        if (i5 == 2) {
            return Math.max(i / i3, i2 / i4);
        }
        if (i5 != 3) {
            return 1.0f;
        }
        return Math.min(i / i3, i2 / i4);
    }

    @VisibleForTesting
    public int deltaLeft(int i, double d) {
        long round;
        switch (AnonymousClass1.$SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[this.mVectorGraphicAlign.ordinal()]) {
            case 1:
            case 2:
            case 3:
                round = Math.round((i - d) * 0.5d);
                break;
            case 4:
            case 5:
            case 6:
                round = Math.round(i - d);
                break;
            default:
                return 0;
        }
        return (int) round;
    }

    @VisibleForTesting
    public int deltaTop(int i, double d) {
        long round;
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$VectorGraphicAlign[this.mVectorGraphicAlign.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5 && i2 != 7) {
                        if (i2 != 8) {
                            return 0;
                        }
                    }
                }
            }
            round = Math.round((i - d) * 0.5d);
            return (int) round;
        }
        round = Math.round(i - d);
        return (int) round;
    }

    public void setAlign(@NonNull VectorGraphicAlign vectorGraphicAlign) {
        this.mVectorGraphicAlign = vectorGraphicAlign;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        this.mFrameSet = true;
        updateMatrix();
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        updateMatrix();
    }

    public void setScale(@NonNull VectorGraphicScale vectorGraphicScale) {
        this.mVectorGraphicScale = vectorGraphicScale;
    }
}
