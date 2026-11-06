package com.amazon.identity.auth.device.framework.webauthn;

import android.text.TextUtils;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeErrorConstants;
import com.amazon.identity.mobi.common.javascript.type.JavaScriptBridgeError;
import com.amazon.identity.mobi.common.javascript.type.JavaScriptBridgeErrorDetails;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CredentialManagerError {
    UNABLE_TO_ENROLL("UnableToEnroll", "Unable to enroll passkey for this device"),
    ENROLLMENT_CANCELLED("EnrollmentCancelled", "The enrollment flow was cancelled on the user's device"),
    ENROLLMENT_TIMEOUT("EnrollmentTimeout", "Enrollment request doesn't finish on time"),
    ENROLLMENT_GENERAL_ERROR("EnrollmentGeneralError", "Enrollment unknown error"),
    ENROLLMENT_REQUEST_JSON_PARSE_FAILED("EnrollmentRequestJSONParseFailed", "Unable to parse the request JSON"),
    UNABLE_TO_AUTHENTICATE("UnableToAuthenticate", "Unable to enroll passkey for this device"),
    AUTHENTICATION_CANCELLED("AuthenticationCancelled", "The authentication flow is cancelled by the user"),
    AUTHENTICATION_TIMEOUT("AuthenticationTimeout", "Authentication request doesn't finish on time"),
    AUTHENTICATION_GENERAL_ERROR("AuthenticationGeneralError", "Authentication unknown error"),
    AUTHENTICATION_REQUEST_JSON_PARSE_FAILED("AuthenticationRequestJSONParseFailed", "Unable to parse the request JSON"),
    CREDENTIAL_MANAGER_GENERAL_ERROR("CredentialManagerGeneralError", "CredentialManager related unknown error"),
    NO_CREDENTIAL_MANAGER_ERROR("NoCredentialManagerError", "Cannot create credential manager on this device"),
    INSECURE_ENVIRONMENT_ERROR("InsecureEnvironmentError", "The environment is not secure"),
    ENROLLMENT_UNABLE_TO_VALIDATE("EnrollmentUnableToValidate", "Request cannot be validated"),
    ENROLLMENT_CREDENTIAL_EXISTS("EnrollmentCredentialExists", ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_EXCLUDED_CREDENTIAL_EXISTS),
    ENROLLMENT_RE_ENROLL_CANCEL("EnrollmentReEnrollCancel", ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_USER_DOES_NOT_CONSENT),
    AUTHENTICATION_NO_MATCHING_CREDENTIALS("AuthenticationNoMatchedCredentials", "Cannot find matching credential"),
    THIRD_PARTY_CREDENTIAL_ERROR("ThirdPartyCredentialError", "exceptions thrown by 3rd party sdk"),
    USER_CANCELLED("UserCancelled", "User cancelled the operation"),
    NO_CREDENTIAL_AVAILABLE("NoCredentialAvailable", "No credential available"),
    CREDENTIAL_REQUEST_FAILED("CredentialRequestFailed", "Credential request failed");

    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_UNABLE_TO_CREATE_KEY = "Unable to create key during registration";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_UNABLE_TO_GET_SYNC_ACCOUNT = "Unable to get sync account";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_USER_DOES_NOT_CONSENT = "User does not consent to create a new credential";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_EXCLUDED_CREDENTIAL_EXISTS = "One of the excluded credentials exists on the local device";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_REQUEST_CANNOT_BE_VALIDATED = "The incoming request cannot be validated";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_TIMEOUT = "Request doesn't finish on time";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_CREATE_NO_SCREEN_LOCK = "The device is not secured with any screen lock";
    private static final String ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_CREATE_PASSKEYS = "User is unable to create passkeys";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_CANCEL = "cancelled";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_CREDENTIALS_CANNOT_BE_AUTHENTICATED = "None of the allowed credentials can be authenticated";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_NO_SCREEN_LOCK = "device is not secured with any screen lock";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_TIMEOUT = "on time";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_AUTHENTICATE_BLOCKED = "Caller has been temporarily blocked";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_AUTHENTICATE_NOT_WHITELISTED = "Caller not whitelisted to call this API";
    private static final String ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_AUTHENTICATE_NO_MATCHING_CREDENTIAL = "Cannot find a matching credential";
    private final String mErrorMessage;
    private final String mErrorType;
    private String mPlatformExceptionMessage;

    CredentialManagerError(String str, String str2) {
        this.mErrorType = str;
        this.mErrorMessage = str2;
        this.mPlatformExceptionMessage = str2;
    }

    public static CredentialManagerError createPasskeyAuthenticationError(GetCredentialException getCredentialException) {
        CredentialManagerError authenticationError = getAuthenticationError(getCredentialException);
        authenticationError.mPlatformExceptionMessage = getCredentialException.getMessage();
        return authenticationError;
    }

    public static CredentialManagerError createPasskeyEnrollmentError(CreateCredentialException createCredentialException) {
        CredentialManagerError enrollmentError = getEnrollmentError(createCredentialException);
        enrollmentError.mPlatformExceptionMessage = createCredentialException.getMessage();
        return enrollmentError;
    }

    private static CredentialManagerError getAuthenticationError(GetCredentialException getCredentialException) {
        String message = getCredentialException.getMessage();
        return ((getCredentialException instanceof GetCredentialCancellationException) || (getCredentialException instanceof GetCredentialInterruptedException)) ? AUTHENTICATION_CANCELLED : getCredentialException instanceof NoCredentialException ? AUTHENTICATION_NO_MATCHING_CREDENTIALS : ((getCredentialException instanceof GetCredentialUnsupportedException) || (getCredentialException instanceof GetCredentialProviderConfigurationException)) ? UNABLE_TO_AUTHENTICATE : getCredentialException instanceof GetCredentialCustomException ? THIRD_PARTY_CREDENTIAL_ERROR : TextUtils.isEmpty(message) ? CREDENTIAL_MANAGER_GENERAL_ERROR : message.contains(ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_TIMEOUT) ? AUTHENTICATION_TIMEOUT : (message.contains("cancelled") || message.contains(ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_AUTHENTICATE_BLOCKED) || message.contains(ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_CREDENTIALS_CANNOT_BE_AUTHENTICATED)) ? AUTHENTICATION_CANCELLED : message.contains(ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_NO_SCREEN_LOCK) ? UNABLE_TO_AUTHENTICATE : message.contains(ANDROID_GET_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_AUTHENTICATE_NO_MATCHING_CREDENTIAL) ? AUTHENTICATION_NO_MATCHING_CREDENTIALS : AUTHENTICATION_GENERAL_ERROR;
    }

    private static CredentialManagerError getEnrollmentError(CreateCredentialException createCredentialException) {
        String message = createCredentialException.getMessage();
        return ((createCredentialException instanceof CreateCredentialCancellationException) || (createCredentialException instanceof CreateCredentialInterruptedException)) ? ENROLLMENT_CANCELLED : ((createCredentialException instanceof CreateCredentialProviderConfigurationException) || (createCredentialException instanceof CreateCredentialUnsupportedException)) ? UNABLE_TO_ENROLL : createCredentialException instanceof CreateCredentialCustomException ? THIRD_PARTY_CREDENTIAL_ERROR : TextUtils.isEmpty(message) ? CREDENTIAL_MANAGER_GENERAL_ERROR : message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_TIMEOUT) ? ENROLLMENT_TIMEOUT : (message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_UNABLE_TO_CREATE_KEY) || message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_UNABLE_TO_GET_SYNC_ACCOUNT)) ? ENROLLMENT_CANCELLED : (message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_CREATE_PASSKEYS) || message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_UNABLE_TO_CREATE_NO_SCREEN_LOCK)) ? UNABLE_TO_ENROLL : message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_REQUEST_CANNOT_BE_VALIDATED) ? ENROLLMENT_UNABLE_TO_VALIDATE : message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_EXCLUDED_CREDENTIAL_EXISTS) ? ENROLLMENT_CREDENTIAL_EXISTS : message.contains(ANDROID_CREATE_CREDENTIAL_ERROR_MESSAGE_CANCEL_USER_DOES_NOT_CONSENT) ? ENROLLMENT_RE_ENROLL_CANCEL : ENROLLMENT_GENERAL_ERROR;
    }

    public String constructJSResult() {
        String serializeObjectToJson = JSONUtils.serializeObjectToJson(JavaScriptBridgeError.builder().errorCode(getErrorType()).errorDetails(JavaScriptBridgeErrorDetails.builder().mapErrorMessage(getErrorMessage()).platformExceptionMessage(this.mPlatformExceptionMessage).build()).build());
        return serializeObjectToJson == null ? JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString() : serializeObjectToJson;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public String getErrorType() {
        return this.mErrorType;
    }
}
