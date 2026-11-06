package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.RequestValidationUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "candidateQueryData", "Landroid/os/Bundle;", "id", "", "requestJson", "clientDataHash", "", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[B)V", "getClientDataHash", "()[B", "getRequestJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BeginGetPublicKeyCredentialOption extends BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final byte[] clientDataHash;

    @NotNull
    private final String requestJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BeginGetPublicKeyCredentialOption(@NotNull Bundle bundle, @NotNull String str, @NotNull String str2, @Nullable byte[] bArr) {
        super(str, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        bundle.getClass();
        str.getClass();
        str2.getClass();
        this.requestJson = str2;
        this.clientDataHash = bArr;
        if (RequestValidationUtil.INSTANCE.isValidJSON(str2)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("requestJson must not be empty, and must be a valid JSON");
        throw null;
    }

    @Nullable
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @NotNull
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption$Companion;", "", "()V", "createFrom", "Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "data", "Landroid/os/Bundle;", "id", "", "createFrom$credentials_release", "createFromEntrySlice", "createFromEntrySlice$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BeginGetPublicKeyCredentialOption createFrom$credentials_release(@NotNull Bundle data, @NotNull String id) {
            data.getClass();
            id.getClass();
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                string.getClass();
                return new BeginGetPublicKeyCredentialOption(data, id, string, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final BeginGetPublicKeyCredentialOption createFromEntrySlice$credentials_release(@NotNull Bundle data, @NotNull String id) {
            data.getClass();
            id.getClass();
            return new BeginGetPublicKeyCredentialOption(data, id, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, str2, (i & 8) != 0 ? null : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BeginGetPublicKeyCredentialOption(@NotNull Bundle bundle, @NotNull String str, @NotNull String str2) {
        this(bundle, str, str2, null, 8, null);
        bundle.getClass();
        str.getClass();
        str2.getClass();
    }
}
