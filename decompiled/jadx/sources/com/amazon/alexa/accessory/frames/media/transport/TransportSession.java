package com.amazon.alexa.accessory.frames.media.transport;

import com.amazon.alexa.accessory.frames.media.MediaDownloader;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/transport/TransportSession;", "", "downloader", "Lcom/amazon/alexa/accessory/frames/media/MediaDownloader;", "<init>", "(Lcom/amazon/alexa/accessory/frames/media/MediaDownloader;)V", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TransportSession {

    @JvmField
    @NotNull
    public final MediaDownloader downloader;

    public TransportSession(@NotNull MediaDownloader mediaDownloader) {
        mediaDownloader.getClass();
        this.downloader = mediaDownloader;
    }

    public static /* synthetic */ TransportSession copy$default(TransportSession transportSession, MediaDownloader mediaDownloader, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaDownloader = transportSession.downloader;
        }
        return transportSession.copy(mediaDownloader);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MediaDownloader getDownloader() {
        return this.downloader;
    }

    @NotNull
    public final TransportSession copy(@NotNull MediaDownloader downloader) {
        downloader.getClass();
        return new TransportSession(downloader);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransportSession) && Intrinsics.areEqual(this.downloader, ((TransportSession) other).downloader);
    }

    public int hashCode() {
        return this.downloader.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransportSession(downloader=" + this.downloader + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
