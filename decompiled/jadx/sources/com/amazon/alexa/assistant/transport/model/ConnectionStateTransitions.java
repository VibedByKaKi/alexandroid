package com.amazon.alexa.assistant.transport.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason;
import com.amazon.alexa.assistant.transport.model.ConnectionState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ConnectionStateTransitions;", "", "<init>", "()V", "isValidTransition", "", "from", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", TypedValues.TransitionType.S_TO, "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConnectionStateTransitions {

    @NotNull
    public static final ConnectionStateTransitions INSTANCE = new ConnectionStateTransitions();

    private ConnectionStateTransitions() {
    }

    public final boolean isValidTransition(@NotNull ConnectionState from, @NotNull ConnectionState to) {
        from.getClass();
        to.getClass();
        if (to instanceof ConnectionState.Disconnected) {
            ConnectionDisconnectedReason reason = ((ConnectionState.Disconnected) to).getReason();
            if (reason instanceof ConnectionDisconnectedReason.Initializing) {
                return true;
            }
            return reason instanceof ConnectionDisconnectedReason.UnAuthorized ? (from instanceof ConnectionState.DownChannelConnectionInProgress) || (from instanceof ConnectionState.DownChannelConnected) : reason instanceof ConnectionDisconnectedReason.DirectiveRequestInitFailed ? (from instanceof ConnectionState.DownChannelConnectionInProgress) || (from instanceof ConnectionState.DownChannelConnected) : reason instanceof ConnectionDisconnectedReason.InvalidConfiguration ? (from instanceof ConnectionState.DownChannelConnectionInProgress) || (from instanceof ConnectionState.DownChannelConnected) : reason instanceof ConnectionDisconnectedReason.DirectiveTaskReturnedFailed ? (from instanceof ConnectionState.DownChannelConnectionInProgress) || (from instanceof ConnectionState.DownChannelConnected) : reason instanceof ConnectionDisconnectedReason.PingFailed ? from instanceof ConnectionState.DownChannelConnected : reason instanceof ConnectionDisconnectedReason.Idle;
        }
        if (to instanceof ConnectionState.DownChannelConnectionInProgress) {
            return (from instanceof ConnectionState.Disconnected) && (((ConnectionState.Disconnected) from).getReason() instanceof ConnectionDisconnectedReason.Initializing);
        }
        if (to instanceof ConnectionState.DownChannelConnected) {
            return from instanceof ConnectionState.DownChannelConnectionInProgress;
        }
        return false;
    }
}
