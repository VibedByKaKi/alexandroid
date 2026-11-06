package com.amazon.alexa.matter.client.apostilleservice;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.amazon.alexa.matter.client.apostilleservice.model.AttestationAndSetPeripheralCertificateResponse;
import com.amazon.alexa.matter.client.apostilleservice.model.VerifyAttestationAndSignCertificate;
import com.amazon.alexa.matter.client.coral.CoralServiceClient;
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
public class ApostilleServiceCoralClient extends CoralServiceClient implements ApostilleServiceClient {

    @NonNull
    private static final String NAME = "apostille-service";

    @NonNull
    private static final CoralServiceClient.Operation<VerifyAttestationAndSignCertificate, AttestationAndSetPeripheralCertificateResponse> VERIFY_ATTESTATION_AND_SIGN_CERTIFICATE_OPERATION = new CoralServiceClient.Operation<>("verifyAttestationAndSignCertificate", "/api/apostilleservice/v1/external/verifyAttestationAndSignCertificate", AttestationAndSetPeripheralCertificateResponse.class);

    @Inject
    public ApostilleServiceCoralClient(@NonNull CoralService coralService, @NonNull MatterLogger matterLogger) {
        super(NAME, coralService, PrefixLogger.scopedTo(ApostilleServiceCoralClient.class, matterLogger));
    }

    @Override // com.amazon.alexa.matter.client.apostilleservice.ApostilleServiceClient
    @NonNull
    @CheckResult
    public Single<AttestationAndSetPeripheralCertificateResponse> verifyAttestationAndSignCertificate(@NonNull VerifyAttestationAndSignCertificate verifyAttestationAndSignCertificate) {
        return RxJava1To3.shim(post(VERIFY_ATTESTATION_AND_SIGN_CERTIFICATE_OPERATION, verifyAttestationAndSignCertificate).toObservable()).firstOrError();
    }
}
