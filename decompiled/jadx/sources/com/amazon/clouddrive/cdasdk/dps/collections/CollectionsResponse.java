package com.amazon.clouddrive.cdasdk.dps.collections;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionsResponse {

    @SerializedName("collectionId")
    @Expose
    private String collectionId;

    @SerializedName("collectionName")
    @Expose
    private String collectionName;

    @SerializedName("collectionType")
    @Expose
    private String collectionType;

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("coverPhotoUrls")
    @Expose
    private List<String> coverPhotoUrls;

    @Generated
    public CollectionsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CollectionsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionsResponse)) {
            return false;
        }
        CollectionsResponse collectionsResponse = (CollectionsResponse) obj;
        if (!collectionsResponse.canEqual(this)) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = collectionsResponse.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String collectionId = getCollectionId();
        String collectionId2 = collectionsResponse.getCollectionId();
        if (collectionId != null ? !collectionId.equals(collectionId2) : collectionId2 != null) {
            return false;
        }
        String collectionName = getCollectionName();
        String collectionName2 = collectionsResponse.getCollectionName();
        if (collectionName != null ? !collectionName.equals(collectionName2) : collectionName2 != null) {
            return false;
        }
        String collectionType = getCollectionType();
        String collectionType2 = collectionsResponse.getCollectionType();
        if (collectionType != null ? !collectionType.equals(collectionType2) : collectionType2 != null) {
            return false;
        }
        List<String> coverPhotoUrls = getCoverPhotoUrls();
        List<String> coverPhotoUrls2 = collectionsResponse.getCoverPhotoUrls();
        return coverPhotoUrls != null ? coverPhotoUrls.equals(coverPhotoUrls2) : coverPhotoUrls2 == null;
    }

    @Generated
    public String getCollectionId() {
        return this.collectionId;
    }

    @Generated
    public String getCollectionName() {
        return this.collectionName;
    }

    @Generated
    public String getCollectionType() {
        return this.collectionType;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public List<String> getCoverPhotoUrls() {
        return this.coverPhotoUrls;
    }

    @Generated
    public int hashCode() {
        Integer count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        String collectionId = getCollectionId();
        int hashCode2 = ((hashCode + 59) * 59) + (collectionId == null ? 43 : collectionId.hashCode());
        String collectionName = getCollectionName();
        int hashCode3 = (hashCode2 * 59) + (collectionName == null ? 43 : collectionName.hashCode());
        String collectionType = getCollectionType();
        int i = hashCode3 * 59;
        int hashCode4 = collectionType == null ? 43 : collectionType.hashCode();
        List<String> coverPhotoUrls = getCoverPhotoUrls();
        return ((i + hashCode4) * 59) + (coverPhotoUrls != null ? coverPhotoUrls.hashCode() : 43);
    }

    @Generated
    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    @Generated
    public void setCollectionName(String str) {
        this.collectionName = str;
    }

    @Generated
    public void setCollectionType(String str) {
        this.collectionType = str;
    }

    @Generated
    public void setCount(Integer num) {
        this.count = num;
    }

    @Generated
    public void setCoverPhotoUrls(List<String> list) {
        this.coverPhotoUrls = list;
    }

    @Generated
    public String toString() {
        return "CollectionsResponse(collectionId=" + getCollectionId() + ", collectionName=" + getCollectionName() + ", collectionType=" + getCollectionType() + ", coverPhotoUrls=" + getCoverPhotoUrls() + ", count=" + getCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
