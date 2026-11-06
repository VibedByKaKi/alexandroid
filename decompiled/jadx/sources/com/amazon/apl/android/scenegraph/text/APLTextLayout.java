package com.amazon.apl.android.scenegraph.text;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.text.Layout;
import com.amazon.apl.android.utils.APLTextUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLTextLayout {
    private final double mBaseLine;
    private final float mHeightDp;
    private final Layout mLayout;
    private final boolean mLinesClipped;
    private final CharSequence mText;
    private APLTextProperties mTextProperties;
    private final float mWidthDp;

    @SuppressLint({"WrongConstant"})
    public APLTextLayout(Layout layout, CharSequence charSequence, boolean z, float f, float f2, double d) {
        this.mLayout = layout;
        this.mText = charSequence;
        this.mWidthDp = f;
        this.mHeightDp = f2;
        this.mLinesClipped = z;
        this.mBaseLine = d;
    }

    private int[] getBoundingBoxForLineRange(int i, int i2) {
        Rect rect = new Rect(0, 0, 0, 0);
        while (i <= i2) {
            if (rect.isEmpty()) {
                this.mLayout.getLineBounds(i, rect);
            } else {
                Rect rect2 = new Rect();
                this.mLayout.getLineBounds(i, rect2);
                rect.union(rect2);
            }
            i++;
        }
        return new int[]{rect.left, rect.top, rect.width(), rect.height()};
    }

    private int getByteLength() {
        return this.mText.length();
    }

    private String getLaidOutText() {
        return this.mLayout.getText().toString().replace("\ufeff", "");
    }

    private int getLineCount() {
        return this.mLayout.getLineCount();
    }

    private int[] getLineRangeFromByteRange(int i, int i2) {
        int[] calculateCharacterOffsetByRange = APLTextUtil.calculateCharacterOffsetByRange(this.mText.toString(), i, i2);
        return new int[]{this.mLayout.getLineForOffset(calculateCharacterOffsetByRange[0]), this.mLayout.getLineForOffset(calculateCharacterOffsetByRange[1])};
    }

    private boolean isTruncated() {
        if (!this.mLinesClipped) {
            Layout layout = this.mLayout;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                return false;
            }
        }
        return true;
    }

    public void attachTextProperties(APLTextProperties aPLTextProperties) {
        this.mTextProperties = aPLTextProperties;
    }

    public double getBaseLine() {
        return this.mBaseLine;
    }

    public Layout getLayout() {
        return this.mLayout;
    }

    public float[] getSize() {
        return new float[]{this.mWidthDp, this.mHeightDp};
    }

    public CharSequence getText() {
        return this.mText;
    }

    public APLTextProperties getTextProperties() {
        return this.mTextProperties;
    }
}
