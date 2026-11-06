package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DevoEndpointConfiguration implements EndpointConfiguration {
    private static final String DEVO_APS_API_URL = "https://aps-na-beta.integ.amazon.com/photoapp/";
    private static final String DEVO_CDRS_API_URL = "https://cds-na-beta.integ.amazon.com/drive/v2/";
    private static final String DEVO_CONTENT_API_URL = "https://cd-proxyservice-na.integ.amazon.com/";
    private static final String DEVO_DPS_API_URL = "https://cds-na-beta.integ.amazon.com/drive/v2/device-personalization/";
    private static final String DEVO_METADATA_API_URL = "https://cds-na-beta.integ.amazon.com/drive/v1/";
    private static final String DEVO_PROMPTO_API_URL = "https://cds-na-beta.integ.amazon.com/drive/v2/photosGroups/";

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getApsServiceUrl() {
        return DEVO_APS_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getCdrsServiceUrl() {
        return DEVO_CDRS_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getContentUrl() {
        return DEVO_CONTENT_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getDpsServiceUrl() {
        return DEVO_DPS_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getMetadataUrl() {
        return DEVO_METADATA_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getPromptoServiceUrl() {
        return DEVO_PROMPTO_API_URL;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    public String getThumbnailUrl() {
        return getContentUrl();
    }
}
