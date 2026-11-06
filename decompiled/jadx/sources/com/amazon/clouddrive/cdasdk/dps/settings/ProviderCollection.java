package com.amazon.clouddrive.cdasdk.dps.settings;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProviderCollection {

    @SerializedName("collectionIds")
    @Expose
    private List<String> collectionIds;

    @SerializedName("providerId")
    @Expose
    private String providerId;

    @Generated
    public ProviderCollection() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ProviderCollection;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProviderCollection)) {
            return false;
        }
        ProviderCollection providerCollection = (ProviderCollection) obj;
        if (!providerCollection.canEqual(this)) {
            return false;
        }
        String providerId = getProviderId();
        String providerId2 = providerCollection.getProviderId();
        if (providerId != null ? !providerId.equals(providerId2) : providerId2 != null) {
            return false;
        }
        List<String> collectionIds = getCollectionIds();
        List<String> collectionIds2 = providerCollection.getCollectionIds();
        return collectionIds != null ? collectionIds.equals(collectionIds2) : collectionIds2 == null;
    }

    @Generated
    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    @Generated
    public String getProviderId() {
        return this.providerId;
    }

    @Generated
    public int hashCode() {
        String providerId = getProviderId();
        int hashCode = providerId == null ? 43 : providerId.hashCode();
        List<String> collectionIds = getCollectionIds();
        return ((hashCode + 59) * 59) + (collectionIds != null ? collectionIds.hashCode() : 43);
    }

    @Generated
    public void setCollectionIds(List<String> list) {
        this.collectionIds = list;
    }

    @Generated
    public void setProviderId(String str) {
        this.providerId = str;
    }

    @Generated
    public String toString() {
        return "ProviderCollection(providerId=" + getProviderId() + ", collectionIds=" + getCollectionIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
