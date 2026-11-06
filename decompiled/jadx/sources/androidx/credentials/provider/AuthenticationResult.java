package androidx.credentials.provider;

import androidx.annotation.RestrictTo;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult;", "", "authenticationType", "", "(I)V", "getAuthenticationType", "()I", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthenticationResult {

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private final int authenticationType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @VisibleForTesting
    @NotNull
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap = MapsKt.linkedMapOf(TuplesKt.to(2, 2), TuplesKt.to(1, 1));

    public AuthenticationResult(int i) {
        this.authenticationType = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthenticationResult) && this.authenticationType == ((AuthenticationResult) other).authenticationType;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authenticationType));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R2\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\t8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/credentials/provider/AuthenticationResult$Companion;", "", "()V", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE", "", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK", "biometricFrameworkToJetpackResultMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getBiometricFrameworkToJetpackResultMap$credentials_release", "()Ljava/util/LinkedHashMap;", "convertFrameworkBiometricResultToJetpack", "frameworkCode", "convertFrameworkBiometricResultToJetpack$credentials_release", "createFrom", "Landroidx/credentials/provider/AuthenticationResult;", "uiAuthenticationType", "isFrameworkBiometricPrompt", "", "createFrom$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AuthenticationResult createFrom$credentials_release$default(Companion companion, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return companion.createFrom$credentials_release(i, z);
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials_release(int frameworkCode) {
            if (!getBiometricFrameworkToJetpackResultMap$credentials_release().containsKey(Integer.valueOf(frameworkCode))) {
                ParcelCompat$$ExternalSyntheticOutline0.m(frameworkCode, "Non framework result code, ", ", ", AuthenticationError.INSTANCE.getTAG$credentials_release());
                return frameworkCode;
            }
            Integer num = getBiometricFrameworkToJetpackResultMap$credentials_release().get(Integer.valueOf(frameworkCode));
            num.getClass();
            num.getClass();
            return num.intValue();
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationResult createFrom$credentials_release(int uiAuthenticationType, boolean isFrameworkBiometricPrompt) {
            if (isFrameworkBiometricPrompt) {
                uiAuthenticationType = convertFrameworkBiometricResultToJetpack$credentials_release(uiAuthenticationType);
            }
            return new AuthenticationResult(uiAuthenticationType);
        }

        @NotNull
        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackResultMap$credentials_release() {
            return AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }

        private Companion() {
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationResult createFrom$credentials_release(int i) {
            return createFrom$credentials_release$default(this, i, false, 2, null);
        }
    }
}
