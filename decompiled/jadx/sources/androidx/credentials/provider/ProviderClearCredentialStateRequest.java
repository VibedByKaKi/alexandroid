package androidx.credentials.provider;

import android.os.Bundle;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "(Landroidx/credentials/provider/CallingAppInfo;)V", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProviderClearCredentialStateRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CallingAppInfo callingAppInfo;

    public ProviderClearCredentialStateRequest(@NotNull CallingAppInfo callingAppInfo) {
        callingAppInfo.getClass();
        this.callingAppInfo = callingAppInfo;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return INSTANCE.asBundle(providerClearCredentialStateRequest);
    }

    @JvmStatic
    @NotNull
    public static final ProviderClearCredentialStateRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest$Companion;", "", "()V", "asBundle", "Landroid/os/Bundle;", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull ProviderClearCredentialStateRequest request) {
            request.getClass();
            Bundle bundle = new Bundle();
            CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @JvmStatic
        @NotNull
        public final ProviderClearCredentialStateRequest fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.INSTANCE.extractCallingAppInfo$credentials_release(bundle);
            if (extractCallingAppInfo$credentials_release != null) {
                return new ProviderClearCredentialStateRequest(extractCallingAppInfo$credentials_release);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Bundle was missing CallingAppInfo.");
            return null;
        }

        private Companion() {
        }
    }
}
