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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState;", "", "<init>", "()V", "toString", "", "Stopped", "Disconnected", "Connecting", "Connected", "Error", "Lcom/amazon/alexa/assistant/transport/model/ClientState$Connected;", "Lcom/amazon/alexa/assistant/transport/model/ClientState$Connecting;", "Lcom/amazon/alexa/assistant/transport/model/ClientState$Disconnected;", "Lcom/amazon/alexa/assistant/transport/model/ClientState$Error;", "Lcom/amazon/alexa/assistant/transport/model/ClientState$Stopped;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ClientState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState$Connected;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Connected extends ClientState {

        @NotNull
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Connected);
        }

        public int hashCode() {
            return -637796353;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientState
        @NotNull
        public String toString() {
            return "Connected";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState$Connecting;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Connecting extends ClientState {

        @NotNull
        public static final Connecting INSTANCE = new Connecting();

        private Connecting() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Connecting);
        }

        public int hashCode() {
            return 1703153794;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientState
        @NotNull
        public String toString() {
            return "Connecting";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState$Disconnected;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disconnected extends ClientState {

        @NotNull
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Disconnected);
        }

        public int hashCode() {
            return 1338766725;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientState
        @NotNull
        public String toString() {
            return "Disconnected";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState$Error;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "error", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientStateError;)V", "getError", "()Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends ClientState {

        @NotNull
        private final ClientStateError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ClientStateError clientStateError) {
            super(null);
            clientStateError.getClass();
            this.error = clientStateError;
        }

        public static /* synthetic */ Error copy$default(Error error, ClientStateError clientStateError, int i, Object obj) {
            if ((i & 1) != 0) {
                clientStateError = error.error;
            }
            return error.copy(clientStateError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ClientStateError getError() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull ClientStateError error) {
            error.getClass();
            return new Error(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        @NotNull
        public final ClientStateError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientState
        @NotNull
        public String toString() {
            return "Error(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientState$Stopped;", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends ClientState {

        @NotNull
        public static final Stopped INSTANCE = new Stopped();

        private Stopped() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Stopped);
        }

        public int hashCode() {
            return -199465917;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientState
        @NotNull
        public String toString() {
            return "Stopped";
        }
    }

    public /* synthetic */ ClientState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Stopped) {
            return "Stopped";
        }
        if (this instanceof Disconnected) {
            return "Disconnected";
        }
        if (this instanceof Connecting) {
            return "Connecting";
        }
        if (this instanceof Connected) {
            return "Connected";
        }
        if (!(this instanceof Error)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return "Error(" + ((Error) this).getError() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    private ClientState() {
    }
}
