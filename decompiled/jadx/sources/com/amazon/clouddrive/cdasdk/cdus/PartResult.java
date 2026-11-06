package com.amazon.clouddrive.cdasdk.cdus;

import chip.platform.ConfigurationManager;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PartResult {

    @SerializedName("eTag")
    @Expose
    private String eTag;

    @SerializedName(ConfigurationManager.kConfigKey_PartNumber)
    @Expose
    private Long partNumber;

    @SerializedName("part-size")
    @Expose
    private Long partSize;

    @Generated
    public PartResult() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PartResult;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartResult)) {
            return false;
        }
        PartResult partResult = (PartResult) obj;
        if (!partResult.canEqual(this)) {
            return false;
        }
        Long partNumber = getPartNumber();
        Long partNumber2 = partResult.getPartNumber();
        if (partNumber != null ? !partNumber.equals(partNumber2) : partNumber2 != null) {
            return false;
        }
        Long partSize = getPartSize();
        Long partSize2 = partResult.getPartSize();
        if (partSize != null ? !partSize.equals(partSize2) : partSize2 != null) {
            return false;
        }
        String eTag = getETag();
        String eTag2 = partResult.getETag();
        return eTag != null ? eTag.equals(eTag2) : eTag2 == null;
    }

    @Generated
    public String getETag() {
        return this.eTag;
    }

    @Generated
    public Long getPartNumber() {
        return this.partNumber;
    }

    @Generated
    public Long getPartSize() {
        return this.partSize;
    }

    @Generated
    public int hashCode() {
        Long partNumber = getPartNumber();
        int hashCode = partNumber == null ? 43 : partNumber.hashCode();
        Long partSize = getPartSize();
        int i = (hashCode + 59) * 59;
        int hashCode2 = partSize == null ? 43 : partSize.hashCode();
        String eTag = getETag();
        return ((i + hashCode2) * 59) + (eTag != null ? eTag.hashCode() : 43);
    }

    @Generated
    public void setETag(String str) {
        this.eTag = str;
    }

    @Generated
    public void setPartNumber(Long l) {
        this.partNumber = l;
    }

    @Generated
    public void setPartSize(Long l) {
        this.partSize = l;
    }

    @Generated
    public String toString() {
        return "PartResult(partNumber=" + getPartNumber() + ", partSize=" + getPartSize() + ", eTag=" + getETag() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
