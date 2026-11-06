package androidx.credentials;

import android.os.Bundle;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/ClearCredentialStateRequest;", "", "requestType", "", "(Ljava/lang/String;)V", "requestBundle", "Landroid/os/Bundle;", "getRequestBundle", "()Landroid/os/Bundle;", "getRequestType", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClearCredentialStateRequest {

    @NotNull
    private static final String BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST";

    @NotNull
    public static final String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";

    @NotNull
    public static final String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";

    @NotNull
    private final Bundle requestBundle;

    @NotNull
    private final String requestType;

    @JvmOverloads
    public ClearCredentialStateRequest(@NotNull String str) {
        str.getClass();
        this.requestType = str;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (!Intrinsics.areEqual(str, TYPE_CLEAR_CREDENTIAL_STATE) && !Intrinsics.areEqual(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The request type ", str, " is not supported."));
            throw null;
        }
        if (Intrinsics.areEqual(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            bundle.putBoolean(BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST, true);
        }
    }

    @NotNull
    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialStateRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }
}
