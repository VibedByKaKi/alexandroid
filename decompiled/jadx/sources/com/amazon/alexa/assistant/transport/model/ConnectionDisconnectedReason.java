package com.amazon.alexa.assistant.transport.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "", "<init>", "()V", "toString", "", "Idle", "Initializing", "PingFailed", "DirectiveRequestInitFailed", "InvalidConfiguration", "DirectiveTaskReturnedFailed", "UnAuthorized", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$DirectiveRequestInitFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$DirectiveTaskReturnedFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$Idle;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$Initializing;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$InvalidConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$PingFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$UnAuthorized;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ConnectionDisconnectedReason {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$DirectiveRequestInitFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "error", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientStateError;)V", "getError", "()Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectiveRequestInitFailed extends ConnectionDisconnectedReason {

        @NotNull
        private final ClientStateError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectiveRequestInitFailed(@NotNull ClientStateError clientStateError) {
            super(null);
            clientStateError.getClass();
            this.error = clientStateError;
        }

        public static /* synthetic */ DirectiveRequestInitFailed copy$default(DirectiveRequestInitFailed directiveRequestInitFailed, ClientStateError clientStateError, int i, Object obj) {
            if ((i & 1) != 0) {
                clientStateError = directiveRequestInitFailed.error;
            }
            return directiveRequestInitFailed.copy(clientStateError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClientStateError getError() {
            return this.error;
        }

        @NotNull
        public final DirectiveRequestInitFailed copy(@NotNull ClientStateError error) {
            error.getClass();
            return new DirectiveRequestInitFailed(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DirectiveRequestInitFailed) && Intrinsics.areEqual(this.error, ((DirectiveRequestInitFailed) other).error);
        }

        @NotNull
        public final ClientStateError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "DirectiveRequestInitFailed(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$Idle;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends ConnectionDisconnectedReason {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 768798691;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$Initializing;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Initializing extends ConnectionDisconnectedReason {

        @NotNull
        public static final Initializing INSTANCE = new Initializing();

        private Initializing() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Initializing);
        }

        public int hashCode() {
            return -1592036004;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "Initializing";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$InvalidConfiguration;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "error", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientStateError;)V", "getError", "()Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvalidConfiguration extends ConnectionDisconnectedReason {

        @NotNull
        private final ClientStateError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidConfiguration(@NotNull ClientStateError clientStateError) {
            super(null);
            clientStateError.getClass();
            this.error = clientStateError;
        }

        public static /* synthetic */ InvalidConfiguration copy$default(InvalidConfiguration invalidConfiguration, ClientStateError clientStateError, int i, Object obj) {
            if ((i & 1) != 0) {
                clientStateError = invalidConfiguration.error;
            }
            return invalidConfiguration.copy(clientStateError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClientStateError getError() {
            return this.error;
        }

        @NotNull
        public final InvalidConfiguration copy(@NotNull ClientStateError error) {
            error.getClass();
            return new InvalidConfiguration(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidConfiguration) && Intrinsics.areEqual(this.error, ((InvalidConfiguration) other).error);
        }

        @NotNull
        public final ClientStateError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "InvalidConfiguration(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$PingFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "error", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientStateError;)V", "getError", "()Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PingFailed extends ConnectionDisconnectedReason {

        @NotNull
        private final ClientStateError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PingFailed(@NotNull ClientStateError clientStateError) {
            super(null);
            clientStateError.getClass();
            this.error = clientStateError;
        }

        public static /* synthetic */ PingFailed copy$default(PingFailed pingFailed, ClientStateError clientStateError, int i, Object obj) {
            if ((i & 1) != 0) {
                clientStateError = pingFailed.error;
            }
            return pingFailed.copy(clientStateError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClientStateError getError() {
            return this.error;
        }

        @NotNull
        public final PingFailed copy(@NotNull ClientStateError error) {
            error.getClass();
            return new PingFailed(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PingFailed) && Intrinsics.areEqual(this.error, ((PingFailed) other).error);
        }

        @NotNull
        public final ClientStateError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "PingFailed(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$UnAuthorized;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnAuthorized extends ConnectionDisconnectedReason {

        @NotNull
        public static final UnAuthorized INSTANCE = new UnAuthorized();

        private UnAuthorized() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof UnAuthorized);
        }

        public int hashCode() {
            return 1422419491;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "UnAuthorized";
        }
    }

    public /* synthetic */ ConnectionDisconnectedReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Idle) {
            return "Idle";
        }
        if (this instanceof Initializing) {
            return "Initializing";
        }
        if (this instanceof PingFailed) {
            return "PingFailed(" + ((PingFailed) this).getError() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
        if (this instanceof DirectiveRequestInitFailed) {
            return "DirectiveRequestInitFailed(" + ((DirectiveRequestInitFailed) this).getError() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
        if (this instanceof InvalidConfiguration) {
            return "InvalidConfiguration(" + ((InvalidConfiguration) this).getError() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
        if (!(this instanceof DirectiveTaskReturnedFailed)) {
            if (this instanceof UnAuthorized) {
                return "UnAuthorized";
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        DirectiveTaskReturnedFailed directiveTaskReturnedFailed = (DirectiveTaskReturnedFailed) this;
        boolean closedStale = directiveTaskReturnedFailed.getClosedStale();
        ClientStateError error = directiveTaskReturnedFailed.getError();
        if (closedStale) {
            return "DirectiveTaskReturnedFailed(" + error + ", closedStale)";
        }
        return "DirectiveTaskReturnedFailed(" + error + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    private ConnectionDisconnectedReason() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason$DirectiveTaskReturnedFailed;", "Lcom/amazon/alexa/assistant/transport/model/ConnectionDisconnectedReason;", "error", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "closedStale", "", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientStateError;Z)V", "getError", "()Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "getClosedStale", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectiveTaskReturnedFailed extends ConnectionDisconnectedReason {
        private final boolean closedStale;

        @NotNull
        private final ClientStateError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectiveTaskReturnedFailed(@NotNull ClientStateError clientStateError, boolean z) {
            super(null);
            clientStateError.getClass();
            this.error = clientStateError;
            this.closedStale = z;
        }

        public static /* synthetic */ DirectiveTaskReturnedFailed copy$default(DirectiveTaskReturnedFailed directiveTaskReturnedFailed, ClientStateError clientStateError, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                clientStateError = directiveTaskReturnedFailed.error;
            }
            if ((i & 2) != 0) {
                z = directiveTaskReturnedFailed.closedStale;
            }
            return directiveTaskReturnedFailed.copy(clientStateError, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClientStateError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getClosedStale() {
            return this.closedStale;
        }

        @NotNull
        public final DirectiveTaskReturnedFailed copy(@NotNull ClientStateError error, boolean closedStale) {
            error.getClass();
            return new DirectiveTaskReturnedFailed(error, closedStale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectiveTaskReturnedFailed)) {
                return false;
            }
            DirectiveTaskReturnedFailed directiveTaskReturnedFailed = (DirectiveTaskReturnedFailed) other;
            return Intrinsics.areEqual(this.error, directiveTaskReturnedFailed.error) && this.closedStale == directiveTaskReturnedFailed.closedStale;
        }

        public final boolean getClosedStale() {
            return this.closedStale;
        }

        @NotNull
        public final ClientStateError getError() {
            return this.error;
        }

        public int hashCode() {
            return Boolean.hashCode(this.closedStale) + (this.error.hashCode() * 31);
        }

        @Override // com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason
        @NotNull
        public String toString() {
            return "DirectiveTaskReturnedFailed(error=" + this.error + ", closedStale=" + this.closedStale + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public /* synthetic */ DirectiveTaskReturnedFailed(ClientStateError clientStateError, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(clientStateError, (i & 2) != 0 ? false : z);
        }
    }
}
