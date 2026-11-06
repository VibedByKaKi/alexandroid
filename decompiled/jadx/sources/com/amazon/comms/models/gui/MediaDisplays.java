package com.amazon.comms.models.gui;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaDisplays {
    private MediaDisplay smallIcon;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaDisplaysBuilder {
        private MediaDisplay smallIcon;

        public MediaDisplays build() {
            return new MediaDisplays(this.smallIcon, 0);
        }

        public MediaDisplaysBuilder smallIcon(MediaDisplay mediaDisplay) {
            this.smallIcon = mediaDisplay;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("MediaDisplays.MediaDisplaysBuilder(smallIcon=", String.valueOf(this.smallIcon), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private MediaDisplays(MediaDisplay mediaDisplay) {
        this.smallIcon = mediaDisplay;
    }

    public static MediaDisplaysBuilder builder() {
        return new MediaDisplaysBuilder();
    }

    public MediaDisplay getSmallIcon() {
        return this.smallIcon;
    }

    public void setSmallIcon(MediaDisplay mediaDisplay) {
        this.smallIcon = mediaDisplay;
    }

    public MediaDisplays() {
    }

    public /* synthetic */ MediaDisplays(MediaDisplay mediaDisplay, int i) {
        this(mediaDisplay);
    }
}
