package com.amazon.alexa.client.alexaservice.base.metrics;

import android.os.RemoteException;
import com.amazon.alexa.api.UserPerceivedLatencyData;
import com.amazon.alexa.api.UserPerceivedLatencyListenerProxy;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UserPerceivedLatencyListenerWrapper {
    private final UserPerceivedLatencyListenerProxy userPerceivedLatencyListener;

    public UserPerceivedLatencyListenerWrapper(UserPerceivedLatencyListenerProxy userPerceivedLatencyListenerProxy) {
        this.userPerceivedLatencyListener = userPerceivedLatencyListenerProxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.userPerceivedLatencyListener, ((UserPerceivedLatencyListenerWrapper) obj).userPerceivedLatencyListener);
    }

    public int hashCode() {
        return Objects.hash(this.userPerceivedLatencyListener);
    }

    public void publishUserPerceivedLatency(DialogTurnIdentifier dialogTurnIdentifier, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, long j3, long j4) throws RemoteException {
        this.userPerceivedLatencyListener.onLatencyData(dialogTurnIdentifier.getValue(), UserPerceivedLatencyData.toBundle(new UserPerceivedLatencyData(dialogRequestIdentifier.getValue(), j, j2, j3, j4)));
    }
}
