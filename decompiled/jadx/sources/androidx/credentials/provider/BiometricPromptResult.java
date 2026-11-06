package androidx.credentials.provider;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/BiometricPromptResult;", "", "authenticationError", "Landroidx/credentials/provider/AuthenticationError;", "(Landroidx/credentials/provider/AuthenticationError;)V", "authenticationResult", "Landroidx/credentials/provider/AuthenticationResult;", "(Landroidx/credentials/provider/AuthenticationResult;)V", "(Landroidx/credentials/provider/AuthenticationResult;Landroidx/credentials/provider/AuthenticationError;)V", "getAuthenticationError", "()Landroidx/credentials/provider/AuthenticationError;", "getAuthenticationResult", "()Landroidx/credentials/provider/AuthenticationResult;", "isSuccessful", "", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BiometricPromptResult {

    @Nullable
    private final AuthenticationError authenticationError;

    @Nullable
    private final AuthenticationResult authenticationResult;
    private final boolean isSuccessful;

    public BiometricPromptResult(@Nullable AuthenticationResult authenticationResult, @Nullable AuthenticationError authenticationError) {
        this.authenticationResult = authenticationResult;
        this.authenticationError = authenticationError;
        this.isSuccessful = authenticationResult != null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BiometricPromptResult) {
            BiometricPromptResult biometricPromptResult = (BiometricPromptResult) other;
            if (this.isSuccessful == biometricPromptResult.isSuccessful && Intrinsics.areEqual(this.authenticationResult, biometricPromptResult.authenticationResult) && Intrinsics.areEqual(this.authenticationError, biometricPromptResult.authenticationError)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final AuthenticationError getAuthenticationError() {
        return this.authenticationError;
    }

    @Nullable
    public final AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSuccessful), this.authenticationResult, this.authenticationError);
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authenticationResult, (i & 2) != 0 ? null : authenticationError);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(@NotNull AuthenticationError authenticationError) {
        this(null, authenticationError);
        authenticationError.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(@NotNull AuthenticationResult authenticationResult) {
        this(authenticationResult, null);
        authenticationResult.getClass();
    }
}
