package com.amazon.clouddrive.cdasdk.prompto.photos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CropBoxResponse {

    @SerializedName("cropHeight")
    @Expose
    private Integer cropHeight;

    @SerializedName("cropWidth")
    @Expose
    private Integer cropWidth;

    @SerializedName("offsetX")
    @Expose
    private Integer offsetX;

    @SerializedName("offsetY")
    @Expose
    private Integer offsetY;

    @Generated
    public CropBoxResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CropBoxResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CropBoxResponse)) {
            return false;
        }
        CropBoxResponse cropBoxResponse = (CropBoxResponse) obj;
        if (!cropBoxResponse.canEqual(this)) {
            return false;
        }
        Integer offsetX = getOffsetX();
        Integer offsetX2 = cropBoxResponse.getOffsetX();
        if (offsetX != null ? !offsetX.equals(offsetX2) : offsetX2 != null) {
            return false;
        }
        Integer offsetY = getOffsetY();
        Integer offsetY2 = cropBoxResponse.getOffsetY();
        if (offsetY != null ? !offsetY.equals(offsetY2) : offsetY2 != null) {
            return false;
        }
        Integer cropWidth = getCropWidth();
        Integer cropWidth2 = cropBoxResponse.getCropWidth();
        if (cropWidth != null ? !cropWidth.equals(cropWidth2) : cropWidth2 != null) {
            return false;
        }
        Integer cropHeight = getCropHeight();
        Integer cropHeight2 = cropBoxResponse.getCropHeight();
        return cropHeight != null ? cropHeight.equals(cropHeight2) : cropHeight2 == null;
    }

    @Generated
    public Integer getCropHeight() {
        return this.cropHeight;
    }

    @Generated
    public Integer getCropWidth() {
        return this.cropWidth;
    }

    @Generated
    public Integer getOffsetX() {
        return this.offsetX;
    }

    @Generated
    public Integer getOffsetY() {
        return this.offsetY;
    }

    @Generated
    public int hashCode() {
        Integer offsetX = getOffsetX();
        int hashCode = offsetX == null ? 43 : offsetX.hashCode();
        Integer offsetY = getOffsetY();
        int hashCode2 = ((hashCode + 59) * 59) + (offsetY == null ? 43 : offsetY.hashCode());
        Integer cropWidth = getCropWidth();
        int i = hashCode2 * 59;
        int hashCode3 = cropWidth == null ? 43 : cropWidth.hashCode();
        Integer cropHeight = getCropHeight();
        return ((i + hashCode3) * 59) + (cropHeight != null ? cropHeight.hashCode() : 43);
    }

    @Generated
    public void setCropHeight(Integer num) {
        this.cropHeight = num;
    }

    @Generated
    public void setCropWidth(Integer num) {
        this.cropWidth = num;
    }

    @Generated
    public void setOffsetX(Integer num) {
        this.offsetX = num;
    }

    @Generated
    public void setOffsetY(Integer num) {
        this.offsetY = num;
    }

    @Generated
    public String toString() {
        return "CropBoxResponse(offsetX=" + getOffsetX() + ", offsetY=" + getOffsetY() + ", cropWidth=" + getCropWidth() + ", cropHeight=" + getCropHeight() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
