package com.amazon.alexa.assistant.media.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/media/model/MediaPlaybackItemMetadata;", "", "token", "", "offsetInMilliseconds", "", "controls", "", "Lcom/amazon/alexa/assistant/media/model/MediaControl;", "state", "Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;", "<init>", "(Ljava/lang/String;JLjava/util/List;Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;)V", "getToken", "()Ljava/lang/String;", "getOffsetInMilliseconds", "()J", "getControls", "()Ljava/util/List;", "getState", "()Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaPlaybackItemMetadata {

    @NotNull
    private final List<MediaControl> controls;
    private final long offsetInMilliseconds;

    @NotNull
    private final MediaPlaybackState state;

    @Nullable
    private final String token;

    public MediaPlaybackItemMetadata(@Nullable String str, long j, @NotNull List<MediaControl> list, @NotNull MediaPlaybackState mediaPlaybackState) {
        list.getClass();
        mediaPlaybackState.getClass();
        this.token = str;
        this.offsetInMilliseconds = j;
        this.controls = list;
        this.state = mediaPlaybackState;
    }

    public static /* synthetic */ MediaPlaybackItemMetadata copy$default(MediaPlaybackItemMetadata mediaPlaybackItemMetadata, String str, long j, List list, MediaPlaybackState mediaPlaybackState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaPlaybackItemMetadata.token;
        }
        if ((i & 2) != 0) {
            j = mediaPlaybackItemMetadata.offsetInMilliseconds;
        }
        if ((i & 4) != 0) {
            list = mediaPlaybackItemMetadata.controls;
        }
        if ((i & 8) != 0) {
            mediaPlaybackState = mediaPlaybackItemMetadata.state;
        }
        return mediaPlaybackItemMetadata.copy(str, j, list, mediaPlaybackState);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    public final List<MediaControl> component3() {
        return this.controls;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MediaPlaybackState getState() {
        return this.state;
    }

    @NotNull
    public final MediaPlaybackItemMetadata copy(@Nullable String token, long offsetInMilliseconds, @NotNull List<MediaControl> controls, @NotNull MediaPlaybackState state) {
        controls.getClass();
        state.getClass();
        return new MediaPlaybackItemMetadata(token, offsetInMilliseconds, controls, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPlaybackItemMetadata)) {
            return false;
        }
        MediaPlaybackItemMetadata mediaPlaybackItemMetadata = (MediaPlaybackItemMetadata) other;
        return Intrinsics.areEqual(this.token, mediaPlaybackItemMetadata.token) && this.offsetInMilliseconds == mediaPlaybackItemMetadata.offsetInMilliseconds && Intrinsics.areEqual(this.controls, mediaPlaybackItemMetadata.controls) && this.state == mediaPlaybackItemMetadata.state;
    }

    @NotNull
    public final List<MediaControl> getControls() {
        return this.controls;
    }

    public final long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    public final MediaPlaybackState getState() {
        return this.state;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        return this.state.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.controls, BitVector$$ExternalSyntheticOutline0.m(this.offsetInMilliseconds, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.token;
        long j = this.offsetInMilliseconds;
        List<MediaControl> list = this.controls;
        MediaPlaybackState mediaPlaybackState = this.state;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("MediaPlaybackItemMetadata(token=", str, ", offsetInMilliseconds=", j);
        m.append(", controls=");
        m.append(list);
        m.append(", state=");
        m.append(mediaPlaybackState);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
