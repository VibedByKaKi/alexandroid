package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$InitiateChallengeAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tBA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/credentials/GetPublicKeyCredentialOption;", "Landroidx/credentials/CredentialOption;", "requestJson", "", "clientDataHash", "", "allowedProviders", "", "Landroid/content/ComponentName;", "(Ljava/lang/String;[BLjava/util/Set;)V", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "typePriorityCategory", "", "(Ljava/lang/String;[BLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "getClientDataHash", "()[B", "getRequestJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPublicKeyCredentialOption extends CredentialOption {

    @NotNull
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    @NotNull
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    @NotNull
    public static final String BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final byte[] clientDataHash;

    @NotNull
    private final String requestJson;

    private GetPublicKeyCredentialOption(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2, int i) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, true, set, i);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (RequestValidationHelper.INSTANCE.isValidJSON(str)) {
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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/credentials/GetPublicKeyCredentialOption$Companion;", "", "()V", "BUNDLE_KEY_CLIENT_DATA_HASH", "", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "createFrom", "Landroidx/credentials/GetPublicKeyCredentialOption;", "data", "Landroid/os/Bundle;", "allowedProviders", "", "Landroid/content/ComponentName;", "candidateQueryData", "createFrom$credentials_release", "toRequestDataBundle", "requestJson", "clientDataHash", "", "toRequestDataBundle$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GetPublicKeyCredentialOption createFrom$credentials_release(@NotNull Bundle data, @NotNull Set<ComponentName> allowedProviders, @NotNull Bundle candidateQueryData) {
            data.getClass();
            allowedProviders.getClass();
            candidateQueryData.getClass();
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                string.getClass();
                return new GetPublicKeyCredentialOption(string, byteArray, allowedProviders, data, candidateQueryData, data.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100), null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final Bundle toRequestDataBundle$credentials_release(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            requestJson.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetPublicKeyCredentialOption(@NotNull String str, @Nullable byte[] bArr) {
        this(str, bArr, null, 4, null);
        str.getClass();
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, set, bundle, bundle2, i);
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, set, bundle, bundle2, (i2 & 32) != 0 ? 100 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetPublicKeyCredentialOption(@NotNull String str) {
        this(str, null, null, 6, null);
        str.getClass();
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GetPublicKeyCredentialOption(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.Nullable byte[] r12, @org.jetbrains.annotations.NotNull java.util.Set<android.content.ComponentName> r13) {
        /*
            r10 = this;
            r11.getClass()
            r13.getClass()
            androidx.credentials.GetPublicKeyCredentialOption$Companion r0 = androidx.credentials.GetPublicKeyCredentialOption.INSTANCE
            android.os.Bundle r5 = r0.toRequestDataBundle$credentials_release(r11, r12)
            android.os.Bundle r6 = r0.toRequestDataBundle$credentials_release(r11, r12)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.GetPublicKeyCredentialOption.<init>(java.lang.String, byte[], java.util.Set):void");
    }
}
