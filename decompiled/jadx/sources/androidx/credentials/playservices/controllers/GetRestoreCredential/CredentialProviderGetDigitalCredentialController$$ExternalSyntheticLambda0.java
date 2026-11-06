package androidx.credentials.playservices.controllers.GetRestoreCredential;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CredentialProviderGetDigitalCredentialController$$ExternalSyntheticLambda0(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }
}
