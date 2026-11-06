package com.amazon.alexa.voice.hva;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class HighValueActionEventPublisher {
    private final Context context;

    @Inject
    public HighValueActionEventPublisher(Context context) {
        this.context = context;
    }

    public void publish(String str) {
        HighValueActionEventForwardReceiver.forward(this.context, str);
    }
}
