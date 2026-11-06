package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/CreateCredentialResponse;", "", "type", "", "data", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getData", "()Landroid/os/Bundle;", "getType", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CreateCredentialResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA";

    @NotNull
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE";

    @NotNull
    private final Bundle data;

    @NotNull
    private final String type;

    public CreateCredentialResponse(@NotNull String str, @NotNull Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.type = str;
        this.data = bundle;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle asBundle(@NotNull CreateCredentialResponse createCredentialResponse) {
        return INSTANCE.asBundle(createCredentialResponse);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final CreateCredentialResponse createFrom(@NotNull String str, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(str, bundle);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final CreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final Bundle getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/credentials/CreateCredentialResponse$Companion;", "", "()V", "EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA", "", "EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE", "asBundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/CreateCredentialResponse;", "createFrom", "type", "data", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle asBundle(@NotNull CreateCredentialResponse response) {
            response.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE, response.getType());
            bundle.putBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA, response.getData());
            return bundle;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final CreateCredentialResponse createFrom(@NotNull String type, @NotNull Bundle data) {
            type.getClass();
            data.getClass();
            try {
                if (Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    return CreatePasswordResponse.INSTANCE.createFrom$credentials_release(data);
                }
                if (Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    return CreatePublicKeyCredentialResponse.INSTANCE.createFrom$credentials_release(data);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCustomCredentialResponse(type, data);
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Bundle bundle2;
            bundle.getClass();
            String string = bundle.getString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA)) == null) {
                return null;
            }
            return createFrom(string, bundle2);
        }

        private Companion() {
        }
    }
}
