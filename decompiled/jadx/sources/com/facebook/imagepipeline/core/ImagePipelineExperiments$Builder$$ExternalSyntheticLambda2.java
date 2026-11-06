package com.facebook.imagepipeline.core;

import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ImagePipelineExperiments$Builder$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImagePipelineExperiments.Builder f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ImagePipelineExperiments$Builder$$ExternalSyntheticLambda2(ImagePipelineExperiments.Builder builder, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = builder;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit maxBitmapDimension$lambda$14;
        Unit animationRenderFpsLimit$lambda$32;
        Unit trackedKeysSize$lambda$29;
        Unit animationStrategyBufferLengthMilliseconds$lambda$13;
        switch (this.$r8$classId) {
            case 0:
                maxBitmapDimension$lambda$14 = ImagePipelineExperiments.Builder.setMaxBitmapDimension$lambda$14(this.f$0, this.f$1);
                return maxBitmapDimension$lambda$14;
            case 1:
                animationRenderFpsLimit$lambda$32 = ImagePipelineExperiments.Builder.setAnimationRenderFpsLimit$lambda$32(this.f$0, this.f$1);
                return animationRenderFpsLimit$lambda$32;
            case 2:
                trackedKeysSize$lambda$29 = ImagePipelineExperiments.Builder.setTrackedKeysSize$lambda$29(this.f$0, this.f$1);
                return trackedKeysSize$lambda$29;
            default:
                animationStrategyBufferLengthMilliseconds$lambda$13 = ImagePipelineExperiments.Builder.setAnimationStrategyBufferLengthMilliseconds$lambda$13(this.f$0, this.f$1);
                return animationStrategyBufferLengthMilliseconds$lambda$13;
        }
    }
}
