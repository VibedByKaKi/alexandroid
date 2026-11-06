package com.amazon.apl.android.scenegraph.text;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.ITextProxy;
import com.amazon.apl.android.primitive.Dimension;
import com.amazon.apl.android.scaling.IMetricsTransform;
import com.amazon.apl.enums.FontStyle;
import com.amazon.apl.enums.LayoutDirection;
import com.amazon.apl.enums.TextAlign;
import com.amazon.apl.enums.TextAlignVertical;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLTextProperties implements ITextProxy {
    private IMetricsTransform mMetricsTransform;
    private final long mNativeHandle;

    public APLTextProperties(long j, @NonNull IMetricsTransform iMetricsTransform) {
        this.mNativeHandle = j;
        this.mMetricsTransform = iMetricsTransform;
    }

    private static native String[] nGetFontFamily(long j);

    private static native String nGetFontLanguage(long j);

    private static native float nGetFontSize(long j);

    private static native int nGetFontStyle(long j);

    private static native int nGetFontWeight(long j);

    private static native long nGetHash(long j);

    private static native int nGetLayoutDirection(long j);

    private static native float nGetLetterSpacing(long j);

    private static native float nGetLineHeight(long j);

    private static native int nGetMaxLines(long j);

    private static native int nGetTextAlign(long j);

    private static native int nGetTextAlignVertical(long j);

    @Override // com.amazon.apl.android.ITextProxy
    public TextDirectionHeuristic getDirectionHeuristic() {
        return getLayoutDirection() == LayoutDirection.kLayoutDirectionRTL ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    @Override // com.amazon.apl.android.ITextProxy
    public String[] getFontFamily() {
        return nGetFontFamily(this.mNativeHandle);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public String getFontLanguage() {
        return nGetFontLanguage(this.mNativeHandle);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public float getFontSize() {
        return this.mMetricsTransform.toViewhost(nGetFontSize(this.mNativeHandle));
    }

    @Override // com.amazon.apl.android.ITextProxy
    public FontStyle getFontStyle() {
        return FontStyle.valueOf(nGetFontStyle(this.mNativeHandle));
    }

    @Override // com.amazon.apl.android.ITextProxy
    public int getFontWeight() {
        return nGetFontWeight(this.mNativeHandle);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public LayoutDirection getLayoutDirection() {
        return LayoutDirection.valueOf(nGetLayoutDirection(this.mNativeHandle));
    }

    @Override // com.amazon.apl.android.ITextProxy
    @Nullable
    public Dimension getLetterSpacing() {
        return Dimension.create(this.mMetricsTransform.toViewhost(nGetLetterSpacing(this.mNativeHandle)));
    }

    @Override // com.amazon.apl.android.ITextProxy
    public float getLineHeight() {
        return nGetLineHeight(this.mNativeHandle);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public int getMaxLines() {
        return nGetMaxLines(this.mNativeHandle);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public float getScalingFactor() {
        return this.mMetricsTransform.toViewhost(1.0f);
    }

    @Override // com.amazon.apl.android.ITextProxy
    public TextAlign getTextAlign() {
        return TextAlign.valueOf(nGetTextAlign(this.mNativeHandle));
    }

    @Override // com.amazon.apl.android.ITextProxy
    public TextAlignVertical getTextAlignVertical() {
        return TextAlignVertical.valueOf(nGetTextAlignVertical(this.mNativeHandle));
    }

    @Override // com.amazon.apl.android.ITextProxy
    public String getVisualHash() {
        return String.valueOf(nGetHash(this.mNativeHandle));
    }
}
