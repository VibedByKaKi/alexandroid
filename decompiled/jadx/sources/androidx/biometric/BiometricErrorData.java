package androidx.biometric;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class BiometricErrorData {
    private final int mErrorCode;

    @Nullable
    private final CharSequence mErrorMessage;

    public BiometricErrorData(int i, @Nullable CharSequence charSequence) {
        this.mErrorCode = i;
        this.mErrorMessage = charSequence;
    }

    @Nullable
    private static String convertToString(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean isErrorMessageEqualTo(@Nullable CharSequence charSequence) {
        String convertToString = convertToString(this.mErrorMessage);
        String convertToString2 = convertToString(charSequence);
        if (convertToString == null && convertToString2 == null) {
            return true;
        }
        return convertToString != null && convertToString.equals(convertToString2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof BiometricErrorData) {
            BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
            if (this.mErrorCode == biometricErrorData.mErrorCode && isErrorMessageEqualTo(biometricErrorData.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Nullable
    public CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mErrorCode), convertToString(this.mErrorMessage)});
    }
}
