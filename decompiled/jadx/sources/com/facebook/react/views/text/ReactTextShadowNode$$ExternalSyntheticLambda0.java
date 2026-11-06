package com.facebook.react.views.text;

import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class ReactTextShadowNode$$ExternalSyntheticLambda0 implements YogaMeasureFunction, YogaBaselineFunction {
    public final /* synthetic */ ReactTextShadowNode f$0;

    public /* synthetic */ ReactTextShadowNode$$ExternalSyntheticLambda0(ReactTextShadowNode reactTextShadowNode) {
        this.f$0 = reactTextShadowNode;
    }

    @Override // com.facebook.yoga.YogaBaselineFunction
    public float baseline(YogaNode yogaNode, float f, float f2) {
        float mTextBaselineFunction$lambda$4;
        mTextBaselineFunction$lambda$4 = ReactTextShadowNode.mTextBaselineFunction$lambda$4(this.f$0, yogaNode, f, f2);
        return mTextBaselineFunction$lambda$4;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        long textMeasureFunction$lambda$2;
        textMeasureFunction$lambda$2 = ReactTextShadowNode.textMeasureFunction$lambda$2(this.f$0, yogaNode, f, yogaMeasureMode, f2, yogaMeasureMode2);
        return textMeasureFunction$lambda$2;
    }
}
