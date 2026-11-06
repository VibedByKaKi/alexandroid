package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaExpectTextListenerAdapter;", "Lcom/amazon/alexa/api/AlexaExpectTextListener;", "compatListener", "Lcom/amazon/alexa/api/compat/AlexaExpectTextListener;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaExpectTextListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/AlexaExpectTextListener;", "onExpectTextReceived", "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaExpectTextListenerAdapter implements com.amazon.alexa.api.AlexaExpectTextListener {

    @NotNull
    private final AlexaExpectTextListener compatListener;

    public AlexaExpectTextListenerAdapter(@NotNull AlexaExpectTextListener alexaExpectTextListener) {
        alexaExpectTextListener.getClass();
        this.compatListener = alexaExpectTextListener;
    }

    @NotNull
    public final AlexaExpectTextListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaExpectTextListener
    public void onExpectTextReceived() {
        this.compatListener.onExpectTextReceived();
    }
}
