package com.amazon.comms.calling.infrastructure;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent;", "", "<init>", "()V", "OnDisconnected", "OnChanged", "Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent$OnChanged;", "Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent$OnDisconnected;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class CallingNetworkEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent$OnChanged;", "Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent;", "previousNetworkType", "Lcom/amazon/comms/calling/infrastructure/NetworkType;", "newNetworkType", "<init>", "(Lcom/amazon/comms/calling/infrastructure/NetworkType;Lcom/amazon/comms/calling/infrastructure/NetworkType;)V", "getPreviousNetworkType", "()Lcom/amazon/comms/calling/infrastructure/NetworkType;", "getNewNetworkType", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChanged extends CallingNetworkEvent {

        @NotNull
        private final NetworkType newNetworkType;

        @NotNull
        private final NetworkType previousNetworkType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnChanged(@NotNull NetworkType networkType, @NotNull NetworkType networkType2) {
            super(null);
            networkType.getClass();
            networkType2.getClass();
            this.previousNetworkType = networkType;
            this.newNetworkType = networkType2;
        }

        public static /* synthetic */ OnChanged copy$default(OnChanged onChanged, NetworkType networkType, NetworkType networkType2, int i, Object obj) {
            if ((i & 1) != 0) {
                networkType = onChanged.previousNetworkType;
            }
            if ((i & 2) != 0) {
                networkType2 = onChanged.newNetworkType;
            }
            return onChanged.copy(networkType, networkType2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NetworkType getPreviousNetworkType() {
            return this.previousNetworkType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final NetworkType getNewNetworkType() {
            return this.newNetworkType;
        }

        @NotNull
        public final OnChanged copy(@NotNull NetworkType previousNetworkType, @NotNull NetworkType newNetworkType) {
            previousNetworkType.getClass();
            newNetworkType.getClass();
            return new OnChanged(previousNetworkType, newNetworkType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnChanged)) {
                return false;
            }
            OnChanged onChanged = (OnChanged) other;
            return this.previousNetworkType == onChanged.previousNetworkType && this.newNetworkType == onChanged.newNetworkType;
        }

        @NotNull
        public final NetworkType getNewNetworkType() {
            return this.newNetworkType;
        }

        @NotNull
        public final NetworkType getPreviousNetworkType() {
            return this.previousNetworkType;
        }

        public int hashCode() {
            return this.newNetworkType.hashCode() + (this.previousNetworkType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnChanged(previousNetworkType=" + this.previousNetworkType + ", newNetworkType=" + this.newNetworkType + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent$OnDisconnected;", "Lcom/amazon/comms/calling/infrastructure/CallingNetworkEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDisconnected extends CallingNetworkEvent {

        @NotNull
        public static final OnDisconnected INSTANCE = new OnDisconnected();

        private OnDisconnected() {
            super(null);
        }
    }

    public /* synthetic */ CallingNetworkEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CallingNetworkEvent() {
    }
}
