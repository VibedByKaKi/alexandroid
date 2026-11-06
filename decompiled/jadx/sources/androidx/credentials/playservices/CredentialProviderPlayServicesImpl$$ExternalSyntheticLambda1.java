package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CancellationSignal f$0;
    public final /* synthetic */ Executor f$1;
    public final /* synthetic */ CredentialManagerCallback f$2;

    public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = cancellationSignal;
        this.f$1 = executor;
        this.f$2 = credentialManagerCallback;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.$r8$classId) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(this.f$0, this.f$1, this.f$2, exc);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$1(this.f$0, this.f$1, this.f$2, exc);
                break;
            default:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$1(this.f$0, this.f$1, this.f$2, exc);
                break;
        }
    }
}
