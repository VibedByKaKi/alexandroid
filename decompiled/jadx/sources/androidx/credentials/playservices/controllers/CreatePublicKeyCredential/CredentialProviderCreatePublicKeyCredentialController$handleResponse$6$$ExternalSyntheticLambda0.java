package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$handleResponse$6$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;
    public final /* synthetic */ JSONException f$1;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$handleResponse$6$$ExternalSyntheticLambda0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f$1 = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(this.f$0, this.f$1);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1.invoke$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
