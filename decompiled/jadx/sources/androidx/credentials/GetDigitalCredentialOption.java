package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$InitiateChallengeAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalDigitalCredentialApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/credentials/GetDigitalCredentialOption;", "Landroidx/credentials/CredentialOption;", "requestJson", "", "(Ljava/lang/String;)V", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "allowedProviders", "", "Landroid/content/ComponentName;", "typePriorityHint", "", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "getRequestJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetDigitalCredentialOption extends CredentialOption {

    @NotNull
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String requestJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, boolean z2, @NotNull Set<ComponentName> set, int i) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, z, z2, set, i);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
        this.requestJson = str;
        if (RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }

    @NotNull
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/credentials/GetDigitalCredentialOption$Companion;", "", "()V", "BUNDLE_KEY_REQUEST_JSON", "", "createFrom", "Landroidx/credentials/GetDigitalCredentialOption;", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "requireSystemProvider", "", "allowedProviders", "", "Landroid/content/ComponentName;", "createFrom$credentials_release", "toBundle", "requestJson", "toBundle$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GetDigitalCredentialOption createFrom$credentials_release(@NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean requireSystemProvider, @NotNull Set<ComponentName> allowedProviders) {
            requestData.getClass();
            candidateQueryData.getClass();
            allowedProviders.getClass();
            try {
                String string = requestData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                string.getClass();
                return new GetDigitalCredentialOption(string, requestData, candidateQueryData, requireSystemProvider, requestData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, requestData.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100));
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final Bundle toBundle$credentials_release(@NotNull String requestJson) {
            requestJson.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GetDigitalCredentialOption(@org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r9 = this;
            r10.getClass()
            androidx.credentials.GetDigitalCredentialOption$Companion r0 = androidx.credentials.GetDigitalCredentialOption.INSTANCE
            android.os.Bundle r3 = r0.toBundle$credentials_release(r10)
            android.os.Bundle r4 = r0.toBundle$credentials_release(r10)
            java.util.Set r7 = kotlin.collections.SetsKt.emptySet()
            r8 = 100
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.GetDigitalCredentialOption.<init>(java.lang.String):void");
    }
}
