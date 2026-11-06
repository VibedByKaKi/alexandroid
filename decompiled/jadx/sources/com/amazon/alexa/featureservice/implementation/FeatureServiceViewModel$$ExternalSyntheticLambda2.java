package com.amazon.alexa.featureservice.implementation;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FeatureServiceViewModel$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureServiceViewModel f$0;

    public /* synthetic */ FeatureServiceViewModel$$ExternalSyntheticLambda2(FeatureServiceViewModel featureServiceViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = featureServiceViewModel;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        FeatureServiceViewModel featureServiceViewModel = this.f$0;
        switch (i) {
            case 0:
                featureServiceViewModel.lambda$reloadFeaturesFromDb$4((List) obj);
                break;
            case 1:
                featureServiceViewModel.lambda$reloadFeaturesFromDb$5((Throwable) obj);
                break;
            default:
                featureServiceViewModel.lambda$refreshFeatures$0((List) obj);
                break;
        }
    }
}
