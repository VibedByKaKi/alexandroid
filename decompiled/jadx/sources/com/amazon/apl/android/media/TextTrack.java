package com.amazon.apl.android.media;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.apl.enums.TextTrackType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TextTrack {
    private final String description;
    TextTrackType type;
    private final String url;

    public TextTrack(int i, String str, String str2) {
        this.type = TextTrackType.valueOf(i);
        this.url = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public TextTrackType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "TextTrack(type=" + getType() + ", url=" + getUrl() + ", description=" + getDescription() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
