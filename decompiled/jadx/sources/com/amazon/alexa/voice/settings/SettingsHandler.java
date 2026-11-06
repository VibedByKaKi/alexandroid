package com.amazon.alexa.voice.settings;

import com.amazon.alexa.eventbus.api.MessageHandler;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface SettingsHandler extends MessageHandler {
    UUID getSubscriptionId();

    boolean isEventTypeSupported(String str);

    void startSubscription(UUID uuid);

    void stopSubscription();
}
