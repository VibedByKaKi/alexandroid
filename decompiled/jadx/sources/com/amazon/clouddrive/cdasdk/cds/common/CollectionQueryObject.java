package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionQueryObject {

    @SerializedName("excludedIds")
    @Expose
    private List<String> excludedIds;

    @SerializedName("include")
    @Expose
    private List<CollectionFilterObject> include;

    @Generated
    public CollectionQueryObject() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CollectionQueryObject;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionQueryObject)) {
            return false;
        }
        CollectionQueryObject collectionQueryObject = (CollectionQueryObject) obj;
        if (!collectionQueryObject.canEqual(this)) {
            return false;
        }
        List<CollectionFilterObject> include = getInclude();
        List<CollectionFilterObject> include2 = collectionQueryObject.getInclude();
        if (include != null ? !include.equals(include2) : include2 != null) {
            return false;
        }
        List<String> excludedIds = getExcludedIds();
        List<String> excludedIds2 = collectionQueryObject.getExcludedIds();
        return excludedIds != null ? excludedIds.equals(excludedIds2) : excludedIds2 == null;
    }

    @Generated
    public List<String> getExcludedIds() {
        return this.excludedIds;
    }

    @Generated
    public List<CollectionFilterObject> getInclude() {
        return this.include;
    }

    @Generated
    public int hashCode() {
        List<CollectionFilterObject> include = getInclude();
        int hashCode = include == null ? 43 : include.hashCode();
        List<String> excludedIds = getExcludedIds();
        return ((hashCode + 59) * 59) + (excludedIds != null ? excludedIds.hashCode() : 43);
    }

    @Generated
    public void setExcludedIds(List<String> list) {
        this.excludedIds = list;
    }

    @Generated
    public void setInclude(List<CollectionFilterObject> list) {
        this.include = list;
    }

    @Generated
    public String toString() {
        return "CollectionQueryObject(include=" + getInclude() + ", excludedIds=" + getExcludedIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
