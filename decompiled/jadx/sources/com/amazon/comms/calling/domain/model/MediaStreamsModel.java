package com.amazon.comms.calling.domain.model;

import android.view.SurfaceView;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaStreamsModel;", "", "localSurfaceView", "Landroid/view/SurfaceView;", "remoteSurfaceView", "isVideoCall", "", "isFrontCamera", "isLocalVideoHidden", "hasUserEnabledVideo", "<init>", "(Landroid/view/SurfaceView;Landroid/view/SurfaceView;ZZZZ)V", "getLocalSurfaceView", "()Landroid/view/SurfaceView;", "getRemoteSurfaceView", "()Z", "getHasUserEnabledVideo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaStreamsModel {
    private final boolean hasUserEnabledVideo;
    private final boolean isFrontCamera;
    private final boolean isLocalVideoHidden;
    private final boolean isVideoCall;

    @Nullable
    private final SurfaceView localSurfaceView;

    @Nullable
    private final SurfaceView remoteSurfaceView;

    public MediaStreamsModel(@Nullable SurfaceView surfaceView, @Nullable SurfaceView surfaceView2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.localSurfaceView = surfaceView;
        this.remoteSurfaceView = surfaceView2;
        this.isVideoCall = z;
        this.isFrontCamera = z2;
        this.isLocalVideoHidden = z3;
        this.hasUserEnabledVideo = z4;
    }

    public static /* synthetic */ MediaStreamsModel copy$default(MediaStreamsModel mediaStreamsModel, SurfaceView surfaceView, SurfaceView surfaceView2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            surfaceView = mediaStreamsModel.localSurfaceView;
        }
        if ((i & 2) != 0) {
            surfaceView2 = mediaStreamsModel.remoteSurfaceView;
        }
        if ((i & 4) != 0) {
            z = mediaStreamsModel.isVideoCall;
        }
        if ((i & 8) != 0) {
            z2 = mediaStreamsModel.isFrontCamera;
        }
        if ((i & 16) != 0) {
            z3 = mediaStreamsModel.isLocalVideoHidden;
        }
        if ((i & 32) != 0) {
            z4 = mediaStreamsModel.hasUserEnabledVideo;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return mediaStreamsModel.copy(surfaceView, surfaceView2, z, z2, z5, z6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final SurfaceView getLocalSurfaceView() {
        return this.localSurfaceView;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final SurfaceView getRemoteSurfaceView() {
        return this.remoteSurfaceView;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVideoCall() {
        return this.isVideoCall;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFrontCamera() {
        return this.isFrontCamera;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLocalVideoHidden() {
        return this.isLocalVideoHidden;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasUserEnabledVideo() {
        return this.hasUserEnabledVideo;
    }

    @NotNull
    public final MediaStreamsModel copy(@Nullable SurfaceView localSurfaceView, @Nullable SurfaceView remoteSurfaceView, boolean isVideoCall, boolean isFrontCamera, boolean isLocalVideoHidden, boolean hasUserEnabledVideo) {
        return new MediaStreamsModel(localSurfaceView, remoteSurfaceView, isVideoCall, isFrontCamera, isLocalVideoHidden, hasUserEnabledVideo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStreamsModel)) {
            return false;
        }
        MediaStreamsModel mediaStreamsModel = (MediaStreamsModel) other;
        return Intrinsics.areEqual(this.localSurfaceView, mediaStreamsModel.localSurfaceView) && Intrinsics.areEqual(this.remoteSurfaceView, mediaStreamsModel.remoteSurfaceView) && this.isVideoCall == mediaStreamsModel.isVideoCall && this.isFrontCamera == mediaStreamsModel.isFrontCamera && this.isLocalVideoHidden == mediaStreamsModel.isLocalVideoHidden && this.hasUserEnabledVideo == mediaStreamsModel.hasUserEnabledVideo;
    }

    public final boolean getHasUserEnabledVideo() {
        return this.hasUserEnabledVideo;
    }

    @Nullable
    public final SurfaceView getLocalSurfaceView() {
        return this.localSurfaceView;
    }

    @Nullable
    public final SurfaceView getRemoteSurfaceView() {
        return this.remoteSurfaceView;
    }

    public int hashCode() {
        SurfaceView surfaceView = this.localSurfaceView;
        int hashCode = (surfaceView == null ? 0 : surfaceView.hashCode()) * 31;
        SurfaceView surfaceView2 = this.remoteSurfaceView;
        return Boolean.hashCode(this.hasUserEnabledVideo) + c.a(this.isLocalVideoHidden, c.a(this.isFrontCamera, c.a(this.isVideoCall, (hashCode + (surfaceView2 != null ? surfaceView2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final boolean isFrontCamera() {
        return this.isFrontCamera;
    }

    public final boolean isLocalVideoHidden() {
        return this.isLocalVideoHidden;
    }

    public final boolean isVideoCall() {
        return this.isVideoCall;
    }

    @NotNull
    public String toString() {
        SurfaceView surfaceView = this.localSurfaceView;
        SurfaceView surfaceView2 = this.remoteSurfaceView;
        boolean z = this.isVideoCall;
        boolean z2 = this.isFrontCamera;
        boolean z3 = this.isLocalVideoHidden;
        boolean z4 = this.hasUserEnabledVideo;
        StringBuilder sb = new StringBuilder("MediaStreamsModel(localSurfaceView=");
        sb.append(surfaceView);
        sb.append(", remoteSurfaceView=");
        sb.append(surfaceView2);
        sb.append(", isVideoCall=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(sb, z, ", isFrontCamera=", z2, ", isLocalVideoHidden=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(sb, z3, ", hasUserEnabledVideo=", z4, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
