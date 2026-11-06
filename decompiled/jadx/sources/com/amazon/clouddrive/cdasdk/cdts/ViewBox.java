package com.amazon.clouddrive.cdasdk.cdts;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ViewBox {
    private int height;
    private int width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class ViewBoxBuilder {

        @Generated
        private int height;

        @Generated
        private int width;

        @Generated
        public ViewBoxBuilder() {
        }

        @Generated
        public ViewBox build() {
            return new ViewBox(this.width, this.height);
        }

        @Generated
        public ViewBoxBuilder height(int i) {
            this.height = i;
            return this;
        }

        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("ViewBox.ViewBoxBuilder(width=");
            sb.append(this.width);
            sb.append(", height=");
            return a$$ExternalSyntheticOutline0.m(sb, this.height, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @Generated
        public ViewBoxBuilder width(int i) {
            this.width = i;
            return this;
        }
    }

    @Generated
    public ViewBox(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Generated
    public static ViewBoxBuilder builder() {
        return new ViewBoxBuilder();
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ViewBox;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewBox)) {
            return false;
        }
        ViewBox viewBox = (ViewBox) obj;
        return viewBox.canEqual(this) && getWidth() == viewBox.getWidth() && getHeight() == viewBox.getHeight();
    }

    @Generated
    public int getHeight() {
        return this.height;
    }

    @Generated
    public int getWidth() {
        return this.width;
    }

    @Generated
    public int hashCode() {
        return getHeight() + ((getWidth() + 59) * 59);
    }

    @Generated
    public void setHeight(int i) {
        this.height = i;
    }

    @Generated
    public void setWidth(int i) {
        this.width = i;
    }

    @Generated
    public String toString() {
        return "ViewBox(width=" + getWidth() + ", height=" + getHeight() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
