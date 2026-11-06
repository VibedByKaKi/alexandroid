package com.amazon.alexa.assistant.transport.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", "", "<init>", "()V", "toString", "", "Disconnected", "DownChannelConnectionInProgress", "DownChannelConnected", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState$Disconnected;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState$DownChannelConnected;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState$DownChannelConnectionInProgress;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ConnectionState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionState$DownChannelConnected;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", "gateway", "", "<init>", "(Ljava/lang/String;)V", "getGateway", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownChannelConnected extends ConnectionState {

        @NotNull
        private final String gateway;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownChannelConnected(@NotNull String str) {
            super(null);
            str.getClass();
            this.gateway = str;
        }

        public static /* synthetic */ DownChannelConnected copy$default(DownChannelConnected downChannelConnected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downChannelConnected.gateway;
            }
            return downChannelConnected.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final DownChannelConnected copy(@NotNull String gateway) {
            gateway.getClass();
            return new DownChannelConnected(gateway);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownChannelConnected) && Intrinsics.areEqual(this.gateway, ((DownChannelConnected) other).gateway);
        }

        @NotNull
        public final String getGateway() {
            return this.gateway;
        }

        public int hashCode() {
            return this.gateway.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionState
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("DownChannelConnected(gateway=", this.gateway, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionState$DownChannelConnectionInProgress;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", "gateway", "", "<init>", "(Ljava/lang/String;)V", "getGateway", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownChannelConnectionInProgress extends ConnectionState {

        @NotNull
        private final String gateway;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownChannelConnectionInProgress(@NotNull String str) {
            super(null);
            str.getClass();
            this.gateway = str;
        }

        public static /* synthetic */ DownChannelConnectionInProgress copy$default(DownChannelConnectionInProgress downChannelConnectionInProgress, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downChannelConnectionInProgress.gateway;
            }
            return downChannelConnectionInProgress.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final DownChannelConnectionInProgress copy(@NotNull String gateway) {
            gateway.getClass();
            return new DownChannelConnectionInProgress(gateway);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownChannelConnectionInProgress) && Intrinsics.areEqual(this.gateway, ((DownChannelConnectionInProgress) other).gateway);
        }

        @NotNull
        public final String getGateway() {
            return this.gateway;
        }

        public int hashCode() {
            return this.gateway.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionState
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("DownChannelConnectionInProgress(gateway=", this.gateway, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (!(this instanceof Disconnected)) {
            if (this instanceof DownChannelConnectionInProgress) {
                return a$$ExternalSyntheticOutline0.m("DownChannelConnectionInProgress(gateway=", ((DownChannelConnectionInProgress) this).getGateway(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (this instanceof DownChannelConnected) {
                return a$$ExternalSyntheticOutline0.m("DownChannelConnected(gateway=", ((DownChannelConnected) this).getGateway(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Disconnected disconnected = (Disconnected) this;
        return "Disconnected(" + disconnected.getReason() + ", gateway=" + disconnected.getGateway() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    private ConnectionState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionState$Disconnected;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", "reason", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "gateway", "", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;Ljava/lang/String;)V", "getReason", "()Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "getGateway", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disconnected extends ConnectionState {

        @Nullable
        private final String gateway;

        @NotNull
        private final ConnectionDisconnectedReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disconnected(@NotNull ConnectionDisconnectedReason connectionDisconnectedReason, @Nullable String str) {
            super(null);
            connectionDisconnectedReason.getClass();
            this.reason = connectionDisconnectedReason;
            this.gateway = str;
        }

        public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, ConnectionDisconnectedReason connectionDisconnectedReason, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionDisconnectedReason = disconnected.reason;
            }
            if ((i & 2) != 0) {
                str = disconnected.gateway;
            }
            return disconnected.copy(connectionDisconnectedReason, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ConnectionDisconnectedReason getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final Disconnected copy(@NotNull ConnectionDisconnectedReason reason, @Nullable String gateway) {
            reason.getClass();
            return new Disconnected(reason, gateway);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disconnected)) {
                return false;
            }
            Disconnected disconnected = (Disconnected) other;
            return Intrinsics.areEqual(this.reason, disconnected.reason) && Intrinsics.areEqual(this.gateway, disconnected.gateway);
        }

        @Nullable
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final ConnectionDisconnectedReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.gateway;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionState
        @NotNull
        public String toString() {
            return "Disconnected(reason=" + this.reason + ", gateway=" + this.gateway + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public /* synthetic */ Disconnected(ConnectionDisconnectedReason connectionDisconnectedReason, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(connectionDisconnectedReason, (i & 2) != 0 ? null : str);
        }
    }
}
