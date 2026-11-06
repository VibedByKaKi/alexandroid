package com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens;

import androidx.autofill.HintConstants;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoInternalErrorException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoJWTParser;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CognitoAccessToken extends CognitoUserToken {
    private static final int SECS = 1000;

    public CognitoAccessToken(String str) {
        super(str);
    }

    public Date getExpiration() {
        try {
            String claim = CognitoJWTParser.getClaim(super.getToken(), "exp");
            if (claim == null) {
                return null;
            }
            return new Date(Long.parseLong(claim) * 1000);
        } catch (Exception e) {
            throw new CognitoInternalErrorException(e.getMessage());
        }
    }

    public String getJWTToken() {
        return super.getToken();
    }

    public String getUsername() throws Exception {
        return CognitoJWTParser.getClaim(super.getToken(), HintConstants.AUTOFILL_HINT_USERNAME);
    }
}
