package androidx.credentials;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/PendingGetCredentialRequest;", "", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/GetCredentialRequest;", "callback", "Lkotlin/Function1;", "Landroidx/credentials/GetCredentialResponse;", "", "(Landroidx/credentials/GetCredentialRequest;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getRequest", "()Landroidx/credentials/GetCredentialRequest;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PendingGetCredentialRequest {

    @NotNull
    private final Function1<GetCredentialResponse, Unit> callback;

    @NotNull
    private final GetCredentialRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingGetCredentialRequest(@NotNull GetCredentialRequest getCredentialRequest, @NotNull Function1<? super GetCredentialResponse, Unit> function1) {
        getCredentialRequest.getClass();
        function1.getClass();
        this.request = getCredentialRequest;
        this.callback = function1;
    }

    @NotNull
    public final Function1<GetCredentialResponse, Unit> getCallback() {
        return this.callback;
    }

    @NotNull
    public final GetCredentialRequest getRequest() {
        return this.request;
    }
}
