package com.facebook.imagepipeline.core;

import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ImagePipelineExperiments$Builder$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImagePipelineExperiments.Builder f$0;
    public final /* synthetic */ Supplier f$1;

    public /* synthetic */ ImagePipelineExperiments$Builder$$ExternalSyntheticLambda11(ImagePipelineExperiments.Builder builder, Supplier supplier, int i) {
        this.$r8$classId = i;
        this.f$0 = builder;
        this.f$1 = supplier;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit suppressBitmapPrefetchingSupplier$lambda$20;
        Unit lazyDataSource$lambda$17;
        switch (this.$r8$classId) {
            case 0:
                suppressBitmapPrefetchingSupplier$lambda$20 = ImagePipelineExperiments.Builder.setSuppressBitmapPrefetchingSupplier$lambda$20(this.f$0, this.f$1);
                return suppressBitmapPrefetchingSupplier$lambda$20;
            default:
                lazyDataSource$lambda$17 = ImagePipelineExperiments.Builder.setLazyDataSource$lambda$17(this.f$0, this.f$1);
                return lazyDataSource$lambda$17;
        }
    }
}
