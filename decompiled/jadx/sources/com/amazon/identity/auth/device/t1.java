package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.RegistrationType;
import com.amazon.identity.kcpsdk.auth.DeregisterDeviceErrorType;
import com.amazon.identity.kcpsdk.auth.RegisterDeviceErrorType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f965a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DeregisterDeviceErrorType.values().length];
        c = iArr;
        try {
            iArr[DeregisterDeviceErrorType.DeregisterDeviceErrorTypeFailed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr2 = new int[RegistrationType.values().length];
        b = iArr2;
        try {
            iArr2[RegistrationType.WITH_LOGIN_CREDENTIALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[RegistrationType.WITH_DEVICE_SECRET.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[RegistrationType.FROM_ATMAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[RegistrationType.FROM_AUTH_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[RegistrationType.FROM_ACCESS_TOKEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[RegistrationType.FROM_ADP_TOKEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[RegistrationType.WITH_EXPLICIT_URL.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            b[RegistrationType.REGISTER_DELEGATED_ACCOUNT.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[RegistrationType.WITH_DIRECTEDID_CREDENTIALS.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            b[RegistrationType.WITH_PRIMARY_DIRECTEDID_CREDENTIALS.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            b[RegistrationType.WITH_LINK_CODE.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            b[RegistrationType.WITH_SSO_CODE.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            b[RegistrationType.ANONYMOUS.ordinal()] = 13;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[RegistrationType.FROM_AUTHORIZATION_CODE.ordinal()] = 14;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            b[RegistrationType.SHUMA_ADDITIONAL_ACCOUNT.ordinal()] = 15;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            b[RegistrationType.WITH_OAUTH.ordinal()] = 16;
        } catch (NoSuchFieldError unused17) {
        }
        int[] iArr3 = new int[RegisterDeviceErrorType.values().length];
        f965a = iArr3;
        try {
            iArr3[RegisterDeviceErrorType.RegisterDeviceErrorTypeCustomerNotFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeDeviceAlreadyRegistered.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeDuplicateDeviceName.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeChallengeResponse.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeMissingValue.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidValue.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeProtocolError.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeMethodNotAllowed.ordinal()] = 8;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeServerError.ordinal()] = 9;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeNotImplemented.ordinal()] = 10;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidDirectedId.ordinal()] = 11;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidDevice.ordinal()] = 12;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeServerUnavailable.ordinal()] = 13;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeUnauthorizedPanda.ordinal()] = 14;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidTokenPanda.ordinal()] = 15;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeDeviceNotRegisteredPanda.ordinal()] = 16;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypePrimaryAccountDeregisteredWhenRegisterSecondary.ordinal()] = 17;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeForbidden.ordinal()] = 18;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInsufficientAuthorization.ordinal()] = 19;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidCredentials.ordinal()] = 20;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidRequest.ordinal()] = 21;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeAuthenticationFailed.ordinal()] = 22;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            f965a[RegisterDeviceErrorType.RegisterDeviceErrorTypeBlocklistedDevice.ordinal()] = 23;
        } catch (NoSuchFieldError unused40) {
        }
    }
}
