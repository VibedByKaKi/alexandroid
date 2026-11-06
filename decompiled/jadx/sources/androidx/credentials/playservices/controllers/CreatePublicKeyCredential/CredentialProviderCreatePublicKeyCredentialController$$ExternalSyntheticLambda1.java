package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                break;
        }
    }
}
