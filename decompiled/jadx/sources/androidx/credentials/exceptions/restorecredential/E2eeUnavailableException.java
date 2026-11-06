package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/E2eeUnavailableException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "errorMessage", "", "(Ljava/lang/CharSequence;)V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class E2eeUnavailableException extends CreateCredentialException {

    @NotNull
    public static final String TYPE_E2EE_UNAVAILABLE_EXCEPTION = "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2eeUnavailableException(@NotNull CharSequence charSequence) {
        super(TYPE_E2EE_UNAVAILABLE_EXCEPTION, charSequence);
        charSequence.getClass();
    }
}
