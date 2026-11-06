package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bBO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/credentials/CreatePasswordRequest;", "Landroidx/credentials/CreateCredentialRequest;", "id", "", "password", "origin", "preferImmediatelyAvailableCredentials", "", "isAutoSelectAllowed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getPassword", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreatePasswordRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePasswordRequest.kt\nandroidx/credentials/CreatePasswordRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes13.dex */
public final class CreatePasswordRequest extends CreateCredentialRequest {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;

    @NotNull
    private final String password;

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, displayInfo, (i & 16) != 0 ? null : str3, z2, (i & 64) != 0 ? INSTANCE.toCredentialDataBundle$credentials_release(str, str2) : bundle, (i & 128) != 0 ? INSTANCE.toCandidateDataBundle$credentials_release() : bundle2);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\tH\u0001¢\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0012R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/credentials/CreatePasswordRequest$Companion;", "", "()V", "BUNDLE_KEY_ID", "", "BUNDLE_KEY_PASSWORD", "createFrom", "Landroidx/credentials/CreatePasswordRequest;", "data", "Landroid/os/Bundle;", "origin", "candidateQueryData", "createFrom$credentials_release", "toCandidateDataBundle", "toCandidateDataBundle$credentials_release", "toCredentialDataBundle", "id", "password", "toCredentialDataBundle$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RequiresApi(23)
        @NotNull
        public final CreatePasswordRequest createFrom$credentials_release(@NotNull Bundle data, @Nullable String origin, @NotNull Bundle candidateQueryData) {
            CreateCredentialRequest.DisplayInfo displayInfo;
            data.getClass();
            candidateQueryData.getClass();
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                string.getClass();
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                string2.getClass();
                try {
                    displayInfo = CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(data);
                } catch (IllegalArgumentException unused) {
                    displayInfo = new CreateCredentialRequest.DisplayInfo(string, null);
                }
                return new CreatePasswordRequest(string, string2, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), displayInfo, origin, data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), data, candidateQueryData, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final Bundle toCandidateDataBundle$credentials_release() {
            return new Bundle();
        }

        @JvmStatic
        @NotNull
        public final Bundle toCredentialDataBundle$credentials_release(@NotNull String id, @NotNull String password) {
            id.getClass();
            password.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(str, str2, str3, false, false, 24, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        this(str, str2, str3, z, false, 16, null);
        str.getClass();
        str2.getClass();
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, displayInfo, str3, z2, bundle, bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, false, false, 28, null);
        str.getClass();
        str2.getClass();
    }

    private CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str3, z2);
        this.id = str;
        this.password = str2;
        if (str2.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("password should not be empty");
        throw null;
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null), str3, z, null, null, 192, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null, str4), str3, z, null, null, 192, null);
        str.getClass();
        str2.getClass();
    }
}
