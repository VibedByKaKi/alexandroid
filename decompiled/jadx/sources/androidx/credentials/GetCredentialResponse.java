package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/GetCredentialResponse;", "", "credential", "Landroidx/credentials/Credential;", "(Landroidx/credentials/Credential;)V", "getCredential", "()Landroidx/credentials/Credential;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CREDENTIAL_DATA = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA";

    @NotNull
    private static final String EXTRA_CREDENTIAL_TYPE = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE";

    @NotNull
    private final Credential credential;

    public GetCredentialResponse(@NotNull Credential credential) {
        credential.getClass();
        this.credential = credential;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle asBundle(@NotNull GetCredentialResponse getCredentialResponse) {
        return INSTANCE.asBundle(getCredentialResponse);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final GetCredentialResponse fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final Credential getCredential() {
        return this.credential;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/credentials/GetCredentialResponse$Companion;", "", "()V", "EXTRA_CREDENTIAL_DATA", "", "EXTRA_CREDENTIAL_TYPE", "asBundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/GetCredentialResponse;", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle asBundle(@NotNull GetCredentialResponse response) {
            response.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE, response.getCredential().getType());
            bundle.putBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA, response.getCredential().getData());
            return bundle;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final GetCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Bundle bundle2;
            bundle.getClass();
            String string = bundle.getString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA)) == null) {
                return null;
            }
            return new GetCredentialResponse(Credential.INSTANCE.createFrom(string, bundle2));
        }

        private Companion() {
        }
    }
}
