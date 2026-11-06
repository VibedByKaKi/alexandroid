package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;
import com.amazon.alexa.sharing.api.models.PayloadAttachmentUrl;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpecificEndpointConfiguration implements EndpointConfiguration {

    @NonNull
    @SerializedName("apsServiceUrl")
    private String apsServiceUrl;

    @NonNull
    @SerializedName("cdrsServiceUrl")
    private String cdrsServiceUrl;

    @NonNull
    @SerializedName("contentUrl")
    private String contentUrl;

    @NonNull
    @SerializedName("dpsServiceUrl")
    private String dpsServiceUrl;

    @NonNull
    @SerializedName("metadataUrl")
    private String metadataUrl;

    @NonNull
    @SerializedName("promptoServiceUrl")
    private String promptoServiceUrl;

    @NonNull
    @SerializedName(PayloadAttachmentUrl.SERIALIZED_NAME_THUMBNAIL_URL)
    private String thumbnailUrl;

    public SpecificEndpointConfiguration(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7) {
        this.metadataUrl = str;
        this.contentUrl = str2;
        this.thumbnailUrl = str3;
        this.promptoServiceUrl = str4;
        this.apsServiceUrl = str5;
        this.cdrsServiceUrl = str6;
        this.dpsServiceUrl = str7;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getApsServiceUrl() {
        return this.apsServiceUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getCdrsServiceUrl() {
        return this.cdrsServiceUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getContentUrl() {
        return this.contentUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getDpsServiceUrl() {
        return this.dpsServiceUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getMetadataUrl() {
        return this.metadataUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getPromptoServiceUrl() {
        return this.promptoServiceUrl;
    }

    @Override // com.amazon.clouddrive.cdasdk.EndpointConfiguration
    @NonNull
    @Generated
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
}
