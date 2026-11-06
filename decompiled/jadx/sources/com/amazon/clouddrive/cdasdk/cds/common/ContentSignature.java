package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ContentSignature {

    @SerializedName("contentSignature")
    @Expose
    private String contentSignature;

    @SerializedName("contentSignatureType")
    @Expose
    private ContentSignatureType contentSignatureType;

    @Generated
    public ContentSignature() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ContentSignature;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentSignature)) {
            return false;
        }
        ContentSignature contentSignature = (ContentSignature) obj;
        if (!contentSignature.canEqual(this)) {
            return false;
        }
        ContentSignatureType contentSignatureType = getContentSignatureType();
        ContentSignatureType contentSignatureType2 = contentSignature.getContentSignatureType();
        if (contentSignatureType != null ? !contentSignatureType.equals(contentSignatureType2) : contentSignatureType2 != null) {
            return false;
        }
        String contentSignature2 = getContentSignature();
        String contentSignature3 = contentSignature.getContentSignature();
        return contentSignature2 != null ? contentSignature2.equals(contentSignature3) : contentSignature3 == null;
    }

    @Generated
    public String getContentSignature() {
        return this.contentSignature;
    }

    @Generated
    public ContentSignatureType getContentSignatureType() {
        return this.contentSignatureType;
    }

    @Generated
    public int hashCode() {
        ContentSignatureType contentSignatureType = getContentSignatureType();
        int hashCode = contentSignatureType == null ? 43 : contentSignatureType.hashCode();
        String contentSignature = getContentSignature();
        return ((hashCode + 59) * 59) + (contentSignature != null ? contentSignature.hashCode() : 43);
    }

    @Generated
    public void setContentSignature(String str) {
        this.contentSignature = str;
    }

    @Generated
    public void setContentSignatureType(ContentSignatureType contentSignatureType) {
        this.contentSignatureType = contentSignatureType;
    }

    @Generated
    public String toString() {
        return "ContentSignature(contentSignatureType=" + getContentSignatureType() + ", contentSignature=" + getContentSignature() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
