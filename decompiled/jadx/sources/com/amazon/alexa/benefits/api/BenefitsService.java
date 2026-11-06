package com.amazon.alexa.benefits.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.benefits.api.models.BenefitsObserver;
import com.amazon.alexa.benefits.api.models.ForceBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.ForceBenefitsRefreshCallback;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.PeekBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.PeekMultipleBenefitsRequest;
import com.amazon.alexa.benefits.api.models.PeekMultipleBenefitsResponse;
import com.amazon.alexa.benefits.api.models.RepositoryCallback;
import com.amazon.alexa.benefits.api.models.SubscribeBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface BenefitsService {
    void forceBenefitsRefresh(ForceBenefitsEntitlementRequest forceBenefitsEntitlementRequest, ForceBenefitsRefreshCallback forceBenefitsRefreshCallback);

    void getBenefitsEntitlement(GetBenefitsEntitlementRequest getBenefitsEntitlementRequest, RepositoryCallback<GetBenefitsEntitlementResponse> repositoryCallback);

    PeekBenefitsEntitlementResponse peekBenefitsEntitlement(@NonNull GetBenefitsEntitlementRequest getBenefitsEntitlementRequest);

    PeekMultipleBenefitsResponse peekMultipleBenefits(@NonNull PeekMultipleBenefitsRequest peekMultipleBenefitsRequest);

    Subscription subscribeToBenefitsEntitlement(SubscribeBenefitsEntitlementRequest subscribeBenefitsEntitlementRequest, BenefitsObserver benefitsObserver);
}
