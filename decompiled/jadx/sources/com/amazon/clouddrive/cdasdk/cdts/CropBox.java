package com.amazon.clouddrive.cdasdk.cdts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CropBox {
    private long cropHeight;
    private long cropWidth;
    private long offsetX;
    private long offsetY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class CropBoxBuilder {

        @Generated
        private long cropHeight;

        @Generated
        private long cropWidth;

        @Generated
        private long offsetX;

        @Generated
        private long offsetY;

        @Generated
        public CropBoxBuilder() {
        }

        @Generated
        public CropBox build() {
            return new CropBox(this.offsetX, this.offsetY, this.cropWidth, this.cropHeight);
        }

        @Generated
        public CropBoxBuilder cropHeight(long j) {
            this.cropHeight = j;
            return this;
        }

        @Generated
        public CropBoxBuilder cropWidth(long j) {
            this.cropWidth = j;
            return this;
        }

        @Generated
        public CropBoxBuilder offsetX(long j) {
            this.offsetX = j;
            return this;
        }

        @Generated
        public CropBoxBuilder offsetY(long j) {
            this.offsetY = j;
            return this;
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CropBox.CropBoxBuilder(offsetX=");
            sb.append(this.offsetX);
            sb.append(", offsetY=");
            sb.append(this.offsetY);
            sb.append(", cropWidth=");
            sb.append(this.cropWidth);
            sb.append(", cropHeight=");
            return a$$ExternalSyntheticOutline0.m(this.cropHeight, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }
    }

    @Generated
    public CropBox(long j, long j2, long j3, long j4) {
        this.offsetX = j;
        this.offsetY = j2;
        this.cropWidth = j3;
        this.cropHeight = j4;
    }

    @Generated
    public static CropBoxBuilder builder() {
        return new CropBoxBuilder();
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CropBox;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CropBox)) {
            return false;
        }
        CropBox cropBox = (CropBox) obj;
        return cropBox.canEqual(this) && getOffsetX() == cropBox.getOffsetX() && getOffsetY() == cropBox.getOffsetY() && getCropWidth() == cropBox.getCropWidth() && getCropHeight() == cropBox.getCropHeight();
    }

    @Generated
    public long getCropHeight() {
        return this.cropHeight;
    }

    @Generated
    public long getCropWidth() {
        return this.cropWidth;
    }

    @Generated
    public long getOffsetX() {
        return this.offsetX;
    }

    @Generated
    public long getOffsetY() {
        return this.offsetY;
    }

    @Generated
    public int hashCode() {
        long offsetX = getOffsetX();
        long offsetY = getOffsetY();
        int i = ((((int) (offsetX ^ (offsetX >>> 32))) + 59) * 59) + ((int) (offsetY ^ (offsetY >>> 32)));
        long cropWidth = getCropWidth();
        int i2 = (i * 59) + ((int) (cropWidth ^ (cropWidth >>> 32)));
        long cropHeight = getCropHeight();
        return (i2 * 59) + ((int) ((cropHeight >>> 32) ^ cropHeight));
    }

    @Generated
    public void setCropHeight(long j) {
        this.cropHeight = j;
    }

    @Generated
    public void setCropWidth(long j) {
        this.cropWidth = j;
    }

    @Generated
    public void setOffsetX(long j) {
        this.offsetX = j;
    }

    @Generated
    public void setOffsetY(long j) {
        this.offsetY = j;
    }

    @Generated
    public String toString() {
        return "CropBox(offsetX=" + getOffsetX() + ", offsetY=" + getOffsetY() + ", cropWidth=" + getCropWidth() + ", cropHeight=" + getCropHeight() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
