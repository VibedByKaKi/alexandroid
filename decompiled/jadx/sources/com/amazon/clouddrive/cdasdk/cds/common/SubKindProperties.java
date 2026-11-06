package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.NodeSubKindProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SubKindProperties {

    @SerializedName("iOSBurstPhoto")
    @Expose
    private IOSBurstPhoto iOSBurstPhoto;

    @SerializedName(NodeSubKindProperties.SubKindPropertyOwner.SONY_BURST_PHOTO)
    @Expose
    private SonyBurstPhoto sonyBurstPhoto;

    @Generated
    public SubKindProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SubKindProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubKindProperties)) {
            return false;
        }
        SubKindProperties subKindProperties = (SubKindProperties) obj;
        if (!subKindProperties.canEqual(this)) {
            return false;
        }
        IOSBurstPhoto iOSBurstPhoto = getIOSBurstPhoto();
        IOSBurstPhoto iOSBurstPhoto2 = subKindProperties.getIOSBurstPhoto();
        if (iOSBurstPhoto != null ? !iOSBurstPhoto.equals(iOSBurstPhoto2) : iOSBurstPhoto2 != null) {
            return false;
        }
        SonyBurstPhoto sonyBurstPhoto = getSonyBurstPhoto();
        SonyBurstPhoto sonyBurstPhoto2 = subKindProperties.getSonyBurstPhoto();
        return sonyBurstPhoto != null ? sonyBurstPhoto.equals(sonyBurstPhoto2) : sonyBurstPhoto2 == null;
    }

    @Generated
    public IOSBurstPhoto getIOSBurstPhoto() {
        return this.iOSBurstPhoto;
    }

    @Generated
    public SonyBurstPhoto getSonyBurstPhoto() {
        return this.sonyBurstPhoto;
    }

    @Generated
    public int hashCode() {
        IOSBurstPhoto iOSBurstPhoto = getIOSBurstPhoto();
        int hashCode = iOSBurstPhoto == null ? 43 : iOSBurstPhoto.hashCode();
        SonyBurstPhoto sonyBurstPhoto = getSonyBurstPhoto();
        return ((hashCode + 59) * 59) + (sonyBurstPhoto != null ? sonyBurstPhoto.hashCode() : 43);
    }

    @Generated
    public void setIOSBurstPhoto(IOSBurstPhoto iOSBurstPhoto) {
        this.iOSBurstPhoto = iOSBurstPhoto;
    }

    @Generated
    public void setSonyBurstPhoto(SonyBurstPhoto sonyBurstPhoto) {
        this.sonyBurstPhoto = sonyBurstPhoto;
    }

    @Generated
    public String toString() {
        return "SubKindProperties(iOSBurstPhoto=" + getIOSBurstPhoto() + ", sonyBurstPhoto=" + getSonyBurstPhoto() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
