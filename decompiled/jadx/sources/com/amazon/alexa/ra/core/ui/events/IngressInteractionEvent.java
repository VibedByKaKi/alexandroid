package com.amazon.alexa.ra.core.ui.events;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "", "<init>", "()V", "MicrophoneClicked", "LiveModeClicked", "ShareMyScreenClicked", "StopButtonPressed", "AttachButtonClicked", "AlexaLogoClicked", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$AlexaLogoClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$AttachButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$LiveModeClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$MicrophoneClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$ShareMyScreenClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$StopButtonPressed;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class IngressInteractionEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$AlexaLogoClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlexaLogoClicked extends IngressInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AlexaLogoClicked INSTANCE = new AlexaLogoClicked();

        private AlexaLogoClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$AttachButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AttachButtonClicked extends IngressInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final AttachButtonClicked INSTANCE = new AttachButtonClicked();

        private AttachButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$LiveModeClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveModeClicked extends IngressInteractionEvent {
        public static final int $stable = 8;

        @NotNull
        private final Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveModeClicked(@NotNull Context context) {
            super(null);
            context.getClass();
            this.context = context;
        }

        public static /* synthetic */ LiveModeClicked copy$default(LiveModeClicked liveModeClicked, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = liveModeClicked.context;
            }
            return liveModeClicked.copy(context);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final LiveModeClicked copy(@NotNull Context context) {
            context.getClass();
            return new LiveModeClicked(context);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LiveModeClicked) && Intrinsics.areEqual(this.context, ((LiveModeClicked) other).context);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        @NotNull
        public String toString() {
            return "LiveModeClicked(context=" + this.context + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$MicrophoneClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "context", "Landroid/content/Context;", "timestamp", "", "<init>", "(Landroid/content/Context;J)V", "getContext", "()Landroid/content/Context;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MicrophoneClicked extends IngressInteractionEvent {
        public static final int $stable = 8;

        @NotNull
        private final Context context;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MicrophoneClicked(@NotNull Context context, long j) {
            super(null);
            context.getClass();
            this.context = context;
            this.timestamp = j;
        }

        public static /* synthetic */ MicrophoneClicked copy$default(MicrophoneClicked microphoneClicked, Context context, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                context = microphoneClicked.context;
            }
            if ((i & 2) != 0) {
                j = microphoneClicked.timestamp;
            }
            return microphoneClicked.copy(context, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final MicrophoneClicked copy(@NotNull Context context, long timestamp) {
            context.getClass();
            return new MicrophoneClicked(context, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MicrophoneClicked)) {
                return false;
            }
            MicrophoneClicked microphoneClicked = (MicrophoneClicked) other;
            return Intrinsics.areEqual(this.context, microphoneClicked.context) && this.timestamp == microphoneClicked.timestamp;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.context.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MicrophoneClicked(context=" + this.context + ", timestamp=" + this.timestamp + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$ShareMyScreenClicked;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShareMyScreenClicked extends IngressInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final ShareMyScreenClicked INSTANCE = new ShareMyScreenClicked();

        private ShareMyScreenClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent$StopButtonPressed;", "Lcom/amazon/alexa/ra/core/ui/events/IngressInteractionEvent;", "<init>", "()V", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopButtonPressed extends IngressInteractionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final StopButtonPressed INSTANCE = new StopButtonPressed();

        private StopButtonPressed() {
            super(null);
        }
    }

    public /* synthetic */ IngressInteractionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IngressInteractionEvent() {
    }
}
