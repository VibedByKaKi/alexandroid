package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.ClearCredentialException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CredentialManagerCallback<Void, ClearCredentialException> $callback;
    final /* synthetic */ Ref.ObjectRef<ClearCredentialException> $clearException;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$3$1(Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback, Ref.ObjectRef<ClearCredentialException> objectRef) {
        super(0);
        this.$executor = executor;
        this.$callback = credentialManagerCallback;
        this.$clearException = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialManagerCallback credentialManagerCallback, Ref.ObjectRef objectRef) {
        credentialManagerCallback.onError(objectRef.element);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$3$1$$ExternalSyntheticLambda0(this.$callback, this.$clearException, 0));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
