package com.amazon.deecomms.common.auth;

import android.text.TextUtils;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.IHttpClient;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPAuthorizationProvider implements IHttpClient.AuthHeaderProvider {
    private static final String AUTH_HEADER_KEY = "Authorization";
    private static final String AUTH_SCHEME = "map";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, "EPMSAuthorizationProvider");
    private String authenticateWithCommsId;
    private IdentityService identityService;

    public MAPAuthorizationProvider(String str, String str2) {
        this.authenticateWithCommsId = str;
    }

    @Override // com.amazon.deecomms.common.network.IHttpClient.AuthHeaderProvider
    public Map<String, String> getAuthHeaders(String str, boolean z) {
        HashMap hashMap = new HashMap();
        String accessToken = this.identityService.getAccessToken(MAPAuthorizationProvider.class.getName());
        if (accessToken == null || TextUtils.isEmpty(accessToken)) {
            LOG.e("Cannot fetch mapToken from IdentityService. Auth Token is NULL");
            return hashMap;
        }
        CommsLogger commsLogger = LOG;
        commsLogger.d("MAP Token received = " + commsLogger.sensitive(accessToken));
        hashMap.put("Authorization", "map ".concat(accessToken));
        return hashMap;
    }

    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }
}
