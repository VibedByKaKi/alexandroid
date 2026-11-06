package com.amazon.alexa.accessory.speechapi.listeners;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/listeners/Caption;", "", "content", "", "type", "Lcom/amazon/alexa/accessory/speechapi/listeners/CaptionFormat;", "(Ljava/lang/String;Lcom/amazon/alexa/accessory/speechapi/listeners/CaptionFormat;)V", "getContent", "()Ljava/lang/String;", "getType", "()Lcom/amazon/alexa/accessory/speechapi/listeners/CaptionFormat;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Caption {

    @NotNull
    private final String content;

    @NotNull
    private final CaptionFormat type;

    public Caption(@NotNull String str, @NotNull CaptionFormat captionFormat) {
        str.getClass();
        captionFormat.getClass();
        this.content = str;
        this.type = captionFormat;
    }

    public static /* synthetic */ Caption copy$default(Caption caption, String str, CaptionFormat captionFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            str = caption.content;
        }
        if ((i & 2) != 0) {
            captionFormat = caption.type;
        }
        return caption.copy(str, captionFormat);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaptionFormat getType() {
        return this.type;
    }

    @NotNull
    public final Caption copy(@NotNull String content, @NotNull CaptionFormat type) {
        content.getClass();
        type.getClass();
        return new Caption(content, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Caption)) {
            return false;
        }
        Caption caption = (Caption) other;
        return Intrinsics.areEqual(this.content, caption.content) && this.type == caption.type;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final CaptionFormat getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.content.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Caption(content=" + this.content + ", type=" + this.type + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
