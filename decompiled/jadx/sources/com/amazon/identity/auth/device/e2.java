package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f589a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f589a = sparseIntArray;
        MAPAccountManager.RegistrationError registrationError = MAPAccountManager.RegistrationError.BAD_REQUEST;
        sparseIntArray.append(7, registrationError.value());
        sparseIntArray.append(8, registrationError.value());
        MAPAccountManager.RegistrationError registrationError2 = MAPAccountManager.RegistrationError.REGISTER_FAILED;
        sparseIntArray.append(4, registrationError2.value());
        sparseIntArray.append(5, MAPAccountManager.RegistrationError.PARSE_ERROR.value());
        sparseIntArray.append(3, MAPAccountManager.RegistrationError.NETWORK_FAILURE.value());
        sparseIntArray.append(1, registrationError2.value());
        sparseIntArray.append(6, MAPAccountManager.RegistrationError.UNRECOGNIZED.value());
    }

    public static Bundle a(MAPError.CommonError commonError, String str, int i, String str2) {
        int i2 = f589a.get(i, Integer.MIN_VALUE);
        Integer valueOf = i2 == Integer.MIN_VALUE ? null : Integer.valueOf(i2);
        Bundle bundle = new Bundle();
        if (valueOf != null) {
            bundle = a((MAPError) commonError, str, valueOf.intValue(), str2);
        }
        bundle.putInt("errorCode", i);
        bundle.putString("errorMessage", str2);
        return bundle;
    }

    public static Bundle a(MAPError mAPError, String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.amazon.dcp.sso.ErrorCode", i);
        bundle.putString("com.amazon.dcp.sso.ErrorMessage", str2);
        bundle.putInt(MAPError.KEY_ERROR_CODE, mAPError.getErrorCode());
        bundle.putString(MAPError.KEY_ERROR_MESSAGE, str);
        bundle.putString(MAPError.KEY_ERROR_TYPE, mAPError.getErrorType());
        return bundle;
    }

    public static void a(Callback callback, MAPError mAPError, String str, int i, String str2, Bundle bundle) {
        if (callback == null) {
            return;
        }
        Bundle a2 = a(mAPError, str, i, str2);
        if (bundle != null) {
            a2.putAll(bundle);
        }
        callback.onError(a2);
    }

    public static Bundle a(String str) {
        Bundle a2 = a(MAPError.AccountError.ACCOUNT_ALREADY_REGISTERED, "Account has already been registered on this device", MAPAccountManager.RegistrationError.ACCOUNT_ALREADY_EXISTS.value(), "Account has already been registered on this device");
        if (!TextUtils.isEmpty(str)) {
            a2.putString("com.amazon.dcp.sso.property.account.acctId", str);
        }
        return a2;
    }
}
