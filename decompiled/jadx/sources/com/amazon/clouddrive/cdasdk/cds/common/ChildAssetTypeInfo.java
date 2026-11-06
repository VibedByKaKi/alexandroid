package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ChildAssetTypeInfo {

    @SerializedName("assetType")
    @Expose
    private String assetType;

    @Generated
    public ChildAssetTypeInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ChildAssetTypeInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChildAssetTypeInfo)) {
            return false;
        }
        ChildAssetTypeInfo childAssetTypeInfo = (ChildAssetTypeInfo) obj;
        if (!childAssetTypeInfo.canEqual(this)) {
            return false;
        }
        String assetType = getAssetType();
        String assetType2 = childAssetTypeInfo.getAssetType();
        return assetType != null ? assetType.equals(assetType2) : assetType2 == null;
    }

    @Generated
    public String getAssetType() {
        return this.assetType;
    }

    @Generated
    public int hashCode() {
        String assetType = getAssetType();
        return 59 + (assetType == null ? 43 : assetType.hashCode());
    }

    @Generated
    public void setAssetType(String str) {
        this.assetType = str;
    }

    @Generated
    public String toString() {
        return "ChildAssetTypeInfo(assetType=" + getAssetType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
