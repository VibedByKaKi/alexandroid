package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.RegisterMfaHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import com.amazonaws.util.StringUtils;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VerifyMfaContinuation implements CognitoIdentityProviderContinuation<Map<String, String>> {
    public static final boolean RUN_IN_BACKGROUND = true;
    public static final boolean RUN_IN_CURRENT = false;
    private final RegisterMfaHandler callback;
    private final String clientId;
    private final Context context;
    private String friendlyName = CognitoServiceConstants.DEFAULT_TOTP_DEVICE_FRIENDLY_NAME;
    private final Map<String, String> mfaSetupDetails;
    private final boolean runInBackground;
    private final String sessionToken;
    private final boolean useSessionToken;
    private final CognitoUser user;
    private String verificationCode;

    public VerifyMfaContinuation(Context context, String str, CognitoUser cognitoUser, RegisterMfaHandler registerMfaHandler, Map<String, String> map, boolean z, String str2, boolean z2) {
        this.context = context;
        this.clientId = str;
        this.user = cognitoUser;
        this.callback = registerMfaHandler;
        this.mfaSetupDetails = map;
        this.useSessionToken = z;
        this.sessionToken = str2;
        this.runInBackground = z2;
    }

    @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation
    public void continueTask() {
        if (!this.runInBackground) {
            this.user.verifySoftwareTokenInBackground(null, this.verificationCode, this.friendlyName, this.callback);
            return;
        }
        boolean z = this.useSessionToken;
        CognitoUser cognitoUser = this.user;
        if (z) {
            cognitoUser.verifySoftwareTokenInBackground(this.sessionToken, this.verificationCode, this.friendlyName, this.callback);
        } else {
            cognitoUser.verifySoftwareTokenInBackground(null, this.verificationCode, this.friendlyName, this.callback);
        }
    }

    public void setVerificationResponse(String str, String str2) {
        if (StringUtils.isBlank(str)) {
            Classes$$ExternalSyntheticBUOutline0.m$2("verification code is invalid");
            return;
        }
        this.verificationCode = str;
        if (StringUtils.isBlank(str2)) {
            return;
        }
        this.friendlyName = str2;
    }

    @Override // com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations.CognitoIdentityProviderContinuation
    public Map<String, String> getParameters() {
        return this.mfaSetupDetails;
    }
}
