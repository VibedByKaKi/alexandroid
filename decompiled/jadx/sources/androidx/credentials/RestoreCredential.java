package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.RequestValidationHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/credentials/RestoreCredential;", "Landroidx/credentials/Credential;", "authenticationResponseJson", "", "data", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getAuthenticationResponseJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RestoreCredential extends Credential {

    @NotNull
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_RESTORE_CREDENTIAL";

    @NotNull
    private final String authenticationResponseJson;

    private RestoreCredential(String str, Bundle bundle) {
        super(TYPE_RESTORE_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    @NotNull
    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/credentials/RestoreCredential$Companion;", "", "()V", "BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE", "", "TYPE_RESTORE_CREDENTIAL", "createFrom", "Landroidx/credentials/RestoreCredential;", "data", "Landroid/os/Bundle;", "createFrom$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RestoreCredential createFrom$credentials_release(@NotNull Bundle data) {
            data.getClass();
            String string = data.getString(RestoreCredential.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new RestoreCredential(string, data, null);
            }
            throw new NoCredentialException("The device does not contain a restore credential.");
        }

        private Companion() {
        }
    }

    public /* synthetic */ RestoreCredential(String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }
}
