package com.amazon.alexa.assetManagementService.service;

import android.content.Context;
import com.amazon.alexa.assetManagementService.model.constants.GetAssetURLServiceConstants;
import com.amazon.alexa.assetManagementService.model.constants.GetAssetURLServiceMetricsConstants;
import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class NetworkHelper {
    private static final String LOGTAG = "GetAssetURLService";
    private Context context;
    private String currentEtag;
    private String currentResolution;

    public NetworkHelper(Context context, String str) {
        this.context = context;
        this.currentResolution = str;
    }

    public Request createRequest(boolean z) {
        this.currentEtag = this.context.getSharedPreferences(GetAssetURLServiceMetricsConstants.CAM_COMPONENT_NAME, 0).getString("ETag", null);
        Request.Builder url = new Request.Builder().url(String.format(z ? GetAssetURLServiceConstants.PROD_NETWORK_CALL_CLOUDFRONT_URL : GetAssetURLServiceConstants.STAGING_NETWORK_CALL_CLOUDFRONT_URL, this.currentResolution));
        Request build = url.build();
        String str = this.currentEtag;
        return str != null ? url.addHeader("If-None-Match", str).build() : build;
    }

    public String getCurrentEtag() {
        return this.currentEtag;
    }
}
