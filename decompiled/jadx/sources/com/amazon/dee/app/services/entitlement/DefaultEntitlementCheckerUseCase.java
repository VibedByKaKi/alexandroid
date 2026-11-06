package com.amazon.dee.app.services.entitlement;

import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementRequest;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.PeekBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.RepositoryCallback;
import com.amazon.alexa.benefits.api.models.enums.CacheState;
import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.dee.app.services.logging.Log;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/entitlement/DefaultEntitlementCheckerUseCase;", "Lcom/amazon/dee/app/services/entitlement/EntitlementCheckerUseCase;", "benefitsService", "Lcom/amazon/alexa/benefits/api/BenefitsService;", "<init>", "(Lcom/amazon/alexa/benefits/api/BenefitsService;)V", "checkEntitlement", "", "callback", "Lcom/amazon/dee/app/services/entitlement/EntitlementCallback;", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEntitlementCheckerUseCase implements EntitlementCheckerUseCase {

    @NotNull
    private static final String BENEFIT_TYPE = "alexa_premium_default";

    @NotNull
    private static final String TAG = "EntitlementCheckerUseCase";

    @NotNull
    private final BenefitsService benefitsService;

    @Inject
    public DefaultEntitlementCheckerUseCase(@NotNull BenefitsService benefitsService) {
        benefitsService.getClass();
        this.benefitsService = benefitsService;
    }

    @Override // com.amazon.dee.app.services.entitlement.EntitlementCheckerUseCase
    public void checkEntitlement(@NotNull final EntitlementCallback callback) {
        callback.getClass();
        try {
            GetBenefitsEntitlementRequest getBenefitsEntitlementRequest = new GetBenefitsEntitlementRequest("b3d450dc-27f9-4658-8cce-2784e86f06e9", "alexa_premium_default");
            PeekBenefitsEntitlementResponse peekBenefitsEntitlement = this.benefitsService.peekBenefitsEntitlement(getBenefitsEntitlementRequest);
            if (peekBenefitsEntitlement == null || peekBenefitsEntitlement.getCacheState() != CacheState.VALID) {
                this.benefitsService.getBenefitsEntitlement(getBenefitsEntitlementRequest, new RepositoryCallback<GetBenefitsEntitlementResponse>() { // from class: com.amazon.dee.app.services.entitlement.DefaultEntitlementCheckerUseCase$checkEntitlement$1
                    @Override // com.amazon.alexa.benefits.api.models.RepositoryCallback
                    public void onFailure(Throwable t) {
                        t.getClass();
                        CredentialConfig$$ExternalSyntheticOutline0.m("Error fetching benefits entitlement: ", t.getMessage(), "EntitlementCheckerUseCase");
                        EntitlementCallback.this.onError();
                    }

                    @Override // com.amazon.alexa.benefits.api.models.RepositoryCallback
                    public void onSuccess(GetBenefitsEntitlementResponse response) {
                        if (response == null || response.getEntitlementStatus() != EntitlementStatus.ENTITLED) {
                            EntitlementCallback.this.onNotEntitled();
                        } else {
                            EntitlementCallback.this.onEntitled();
                        }
                    }
                });
                return;
            }
            GetBenefitsEntitlementResponse response = peekBenefitsEntitlement.getResponse();
            if (response == null) {
                Log.w(TAG, "Cached response is null.");
                callback.onNotEntitled();
            } else if (response.getEntitlementStatus() == EntitlementStatus.ENTITLED) {
                callback.onEntitled();
            } else {
                callback.onNotEntitled();
            }
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Invalid argument exception in checkEntitlement: " + e.getMessage());
            callback.onError();
        } catch (Exception unused) {
            Log.e(TAG, "Unexpected error in checkEntitlement");
            callback.onError();
        }
    }
}
