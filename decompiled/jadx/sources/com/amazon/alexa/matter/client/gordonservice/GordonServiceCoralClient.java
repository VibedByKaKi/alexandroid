package com.amazon.alexa.matter.client.gordonservice;

import ai.onnxruntime.TensorInfo$$ExternalSyntheticLambda4;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.amazon.alexa.matter.client.coral.CoralServiceClient;
import com.amazon.alexa.matter.client.gordonservice.model.FinalizeCommissioningRequest;
import com.amazon.alexa.matter.client.gordonservice.model.FinalizeCommissioningResponse;
import com.amazon.alexa.matter.client.gordonservice.model.SetupRequirementsRequest;
import com.amazon.alexa.matter.client.gordonservice.model.SetupRequirementsResponse;
import com.amazon.alexa.matter.utils.RxJava1To3;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import com.dee.app.http.CoralService;
import io.reactivex.rxjava3.core.Single;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class GordonServiceCoralClient extends CoralServiceClient implements GordonServiceClient {

    @NonNull
    private static final String NAME = "gordon-service";

    @NonNull
    private static final CoralServiceClient.Operation<SetupRequirementsRequest, SetupRequirementsResponse> SETUP_REQUIREMENTS_OPERATION = new CoralServiceClient.Operation<>("setupRequirements", "/api/gordonservice/v1/setupRequirements", SetupRequirementsResponse.class);

    @NonNull
    private static final CoralServiceClient.Operation<FinalizeCommissioningRequest, FinalizeCommissioningResponse> FINALIZE_COMMISSIONING_OPERATION = new CoralServiceClient.Operation<>("finalizeCommissioning", new TensorInfo$$ExternalSyntheticLambda4(29), FinalizeCommissioningResponse.class);

    @Inject
    public GordonServiceCoralClient(@NonNull CoralService coralService, @NonNull MatterLogger matterLogger) {
        super(NAME, coralService, PrefixLogger.scopedTo(GordonServiceCoralClient.class, matterLogger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(FinalizeCommissioningRequest finalizeCommissioningRequest) {
        return "/api/gordonservice/v1/sessions/" + finalizeCommissioningRequest.getSessionId() + "/finalizeCommissioning";
    }

    @Override // com.amazon.alexa.matter.client.gordonservice.GordonServiceClient
    @NonNull
    @CheckResult
    public Single<FinalizeCommissioningResponse> finalizeCommissioning(@NonNull FinalizeCommissioningRequest finalizeCommissioningRequest) {
        return RxJava1To3.shim(post(FINALIZE_COMMISSIONING_OPERATION, finalizeCommissioningRequest).toObservable()).firstOrError();
    }

    @Override // com.amazon.alexa.matter.client.gordonservice.GordonServiceClient
    @NonNull
    @CheckResult
    public Single<SetupRequirementsResponse> setupRequirements(@NonNull SetupRequirementsRequest setupRequirementsRequest) {
        return RxJava1To3.shim(post(SETUP_REQUIREMENTS_OPERATION, setupRequirementsRequest).toObservable()).firstOrError();
    }
}
