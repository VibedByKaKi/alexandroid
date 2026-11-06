package com.amazon.alexa.mosaic.apl.dependencies;

import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import com.amazon.alexa.mosaic.apl.interfaces.IEventHandler;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class WeakEventHandler {
    private final WeakReference<IEventHandler> handlerRef;

    public WeakEventHandler(IEventHandler iEventHandler) {
        this.handlerRef = new WeakReference<>(iEventHandler);
    }

    public void handle(IEvent iEvent) {
        IEventHandler iEventHandler = this.handlerRef.get();
        if (iEventHandler != null) {
            iEventHandler.handle(iEvent);
        }
    }
}
