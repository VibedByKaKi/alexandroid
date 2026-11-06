package com.amazon.identity.auth.device.api;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPError {
    public static final String ERROR_CODE_PREFIX = "com.amazon.map.error.";

    @FireOsSdk
    public static final String KEY_ERROR_CODE = "com.amazon.map.error.errorCode";

    @FireOsSdk
    public static final String KEY_ERROR_MESSAGE = "com.amazon.map.error.errorMessage";

    @FireOsSdk
    public static final String KEY_ERROR_TYPE = "com.amazon.map.error.errorType";

    @FireOsSdk
    public static final String KEY_SHOULD_CLEAR_AUTH_COOKIES = "com.amazon.map.error.shouldClearAuthCookies";

    /* renamed from: a, reason: collision with root package name */
    private final int f501a;
    private final String b;
    private final String c;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.identity.auth.device.api.MAPError$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f502a;

        static {
            int[] iArr = new int[MAPAccountManager.BootstrapError.values().length];
            f502a = iArr;
            try {
                iArr[MAPAccountManager.BootstrapError.NO_SERVICE_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.TIMEOUT_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.NO_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.NO_SIGNATURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.INVALID_RESPONSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.NETWORK_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.PARSE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.BOOTSTRAP_NOT_ALLOWED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.SERVICE_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.FRAUDULENT_PACKAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.BOOTSTRAP_BLOCKED_FOR_NON_ADULT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f502a[MAPAccountManager.BootstrapError.UNCATEGORIZED_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MAPErrorMethods {
        @FireOsSdk
        int getErrorCode();

        @FireOsSdk
        String getErrorMessage();

        @FireOsSdk
        String getErrorType();
    }

    public MAPError(String str, int i, String str2) {
        this.f501a = i;
        this.b = str;
        this.c = str2;
    }

    public static MAPError a(int i) {
        int i2 = 0;
        if (i >= 100 && i < 200) {
            for (AccountError.AccountErrorEnum accountErrorEnum : AccountError.AccountErrorEnum.values()) {
                if (accountErrorEnum.getErrorCode() == i) {
                    return new AccountError(accountErrorEnum, i2);
                }
            }
            return null;
        }
        if (i >= 200 && i < 300) {
            for (TokenError.TokenErrorEnum tokenErrorEnum : TokenError.TokenErrorEnum.values()) {
                if (tokenErrorEnum.getErrorCode() == i) {
                    return new TokenError(tokenErrorEnum, i2);
                }
            }
            return null;
        }
        if (i >= 300 && i < 400) {
            for (AttributeError.AttributeErrorEnum attributeErrorEnum : AttributeError.AttributeErrorEnum.values()) {
                if (attributeErrorEnum.getErrorCode() == i) {
                    return new AttributeError(attributeErrorEnum, i2);
                }
            }
            return null;
        }
        if (i >= 400 && i < 500) {
            for (CommonError.CommonErrorEnum commonErrorEnum : CommonError.CommonErrorEnum.values()) {
                if (commonErrorEnum.getErrorCode() == i) {
                    return new CommonError(commonErrorEnum, i2);
                }
            }
            return null;
        }
        if (i >= 500 && i < 600) {
            for (ActorError.ActorErrorEnum actorErrorEnum : ActorError.ActorErrorEnum.values()) {
                if (actorErrorEnum.getErrorCode() == i) {
                    return new ActorError(actorErrorEnum, i2);
                }
            }
            return null;
        }
        if (i >= 600 && i < 700) {
            for (FidoAuthenticatorError.FidoAuthenticatorErrorEnum fidoAuthenticatorErrorEnum : FidoAuthenticatorError.FidoAuthenticatorErrorEnum.values()) {
                if (fidoAuthenticatorErrorEnum.getErrorCode() == i) {
                    return new FidoAuthenticatorError(fidoAuthenticatorErrorEnum, i2);
                }
            }
            return null;
        }
        if (i < 700 || i >= 800) {
            return null;
        }
        for (BootstrapSSOError.BootstrapSSOErrorEnum bootstrapSSOErrorEnum : BootstrapSSOError.BootstrapSSOErrorEnum.values()) {
            if (bootstrapSSOErrorEnum.getErrorCode() == i) {
                return new BootstrapSSOError(bootstrapSSOErrorEnum, i2);
            }
        }
        return null;
    }

    @FireOsSdk
    public static MAPError getErrorFromValue(int i, MAPError mAPError) {
        MAPError a2 = a(i);
        return a2 != null ? a2 : mAPError;
    }

    public static String getErrorTypeWithUnderscores(String str) {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) && i != str.length() - 1 && i != 0) {
                sb.append("_");
            }
            sb.append(str.charAt(i));
        }
        try {
            jSONObject.put("error", sb.toString());
            if (jSONObject.has("error")) {
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return JavaScriptBridgeCommon.GENERAL_ERROR;
    }

    @FireOsSdk
    public int getErrorCode() {
        return this.f501a;
    }

    @FireOsSdk
    public String getErrorMessage() {
        return this.b;
    }

    @FireOsSdk
    public String getErrorType() {
        return this.c;
    }

    @FireOsSdk
    public String toString() {
        Locale locale = Locale.US;
        String str = this.c;
        int i = this.f501a;
        String str2 = this.b;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(i, "MAPError: ", str, " , ErrorCode: ", " , ErrorMessage: ");
        m.append(str2);
        return m.toString();
    }

    @FireOsSdk
    public static MAPError getErrorFromValue(int i) {
        return a(i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AccountError extends MAPError {

        @FireOsSdk
        public static final AccountError CUSTOMER_NOT_FOUND = new AccountError(AccountErrorEnum.CUSTOMER_NOT_FOUND);

        @FireOsSdk
        public static final AccountError DELEGATEE_ACCOUNT_ALREADY_DEREGISTERED = new AccountError(AccountErrorEnum.DELEGATEE_ACCOUNT_ALREADY_DEREGISTERED);

        @FireOsSdk
        public static final AccountError ACCOUNT_ALREADY_REGISTERED = new AccountError(AccountErrorEnum.ACCOUNT_ALREADY_REGISTERED);

        @FireOsSdk
        public static final AccountError REGISTER_FAILED = new AccountError(AccountErrorEnum.REGISTER_FAILED);

        @FireOsSdk
        public static final AccountError ACCOUNT_ALREADY_DEREGISTERED = new AccountError(AccountErrorEnum.ACCOUNT_ALREADY_DEREGISTERED);

        @FireOsSdk
        public static final AccountError DEREGISTER_FAILED = new AccountError(AccountErrorEnum.DEREGISTER_FAILED);

        @FireOsSdk
        public static final AccountError AUTHENTICATION_FAILED = new AccountError(AccountErrorEnum.AUTHENTICATION_FAILED);

        @FireOsSdk
        public static final AccountError DEVICE_ALREADY_DEREGISTERED = new AccountError(AccountErrorEnum.DEVICE_ALREADY_DEREGISTERED);

        @FireOsSdk
        public static final AccountError DUPLICATE_DEVICE_NAME = new AccountError(AccountErrorEnum.DUPLICATE_DEVICE_NAME);

        @FireOsSdk
        public static final AccountError AUTHENTICATION_CHALLENGED = new AccountError(AccountErrorEnum.AUTHENTICATION_CHALLENGED);

        @FireOsSdk
        public static final AccountError MISSING_DEVICE_SECRET = new AccountError(AccountErrorEnum.MISSING_DEVICE_SECRET);

        @FireOsSdk
        public static final AccountError MISSING_PACKAGE = new AccountError(AccountErrorEnum.MISSING_PACKAGE);

        @FireOsSdk
        public static final AccountError DEVICE_TYPE_UPGRADE_FAILED = new AccountError(AccountErrorEnum.DEVICE_TYPE_UPGRADE_FAILED);

        @FireOsSdk
        public static final AccountError DEVICE_ALREADY_REGISTERED = new AccountError(AccountErrorEnum.DEVICE_ALREADY_REGISTERED);

        @FireOsSdk
        public static final AccountError MISSING_CHALLENGE_EXCEPTION = new AccountError(AccountErrorEnum.MISSING_CHALLENGE_EXCEPTION);

        @FireOsSdk
        public static final AccountError UNSUPPORTED_PROTOCOL = new AccountError(AccountErrorEnum.UNSUPPORTED_PROTOCOL);

        @FireOsSdk
        public static final AccountError INVALID_HTTP_METHOD = new AccountError(AccountErrorEnum.INVALID_HTTP_METHOD);

        @FireOsSdk
        public static final AccountError SETTING_CREDENTIALS_FAILED = new AccountError(AccountErrorEnum.SETTING_CREDENTIALS_FAILED);

        @FireOsSdk
        public static final AccountError CORRUPTED_ACCOUNT = new AccountError(AccountErrorEnum.CORRUPTED_ACCOUNT);

        @FireOsSdk
        public static final AccountError REPLACE_ACCOUNTS_FAILED = new AccountError(AccountErrorEnum.REPLACE_ACCOUNTS_FAILED);

        @FireOsSdk
        public static final AccountError REQUIRES_3P_AUTHENTICATION = new AccountError(AccountErrorEnum.REQUIRES_3P_AUTHENTICATION);

        @FireOsSdk
        public static final AccountError ACCOUNT_ENCRYPTION_KEY_NOT_FOUND = new AccountError(AccountErrorEnum.ACCOUNT_ENCRYPTION_KEY_NOT_FOUND);

        @FireOsSdk
        public static final AccountError OTP_RATE_LIMITED = new AccountError(AccountErrorEnum.OTP_RATE_LIMITED);

        @FireOsSdk
        public static final AccountError BLOCKLISTED_DEVICE = new AccountError(AccountErrorEnum.BLOCKLISTED_DEVICE);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AccountErrorEnum implements MAPErrorMethods {
            CUSTOMER_NOT_FOUND(100, "CustomerNotFound", "Customer account does not exist"),
            REQUIRES_3P_AUTHENTICATION(101, "Requires3PAuthentication", "Authentication via a 3P identity provider is required"),
            DELEGATEE_ACCOUNT_ALREADY_DEREGISTERED(102, "DelegateeAccountAlreadyDeregistered", "The delegatee account is already deregistered on this device"),
            ACCOUNT_ALREADY_REGISTERED(103, "AccountAlreadyRegistered", "Account has already been registered on this device"),
            REGISTER_FAILED(104, "RegisterFailed", "An error occurred during registration"),
            ACCOUNT_ALREADY_DEREGISTERED(105, "AccountAlreadyDeregistered", "Given account has already been deregistered"),
            DEREGISTER_FAILED(106, "DeregisterFailed", "An error occurred during deregistration"),
            REPLACE_ACCOUNTS_FAILED(107, "ReplaceAccounts", "Failed to replace accounts on device"),
            AUTHENTICATION_FAILED(108, "AuthenticationFailed", "An error occurred during authentication"),
            DEVICE_ALREADY_DEREGISTERED(109, "DeviceAlreadyDeregistered", "Device already deregistered"),
            DUPLICATE_DEVICE_NAME(110, "DuplicateDeviceName", "Cannot duplicate the device name"),
            AUTHENTICATION_CHALLENGED(111, "AuthenticationChallenged", "Authentication was challenged"),
            MISSING_DEVICE_SECRET(112, "MissingDeviceSecret", "Missing the device secret"),
            CORRUPTED_ACCOUNT(113, "CorruptedAccount", "This account has been corrupted"),
            MISSING_PACKAGE(114, "MissingPackage", "Could not find a package to register the device type"),
            DEVICE_TYPE_UPGRADE_FAILED(115, "DeviceTypeUpgradeFailed", "Cannot upgrade a legacy child device type to a different device type. Deregistering the device to clean up the bad state."),
            DEVICE_ALREADY_REGISTERED(116, "DeviceAlreadyRegistered", "Device already registered"),
            MISSING_CHALLENGE_EXCEPTION(117, "MissingChallengeException", "Challenge exception is missing"),
            UNSUPPORTED_PROTOCOL(118, "UnsupportedProtocol", "Attempting to use an unsupported protocol"),
            INVALID_HTTP_METHOD(119, "InvalidHTTPMethod", "Attempting to use an invalid HTTP method"),
            SETTING_CREDENTIALS_FAILED(120, "SettingCredentialsFailed", "An error occurred while setting the credentials"),
            ACCOUNT_ENCRYPTION_KEY_NOT_FOUND(121, "AccountEncryptionKeyNotFound", "Null/Invalid encryption key or key identifier received."),
            OTP_RATE_LIMITED(122, "OtpRateLimited", "Received OTP challenge request to quickly"),
            BLOCKLISTED_DEVICE(123, "BlocklistedDevice", "Device is blocklisted");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            AccountErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private AccountError(AccountErrorEnum accountErrorEnum) {
            super(accountErrorEnum.getErrorMessage(), accountErrorEnum.getErrorCode(), accountErrorEnum.getErrorType());
        }

        public /* synthetic */ AccountError(AccountErrorEnum accountErrorEnum, int i) {
            this(accountErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ActorError extends MAPError {

        @FireOsSdk
        public static final ActorError ACTOR_NOT_ASSOCIATED = new ActorError(ActorErrorEnum.ACTOR_NOT_ASSOCIATED);

        @FireOsSdk
        public static final ActorError ACTOR_SIGNUP_FAILED = new ActorError(ActorErrorEnum.ACTOR_SIGNUP_FAILED);

        @FireOsSdk
        public static final ActorError ACTOR_ENROLLMENT_FAILED = new ActorError(ActorErrorEnum.ACTOR_ENROLLMENT_FAILED);
        public static final ActorError GET_ACTOR_ACCESS_TOKEN_FAILED = new ActorError(ActorErrorEnum.GET_ACTOR_ACCESS_TOKEN_FAILED);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum ActorErrorEnum implements MAPErrorMethods {
            ACTOR_NOT_ASSOCIATED(500, "ActorNotAssociated", "The actor is no longer associated with the account"),
            ACTOR_SIGNUP_FAILED(501, "ActorSignupFailed", "Failed to sign up a actor for the account."),
            ACTOR_ENROLLMENT_FAILED(502, "ActorEnrollmentFailed", "Failed to enroll the actor for your program."),
            GET_ACTOR_ACCESS_TOKEN_FAILED(503, "ActorGetAccessTokenFailed", "Failed to get actor access token during update pin preference flow.");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            ActorErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private ActorError(ActorErrorEnum actorErrorEnum) {
            super(actorErrorEnum.getErrorMessage(), actorErrorEnum.getErrorCode(), actorErrorEnum.getErrorType());
        }

        public /* synthetic */ ActorError(ActorErrorEnum actorErrorEnum, int i) {
            this(actorErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AttributeError extends MAPError {

        @FireOsSdk
        public static final AttributeError SET_ATTRIBUTE_FAILED = new AttributeError(AttributeErrorEnum.SET_ATTRIBUTE_FAILED);

        @FireOsSdk
        public static final AttributeError GET_ATTRIBUTE_FAILED = new AttributeError(AttributeErrorEnum.GET_ATTRIBUTE_FAILED);

        @FireOsSdk
        public static final AttributeError KEY_NOT_FOUND = new AttributeError(AttributeErrorEnum.KEY_NOT_FOUND);

        @FireOsSdk
        public static final AttributeError CANNOT_DETERMINE_OVERRIDE_DEVICE_TYPE = new AttributeError(AttributeErrorEnum.CANNOT_DETERMINE_OVERRIDE_DEVICE_TYPE);

        @FireOsSdk
        public static final AttributeError NO_OVERRIDDEN_CHILD_DEVICE_TYPE = new AttributeError(AttributeErrorEnum.NO_OVERRIDDEN_CHILD_DEVICE_TYPE);

        @FireOsSdk
        public static final AttributeError PACKAGE_RUNNING_ON_FIRST_PARTY_DEVICE = new AttributeError(AttributeErrorEnum.PACKAGE_RUNNING_ON_FIRST_PARTY_DEVICE);

        @FireOsSdk
        public static final AttributeError NOT_A_CHILD_DEVICE_TYPE = new AttributeError(AttributeErrorEnum.NOT_A_CHILD_DEVICE_TYPE);

        @FireOsSdk
        public static final AttributeError UNRECOGNIZED_PACKAGE_NAME = new AttributeError(AttributeErrorEnum.UNRECOGNIZED_PACKAGE_NAME);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum AttributeErrorEnum implements MAPErrorMethods {
            SET_ATTRIBUTE_FAILED(300, "SetAttributeFailed", "An error occurred while setting the attribute"),
            GET_ATTRIBUTE_FAILED(301, "GetAttributeFailed", "An error occurred while getting the attribute"),
            KEY_NOT_FOUND(302, "KeyNotFound", "Could not find key"),
            CANNOT_DETERMINE_OVERRIDE_DEVICE_TYPE(303, "CannotDetermineOverrideDeviceType", "Cannot determine the override device type"),
            NO_OVERRIDDEN_CHILD_DEVICE_TYPE(304, "NoOverriddenChildDeviceType", "The package doesn't have an overridden child device type to rename child device."),
            PACKAGE_RUNNING_ON_FIRST_PARTY_DEVICE(305, "PackageRunningOnFirstPartyDevice", "The package is running on a first party device, so the child device type cannot be overridden"),
            NOT_A_CHILD_DEVICE_TYPE(306, "NotAChildDeviceType", "This is not a child device type"),
            UNRECOGNIZED_PACKAGE_NAME(307, "UnrecognizedPackageName", "Package cannot be found or trusted to rename child device");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            AttributeErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private AttributeError(AttributeErrorEnum attributeErrorEnum) {
            super(attributeErrorEnum.getErrorMessage(), attributeErrorEnum.getErrorCode(), attributeErrorEnum.getErrorType());
        }

        public /* synthetic */ AttributeError(AttributeErrorEnum attributeErrorEnum, int i) {
            this(attributeErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BootstrapSSOError extends MAPError {

        @FireOsSdk
        public static final BootstrapSSOError NO_SERVICE_AVAILABLE = new BootstrapSSOError(BootstrapSSOErrorEnum.NO_SERVICE_AVAILABLE);

        @FireOsSdk
        public static final BootstrapSSOError TIMEOUT_SERVICE = new BootstrapSSOError(BootstrapSSOErrorEnum.TIMEOUT_SERVICE);

        @FireOsSdk
        public static final BootstrapSSOError NO_ACCOUNT = new BootstrapSSOError(BootstrapSSOErrorEnum.NO_ACCOUNT);

        @FireOsSdk
        public static final BootstrapSSOError NO_SIGNATURE = new BootstrapSSOError(BootstrapSSOErrorEnum.NO_SIGNATURE);

        @FireOsSdk
        public static final BootstrapSSOError INVALID_RESPONSE = new BootstrapSSOError(BootstrapSSOErrorEnum.INVALID_RESPONSE);

        @FireOsSdk
        public static final BootstrapSSOError NETWORK_FAILURE = new BootstrapSSOError(BootstrapSSOErrorEnum.NETWORK_FAILURE);

        @FireOsSdk
        public static final BootstrapSSOError PARSE_ERROR = new BootstrapSSOError(BootstrapSSOErrorEnum.PARSE_ERROR);

        @FireOsSdk
        public static final BootstrapSSOError BOOTSTRAP_NOT_ALLOWED = new BootstrapSSOError(BootstrapSSOErrorEnum.BOOTSTRAP_NOT_ALLOWED);

        @FireOsSdk
        public static final BootstrapSSOError BOOTSTRAP_BLOCKED_FOR_NON_ADULT = new BootstrapSSOError(BootstrapSSOErrorEnum.BOOTSTRAP_BLOCKED_FOR_NON_ADULT);

        @FireOsSdk
        public static final BootstrapSSOError SERVICE_ERROR = new BootstrapSSOError(BootstrapSSOErrorEnum.SERVICE_ERROR);

        @FireOsSdk
        public static final BootstrapSSOError FRAUDULENT_PACKAGE = new BootstrapSSOError(BootstrapSSOErrorEnum.FRAUDULENT_PACKAGE);

        @FireOsSdk
        public static final BootstrapSSOError UNCATEGORIZED_ERROR = new BootstrapSSOError(BootstrapSSOErrorEnum.UNCATEGORIZED_ERROR);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum BootstrapSSOErrorEnum implements MAPErrorMethods {
            NO_SERVICE_AVAILABLE(700, "NoServiceAvailable", "No instance of BootstrapSSOService was available to bootstrap with."),
            TIMEOUT_SERVICE(TypedValues.TransitionType.TYPE_FROM, "NoResponseReceived", "No response received from BootStrapSSOService."),
            NO_ACCOUNT(TypedValues.TransitionType.TYPE_TO, "NoAccount", "No Account Registered."),
            NO_SIGNATURE(703, "NoSignatureObtained", "No app found with valid signature."),
            INVALID_RESPONSE(TypedValues.TransitionType.TYPE_AUTO_TRANSITION, "InvalidResponseFromServer", "Response returned from server is invalid."),
            NETWORK_FAILURE(TypedValues.TransitionType.TYPE_INTERPOLATOR, "NetworkFailed", "Network error, should not happen at all."),
            PARSE_ERROR(TypedValues.TransitionType.TYPE_STAGGERED, "ErrorParsingResponse", "Error parsing the response from server."),
            BOOTSTRAP_NOT_ALLOWED(TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, "BootstrapNotAllowed", "Bootstrap not allowed for your application. Currently it is allowed for applications explicitly declaring meta-data \"MAPBootstrapSSOTargetApplication\" in manifest, or for isolated applications"),
            SERVICE_ERROR(708, "ServiceError", "Unexpectedly disconnected from service"),
            FRAUDULENT_PACKAGE(709, "FraudulentPackage", "Package name does not match caller"),
            UNCATEGORIZED_ERROR(710, "UncategorizedError", "Uncategorized error"),
            BOOTSTRAP_BLOCKED_FOR_NON_ADULT(711, "BootstrapBlockedForNonAdult", "Bootstrap blocked for non adult user");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            BootstrapSSOErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private BootstrapSSOError(BootstrapSSOErrorEnum bootstrapSSOErrorEnum) {
            super(bootstrapSSOErrorEnum.getErrorMessage(), bootstrapSSOErrorEnum.getErrorCode(), bootstrapSSOErrorEnum.getErrorType());
        }

        public static BootstrapSSOError fromBootstrapError(MAPAccountManager.BootstrapError bootstrapError) {
            switch (AnonymousClass1.f502a[bootstrapError.ordinal()]) {
                case 1:
                    return NO_SERVICE_AVAILABLE;
                case 2:
                    return TIMEOUT_SERVICE;
                case 3:
                    return NO_ACCOUNT;
                case 4:
                    return NO_SIGNATURE;
                case 5:
                    return INVALID_RESPONSE;
                case 6:
                    return NETWORK_FAILURE;
                case 7:
                    return PARSE_ERROR;
                case 8:
                    return BOOTSTRAP_NOT_ALLOWED;
                case 9:
                    return SERVICE_ERROR;
                case 10:
                    return FRAUDULENT_PACKAGE;
                case 11:
                    return BOOTSTRAP_BLOCKED_FOR_NON_ADULT;
                default:
                    return UNCATEGORIZED_ERROR;
            }
        }

        public /* synthetic */ BootstrapSSOError(BootstrapSSOErrorEnum bootstrapSSOErrorEnum, int i) {
            this(bootstrapSSOErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CommonError extends MAPError {

        @FireOsSdk
        public static final CommonError NETWORK_ERROR = new CommonError(CommonErrorEnum.NETWORK_ERROR);

        @FireOsSdk
        public static final CommonError UI_NOT_FOUND = new CommonError(CommonErrorEnum.UI_NOT_FOUND);

        @FireOsSdk
        public static final CommonError INTERNAL_ERROR = new CommonError(CommonErrorEnum.INTERNAL_ERROR);

        @FireOsSdk
        public static final CommonError OPERATION_CANCELLED = new CommonError(CommonErrorEnum.OPERATION_CANCELLED);

        @FireOsSdk
        public static final CommonError BAD_REQUEST = new CommonError(CommonErrorEnum.BAD_REQUEST);

        @FireOsSdk
        public static final CommonError PARSE_ERROR = new CommonError(CommonErrorEnum.PARSE_ERROR);

        @FireOsSdk
        public static final CommonError INVALID_RESPONSE = new CommonError(CommonErrorEnum.INVALID_RESPONSE);

        @FireOsSdk
        public static final CommonError BACKWARDS_INCOMPATIBILITY = new CommonError(CommonErrorEnum.BACKWARDS_INCOMPATIBILITY);

        @FireOsSdk
        public static final CommonError CORRUPTED_DATABASE = new CommonError(CommonErrorEnum.CORRUPTED_DATABASE);

        @FireOsSdk
        public static final CommonError UNSUPPORTED_OPERATION = new CommonError(CommonErrorEnum.UNSUPPORTED_OPERATION);

        @FireOsSdk
        public static final CommonError SERVER_ERROR = new CommonError(CommonErrorEnum.SERVER_ERROR);

        @FireOsSdk
        public static final CommonError SERVICE_UNAVAILABLE = new CommonError(CommonErrorEnum.SERVICE_UNAVAILABLE);

        @FireOsSdk
        public static final CommonError FEATURE_NOT_IMPLEMENTED = new CommonError(CommonErrorEnum.FEATURE_NOT_IMPLEMENTED);

        @FireOsSdk
        public static final CommonError UNKNOWN_IPC_ERROR = new CommonError(CommonErrorEnum.UNKNOWN_IPC_ERROR);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CommonErrorEnum implements MAPErrorMethods {
            FEATURE_NOT_IMPLEMENTED(400, "FeatureNotImplemented", "The feature has not been implemented yet"),
            NETWORK_ERROR(401, "NetworkError", "A network error occurred"),
            UI_NOT_FOUND(402, "UINotFound", "The UI could not be found"),
            SERVICE_UNAVAILABLE(403, "ServiceUnavailable", "The service is temporarily unavailable"),
            INTERNAL_ERROR(404, "InternalError", "An internal error occurred"),
            OPERATION_CANCELLED(405, "OperationCancelled", "The operation was cancelled before completing"),
            BAD_REQUEST(406, "BadRequest", "The request was invalid"),
            PARSE_ERROR(407, "ParseError", "An error occurred while parsing the server response"),
            INVALID_RESPONSE(408, "InvalidResponse", "An invalid response was received from the server"),
            BACKWARDS_INCOMPATIBILITY(409, "BackwardsIncompatibility", "An error occurred due to a backwards incompatibility issue"),
            CORRUPTED_DATABASE(410, "CorruptedDatabase", "The MAP database is corrupted"),
            UNSUPPORTED_OPERATION(411, "UnsupportedOperation", "Attempted to perform an operation that is not supported"),
            SERVER_ERROR(412, "ServerError", "An error occurred on the server side"),
            UNKNOWN_IPC_ERROR(413, "UnknownIPCError", "Something went wrong communicating with imp apk. Usually due to IPC command not being recognized");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            CommonErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private CommonError(CommonErrorEnum commonErrorEnum) {
            super(commonErrorEnum.getErrorMessage(), commonErrorEnum.getErrorCode(), commonErrorEnum.getErrorType());
        }

        public /* synthetic */ CommonError(CommonErrorEnum commonErrorEnum, int i) {
            this(commonErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FidoAuthenticatorError extends MAPError {
        public static final Map<Integer, MAPError> AUTHENTICATOR_ERRORS_TO_MAP_ERRORS;

        @FireOsSdk
        public static final FidoAuthenticatorError CANNOT_BE_AUTHENTICATED;

        @FireOsSdk
        public static final FidoAuthenticatorError CANNOT_VALIDATE_REQUEST;

        @FireOsSdk
        public static final FidoAuthenticatorError CREDENTIAL_CREATION_FAILED;

        @FireOsSdk
        public static final FidoAuthenticatorError LOCK_SCREEN_NOT_SECURE;

        @FireOsSdk
        public static final FidoAuthenticatorError REQUEST_TIMED_OUT;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum FidoAuthenticatorErrorEnum implements MAPErrorMethods {
            CANNOT_VALIDATE_REQUEST(600, "CannotValidateRequest", "The request cannot be validated. Check that the relying party domain is correct and that it has the associated assetlink."),
            CANNOT_BE_AUTHENTICATED(601, "CannotBeAuthenticated", "The user cancelled the authenticator screen, or a credential id was used that does not exist on the device."),
            REQUEST_TIMED_OUT(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, "RequestTimedOut", "The user did not complete the PIN/Biometric prompt before the timeout time elapsed."),
            LOCK_SCREE_NOT_SECURE(TypedValues.MotionType.TYPE_EASING, "LockScreenNotSecure", "The user does not have a PIN or Biometric set for their lock screen."),
            CREDENTIAL_CREATION_FAILED(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, "CredentialCreationFailed", "An error occurred while creating the authenticator credential. This could be due to calling the API multiple times before waiting for the user to complete the first prompt to create a credential.");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            FidoAuthenticatorErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        static {
            FidoAuthenticatorError fidoAuthenticatorError = new FidoAuthenticatorError(FidoAuthenticatorErrorEnum.CANNOT_VALIDATE_REQUEST);
            CANNOT_VALIDATE_REQUEST = fidoAuthenticatorError;
            FidoAuthenticatorError fidoAuthenticatorError2 = new FidoAuthenticatorError(FidoAuthenticatorErrorEnum.CANNOT_BE_AUTHENTICATED);
            CANNOT_BE_AUTHENTICATED = fidoAuthenticatorError2;
            FidoAuthenticatorError fidoAuthenticatorError3 = new FidoAuthenticatorError(FidoAuthenticatorErrorEnum.REQUEST_TIMED_OUT);
            REQUEST_TIMED_OUT = fidoAuthenticatorError3;
            FidoAuthenticatorError fidoAuthenticatorError4 = new FidoAuthenticatorError(FidoAuthenticatorErrorEnum.LOCK_SCREE_NOT_SECURE);
            LOCK_SCREEN_NOT_SECURE = fidoAuthenticatorError4;
            FidoAuthenticatorError fidoAuthenticatorError5 = new FidoAuthenticatorError(FidoAuthenticatorErrorEnum.CREDENTIAL_CREATION_FAILED);
            CREDENTIAL_CREATION_FAILED = fidoAuthenticatorError5;
            HashMap hashMap = new HashMap();
            hashMap.put(18, fidoAuthenticatorError);
            hashMap.put(23, fidoAuthenticatorError3);
            hashMap.put(28, fidoAuthenticatorError5);
            hashMap.put(29, fidoAuthenticatorError4);
            hashMap.put(35, fidoAuthenticatorError2);
            AUTHENTICATOR_ERRORS_TO_MAP_ERRORS = Collections.unmodifiableMap(hashMap);
        }

        private FidoAuthenticatorError(FidoAuthenticatorErrorEnum fidoAuthenticatorErrorEnum) {
            super(fidoAuthenticatorErrorEnum.getErrorMessage(), fidoAuthenticatorErrorEnum.getErrorCode(), fidoAuthenticatorErrorEnum.getErrorType());
        }

        public /* synthetic */ FidoAuthenticatorError(FidoAuthenticatorErrorEnum fidoAuthenticatorErrorEnum, int i) {
            this(fidoAuthenticatorErrorEnum);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TokenError extends MAPError {

        @FireOsSdk
        public static final TokenError MISSING_TOKEN = new TokenError(TokenErrorEnum.MISSING_TOKEN);

        @FireOsSdk
        public static final TokenError COOKIE_REFRESH_FAILED = new TokenError(TokenErrorEnum.COOKIE_REFRESH_FAILED);

        @FireOsSdk
        public static final TokenError FETCH_TOKEN_FAILED = new TokenError(TokenErrorEnum.FETCH_TOKEN_FAILED);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum TokenErrorEnum implements MAPErrorMethods {
            MISSING_TOKEN(200, "MissingToken", "The expected token could not be found"),
            COOKIE_REFRESH_FAILED(201, "CookieRefreshFailed", "Cookie refresh failed"),
            FETCH_TOKEN_FAILED(202, "FetchTokenFailed", "An error occurred while fetching the token");

            private int mErrorCode;
            private String mErrorMessage;
            private String mErrorType;

            TokenErrorEnum(int i, String str, String str2) {
                this.mErrorCode = i;
                this.mErrorType = str;
                this.mErrorMessage = str2;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public int getErrorCode() {
                return this.mErrorCode;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorMessage() {
                return this.mErrorMessage;
            }

            @Override // com.amazon.identity.auth.device.api.MAPError.MAPErrorMethods
            public String getErrorType() {
                return this.mErrorType;
            }
        }

        private TokenError(TokenErrorEnum tokenErrorEnum) {
            super(tokenErrorEnum.getErrorMessage(), tokenErrorEnum.getErrorCode(), tokenErrorEnum.getErrorType());
        }

        public /* synthetic */ TokenError(TokenErrorEnum tokenErrorEnum, int i) {
            this(tokenErrorEnum);
        }
    }
}
