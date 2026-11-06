package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.domerrors.DomError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "domError", "Landroidx/credentials/exceptions/domerrors/DomError;", "errorMessage", "", "(Landroidx/credentials/exceptions/domerrors/DomError;Ljava/lang/CharSequence;)V", "getDomError", "()Landroidx/credentials/exceptions/domerrors/DomError;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateRestoreCredentialDomException extends CreateCredentialException {

    @NotNull
    public static final String TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION = "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION";

    @NotNull
    private final DomError domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialDomException(@NotNull DomError domError, @NotNull CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/" + domError.getType(), charSequence);
        domError.getClass();
        charSequence.getClass();
        this.domError = domError;
    }

    @NotNull
    public final DomError getDomError() {
        return this.domError;
    }
}
