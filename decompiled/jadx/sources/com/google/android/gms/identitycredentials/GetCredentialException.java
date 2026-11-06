package com.google.android.gms.identitycredentials;

import androidx.annotation.NonNull;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \n2\u00060\u0002j\u0002`\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCredentialException extends Exception {

    @NotNull
    public static final String ERROR_TYPE_NO_CREDENTIAL = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL";

    @NotNull
    public static final String ERROR_TYPE_UNKNOWN = "android.credentials.GetCredentialException.TYPE_UNKNOWN";

    @NotNull
    public static final String ERROR_TYPE_USER_CANCELED = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";

    @NotNull
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(@NonNull String str, @Nullable String str2) {
        super(str2);
        str.getClass();
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
