package com.airbnb.lottie.model.animatable;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.TextRangeUnits;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AnimatableTextRangeSelector {

    @Nullable
    public final AnimatableIntegerValue end;

    @Nullable
    public final AnimatableIntegerValue offset;

    @Nullable
    public final AnimatableIntegerValue start;
    public final TextRangeUnits units;

    public AnimatableTextRangeSelector(@Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableIntegerValue animatableIntegerValue2, @Nullable AnimatableIntegerValue animatableIntegerValue3, TextRangeUnits textRangeUnits) {
        this.start = animatableIntegerValue;
        this.end = animatableIntegerValue2;
        this.offset = animatableIntegerValue3;
        this.units = textRangeUnits;
    }
}
