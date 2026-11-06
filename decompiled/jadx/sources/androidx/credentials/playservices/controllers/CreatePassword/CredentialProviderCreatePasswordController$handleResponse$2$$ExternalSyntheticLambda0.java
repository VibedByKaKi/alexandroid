package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePasswordController f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePasswordController;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(this.f$0, (CreateCredentialException) this.f$1);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(this.f$0, (CreateCredentialResponse) this.f$1);
                break;
        }
    }
}
