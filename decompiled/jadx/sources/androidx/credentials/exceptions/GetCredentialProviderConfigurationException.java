package androidx.credentials.exceptions;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;", "Landroidx/credentials/exceptions/GetCredentialException;", "errorMessage", "", "(Ljava/lang/CharSequence;)V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCredentialProviderConfigurationException extends GetCredentialException {

    @NotNull
    public static final String TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION = "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";

    public /* synthetic */ GetCredentialProviderConfigurationException(CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GetCredentialProviderConfigurationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public GetCredentialProviderConfigurationException(@Nullable CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION, charSequence);
    }
}
