package com.amazon.alexa.assistant.foundation.audio.drm;

import android.net.Uri;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineAudioItemInfo;", "", "mediaItem", "Landroid/net/Uri;", "widevineInfo", "Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "<init>", "(Landroid/net/Uri;Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;)V", "getMediaItem", "()Landroid/net/Uri;", "getWidevineInfo", "()Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WidevineAudioItemInfo {

    @NotNull
    private final Uri mediaItem;

    @NotNull
    private final WidevineInfo widevineInfo;

    public WidevineAudioItemInfo(@NotNull Uri uri, @NotNull WidevineInfo widevineInfo) {
        uri.getClass();
        widevineInfo.getClass();
        this.mediaItem = uri;
        this.widevineInfo = widevineInfo;
    }

    public static /* synthetic */ WidevineAudioItemInfo copy$default(WidevineAudioItemInfo widevineAudioItemInfo, Uri uri, WidevineInfo widevineInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = widevineAudioItemInfo.mediaItem;
        }
        if ((i & 2) != 0) {
            widevineInfo = widevineAudioItemInfo.widevineInfo;
        }
        return widevineAudioItemInfo.copy(uri, widevineInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Uri getMediaItem() {
        return this.mediaItem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WidevineInfo getWidevineInfo() {
        return this.widevineInfo;
    }

    @NotNull
    public final WidevineAudioItemInfo copy(@NotNull Uri mediaItem, @NotNull WidevineInfo widevineInfo) {
        mediaItem.getClass();
        widevineInfo.getClass();
        return new WidevineAudioItemInfo(mediaItem, widevineInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidevineAudioItemInfo)) {
            return false;
        }
        WidevineAudioItemInfo widevineAudioItemInfo = (WidevineAudioItemInfo) other;
        return Intrinsics.areEqual(this.mediaItem, widevineAudioItemInfo.mediaItem) && Intrinsics.areEqual(this.widevineInfo, widevineAudioItemInfo.widevineInfo);
    }

    @NotNull
    public final Uri getMediaItem() {
        return this.mediaItem;
    }

    @NotNull
    public final WidevineInfo getWidevineInfo() {
        return this.widevineInfo;
    }

    public int hashCode() {
        return this.widevineInfo.hashCode() + (this.mediaItem.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WidevineAudioItemInfo(mediaItem=" + this.mediaItem + ", widevineInfo=" + this.widevineInfo + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
