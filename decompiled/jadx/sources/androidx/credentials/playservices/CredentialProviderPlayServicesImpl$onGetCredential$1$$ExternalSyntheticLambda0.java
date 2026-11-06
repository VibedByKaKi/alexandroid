package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderPlayServicesImpl$onGetCredential$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialManagerCallback f$0;

    public /* synthetic */ CredentialProviderPlayServicesImpl$onGetCredential$1$$ExternalSyntheticLambda0(CredentialManagerCallback credentialManagerCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialManagerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CredentialManagerCallback credentialManagerCallback = this.f$0;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl$onGetCredential$1.invoke$lambda$0(credentialManagerCallback);
                break;
            case 1:
                CredentialProviderPlayServicesImpl$onClearCredential$1.invoke$lambda$0(credentialManagerCallback);
                break;
            case 2:
                credentialManagerCallback.onResult(null);
                break;
            case 3:
                credentialManagerCallback.onResult(null);
                break;
            case 4:
                CredentialProviderPlayServicesImpl$onCreateCredential$1.invoke$lambda$0(credentialManagerCallback);
                break;
            case 5:
                CredentialProviderPlayServicesImpl$onGetCredential$2.invoke$lambda$0(credentialManagerCallback);
                break;
            default:
                CredentialProviderPlayServicesImpl$onGetCredential$3.invoke$lambda$0(credentialManagerCallback);
                break;
        }
    }
}
