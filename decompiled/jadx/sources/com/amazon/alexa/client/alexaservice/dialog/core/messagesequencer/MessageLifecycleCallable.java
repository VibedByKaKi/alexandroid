package com.amazon.alexa.client.alexaservice.dialog.core.messagesequencer;

import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MessageLifecycleCallable implements Callable<Boolean>, MessageProcessingCallbacks {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        return Boolean.TRUE;
    }

    public void onError() {
    }

    public void onFinished() {
    }

    public void onStopped() {
    }
}
