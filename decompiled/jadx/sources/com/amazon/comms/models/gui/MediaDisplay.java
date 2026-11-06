package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaDisplay {
    private String mimeType;
    private String uri;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaDisplayBuilder {
        private String mimeType;
        private String uri;

        public MediaDisplay build() {
            return new MediaDisplay(this.uri, this.mimeType, 0);
        }

        public MediaDisplayBuilder mimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MediaDisplay.MediaDisplayBuilder(uri=", this.uri, ", mimeType=", this.mimeType, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public MediaDisplayBuilder uri(String str) {
            this.uri = str;
            return this;
        }
    }

    private MediaDisplay(String str, String str2) {
        this.uri = str;
        this.mimeType = str2;
    }

    public static MediaDisplayBuilder builder() {
        return new MediaDisplayBuilder();
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getUri() {
        return this.uri;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public MediaDisplay() {
    }

    public /* synthetic */ MediaDisplay(String str, String str2, int i) {
        this(str, str2);
    }
}
