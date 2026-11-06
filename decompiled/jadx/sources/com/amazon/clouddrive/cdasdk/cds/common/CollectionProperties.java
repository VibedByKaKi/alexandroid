package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionProperties {

    @SerializedName("areCoversDesired")
    @Expose
    private Boolean areCoversDesired;

    @SerializedName("covers")
    @Expose
    private List<CoverObject> covers;

    @SerializedName(SearchIntents.EXTRA_QUERY)
    @Expose
    private CollectionQueryObject query;

    @SerializedName("type")
    @Expose
    private String type;

    @Generated
    public CollectionProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CollectionProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionProperties)) {
            return false;
        }
        CollectionProperties collectionProperties = (CollectionProperties) obj;
        if (!collectionProperties.canEqual(this)) {
            return false;
        }
        Boolean areCoversDesired = getAreCoversDesired();
        Boolean areCoversDesired2 = collectionProperties.getAreCoversDesired();
        if (areCoversDesired != null ? !areCoversDesired.equals(areCoversDesired2) : areCoversDesired2 != null) {
            return false;
        }
        List<CoverObject> covers = getCovers();
        List<CoverObject> covers2 = collectionProperties.getCovers();
        if (covers != null ? !covers.equals(covers2) : covers2 != null) {
            return false;
        }
        CollectionQueryObject query = getQuery();
        CollectionQueryObject query2 = collectionProperties.getQuery();
        if (query != null ? !query.equals(query2) : query2 != null) {
            return false;
        }
        String type = getType();
        String type2 = collectionProperties.getType();
        return type != null ? type.equals(type2) : type2 == null;
    }

    @Generated
    public Boolean getAreCoversDesired() {
        return this.areCoversDesired;
    }

    @Generated
    public List<CoverObject> getCovers() {
        return this.covers;
    }

    @Generated
    public CollectionQueryObject getQuery() {
        return this.query;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Generated
    public int hashCode() {
        Boolean areCoversDesired = getAreCoversDesired();
        int hashCode = areCoversDesired == null ? 43 : areCoversDesired.hashCode();
        List<CoverObject> covers = getCovers();
        int hashCode2 = ((hashCode + 59) * 59) + (covers == null ? 43 : covers.hashCode());
        CollectionQueryObject query = getQuery();
        int i = hashCode2 * 59;
        int hashCode3 = query == null ? 43 : query.hashCode();
        String type = getType();
        return ((i + hashCode3) * 59) + (type != null ? type.hashCode() : 43);
    }

    @Generated
    public void setAreCoversDesired(Boolean bool) {
        this.areCoversDesired = bool;
    }

    @Generated
    public void setCovers(List<CoverObject> list) {
        this.covers = list;
    }

    @Generated
    public void setQuery(CollectionQueryObject collectionQueryObject) {
        this.query = collectionQueryObject;
    }

    @Generated
    public void setType(String str) {
        this.type = str;
    }

    @Generated
    public String toString() {
        return "CollectionProperties(areCoversDesired=" + getAreCoversDesired() + ", covers=" + getCovers() + ", query=" + getQuery() + ", type=" + getType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
