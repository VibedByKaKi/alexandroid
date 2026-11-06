package com.amazon.alexa.ra.core.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent;", "", "<init>", "()V", "OnAttachmentRenderingComplete", "OnKeyboardShown", "OnTextFieldFocusFailed", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnAttachmentRenderingComplete;", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnKeyboardShown;", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnTextFieldFocusFailed;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class IngressRenderUpdateEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnAttachmentRenderingComplete;", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent;", "uploadedMediaInfo", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "renderingCompleteTimestamp", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;J)V", "getUploadedMediaInfo", "()Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "getRenderingCompleteTimestamp", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAttachmentRenderingComplete extends IngressRenderUpdateEvent {
        public static final int $stable = 8;
        private final long renderingCompleteTimestamp;

        @NotNull
        private final LocalMediaInfo uploadedMediaInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAttachmentRenderingComplete(@NotNull LocalMediaInfo localMediaInfo, long j) {
            super(null);
            localMediaInfo.getClass();
            this.uploadedMediaInfo = localMediaInfo;
            this.renderingCompleteTimestamp = j;
        }

        public static /* synthetic */ OnAttachmentRenderingComplete copy$default(OnAttachmentRenderingComplete onAttachmentRenderingComplete, LocalMediaInfo localMediaInfo, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                localMediaInfo = onAttachmentRenderingComplete.uploadedMediaInfo;
            }
            if ((i & 2) != 0) {
                j = onAttachmentRenderingComplete.renderingCompleteTimestamp;
            }
            return onAttachmentRenderingComplete.copy(localMediaInfo, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LocalMediaInfo getUploadedMediaInfo() {
            return this.uploadedMediaInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final long getRenderingCompleteTimestamp() {
            return this.renderingCompleteTimestamp;
        }

        @NotNull
        public final OnAttachmentRenderingComplete copy(@NotNull LocalMediaInfo uploadedMediaInfo, long renderingCompleteTimestamp) {
            uploadedMediaInfo.getClass();
            return new OnAttachmentRenderingComplete(uploadedMediaInfo, renderingCompleteTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnAttachmentRenderingComplete)) {
                return false;
            }
            OnAttachmentRenderingComplete onAttachmentRenderingComplete = (OnAttachmentRenderingComplete) other;
            return Intrinsics.areEqual(this.uploadedMediaInfo, onAttachmentRenderingComplete.uploadedMediaInfo) && this.renderingCompleteTimestamp == onAttachmentRenderingComplete.renderingCompleteTimestamp;
        }

        public final long getRenderingCompleteTimestamp() {
            return this.renderingCompleteTimestamp;
        }

        @NotNull
        public final LocalMediaInfo getUploadedMediaInfo() {
            return this.uploadedMediaInfo;
        }

        public int hashCode() {
            return Long.hashCode(this.renderingCompleteTimestamp) + (this.uploadedMediaInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnAttachmentRenderingComplete(uploadedMediaInfo=" + this.uploadedMediaInfo + ", renderingCompleteTimestamp=" + this.renderingCompleteTimestamp + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnKeyboardShown;", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnKeyboardShown extends IngressRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnKeyboardShown INSTANCE = new OnKeyboardShown();

        private OnKeyboardShown() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent$OnTextFieldFocusFailed;", "Lcom/amazon/alexa/ra/core/ui/events/IngressRenderUpdateEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTextFieldFocusFailed extends IngressRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnTextFieldFocusFailed INSTANCE = new OnTextFieldFocusFailed();

        private OnTextFieldFocusFailed() {
            super(null);
        }
    }

    public /* synthetic */ IngressRenderUpdateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IngressRenderUpdateEvent() {
    }
}
