package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public boolean hasInnerCornerRadius;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    @Px
    public int trackInnerCornerRadius;
    public float trackInnerCornerRadiusFraction;

    @Nullable
    public Integer trackStopIndicatorPadding;

    @Px
    public int trackStopIndicatorSize;
    public boolean useRelativeTrackInnerCornerRadius;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.LinearProgressIndicator, R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = obtainStyledAttributes.getInt(R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = obtainStyledAttributes.getInt(R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.trackStopIndicatorSize = Math.min(obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.trackThickness);
        if (obtainStyledAttributes.hasValue(R.styleable.LinearProgressIndicator_trackStopIndicatorPadding)) {
            this.trackStopIndicatorPadding = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.LinearProgressIndicator_trackInnerCornerRadius);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.trackInnerCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackInnerCornerRadius = false;
                this.hasInnerCornerRadius = true;
            } else if (i3 == 6) {
                this.trackInnerCornerRadiusFraction = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackInnerCornerRadius = true;
                this.hasInnerCornerRadius = true;
            }
        }
        obtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    public int getTrackInnerCornerRadiusInPx() {
        return !this.hasInnerCornerRadius ? getTrackCornerRadiusInPx() : this.useRelativeTrackInnerCornerRadius ? (int) (this.trackThickness * this.trackInnerCornerRadiusFraction) : this.trackInnerCornerRadius;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public boolean useStrokeCap() {
        return super.useStrokeCap() && getTrackInnerCornerRadiusInPx() == getTrackCornerRadiusInPx();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Stop indicator size must be >= 0.");
            return;
        }
        if (this.indeterminateAnimationType == 0) {
            if ((getTrackCornerRadiusInPx() > 0 || (this.hasInnerCornerRadius && getTrackInnerCornerRadiusInPx() > 0)) && this.indicatorTrackGapSize == 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.indicatorColors.length >= 3) {
                    return;
                }
                Single$$ExternalSyntheticBUOutline0.m$3("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }
}
