package com.amazon.apl.android;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import com.amazon.apl.android.TextMeasure;
import com.amazon.apl.android.font.TypefaceResolver;
import com.amazon.apl.android.primitive.Dimension;
import com.amazon.apl.enums.Display;
import com.amazon.apl.enums.FontStyle;
import com.amazon.apl.enums.LayoutDirection;
import com.amazon.apl.enums.TextAlign;
import com.amazon.apl.enums.TextAlignVertical;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITextProxy {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.ITextProxy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$TextMeasure$MeasureMode;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$TextAlign;

        static {
            int[] iArr = new int[TextMeasure.MeasureMode.values().length];
            $SwitchMap$com$amazon$apl$android$TextMeasure$MeasureMode = iArr;
            try {
                iArr[TextMeasure.MeasureMode.Undefined.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$TextMeasure$MeasureMode[TextMeasure.MeasureMode.AtMost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$TextMeasure$MeasureMode[TextMeasure.MeasureMode.Exactly.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TextAlign.values().length];
            $SwitchMap$com$amazon$apl$enums$TextAlign = iArr2;
            try {
                iArr2[TextAlign.kTextAlignLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TextAlign[TextAlign.kTextAlignCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TextAlign[TextAlign.kTextAlignRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TextAlign[TextAlign.kTextAlignAuto.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static float adjustHeightByMode(float f, TextMeasure.MeasureMode measureMode, int i) {
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$apl$android$TextMeasure$MeasureMode[measureMode.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? 0 : Math.round(f) : Math.min(Math.round(f), i);
        }
        return i;
    }

    static String getMeasureText(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("M");
        }
        return sb.toString();
    }

    default int getColor() {
        return 0;
    }

    default TextDirectionHeuristic getDirectionHeuristic() {
        return TextDirectionHeuristics.LTR;
    }

    default Display getDisplay() {
        return Display.kDisplayNormal;
    }

    String[] getFontFamily();

    String getFontLanguage();

    float getFontSize();

    FontStyle getFontStyle();

    int getFontWeight();

    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.kLayoutDirectionLTR;
    }

    default Dimension getLetterSpacing() {
        return Dimension.create(1.0f);
    }

    default float getLineHeight() {
        return 1.0f;
    }

    default int getMaxLines() {
        return 0;
    }

    default float getScalingFactor() {
        return 1.0f;
    }

    default int getShadowColor() {
        return 0;
    }

    default int getShadowOffsetHorizontal() {
        return 0;
    }

    default int getShadowOffsetVertical() {
        return 0;
    }

    default int getShadowRadius() {
        return 0;
    }

    default int getSize() {
        return 0;
    }

    default TextAlign getTextAlign() {
        return TextAlign.kTextAlignAuto;
    }

    default TextAlignVertical getTextAlignVertical() {
        return TextAlignVertical.kTextAlignVerticalAuto;
    }

    default Layout.Alignment getTextAlignment() {
        boolean z = getLayoutDirection() == LayoutDirection.kLayoutDirectionLTR;
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$TextAlign[getTextAlign().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? Layout.Alignment.ALIGN_NORMAL : z ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : z ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    @NonNull
    default TextPaint getTextPaint(float f) {
        Typeface typeface = TypefaceResolver.getInstance().getTypeface(getFontFamily(), getFontWeight(), FontStyle.kFontStyleItalic == getFontStyle(), getFontLanguage(), false);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(getColor());
        textPaint.setTextSize(getFontSize());
        textPaint.setTypeface(typeface);
        textPaint.density = f;
        textPaint.setTextScaleX(1.0f);
        return textPaint;
    }

    default String getVisualHash() {
        return "";
    }

    default boolean isItalic() {
        return FontStyle.kFontStyleItalic == getFontStyle();
    }

    default boolean limitLines() {
        return getMaxLines() > 0;
    }
}
