package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaStatusModel;", "", "isLocalVideoEnabled", "", "isRemoteVideoEnabled", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaStatusModel {
    private final boolean isLocalVideoEnabled;
    private final boolean isRemoteVideoEnabled;

    public MediaStatusModel(boolean z, boolean z2) {
        this.isLocalVideoEnabled = z;
        this.isRemoteVideoEnabled = z2;
    }

    public static /* synthetic */ MediaStatusModel copy$default(MediaStatusModel mediaStatusModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mediaStatusModel.isLocalVideoEnabled;
        }
        if ((i & 2) != 0) {
            z2 = mediaStatusModel.isRemoteVideoEnabled;
        }
        return mediaStatusModel.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLocalVideoEnabled() {
        return this.isLocalVideoEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRemoteVideoEnabled() {
        return this.isRemoteVideoEnabled;
    }

    @NotNull
    public final MediaStatusModel copy(boolean isLocalVideoEnabled, boolean isRemoteVideoEnabled) {
        return new MediaStatusModel(isLocalVideoEnabled, isRemoteVideoEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStatusModel)) {
            return false;
        }
        MediaStatusModel mediaStatusModel = (MediaStatusModel) other;
        return this.isLocalVideoEnabled == mediaStatusModel.isLocalVideoEnabled && this.isRemoteVideoEnabled == mediaStatusModel.isRemoteVideoEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRemoteVideoEnabled) + (Boolean.hashCode(this.isLocalVideoEnabled) * 31);
    }

    public final boolean isLocalVideoEnabled() {
        return this.isLocalVideoEnabled;
    }

    public final boolean isRemoteVideoEnabled() {
        return this.isRemoteVideoEnabled;
    }

    @NotNull
    public String toString() {
        return "MediaStatusModel(isLocalVideoEnabled=" + this.isLocalVideoEnabled + ", isRemoteVideoEnabled=" + this.isRemoteVideoEnabled + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
