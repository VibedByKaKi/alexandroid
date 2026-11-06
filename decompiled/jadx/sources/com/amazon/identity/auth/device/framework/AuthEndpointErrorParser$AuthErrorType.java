package com.amazon.identity.auth.device.framework;

import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPError;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MissingValue' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AuthEndpointErrorParser$AuthErrorType {
    private static final /* synthetic */ AuthEndpointErrorParser$AuthErrorType[] $VALUES;
    public static final AuthEndpointErrorParser$AuthErrorType ActorNotAssociated;
    public static final AuthEndpointErrorParser$AuthErrorType AuthenticationChallenged;
    public static final AuthEndpointErrorParser$AuthErrorType BuildRequestFailure;
    public static final AuthEndpointErrorParser$AuthErrorType CredentialError;
    public static final AuthEndpointErrorParser$AuthErrorType DeviceAlreadyRegistered;
    public static final AuthEndpointErrorParser$AuthErrorType DuplicateDeviceName;
    public static final AuthEndpointErrorParser$AuthErrorType Forbidden;
    public static final AuthEndpointErrorParser$AuthErrorType GenericError;
    public static final AuthEndpointErrorParser$AuthErrorType InvalidActorToken;
    public static final AuthEndpointErrorParser$AuthErrorType InvalidDirectedId;
    public static final AuthEndpointErrorParser$AuthErrorType InvalidRequest;
    public static final AuthEndpointErrorParser$AuthErrorType InvalidToken;
    public static final AuthEndpointErrorParser$AuthErrorType InvalidValue;
    public static final AuthEndpointErrorParser$AuthErrorType MethodNotAllowed;
    public static final AuthEndpointErrorParser$AuthErrorType MissingValue;
    public static final AuthEndpointErrorParser$AuthErrorType NetworkFailure;
    public static final AuthEndpointErrorParser$AuthErrorType NotImplemented;
    public static final AuthEndpointErrorParser$AuthErrorType ParseError;
    public static final AuthEndpointErrorParser$AuthErrorType ProtocolError;
    public static final AuthEndpointErrorParser$AuthErrorType ServerError;
    public static final AuthEndpointErrorParser$AuthErrorType ServiceUnavailable;
    private final String mCode;
    private final MAPError mError;
    private final String mErrorMessage;
    private final MAPAccountManager.RegistrationError mLegacyError;
    private final boolean mRetry;

    private static /* synthetic */ AuthEndpointErrorParser$AuthErrorType[] $values() {
        return new AuthEndpointErrorParser$AuthErrorType[]{MissingValue, InvalidValue, InvalidToken, ProtocolError, CredentialError, Forbidden, MethodNotAllowed, ServerError, ServiceUnavailable, NotImplemented, InvalidDirectedId, DeviceAlreadyRegistered, DuplicateDeviceName, GenericError, AuthenticationChallenged, ParseError, BuildRequestFailure, NetworkFailure, ActorNotAssociated, InvalidActorToken, InvalidRequest};
    }

    static {
        MAPAccountManager.RegistrationError registrationError = MAPAccountManager.RegistrationError.BAD_REQUEST;
        MAPError.CommonError commonError = MAPError.CommonError.BAD_REQUEST;
        MissingValue = new AuthEndpointErrorParser$AuthErrorType("MissingValue", 0, "MissingValue", false, registrationError, commonError, "Missing value");
        InvalidValue = new AuthEndpointErrorParser$AuthErrorType("InvalidValue", 1, "InvalidValue", false, registrationError, commonError, "Invalid value");
        InvalidToken = new AuthEndpointErrorParser$AuthErrorType("InvalidToken", 2, "InvalidToken", false, registrationError, commonError, "Invalid token");
        ProtocolError = new AuthEndpointErrorParser$AuthErrorType("ProtocolError", 3, "ProtocolError", false, registrationError, MAPError.AccountError.UNSUPPORTED_PROTOCOL, "Protocol error");
        CredentialError = new AuthEndpointErrorParser$AuthErrorType("CredentialError", 4, "CredentialError", false, MAPAccountManager.RegistrationError.CUSTOMER_NOT_FOUND, MAPError.AccountError.CUSTOMER_NOT_FOUND, "Credential error");
        Forbidden = new AuthEndpointErrorParser$AuthErrorType("Forbidden", 5, "Forbidden", false, registrationError, commonError, "Forbidden");
        MethodNotAllowed = new AuthEndpointErrorParser$AuthErrorType("MethodNotAllowed", 6, "MethodNotAllowed", false, registrationError, MAPError.CommonError.UNSUPPORTED_OPERATION, "Method not allowed");
        MAPAccountManager.RegistrationError registrationError2 = MAPAccountManager.RegistrationError.UNRECOGNIZED;
        ServerError = new AuthEndpointErrorParser$AuthErrorType("ServerError", 7, "ServerError", true, registrationError2, MAPError.CommonError.SERVER_ERROR, "Server error");
        MAPError.CommonError commonError2 = MAPError.CommonError.SERVICE_UNAVAILABLE;
        ServiceUnavailable = new AuthEndpointErrorParser$AuthErrorType("ServiceUnavailable", 8, "ServiceUnavailable", true, registrationError2, commonError2, commonError2.getErrorMessage());
        MAPError.CommonError commonError3 = MAPError.CommonError.FEATURE_NOT_IMPLEMENTED;
        NotImplemented = new AuthEndpointErrorParser$AuthErrorType("NotImplemented", 9, "NotImplemented", false, registrationError, commonError3, commonError3.getErrorMessage());
        InvalidDirectedId = new AuthEndpointErrorParser$AuthErrorType("InvalidDirectedId", 10, "InvalidDirectedId", false, registrationError, commonError, "Invalid directedId");
        MAPAccountManager.RegistrationError registrationError3 = MAPAccountManager.RegistrationError.DEVICE_ALREADY_REGISTERED;
        MAPError.AccountError accountError = MAPError.AccountError.DEVICE_ALREADY_REGISTERED;
        DeviceAlreadyRegistered = new AuthEndpointErrorParser$AuthErrorType("DeviceAlreadyRegistered", 11, "DeviceAlreadyRegistered", false, registrationError3, accountError, accountError.getErrorMessage());
        MAPAccountManager.RegistrationError registrationError4 = MAPAccountManager.RegistrationError.DUPLICATE_DEVICE_NAME;
        MAPError.AccountError accountError2 = MAPError.AccountError.DUPLICATE_DEVICE_NAME;
        DuplicateDeviceName = new AuthEndpointErrorParser$AuthErrorType("DuplicateDeviceName", 12, "DuplicateDeviceName", false, registrationError4, accountError2, accountError2.getErrorMessage());
        GenericError = new AuthEndpointErrorParser$AuthErrorType("GenericError", 13);
        MAPAccountManager.RegistrationError registrationError5 = MAPAccountManager.RegistrationError.AUTHENTICATION_CHALLENGED;
        MAPError.AccountError accountError3 = MAPError.AccountError.AUTHENTICATION_CHALLENGED;
        AuthenticationChallenged = new AuthEndpointErrorParser$AuthErrorType("AuthenticationChallenged", 14, "AuthenticationChallenged", false, registrationError5, accountError3, accountError3.getErrorMessage());
        MAPAccountManager.RegistrationError registrationError6 = MAPAccountManager.RegistrationError.PARSE_ERROR;
        MAPError.CommonError commonError4 = MAPError.CommonError.PARSE_ERROR;
        ParseError = new AuthEndpointErrorParser$AuthErrorType("ParseError", 15, "ParseError", true, registrationError6, commonError4, commonError4.getErrorMessage());
        BuildRequestFailure = new AuthEndpointErrorParser$AuthErrorType("BuildRequestFailure", 16, "BuildRequestFailure", false, registrationError, commonError, "Build request failure");
        MAPAccountManager.RegistrationError registrationError7 = MAPAccountManager.RegistrationError.NETWORK_FAILURE;
        MAPError.CommonError commonError5 = MAPError.CommonError.NETWORK_ERROR;
        NetworkFailure = new AuthEndpointErrorParser$AuthErrorType("NetworkFailure", 17, "NetworkFailure", true, registrationError7, commonError5, commonError5.getErrorMessage());
        ActorNotAssociated = new AuthEndpointErrorParser$AuthErrorType("ActorNotAssociated", 18, "ActorNotAssociated", false, MAPAccountManager.RegistrationError.ACTOR_NOT_ASSOCIATED, commonError, "Actor is not associated with account");
        InvalidActorToken = new AuthEndpointErrorParser$AuthErrorType("InvalidActorToken", 19, "InvalidActorToken", true, MAPAccountManager.RegistrationError.INTERNAL_ERROR, MAPError.CommonError.INTERNAL_ERROR, "Actor token is invalid");
        InvalidRequest = new AuthEndpointErrorParser$AuthErrorType("InvalidRequest", 20, "InvalidRequest", false, registrationError, commonError, "The input is invalid");
        $VALUES = $values();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AuthEndpointErrorParser$AuthErrorType(java.lang.String r9, int r10) {
        /*
            r8 = this;
            com.amazon.identity.auth.device.api.MAPAccountManager$RegistrationError r5 = com.amazon.identity.auth.device.api.MAPAccountManager.RegistrationError.UNRECOGNIZED
            com.amazon.identity.auth.device.api.MAPError$CommonError r6 = com.amazon.identity.auth.device.api.MAPError.CommonError.INTERNAL_ERROR
            java.lang.String r7 = r6.getErrorMessage()
            java.lang.String r3 = "GenericError"
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.framework.AuthEndpointErrorParser$AuthErrorType.<init>(java.lang.String, int):void");
    }

    public static AuthEndpointErrorParser$AuthErrorType getAuthErrorTypeFromCode(String str) {
        for (AuthEndpointErrorParser$AuthErrorType authEndpointErrorParser$AuthErrorType : values()) {
            if (authEndpointErrorParser$AuthErrorType.getCode().equals(str)) {
                return authEndpointErrorParser$AuthErrorType;
            }
        }
        return GenericError;
    }

    public static AuthEndpointErrorParser$AuthErrorType valueOf(String str) {
        return (AuthEndpointErrorParser$AuthErrorType) Enum.valueOf(AuthEndpointErrorParser$AuthErrorType.class, str);
    }

    public static AuthEndpointErrorParser$AuthErrorType[] values() {
        return (AuthEndpointErrorParser$AuthErrorType[]) $VALUES.clone();
    }

    public String getCode() {
        return this.mCode;
    }

    public MAPError getError() {
        return this.mError;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public MAPAccountManager.RegistrationError getRegistrationError() {
        return this.mLegacyError;
    }

    public boolean getRetry() {
        return this.mRetry;
    }

    private AuthEndpointErrorParser$AuthErrorType(String str, int i, String str2, boolean z, MAPAccountManager.RegistrationError registrationError, MAPError mAPError, String str3) {
        this.mCode = str2;
        this.mRetry = z;
        this.mLegacyError = registrationError;
        this.mError = mAPError;
        this.mErrorMessage = str3;
    }
}
