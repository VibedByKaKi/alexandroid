package com.amazon.alexa.accessory.internal.connection;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.transport.TransportDispatcher;
import com.amazon.alexa.accessory.transport.TransportTransaction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DelegateTransportDispatcher implements TransportDispatcher {
    private volatile TransportDispatcher dispatcher;

    @Override // com.amazon.alexa.accessory.transport.TransportDispatcher
    public void abort(TransportTransaction transportTransaction) {
        TransportDispatcher transportDispatcher = this.dispatcher;
        if (transportDispatcher != null) {
            transportDispatcher.abort(transportTransaction);
            return;
        }
        Logger.w("Transport dispatcher is not supplied, abort transaction " + transportTransaction + " is ignored");
    }

    @Override // com.amazon.alexa.accessory.transport.TransportDispatcher
    public void dispatch(TransportTransaction transportTransaction) {
        TransportDispatcher transportDispatcher = this.dispatcher;
        if (transportDispatcher != null) {
            transportDispatcher.dispatch(transportTransaction);
            return;
        }
        Logger.w("Transport dispatcher is not supplied, ignoring transaction " + transportTransaction);
    }

    public void setDispatcher(TransportDispatcher transportDispatcher) {
        this.dispatcher = transportDispatcher;
    }
}
