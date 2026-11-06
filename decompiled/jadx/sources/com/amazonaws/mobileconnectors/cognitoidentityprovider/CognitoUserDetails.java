package com.amazonaws.mobileconnectors.cognitoidentityprovider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CognitoUserDetails {
    private CognitoUserAttributes cognitoUserAttributes;
    private CognitoUserSettings cognitoUserSettings;

    public CognitoUserDetails(CognitoUserAttributes cognitoUserAttributes, CognitoUserSettings cognitoUserSettings) {
        this.cognitoUserAttributes = cognitoUserAttributes;
        this.cognitoUserSettings = cognitoUserSettings;
    }

    public CognitoUserAttributes getAttributes() {
        return this.cognitoUserAttributes;
    }

    public CognitoUserSettings getSettings() {
        return this.cognitoUserSettings;
    }
}
