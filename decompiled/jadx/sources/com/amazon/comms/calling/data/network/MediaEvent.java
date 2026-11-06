package com.amazon.comms.calling.data.network;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.MediaStatusModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/data/network/MediaEvent;", "", "<init>", "()V", "OnMediaStatusUpdated", "OnResolutionChanged", "OnCameraSwitched", "Lcom/amazon/comms/calling/data/network/MediaEvent$OnCameraSwitched;", "Lcom/amazon/comms/calling/data/network/MediaEvent$OnMediaStatusUpdated;", "Lcom/amazon/comms/calling/data/network/MediaEvent$OnResolutionChanged;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class MediaEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/data/network/MediaEvent$OnCameraSwitched;", "Lcom/amazon/comms/calling/data/network/MediaEvent;", "isFrontCamera", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCameraSwitched extends MediaEvent {
        private final boolean isFrontCamera;

        public OnCameraSwitched(boolean z) {
            super(null);
            this.isFrontCamera = z;
        }

        public static /* synthetic */ OnCameraSwitched copy$default(OnCameraSwitched onCameraSwitched, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onCameraSwitched.isFrontCamera;
            }
            return onCameraSwitched.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFrontCamera() {
            return this.isFrontCamera;
        }

        @NotNull
        public final OnCameraSwitched copy(boolean isFrontCamera) {
            return new OnCameraSwitched(isFrontCamera);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCameraSwitched) && this.isFrontCamera == ((OnCameraSwitched) other).isFrontCamera;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFrontCamera);
        }

        public final boolean isFrontCamera() {
            return this.isFrontCamera;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("OnCameraSwitched(isFrontCamera=", MarkdownConstants.RIGHT_PARENTHESIS, this.isFrontCamera);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/network/MediaEvent$OnMediaStatusUpdated;", "Lcom/amazon/comms/calling/data/network/MediaEvent;", "mediaStatus", "Lcom/amazon/comms/calling/domain/model/MediaStatusModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/MediaStatusModel;)V", "getMediaStatus", "()Lcom/amazon/comms/calling/domain/model/MediaStatusModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMediaStatusUpdated extends MediaEvent {

        @NotNull
        private final MediaStatusModel mediaStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMediaStatusUpdated(@NotNull MediaStatusModel mediaStatusModel) {
            super(null);
            mediaStatusModel.getClass();
            this.mediaStatus = mediaStatusModel;
        }

        public static /* synthetic */ OnMediaStatusUpdated copy$default(OnMediaStatusUpdated onMediaStatusUpdated, MediaStatusModel mediaStatusModel, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaStatusModel = onMediaStatusUpdated.mediaStatus;
            }
            return onMediaStatusUpdated.copy(mediaStatusModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MediaStatusModel getMediaStatus() {
            return this.mediaStatus;
        }

        @NotNull
        public final OnMediaStatusUpdated copy(@NotNull MediaStatusModel mediaStatus) {
            mediaStatus.getClass();
            return new OnMediaStatusUpdated(mediaStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnMediaStatusUpdated) && Intrinsics.areEqual(this.mediaStatus, ((OnMediaStatusUpdated) other).mediaStatus);
        }

        @NotNull
        public final MediaStatusModel getMediaStatus() {
            return this.mediaStatus;
        }

        public int hashCode() {
            return this.mediaStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnMediaStatusUpdated(mediaStatus=" + this.mediaStatus + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/data/network/MediaEvent$OnResolutionChanged;", "Lcom/amazon/comms/calling/data/network/MediaEvent;", "isLocal", "", "width", "", "height", "rotation", "<init>", "(ZIII)V", "()Z", "getWidth", "()I", "getHeight", "getRotation", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnResolutionChanged extends MediaEvent {
        private final int height;
        private final boolean isLocal;
        private final int rotation;
        private final int width;

        public OnResolutionChanged(boolean z, int i, int i2, int i3) {
            super(null);
            this.isLocal = z;
            this.width = i;
            this.height = i2;
            this.rotation = i3;
        }

        public static /* synthetic */ OnResolutionChanged copy$default(OnResolutionChanged onResolutionChanged, boolean z, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = onResolutionChanged.isLocal;
            }
            if ((i4 & 2) != 0) {
                i = onResolutionChanged.width;
            }
            if ((i4 & 4) != 0) {
                i2 = onResolutionChanged.height;
            }
            if ((i4 & 8) != 0) {
                i3 = onResolutionChanged.rotation;
            }
            return onResolutionChanged.copy(z, i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLocal() {
            return this.isLocal;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRotation() {
            return this.rotation;
        }

        @NotNull
        public final OnResolutionChanged copy(boolean isLocal, int width, int height, int rotation) {
            return new OnResolutionChanged(isLocal, width, height, rotation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnResolutionChanged)) {
                return false;
            }
            OnResolutionChanged onResolutionChanged = (OnResolutionChanged) other;
            return this.isLocal == onResolutionChanged.isLocal && this.width == onResolutionChanged.width && this.height == onResolutionChanged.height && this.rotation == onResolutionChanged.rotation;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.rotation) + ArcMode$$ExternalSyntheticOutline0.m(this.height, ArcMode$$ExternalSyntheticOutline0.m(this.width, Boolean.hashCode(this.isLocal) * 31, 31), 31);
        }

        public final boolean isLocal() {
            return this.isLocal;
        }

        @NotNull
        public String toString() {
            boolean z = this.isLocal;
            int i = this.width;
            int i2 = this.height;
            int i3 = this.rotation;
            StringBuilder sb = new StringBuilder("OnResolutionChanged(isLocal=");
            sb.append(z);
            sb.append(", width=");
            sb.append(i);
            sb.append(", height=");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(", rotation=", i2, i3, sb, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ MediaEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MediaEvent() {
    }
}
