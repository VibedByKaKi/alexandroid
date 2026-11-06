package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.ContentSignatureType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadContentRequest extends UpdateContentRequest {

    @SerializedName("contentSignature")
    @Expose
    private String contentSignature;

    @SerializedName("contentSignatureType")
    @Expose
    private ContentSignatureType contentSignatureType;

    @SerializedName("fallbackContentDate")
    @Expose
    private String fallbackContentDate;

    @SerializedName("localId")
    @Expose
    private String localId;

    @SerializedName("name")
    @Expose
    private String name;

    public UploadContentRequest(@NonNull String str, @NonNull Long l) {
        super(l);
        this.name = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.UpdateContentRequest, com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UploadContentRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.UpdateContentRequest, com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadContentRequest)) {
            return false;
        }
        UploadContentRequest uploadContentRequest = (UploadContentRequest) obj;
        if (!uploadContentRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String name = getName();
        String name2 = uploadContentRequest.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String fallbackContentDate = getFallbackContentDate();
        String fallbackContentDate2 = uploadContentRequest.getFallbackContentDate();
        if (fallbackContentDate != null ? !fallbackContentDate.equals(fallbackContentDate2) : fallbackContentDate2 != null) {
            return false;
        }
        String localId = getLocalId();
        String localId2 = uploadContentRequest.getLocalId();
        if (localId != null ? !localId.equals(localId2) : localId2 != null) {
            return false;
        }
        String contentSignature = getContentSignature();
        String contentSignature2 = uploadContentRequest.getContentSignature();
        if (contentSignature != null ? !contentSignature.equals(contentSignature2) : contentSignature2 != null) {
            return false;
        }
        ContentSignatureType contentSignatureType = getContentSignatureType();
        ContentSignatureType contentSignatureType2 = uploadContentRequest.getContentSignatureType();
        return contentSignatureType != null ? contentSignatureType.equals(contentSignatureType2) : contentSignatureType2 == null;
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
    public String getFallbackContentDate() {
        return this.fallbackContentDate;
    }

    @Generated
    public String getLocalId() {
        return this.localId;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.UpdateContentRequest, com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String name = getName();
        int hashCode2 = (hashCode * 59) + (name == null ? 43 : name.hashCode());
        String fallbackContentDate = getFallbackContentDate();
        int hashCode3 = (hashCode2 * 59) + (fallbackContentDate == null ? 43 : fallbackContentDate.hashCode());
        String localId = getLocalId();
        int hashCode4 = (hashCode3 * 59) + (localId == null ? 43 : localId.hashCode());
        String contentSignature = getContentSignature();
        int i = hashCode4 * 59;
        int hashCode5 = contentSignature == null ? 43 : contentSignature.hashCode();
        ContentSignatureType contentSignatureType = getContentSignatureType();
        return ((i + hashCode5) * 59) + (contentSignatureType != null ? contentSignatureType.hashCode() : 43);
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
    public void setFallbackContentDate(String str) {
        this.fallbackContentDate = str;
    }

    @Generated
    public void setLocalId(String str) {
        this.localId = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.UpdateContentRequest, com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "UploadContentRequest(name=" + getName() + ", fallbackContentDate=" + getFallbackContentDate() + ", localId=" + getLocalId() + ", contentSignature=" + getContentSignature() + ", contentSignatureType=" + getContentSignatureType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
