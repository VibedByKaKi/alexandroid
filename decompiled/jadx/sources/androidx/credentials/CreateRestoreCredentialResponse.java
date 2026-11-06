package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.internal.RequestValidationHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "responseJson", "", "(Ljava/lang/String;)V", "data", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getResponseJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateRestoreCredentialResponse extends CreateCredentialResponse {

    @NotNull
    public static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String responseJson;

    private CreateRestoreCredentialResponse(String str, Bundle bundle) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final CreateRestoreCredentialResponse createFrom(@NotNull Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    @NotNull
    public final String getResponseJson() {
        return this.responseJson;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse$Companion;", "", "()V", "BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE", "", "createFrom", "Landroidx/credentials/CreateRestoreCredentialResponse;", "data", "Landroid/os/Bundle;", "toBundle", "responseJson", "toBundle$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CreateRestoreCredentialResponse createFrom(@NotNull Bundle data) {
            data.getClass();
            String string = data.getString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new CreateRestoreCredentialResponse(string, data, null);
            }
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }

        @JvmStatic
        @NotNull
        public final Bundle toBundle$credentials_release(@NotNull String responseJson) {
            responseJson.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, responseJson);
            return bundle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateRestoreCredentialResponse(String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialResponse(@NotNull String str) {
        this(str, INSTANCE.toBundle$credentials_release(str));
        str.getClass();
    }
}
