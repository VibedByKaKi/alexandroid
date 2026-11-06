package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Image {
    private String size;
    private String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImageBuilder {
        private String size;
        private String url;

        public Image build() {
            return new Image(this.size, this.url);
        }

        public ImageBuilder size(String str) {
            this.size = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Image.ImageBuilder(size=", this.size, ", url=", this.url, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public ImageBuilder url(String str) {
            this.url = str;
            return this;
        }
    }

    public Image(String str, String str2) {
        this.size = str;
        this.url = str2;
    }

    public static ImageBuilder builder() {
        return new ImageBuilder();
    }

    public String getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }
}
