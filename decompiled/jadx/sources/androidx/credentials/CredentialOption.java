package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$InitiateChallengeAction;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bBE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/credentials/CredentialOption;", "", "type", "", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "allowedProviders", "", "Landroid/content/ComponentName;", "typePriorityHint", "", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "getAllowedProviders", "()Ljava/util/Set;", "getCandidateQueryData", "()Landroid/os/Bundle;", "()Z", "getRequestData", "getType", "()Ljava/lang/String;", "getTypePriorityHint", "()I", "Companion", "PriorityHints", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CredentialOption {

    @NotNull
    public static final String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    @NotNull
    public static final String BUNDLE_KEY_TYPE_PRIORITY_VALUE = "androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int PRIORITY_DEFAULT = 2000;
    public static final int PRIORITY_OIDC_OR_SIMILAR = 500;
    public static final int PRIORITY_PASSKEY_OR_SIMILAR = 100;
    public static final int PRIORITY_PASSWORD_OR_SIMILAR = 1000;

    @NotNull
    private final Set<ComponentName> allowedProviders;

    @NotNull
    private final Bundle candidateQueryData;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;

    @NotNull
    private final Bundle requestData;

    @NotNull
    private final String type;
    private final int typePriorityHint;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/credentials/CredentialOption$PriorityHints;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface PriorityHints {
    }

    public CredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, boolean z2, @NotNull Set<ComponentName> set, int i) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
        this.type = str;
        this.requestData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.allowedProviders = set;
        this.typePriorityHint = i;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
        bundle2.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
    }

    @JvmStatic
    @NotNull
    public static final CredentialOption createFrom(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, @NotNull Set<ComponentName> set) {
        return INSTANCE.createFrom(str, bundle, bundle2, z, set);
    }

    @NotNull
    public final Set<ComponentName> getAllowedProviders() {
        return this.allowedProviders;
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getTypePriorityHint() {
        return this.typePriorityHint;
    }

    /* renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* renamed from: isSystemProviderRequired, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/credentials/CredentialOption$Companion;", "", "()V", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "", "BUNDLE_KEY_TYPE_PRIORITY_VALUE", "PRIORITY_DEFAULT", "", "PRIORITY_OIDC_OR_SIMILAR", "PRIORITY_PASSKEY_OR_SIMILAR", "PRIORITY_PASSWORD_OR_SIMILAR", "createFrom", "Landroidx/credentials/CredentialOption;", "option", "Landroid/credentials/CredentialOption;", "type", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "requireSystemProvider", "", "allowedProviders", "", "Landroid/content/ComponentName;", "extractAutoSelectValue", "data", "extractAutoSelectValue$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CredentialOption createFrom(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean requireSystemProvider, @NotNull Set<ComponentName> allowedProviders) {
            type.getClass();
            requestData.getClass();
            candidateQueryData.getClass();
            allowedProviders.getClass();
            try {
                int hashCode = type.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && type.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            String string = requestData.getString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                            if (string != null && string.hashCode() == -613058807 && string.equals(GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION)) {
                                return GetPublicKeyCredentialOption.INSTANCE.createFrom$credentials_release(requestData, allowedProviders, candidateQueryData);
                            }
                            throw new FrameworkClassParsingException();
                        }
                    } else if (type.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return GetPasswordOption.INSTANCE.createFrom$credentials_release(requestData, allowedProviders, candidateQueryData);
                    }
                } else if (type.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return GetDigitalCredentialOption.INSTANCE.createFrom$credentials_release(requestData, candidateQueryData, requireSystemProvider, allowedProviders);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new GetCustomCredentialOption(requestData, type, candidateQueryData, requireSystemProvider, requestData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, requestData.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 2000));
            }
        }

        public final boolean extractAutoSelectValue$credentials_release(@NotNull Bundle data) {
            data.getClass();
            return data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final CredentialOption createFrom(@NotNull android.credentials.CredentialOption option) {
            option.getClass();
            String type = option.getType();
            type.getClass();
            Bundle credentialRetrievalData = option.getCredentialRetrievalData();
            credentialRetrievalData.getClass();
            Bundle candidateQueryData = option.getCandidateQueryData();
            candidateQueryData.getClass();
            boolean isSystemProviderRequired = option.isSystemProviderRequired();
            Set<ComponentName> allowedProviders = option.getAllowedProviders();
            allowedProviders.getClass();
            return createFrom(type, credentialRetrievalData, candidateQueryData, isSystemProviderRequired, allowedProviders);
        }
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final CredentialOption createFrom(@NotNull android.credentials.CredentialOption credentialOption) {
        return INSTANCE.createFrom(credentialOption);
    }
}
