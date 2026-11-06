package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialManagerCallback f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1$$ExternalSyntheticLambda0(CredentialManagerCallback credentialManagerCallback, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialManagerCallback;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onResult((CreateCredentialResponse) this.f$1);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.AnonymousClass2.invoke$lambda$0(this.f$0, (Exception) this.f$1);
                break;
            default:
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0(this.f$0, (Ref.ObjectRef) this.f$1);
                break;
        }
    }
}
