package com.amazon.alexa.benefits.models.service;

import com.amazon.alexa.benefits.helpers.NetworkHelper;
import com.amazon.alexa.benefits.models.getAllBenefits.GetAllBenefitsResponse;
import com.dee.app.http.CoralService;
import dagger.Lazy;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GetAllBenefitsApi {

    @Inject
    Lazy<CoralService> coralService;

    @Inject
    Lazy<SchedulerProvider> schedulerProvider;

    @Inject
    public GetAllBenefitsApi(Lazy<CoralService> lazy, Lazy<SchedulerProvider> lazy2) {
        this.coralService = lazy;
        this.schedulerProvider = lazy2;
    }

    private CoralService.Request createGetAllBenefitsRequest() {
        return this.coralService.get().request("/api/v1/benefits/list");
    }

    public Observable<GetAllBenefitsResponse> createGetAllBenefitsObservable(String str) {
        CoralService.Request createGetAllBenefitsRequest = createGetAllBenefitsRequest();
        if (NetworkHelper.isMapTokenUsable(str)) {
            createGetAllBenefitsRequest = createGetAllBenefitsRequest.withHeader("Authorization", "Bearer " + str);
        }
        return createGetAllBenefitsRequest.get().as(GetAllBenefitsResponse.class).toObservable().observeOn(this.schedulerProvider.get().ui()).subscribeOn(this.schedulerProvider.get().io());
    }
}
