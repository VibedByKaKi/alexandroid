package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaWakeWordListener;
import com.amazon.alexa.api.WakeWordState;
import com.amazon.alexa.api.compat.model.WakeWordStateListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/WakeWordStateListenerAdapter;", "Lcom/amazon/alexa/api/AlexaWakeWordListener;", "compatListener", "Lcom/amazon/alexa/api/compat/model/WakeWordStateListener;", "<init>", "(Lcom/amazon/alexa/api/compat/model/WakeWordStateListener;)V", "onWakeWordState", "", "state", "Lcom/amazon/alexa/api/WakeWordState;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WakeWordStateListenerAdapter implements AlexaWakeWordListener {

    @NotNull
    private final WakeWordStateListener compatListener;

    public WakeWordStateListenerAdapter(@NotNull WakeWordStateListener wakeWordStateListener) {
        wakeWordStateListener.getClass();
        this.compatListener = wakeWordStateListener;
    }

    @Override // com.amazon.alexa.api.AlexaWakeWordListener
    public void onWakeWordState(@NotNull WakeWordState state) {
        state.getClass();
        this.compatListener.onWakeWordStateChanged(state.isListening());
    }
}
