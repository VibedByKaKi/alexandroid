package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionFilterObject {

    @SerializedName("folderIds")
    @Expose
    private List<String> folderIds;

    @Generated
    public CollectionFilterObject() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CollectionFilterObject;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionFilterObject)) {
            return false;
        }
        CollectionFilterObject collectionFilterObject = (CollectionFilterObject) obj;
        if (!collectionFilterObject.canEqual(this)) {
            return false;
        }
        List<String> folderIds = getFolderIds();
        List<String> folderIds2 = collectionFilterObject.getFolderIds();
        return folderIds != null ? folderIds.equals(folderIds2) : folderIds2 == null;
    }

    @Generated
    public List<String> getFolderIds() {
        return this.folderIds;
    }

    @Generated
    public int hashCode() {
        List<String> folderIds = getFolderIds();
        return 59 + (folderIds == null ? 43 : folderIds.hashCode());
    }

    @Generated
    public void setFolderIds(List<String> list) {
        this.folderIds = list;
    }

    @Generated
    public String toString() {
        return "CollectionFilterObject(folderIds=" + getFolderIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
