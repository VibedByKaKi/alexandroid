package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkImplHelper;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(35)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J*\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¨\u0006\r"}, d2 = {"Landroidx/credentials/Api35Impl;", "", "()V", "clearPendingGetCredentialRequest", "", "view", "Landroid/view/View;", "setPendingGetCredentialRequest", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/GetCredentialRequest;", "callback", "Lkotlin/Function1;", "Landroidx/credentials/GetCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Api35Impl {

    @NotNull
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void clearPendingGetCredentialRequest(@NotNull View view) {
        view.getClass();
        view.clearPendingCredentialRequest();
    }

    public final void setPendingGetCredentialRequest(@NotNull View view, @NotNull GetCredentialRequest request, @NotNull final Function1<? super GetCredentialResponse, Unit> callback) {
        view.getClass();
        request.getClass();
        callback.getClass();
        view.setPendingCredentialRequest(FrameworkImplHelper.INSTANCE.convertGetRequestToFrameworkClass(request), new OutcomeReceiver() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            public void onError(GetCredentialException error) {
                error.getClass();
                Log.w("ViewHandler", "Error: " + error.getType() + " , " + error.getMessage());
            }

            public void onResult(android.credentials.GetCredentialResponse response) {
                response.getClass();
                callback.invoke(FrameworkImplHelper.INSTANCE.convertGetResponseToJetpackClass(response));
            }
        });
    }
}
