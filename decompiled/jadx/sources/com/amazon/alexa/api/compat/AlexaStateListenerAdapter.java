package com.amazon.alexa.api.compat;

import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaStateListenerAdapter;", "Lcom/amazon/alexa/api/AlexaStateListener;", "compatListener", "Lcom/amazon/alexa/api/compat/AlexaStateListener;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaStateListener;)V", "getCompatListener", "()Lcom/amazon/alexa/api/compat/AlexaStateListener;", "onAlexaStateChanged", "", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_STATE, "Lcom/amazon/alexa/api/AlexaState;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaStateListenerAdapter implements com.amazon.alexa.api.AlexaStateListener {

    @NotNull
    private final AlexaStateListener compatListener;

    public AlexaStateListenerAdapter(@NotNull AlexaStateListener alexaStateListener) {
        alexaStateListener.getClass();
        this.compatListener = alexaStateListener;
    }

    @NotNull
    public final AlexaStateListener getCompatListener() {
        return this.compatListener;
    }

    @Override // com.amazon.alexa.api.AlexaStateListener
    public void onAlexaStateChanged(@Nullable com.amazon.alexa.api.AlexaState alexaState) {
        this.compatListener.onAlexaStateChanged(AlexaState.INSTANCE.convertToCompat(alexaState));
    }
}
