package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class AuthenticationCallbackProvider {

    @Nullable
    private BiometricPrompt.AuthenticationCallback mBiometricCallback;

    @Nullable
    private FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;

    @NonNull
    final Listener mListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @NonNull
        public static BiometricPrompt.AuthenticationCallback createCallback(@NonNull final Listener listener) {
            return new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.Api28Impl.1
                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    Listener.this.onError(i, charSequence);
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationFailed() {
                    Listener.this.onFailure();
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject unwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(authenticationResult.getCryptoObject()) : null;
                    int i = Build.VERSION.SDK_INT;
                    int i2 = -1;
                    if (i >= 30) {
                        if (authenticationResult != null) {
                            i2 = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (i != 29) {
                        i2 = 2;
                    }
                    Listener.this.onSuccess(new BiometricPrompt.AuthenticationResult(unwrapFromBiometricPrompt, i2));
                }

                @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }
            };
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int getAuthenticationType(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public AuthenticationCallbackProvider(@NonNull Listener listener) {
        this.mListener = listener;
    }

    @NonNull
    @RequiresApi(28)
    public BiometricPrompt.AuthenticationCallback getBiometricCallback() {
        if (this.mBiometricCallback == null) {
            this.mBiometricCallback = Api28Impl.createCallback(this.mListener);
        }
        return this.mBiometricCallback;
    }

    @NonNull
    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        if (this.mFingerprintCallback == null) {
            this.mFingerprintCallback = new FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.1
                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onError(i, charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationFailed() {
                    AuthenticationCallbackProvider.this.mListener.onFailure();
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()) : null, 2));
                }
            };
        }
        return this.mFingerprintCallback;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Listener {
        public void onFailure() {
        }

        public void onHelp(@Nullable CharSequence charSequence) {
        }

        public void onSuccess(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        }

        public void onError(int i, @Nullable CharSequence charSequence) {
        }
    }
}
