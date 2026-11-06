package com.amazon.clouddrive.cdasdk.dps.settings;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetSettingsResponse {

    @SerializedName("providerCollections")
    @Expose
    private List<ProviderCollection> providerCollections;

    @Generated
    public GetSettingsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetSettingsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSettingsResponse)) {
            return false;
        }
        GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
        if (!getSettingsResponse.canEqual(this)) {
            return false;
        }
        List<ProviderCollection> providerCollections = getProviderCollections();
        List<ProviderCollection> providerCollections2 = getSettingsResponse.getProviderCollections();
        return providerCollections != null ? providerCollections.equals(providerCollections2) : providerCollections2 == null;
    }

    @Generated
    public List<ProviderCollection> getProviderCollections() {
        return this.providerCollections;
    }

    @Generated
    public int hashCode() {
        List<ProviderCollection> providerCollections = getProviderCollections();
        return 59 + (providerCollections == null ? 43 : providerCollections.hashCode());
    }

    @Generated
    public void setProviderCollections(List<ProviderCollection> list) {
        this.providerCollections = list;
    }

    @Generated
    public String toString() {
        return "GetSettingsResponse(providerCollections=" + getProviderCollections() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
