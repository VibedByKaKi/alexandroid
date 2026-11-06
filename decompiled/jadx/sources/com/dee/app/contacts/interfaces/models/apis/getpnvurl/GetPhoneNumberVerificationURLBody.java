package com.dee.app.contacts.interfaces.models.apis.getpnvurl;

import com.dee.app.contacts.interfaces.models.apis.ApiConstants;
import com.dee.app.contacts.interfaces.models.data.enums.ClientConfig;
import com.dee.app.contacts.interfaces.models.data.enums.UiConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPhoneNumberVerificationURLBody {
    private String actorAccessToken;
    private String actorId;
    private String clientConfig;
    private String redirectUrl;
    private String uiConfig;
    private String refreshTokenType = ApiConstants.DEFAULT_REFRESH_TOKEN_TYPE;
    private String policyHandle = ApiConstants.DEFAULT_POLICY_HANDLE;
    private String signInDomain = "www.amazon.com";

    public GetPhoneNumberVerificationURLBody(String str, String str2, String str3) {
        this.actorAccessToken = str;
        this.actorId = str2;
        this.redirectUrl = str3;
    }

    public void setClientConfig(ClientConfig clientConfig) {
        this.clientConfig = clientConfig.getValue();
    }

    public void setUiConfig(UiConfig uiConfig) {
        this.uiConfig = uiConfig.getValue();
    }
}
