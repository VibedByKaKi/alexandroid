package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaStreamsReceived;", "Lcom/amazon/comms/calling/domain/model/MediaStreamsState;", "mediaStreamsModel", "Lcom/amazon/comms/calling/domain/model/MediaStreamsModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/MediaStreamsModel;)V", "getMediaStreamsModel", "()Lcom/amazon/comms/calling/domain/model/MediaStreamsModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaStreamsReceived extends MediaStreamsState {

    @NotNull
    private final MediaStreamsModel mediaStreamsModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStreamsReceived(@NotNull MediaStreamsModel mediaStreamsModel) {
        super(null);
        mediaStreamsModel.getClass();
        this.mediaStreamsModel = mediaStreamsModel;
    }

    public static /* synthetic */ MediaStreamsReceived copy$default(MediaStreamsReceived mediaStreamsReceived, MediaStreamsModel mediaStreamsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaStreamsModel = mediaStreamsReceived.mediaStreamsModel;
        }
        return mediaStreamsReceived.copy(mediaStreamsModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MediaStreamsModel getMediaStreamsModel() {
        return this.mediaStreamsModel;
    }

    @NotNull
    public final MediaStreamsReceived copy(@NotNull MediaStreamsModel mediaStreamsModel) {
        mediaStreamsModel.getClass();
        return new MediaStreamsReceived(mediaStreamsModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MediaStreamsReceived) && Intrinsics.areEqual(this.mediaStreamsModel, ((MediaStreamsReceived) other).mediaStreamsModel);
    }

    @NotNull
    public final MediaStreamsModel getMediaStreamsModel() {
        return this.mediaStreamsModel;
    }

    public int hashCode() {
        return this.mediaStreamsModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaStreamsReceived(mediaStreamsModel=" + this.mediaStreamsModel + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
