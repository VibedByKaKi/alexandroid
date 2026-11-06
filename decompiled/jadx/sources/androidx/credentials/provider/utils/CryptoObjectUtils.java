package androidx.credentials.provider.utils;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils;", "", "()V", "getOperationHandle", "", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "wrapForBiometricPrompt", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "Api28Impl", "Api30Impl", "Api35Impl", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoObjectUtils {

    @NotNull
    public static final CryptoObjectUtils INSTANCE = new CryptoObjectUtils();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(30)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api30Impl;", "", "()V", "create", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "identityCredential", "Landroid/security/identity/IdentityCredential;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api30Impl {

        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull IdentityCredential identityCredential) {
            identityCredential.getClass();
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(35)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api35Impl;", "", "()V", "getOperationHandle", "", PayloadUtils.PayloadKeys.CRYPTO, "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public final long getOperationHandle(@NotNull BiometricPrompt.CryptoObject crypto) {
            crypto.getClass();
            return crypto.getOperationHandle();
        }
    }

    private CryptoObjectUtils() {
    }

    @RequiresApi(35)
    public final long getOperationHandle(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        BiometricPrompt.CryptoObject wrapForBiometricPrompt = wrapForBiometricPrompt(cryptoObject);
        if (wrapForBiometricPrompt != null) {
            return Api35Impl.INSTANCE.getOperationHandle(wrapForBiometricPrompt);
        }
        return 0L;
    }

    @RequiresApi(28)
    @Nullable
    public final BiometricPrompt.CryptoObject wrapForBiometricPrompt(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.INSTANCE.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.INSTANCE.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.INSTANCE.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return Api30Impl.INSTANCE.create(identityCredential);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api28Impl;", "", "()V", "create", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", PayloadUtils.PayloadKeys.SIGNATURE, "Ljava/security/Signature;", "cipher", "Ljavax/crypto/Cipher;", "mac", "Ljavax/crypto/Mac;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Cipher cipher) {
            cipher.getClass();
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Signature signature) {
            signature.getClass();
            return new BiometricPrompt.CryptoObject(signature);
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Mac mac) {
            mac.getClass();
            return new BiometricPrompt.CryptoObject(mac);
        }
    }
}
