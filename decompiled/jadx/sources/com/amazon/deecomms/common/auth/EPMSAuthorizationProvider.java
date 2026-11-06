package com.amazon.deecomms.common.auth;

import android.text.TextUtils;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.auth.AuthTokenHelper;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.IHttpClient;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EPMSAuthorizationProvider implements IHttpClient.AuthHeaderProvider {
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String AUTH_ACT_AS_HEADER = "X-Authorization-Act-As";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, "EPMSAuthorizationProvider");
    private String actAsCommsId;
    private String authenticateWithCommsId;

    public EPMSAuthorizationProvider(String str, String str2) {
        this.authenticateWithCommsId = str;
        this.actAsCommsId = str2;
    }

    @Override // com.amazon.deecomms.common.network.IHttpClient.AuthHeaderProvider
    public Map<String, String> getAuthHeaders(String str, boolean z) {
        HashMap hashMap = new HashMap();
        AuthTokenHelper.AuthToken fetchAuthToken = AuthTokenHelper.fetchAuthToken(this.authenticateWithCommsId, AuthTokenHelper.TokenType.MEDIA_SERVICE, z);
        if (fetchAuthToken == null || TextUtils.isEmpty(fetchAuthToken.getValue())) {
            LOG.e("Cannot fetch epmsToken from AuthTokenHelper. Auth Token is NULL");
            return hashMap;
        }
        CommsLogger commsLogger = LOG;
        commsLogger.d("Token = " + commsLogger.sensitive(fetchAuthToken.toString()));
        hashMap.put("Authorization", fetchAuthToken.getValue());
        if (!this.actAsCommsId.equals(this.authenticateWithCommsId)) {
            hashMap.put("X-Authorization-Act-As", this.actAsCommsId);
        }
        return hashMap;
    }
}
