package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.m1;
import com.amazon.identity.auth.device.n1;
import com.amazon.identity.auth.device.token.OAuthTokenManager$OAuthTokenManagerException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MAPErrorCallbackHelper {
    public static Bundle getErrorBundle(MAPError mAPError, String str, @NonNull m1 m1Var) {
        Bundle errorBundle = getErrorBundle(mAPError, str);
        n1 a2 = m1Var.a();
        if (a2 != null) {
            errorBundle.putAll(a2.c());
        }
        if (m1Var instanceof OAuthTokenManager$OAuthTokenManagerException) {
            errorBundle.putBoolean(MAPError.KEY_SHOULD_CLEAR_AUTH_COOKIES, ((OAuthTokenManager$OAuthTokenManagerException) m1Var).g());
        }
        return errorBundle;
    }

    public static Bundle getErrorBundleForActorAPI(MAPError mAPError, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(MAPError.KEY_ERROR_CODE, mAPError.getErrorCode());
        bundle.putString(MAPError.KEY_ERROR_MESSAGE, str);
        bundle.putString(MAPError.KEY_ERROR_TYPE, mAPError.getErrorType());
        bundle.putBoolean(MAPActorManager.KEY_RETRYABLE, z);
        return bundle;
    }

    @FireOsSdk
    public static void onError(Callback callback, MAPError mAPError) {
        callback.onError(getErrorBundle(mAPError));
    }

    @FireOsSdk
    public static void onError(Callback callback, MAPError mAPError, String str) {
        callback.onError(getErrorBundle(mAPError, str));
    }

    @FireOsSdk
    public static Bundle getErrorBundle(MAPError mAPError, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(MAPError.KEY_ERROR_CODE, mAPError.getErrorCode());
        bundle.putString(MAPError.KEY_ERROR_MESSAGE, str);
        bundle.putString(MAPError.KEY_ERROR_TYPE, mAPError.getErrorType());
        return bundle;
    }

    @FireOsSdk
    public static Bundle getErrorBundle(MAPError mAPError) {
        return getErrorBundle(mAPError, mAPError.getErrorMessage());
    }
}
