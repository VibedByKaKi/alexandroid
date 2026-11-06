package com.amazon.alexa.assistant.media.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/media/model/MediaControl;", "", "type", "Lcom/amazon/alexa/assistant/media/model/MediaControlType;", "name", "Lcom/amazon/alexa/assistant/media/model/MediaControlName;", "enabled", "", Constants.SubmitFeedbackExperienceDetails.REQUEST_INQUIRY_OPTION_SELECTED, "<init>", "(Lcom/amazon/alexa/assistant/media/model/MediaControlType;Lcom/amazon/alexa/assistant/media/model/MediaControlName;ZZ)V", "getType", "()Lcom/amazon/alexa/assistant/media/model/MediaControlType;", "getName", "()Lcom/amazon/alexa/assistant/media/model/MediaControlName;", "getEnabled", "()Z", "getSelected", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaControl {
    private final boolean enabled;

    @Nullable
    private final MediaControlName name;
    private final boolean selected;

    @NotNull
    private final MediaControlType type;

    public MediaControl(@NotNull MediaControlType mediaControlType, @Nullable MediaControlName mediaControlName, boolean z, boolean z2) {
        mediaControlType.getClass();
        this.type = mediaControlType;
        this.name = mediaControlName;
        this.enabled = z;
        this.selected = z2;
    }

    public static /* synthetic */ MediaControl copy$default(MediaControl mediaControl, MediaControlType mediaControlType, MediaControlName mediaControlName, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaControlType = mediaControl.type;
        }
        if ((i & 2) != 0) {
            mediaControlName = mediaControl.name;
        }
        if ((i & 4) != 0) {
            z = mediaControl.enabled;
        }
        if ((i & 8) != 0) {
            z2 = mediaControl.selected;
        }
        return mediaControl.copy(mediaControlType, mediaControlName, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MediaControlType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MediaControlName getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final MediaControl copy(@NotNull MediaControlType type, @Nullable MediaControlName name, boolean enabled, boolean selected) {
        type.getClass();
        return new MediaControl(type, name, enabled, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaControl)) {
            return false;
        }
        MediaControl mediaControl = (MediaControl) other;
        return this.type == mediaControl.type && this.name == mediaControl.name && this.enabled == mediaControl.enabled && this.selected == mediaControl.selected;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final MediaControlName getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final MediaControlType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MediaControlName mediaControlName = this.name;
        return Boolean.hashCode(this.selected) + DoubleList$$ExternalSyntheticOutline0.m(this.enabled, (hashCode + (mediaControlName == null ? 0 : mediaControlName.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        MediaControlType mediaControlType = this.type;
        MediaControlName mediaControlName = this.name;
        boolean z = this.enabled;
        boolean z2 = this.selected;
        StringBuilder sb = new StringBuilder("MediaControl(type=");
        sb.append(mediaControlType);
        sb.append(", name=");
        sb.append(mediaControlName);
        sb.append(", enabled=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(sb, z, ", selected=", z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
