package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.biometric.BiometricPrompt;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.dee.app.contacts.common.constants.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u001d\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData;", "", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "allowedAuthenticators", "", "(Landroidx/biometric/BiometricPrompt$CryptoObject;I)V", "isCreatedFromBundle", "", "(Landroidx/biometric/BiometricPrompt$CryptoObject;IZ)V", "getAllowedAuthenticators", "()I", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "Api35Impl", "ApiMinImpl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BiometricPromptData {

    @NotNull
    public static final String BUNDLE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS";

    @NotNull
    public static final String BUNDLE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.BUNDLE_HINT_CRYPTO_OP_ID";

    @NotNull
    private static final String TAG = "BiometricPromptData";
    private final int allowedAuthenticators;

    @Nullable
    private final BiometricPrompt.CryptoObject cryptoObject;
    private boolean isCreatedFromBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<Integer> ALLOWED_AUTHENTICATOR_VALUES = SetsKt.setOf((Object[]) new Integer[]{15, 255, 32768, 32783, 33023});

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(35)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Api35Impl;", "", "()V", "fromBundle", "Landroidx/credentials/provider/BiometricPromptData;", "bundle", "Landroid/os/Bundle;", "toBundle", "biometricPromptData", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            biometricPromptData.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            if (biometricPromptData.getCryptoObject() != null) {
                bundle.putLong(BiometricPromptData.BUNDLE_HINT_CRYPTO_OP_ID, CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()));
            }
            return bundle;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$ApiMinImpl;", "", "()V", "fromBundle", "Landroidx/credentials/provider/BiometricPromptData;", "bundle", "Landroid/os/Bundle;", "toBundle", "biometricPromptData", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApiMinImpl {

        @NotNull
        public static final ApiMinImpl INSTANCE = new ApiMinImpl();

        private ApiMinImpl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true, 1, null);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            biometricPromptData.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            return bundle;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Builder;", "", "()V", "allowedAuthenticators", "", "Ljava/lang/Integer;", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/credentials/provider/BiometricPromptData;", "setAllowedAuthenticators", "setCryptoObject", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private Integer allowedAuthenticators;

        @Nullable
        private BiometricPrompt.CryptoObject cryptoObject;

        @NotNull
        public final BiometricPromptData build() {
            Integer num = this.allowedAuthenticators;
            return new BiometricPromptData(this.cryptoObject, num != null ? num.intValue() : 255);
        }

        @NotNull
        public final Builder setAllowedAuthenticators(int allowedAuthenticators) {
            this.allowedAuthenticators = Integer.valueOf(allowedAuthenticators);
            return this;
        }

        @NotNull
        public final Builder setCryptoObject(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
            this.cryptoObject = cryptoObject;
            return this;
        }
    }

    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject, int i, boolean z) {
        this.cryptoObject = cryptoObject;
        this.allowedAuthenticators = i;
        this.isCreatedFromBundle = z;
        if (!z && !ALLOWED_AUTHENTICATOR_VALUES.contains(Integer.valueOf(i))) {
            Single$$ExternalSyntheticBUOutline0.m$3("The allowed authenticator must be specified according to the BiometricPrompt spec.");
            throw null;
        }
        if (cryptoObject == null || INSTANCE.isStrongAuthenticationType(Integer.valueOf(i))) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("If the cryptoObject is non-null, the allowedAuthenticator value must be Authenticators.BIOMETRIC_STRONG.");
        throw null;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
        return INSTANCE.toBundle(biometricPromptData);
    }

    public final int getAllowedAuthenticators() {
        return this.allowedAuthenticators;
    }

    @Nullable
    public final BiometricPrompt.CryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/BiometricPromptData$Companion;", "", "()V", "ALLOWED_AUTHENTICATOR_VALUES", "", "", "BUNDLE_HINT_ALLOWED_AUTHENTICATORS", "", "BUNDLE_HINT_CRYPTO_OP_ID", Constants.LOG_TAG, "fromBundle", "Landroidx/credentials/provider/BiometricPromptData;", "bundle", "Landroid/os/Bundle;", "isStrongAuthenticationType", "", "authenticationTypes", "(Ljava/lang/Integer;)Z", "toBundle", "biometricPromptData", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isStrongAuthenticationType(Integer authenticationTypes) {
            return authenticationTypes != null && (authenticationTypes.intValue() & 240) == 0;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            try {
                if (bundle.containsKey(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS)) {
                    return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromBundle(bundle) : ApiMinImpl.fromBundle(bundle);
                }
                throw new IllegalArgumentException("Bundle lacks allowed authenticator key.");
            } catch (Exception e) {
                Log.i(BiometricPromptData.TAG, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            biometricPromptData.getClass();
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toBundle(biometricPromptData) : ApiMinImpl.toBundle(biometricPromptData);
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        this(cryptoObject, 0, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BiometricPromptData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cryptoObject, (i2 & 2) != 0 ? 255 : i, (i2 & 4) != 0 ? false : z);
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cryptoObject, (i2 & 2) != 0 ? 255 : i);
    }

    @JvmOverloads
    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject, int i) {
        this(cryptoObject, i, false);
    }
}
