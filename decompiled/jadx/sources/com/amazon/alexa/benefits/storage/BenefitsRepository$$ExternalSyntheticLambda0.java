package com.amazon.alexa.benefits.storage;

import com.amazon.alexa.benefits.api.models.RepositoryCallback;
import com.amazon.alexa.benefits.helpers.MapCallback;
import com.amazon.alexa.benefits.models.getAllBenefits.GetAllBenefitsResponse;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class BenefitsRepository$$ExternalSyntheticLambda0 implements MapCallback, Action1 {
    public final /* synthetic */ BenefitsRepository f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ RepositoryCallback f$2;
    public final /* synthetic */ MobilyticsMetricsTimer f$3;

    public /* synthetic */ BenefitsRepository$$ExternalSyntheticLambda0(BenefitsRepository benefitsRepository, String str, RepositoryCallback repositoryCallback, MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        this.f$0 = benefitsRepository;
        this.f$1 = str;
        this.f$2 = repositoryCallback;
        this.f$3 = mobilyticsMetricsTimer;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        this.f$0.lambda$requestGetAllBenefits$0(this.f$1, this.f$2, this.f$3, (GetAllBenefitsResponse) obj);
    }

    @Override // com.amazon.alexa.benefits.helpers.MapCallback
    public void onComplete(String str) {
        this.f$0.lambda$requestGetAllBenefits$2(this.f$1, this.f$2, this.f$3, str);
    }
}
