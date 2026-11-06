package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import java.io.Serializable;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderPlayServicesImpl$onClearCredential$3$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialManagerCallback f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ CredentialProviderPlayServicesImpl$onClearCredential$3$1$$ExternalSyntheticLambda0(CredentialManagerCallback credentialManagerCallback, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialManagerCallback;
        this.f$1 = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CredentialProviderPlayServicesImpl$onClearCredential$3$1.invoke$lambda$0(this.f$0, (Ref.ObjectRef) this.f$1);
                break;
            default:
                CredentialProviderPlayServicesImpl$onClearCredential$5$1$1.invoke$lambda$0(this.f$0, (Exception) this.f$1);
                break;
        }
    }
}
