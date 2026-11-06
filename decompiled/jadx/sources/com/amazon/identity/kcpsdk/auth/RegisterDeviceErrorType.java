package com.amazon.identity.kcpsdk.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum RegisterDeviceErrorType {
    RegisterDeviceErrorTypeCustomerNotFound("Customer Not Found. Invalid credentials. The email or phone number and password did not match our records."),
    RegisterDeviceErrorTypeDeviceAlreadyRegistered("Device Already Registered"),
    RegisterDeviceErrorTypeDeviceNotRegisteredPanda("Primary account not registered to device"),
    RegisterDeviceErrorTypeDuplicateDeviceName("The device name is duplicate to an existing one"),
    RegisterDeviceErrorTypeUnrecognized("Unrecognized"),
    RegisterDeviceErrorTypeChallengeResponse("Challenge Response Received"),
    RegisterDeviceErrorTypeMissingValue("One or more required values are missing"),
    RegisterDeviceErrorTypeInvalidValue("One or more required values are invalid"),
    RegisterDeviceErrorTypeInvalidTokenPanda("The token used for registration in Panda is invalid"),
    RegisterDeviceErrorTypeProtocolError("The Protocol is not supported. SSL required"),
    RegisterDeviceErrorTypeMethodNotAllowed("The HTTP method is not valid. For example, using POST instead of GET"),
    RegisterDeviceErrorTypeServerError("The server has encountered a runtime error, try again later"),
    RegisterDeviceErrorTypeNotImplemented("The feature is not implemented"),
    RegisterDeviceErrorTypeInvalidDirectedId("The directedId is invalid. e.g. The customer directedId is invalid. The device directedId is invalid"),
    RegisterDeviceErrorTypeInvalidDevice("The device information is invalid."),
    RegisterDeviceErrorTypeUnauthorizedPanda("Unauthorized error from Panda"),
    RegisterDeviceErrorTypeUnrecognizedFirs("Unrecognized Firs"),
    RegisterDeviceErrorTypeUnrecognizedKindle("Unrecognized Kindle"),
    RegisterDeviceErrorTypeUnrecognizedPanda("Unrecognized Panda"),
    RegisterDeviceErrorTypeServerUnavailable("The service temporarily overloaded or unavailable, try again later"),
    RegisterDeviceErrorTypeInternal("Internal Server error, try again later"),
    RegisterDeviceErrorTypePrimaryAccountDeregisteredWhenRegisterSecondary("Failed to register a secondary account because the primary account associated with it was deregistered or not valid any more on server side. The device is deregistered."),
    RegisterDeviceErrorTypeForbidden("This application is not allowed to signin/register with Panda, please check the Panda onboarding documentation"),
    RegisterDeviceErrorTypeInsufficientAuthorization("Additional authentication challenges required to complete registration"),
    RegisterDeviceErrorTypeInvalidCredentials("Invalid credentials provided"),
    RegisterDeviceErrorTypeInvalidRequest("Invalid request provided"),
    RegisterDeviceErrorTypeAuthenticationFailed("Authentication failed"),
    RegisterDeviceErrorTypeBlocklistedDevice("Device is blocklisted");

    private String mErrorString;

    RegisterDeviceErrorType(String str) {
        this.mErrorString = str;
    }

    public String getErrorString() {
        return this.mErrorString;
    }
}
