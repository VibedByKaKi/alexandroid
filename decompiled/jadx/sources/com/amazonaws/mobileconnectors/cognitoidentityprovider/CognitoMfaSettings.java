package com.amazonaws.mobileconnectors.cognitoidentityprovider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CognitoMfaSettings {
    public static final String SMS_MFA = "SMS_MFA";
    public static final String TOTP_MFA = "TOTP_MFA";
    private String mfaName;
    private boolean enabled = false;
    private boolean preferred = false;

    public CognitoMfaSettings(String str) {
        this.mfaName = str;
    }

    public String getMfaName() {
        return this.mfaName;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPreferred() {
        return this.preferred;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setPreferred(boolean z) {
        this.preferred = z;
    }

    private CognitoMfaSettings() {
    }
}
