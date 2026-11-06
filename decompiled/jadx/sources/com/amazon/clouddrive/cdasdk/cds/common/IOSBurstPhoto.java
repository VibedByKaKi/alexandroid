package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.NodeSubKindProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class IOSBurstPhoto {

    @SerializedName(NodeSubKindProperties.SubKindPropertyKeys.BURST_ID)
    @Expose
    private String burstId;

    @SerializedName(NodeSubKindProperties.SubKindPropertyKeys.IS_HERO)
    @Expose
    private Boolean isHero;

    @Generated
    public IOSBurstPhoto() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof IOSBurstPhoto;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IOSBurstPhoto)) {
            return false;
        }
        IOSBurstPhoto iOSBurstPhoto = (IOSBurstPhoto) obj;
        if (!iOSBurstPhoto.canEqual(this)) {
            return false;
        }
        Boolean isHero = getIsHero();
        Boolean isHero2 = iOSBurstPhoto.getIsHero();
        if (isHero != null ? !isHero.equals(isHero2) : isHero2 != null) {
            return false;
        }
        String burstId = getBurstId();
        String burstId2 = iOSBurstPhoto.getBurstId();
        return burstId != null ? burstId.equals(burstId2) : burstId2 == null;
    }

    @Generated
    public String getBurstId() {
        return this.burstId;
    }

    @Generated
    public Boolean getIsHero() {
        return this.isHero;
    }

    @Generated
    public int hashCode() {
        Boolean isHero = getIsHero();
        int hashCode = isHero == null ? 43 : isHero.hashCode();
        String burstId = getBurstId();
        return ((hashCode + 59) * 59) + (burstId != null ? burstId.hashCode() : 43);
    }

    @Generated
    public void setBurstId(String str) {
        this.burstId = str;
    }

    @Generated
    public void setIsHero(Boolean bool) {
        this.isHero = bool;
    }

    @Generated
    public String toString() {
        return "IOSBurstPhoto(burstId=" + getBurstId() + ", isHero=" + getIsHero() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
